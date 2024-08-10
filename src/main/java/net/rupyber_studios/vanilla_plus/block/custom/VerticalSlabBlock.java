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
import net.rupyber_studios.vanilla_plus.block.ModBlocks;
import net.rupyber_studios.vanilla_plus.block.type.VerticalSlabType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class VerticalSlabBlock extends Block implements Waterloggable {
    public static final EnumProperty<VerticalSlabType> TYPE = EnumProperty.of("type", VerticalSlabType.class);
    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;

    public VerticalSlabBlock(AbstractBlock.Settings properties) {
        super(properties);
        setDefaultState(getDefaultState().with(TYPE, VerticalSlabType.NORTH).with(WATERLOGGED, false));
    }

    public Block getFullBlock() {
        if(this == ModBlocks.DEEP_OCEAN_BRICK_VERTICAL_SLAB) return ModBlocks.DEEP_OCEAN_BRICKS;

        if(this == ModBlocks.OAK_VERTICAL_SLAB) return Blocks.OAK_PLANKS;
        if(this == ModBlocks.SPRUCE_VERTICAL_SLAB) return Blocks.SPRUCE_PLANKS;
        if(this == ModBlocks.BIRCH_VERTICAL_SLAB) return Blocks.BIRCH_PLANKS;
        if(this == ModBlocks.JUNGLE_VERTICAL_SLAB) return Blocks.JUNGLE_PLANKS;
        if(this == ModBlocks.ACACIA_VERTICAL_SLAB) return Blocks.ACACIA_PLANKS;
        if(this == ModBlocks.DARK_OAK_VERTICAL_SLAB) return Blocks.DARK_OAK_PLANKS;
        if(this == ModBlocks.CRIMSON_VERTICAL_SLAB) return Blocks.CRIMSON_PLANKS;
        if(this == ModBlocks.WARPED_VERTICAL_SLAB) return Blocks.WARPED_PLANKS;
        if(this == ModBlocks.STONE_VERTICAL_SLAB) return Blocks.STONE;
        if(this == ModBlocks.COBBLESTONE_VERTICAL_SLAB) return Blocks.COBBLESTONE;
        if(this == ModBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB) return Blocks.MOSSY_COBBLESTONE;
        if(this == ModBlocks.STONE_BRICK_VERTICAL_SLAB) return Blocks.STONE_BRICKS;
        if(this == ModBlocks.MOSSY_STONE_BRICK_VERTICAL_SLAB) return Blocks.MOSSY_STONE_BRICKS;
        if(this == ModBlocks.ANDESITE_VERTICAL_SLAB) return Blocks.ANDESITE;
        if(this == ModBlocks.POLISHED_ANDESITE_VERTICAL_SLAB) return Blocks.POLISHED_ANDESITE;
        if(this == ModBlocks.DIORITE_VERTICAL_SLAB) return Blocks.DIORITE;
        if(this == ModBlocks.POLISHED_DIORITE_VERTICAL_SLAB) return Blocks.POLISHED_DIORITE;
        if(this == ModBlocks.GRANITE_VERTICAL_SLAB) return Blocks.GRANITE;
        if(this == ModBlocks.POLISHED_GRANITE_VERTICAL_SLAB) return Blocks.POLISHED_GRANITE;
        if(this == ModBlocks.SANDSTONE_VERTICAL_SLAB) return Blocks.SANDSTONE;
        if(this == ModBlocks.CUT_SANDSTONE_VERTICAL_SLAB) return Blocks.CUT_SANDSTONE;
        if(this == ModBlocks.SMOOTH_SANDSTONE_VERTICAL_SLAB) return Blocks.SMOOTH_SANDSTONE;
        if(this == ModBlocks.RED_SANDSTONE_VERTICAL_SLAB) return Blocks.RED_SANDSTONE;
        if(this == ModBlocks.CUT_RED_SANDSTONE_VERTICAL_SLAB) return Blocks.CUT_RED_SANDSTONE;
        if(this == ModBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB) return Blocks.SMOOTH_RED_SANDSTONE;
        if(this == ModBlocks.BRICK_VERTICAL_SLAB) return Blocks.BRICKS;
        if(this == ModBlocks.PRISMARINE_VERTICAL_SLAB) return Blocks.PRISMARINE;
        if(this == ModBlocks.PRISMARINE_BRICK_VERTICAL_SLAB) return Blocks.PRISMARINE_BRICKS;
        if(this == ModBlocks.DARK_PRISMARINE_VERTICAL_SLAB) return Blocks.DARK_PRISMARINE;
        if(this == ModBlocks.NETHER_BRICK_VERTICAL_SLAB) return Blocks.NETHER_BRICKS;
        if(this == ModBlocks.RED_NETHER_BRICK_VERTICAL_SLAB) return Blocks.RED_NETHER_BRICK_SLAB;
        if(this == ModBlocks.QUARTZ_VERTICAL_SLAB) return Blocks.QUARTZ_BLOCK;
        if(this == ModBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB) return Blocks.SMOOTH_QUARTZ;
        if(this == ModBlocks.PURPUR_VERTICAL_SLAB) return Blocks.PURPUR_BLOCK;
        if(this == ModBlocks.END_STONE_BRICK_VERTICAL_SLAB) return Blocks.END_STONE;
        if(this == ModBlocks.BLACKSTONE_VERTICAL_SLAB) return Blocks.BLACKSTONE;
        if(this == ModBlocks.POLISHED_BLACKSTONE_VERTICAL_SLAB) return Blocks.POLISHED_BLACKSTONE;
        if(this == ModBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB) return Blocks.POLISHED_BLACKSTONE_BRICKS;
        if(this == ModBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB) return Blocks.WAXED_CUT_COPPER;
        if(this == ModBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB) return Blocks.WAXED_EXPOSED_CUT_COPPER;
        if(this == ModBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB) return Blocks.WAXED_WEATHERED_CUT_COPPER;
        if(this == ModBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB) return Blocks.WAXED_OXIDIZED_CUT_COPPER;
        if(this == ModBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB) return Blocks.COBBLED_DEEPSLATE;
        if(this == ModBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB) return Blocks.POLISHED_DEEPSLATE;
        if(this == ModBlocks.DEEPSLATE_BRICK_VERTICAL_SLAB) return Blocks.DEEPSLATE_BRICKS;
        if(this == ModBlocks.DEEPSLATE_TILE_VERTICAL_SLAB) return Blocks.DEEPSLATE_TILES;
        return Blocks.AIR;
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
        builder.add(TYPE, WATERLOGGED);
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
        BlockState retState = getDefaultState().with(WATERLOGGED, fluid.getFluid() == Fluids.WATER);
        Direction direction = getDirectionForPlacement(context);
        VerticalSlabType type = VerticalSlabType.fromDirection(direction);

        return retState.with(TYPE, type);
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