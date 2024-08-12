package net.rupyber_studios.vanilla_plus.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ShapeContext;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.rupyber_studios.vanilla_plus.block.ModBlocks;
import org.jetbrains.annotations.NotNull;

public class TableBlock extends Block {
    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;

    public TableBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(WATERLOGGED, false));
    }

    public Block getPlanks() {
        if(this == ModBlocks.OAK_TABLE) return Blocks.OAK_PLANKS;
        if(this == ModBlocks.SPRUCE_TABLE) return Blocks.SPRUCE_PLANKS;
        if(this == ModBlocks.BIRCH_TABLE) return Blocks.BIRCH_PLANKS;
        if(this == ModBlocks.ACACIA_TABLE) return Blocks.ACACIA_PLANKS;
        if(this == ModBlocks.JUNGLE_TABLE) return Blocks.JUNGLE_PLANKS;
        if(this == ModBlocks.DARK_OAK_TABLE) return Blocks.DARK_OAK_PLANKS;
        if(this == ModBlocks.CRIMSON_TABLE) return Blocks.CRIMSON_PLANKS;
        if(this == ModBlocks.WARPED_TABLE) return Blocks.WARPED_PLANKS;
        if(this == ModBlocks.MANGROVE_TABLE) return Blocks.MANGROVE_PLANKS;
        if(this == ModBlocks.CHERRY_TABLE) return Blocks.CHERRY_PLANKS;
        return Blocks.AIR;
    }

    @Override
    public boolean hasSidedTransparency(BlockState state) {
        return true;
    }

    @Override
    public BlockState getPlacementState(@NotNull ItemPlacementContext ctx) {
        FluidState fluidState = ctx.getWorld().getFluidState(ctx.getBlockPos());
        return this.getDefaultState().with(WATERLOGGED, fluidState.getFluid() == Fluids.WATER);
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

    private static final VoxelShape LEG_1 = Block.createCuboidShape(0,0,0,2,12,2);
    private static final VoxelShape LEG_2 = Block.createCuboidShape(0,0,14,2,12,16);
    private static final VoxelShape LEG_3 = Block.createCuboidShape(14,0,0,16,12,2);
    private static final VoxelShape LEG_4 = Block.createCuboidShape(14,0,14,16,12,16);
    private static final VoxelShape TOP = Block.createCuboidShape(0,12,0,16,16,16);

    private static final VoxelShape TABLE_SHAPE = VoxelShapes.union(LEG_1, LEG_2, LEG_3, LEG_4, TOP);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return TABLE_SHAPE;
    }

    @Override
    public VoxelShape getCameraCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return TABLE_SHAPE;
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return TABLE_SHAPE;
    }

    @Override
    protected void appendProperties(StateManager.@NotNull Builder<Block, BlockState> builder) {
        builder.add(WATERLOGGED);
    }
}