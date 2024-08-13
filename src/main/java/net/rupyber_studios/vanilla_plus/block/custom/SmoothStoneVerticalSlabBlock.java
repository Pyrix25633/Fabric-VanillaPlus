package net.rupyber_studios.vanilla_plus.block.custom;

import net.minecraft.block.*;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.rupyber_studios.vanilla_plus.block.type.VerticalSlabType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class SmoothStoneVerticalSlabBlock extends Block implements Waterloggable {
    public static final EnumProperty<VerticalSlabType> TYPE = EnumProperty.of("type", VerticalSlabType.class);
    public static final BooleanProperty IS_ON_X_AXIS = BooleanProperty.of("is_on_x_axis");
    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;

    public SmoothStoneVerticalSlabBlock(AbstractBlock.Settings properties) {
        super(properties);
        setDefaultState(getDefaultState().with(TYPE, VerticalSlabType.NORTH).with(WATERLOGGED, false).with(IS_ON_X_AXIS, false));
    }

    @Override
    public BlockState rotate(@NotNull BlockState state, BlockRotation rot) {
        return state.get(TYPE) == VerticalSlabType.DOUBLE ? state : state.with(TYPE, VerticalSlabType.fromDirection(rot.rotate(state.get(TYPE).direction)));
    }

    @Override
    public BlockState mirror(@NotNull BlockState state, BlockMirror mirrorIn) {
        VerticalSlabType type = state.get(TYPE);
        if (type == VerticalSlabType.DOUBLE || mirrorIn == BlockMirror.NONE) return state;

        if ((mirrorIn == BlockMirror.LEFT_RIGHT && type.direction.getAxis() == Direction.Axis.Z) || (mirrorIn == BlockMirror.FRONT_BACK && type.direction.getAxis() == Direction.Axis.X))
            return state.with(TYPE, VerticalSlabType.fromDirection(state.get(TYPE).direction.getOpposite()));

        return state;
    }

    @Override
    public boolean hasSidedTransparency(@NotNull BlockState state) {
        return state.get(TYPE) != VerticalSlabType.DOUBLE;
    }

    @Override
    protected void appendProperties(StateManager.@NotNull Builder<Block, BlockState> builder) {
        builder.add(TYPE, WATERLOGGED, IS_ON_X_AXIS);
    }

    @Override
    public VoxelShape getOutlineShape(@NotNull BlockState state, BlockView worldIn, BlockPos pos, ShapeContext context) {
        return state.get(TYPE).shape;
    }

    @Override
    public VoxelShape getCameraCollisionShape(@NotNull BlockState state, BlockView worldIn, BlockPos pos, ShapeContext context) {
        return state.get(TYPE).shape;
    }

    @Override
    public VoxelShape getCollisionShape(@NotNull BlockState state, BlockView worldIn, BlockPos pos, ShapeContext context) {
        return state.get(TYPE).shape;
    }

    @Override
    @Nullable
    public BlockState getPlacementState(@NotNull ItemPlacementContext context) {
        BlockPos blockpos = context.getBlockPos();
        BlockState blockstate = context.getWorld().getBlockState(blockpos);
        if (blockstate.getBlock() == this) return blockstate.with(TYPE, VerticalSlabType.DOUBLE).with(WATERLOGGED, false);

        FluidState fluid = context.getWorld().getFluidState(blockpos);
        BlockState state = getDefaultState().with(WATERLOGGED, fluid.getFluid() == Fluids.WATER);
        Direction direction = getDirectionForPlacement(context);
        boolean isOnXAxis = direction == Direction.WEST || direction == Direction.EAST;
        VerticalSlabType type = VerticalSlabType.fromDirection(direction);

        return state.with(TYPE, type).with(IS_ON_X_AXIS, isOnXAxis);
    }

    private Direction getDirectionForPlacement(@NotNull ItemPlacementContext context) {
        Direction direction = context.getSide();
        if (direction.getAxis() != Direction.Axis.Y) return direction;

        BlockPos pos = context.getBlockPos();
        Vec3d vec = context.getHitPos().subtract(new Vec3d(pos.getX(), pos.getY(), pos.getZ())).subtract(0.5, 0, 0.5);
        double angle = Math.atan2(vec.x, vec.z) * -180.0 / Math.PI;
        return Direction.fromRotation(angle).getOpposite();
    }

    @Override
    public boolean canReplace(@NotNull BlockState state, @NotNull ItemPlacementContext useContext) {
        ItemStack itemstack = useContext.getStack();
        VerticalSlabType slabType = state.get(TYPE);
        return slabType != VerticalSlabType.DOUBLE && itemstack.getItem() == this.asItem() && (useContext.canReplaceExisting() && (useContext.getSide() == slabType.direction && getDirectionForPlacement(useContext) == slabType.direction) || (!useContext.canReplaceExisting() && useContext.getSide().getAxis() != slabType.direction.getAxis()));
    }

    @Override
    public FluidState getFluidState(@NotNull BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    @Override
    public void neighborUpdate(BlockState state, @NotNull World world, BlockPos pos, Block sourceBlock, BlockPos sourcePos, boolean notify) {
        if(!world.isClient) {
            if(state.get(WATERLOGGED)) {
                world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
            }
        }
    }

    @Override
    public BlockState getStateForNeighborUpdate(@NotNull BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if(state.get(WATERLOGGED)) {
            world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    public boolean canPathfindThrough(BlockState state, NavigationType type) {
        return type == NavigationType.WATER && state.getFluidState().isIn(FluidTags.WATER);
    }
}