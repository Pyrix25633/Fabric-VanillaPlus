package net.pyrix25633.vanilla_plus.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class ModTableBlock extends Block{
    public ModTableBlock(Settings settings) {
        super(settings);
    }

    private static final VoxelShape LEG_1 = Block.createCuboidShape(0,0,0,2,12,2);
    private static final VoxelShape LEG_2 = Block.createCuboidShape(0,0,14,2,12,16);
    private static final VoxelShape LEG_3 = Block.createCuboidShape(14,0,0,16,12,2);
    private static final VoxelShape LEG_4 = Block.createCuboidShape(14,0,14,16,12,16);
    private static final VoxelShape TOP = Block.createCuboidShape(0,12,0,16,16,16);

    private static final VoxelShape TABLE_SHAPE = VoxelShapes.union(LEG_1, LEG_2, LEG_3, LEG_4, TOP);

    @Override
    @SuppressWarnings("deprecation")
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return TABLE_SHAPE;
    }

    @Override
    @SuppressWarnings("deprecation")
    public VoxelShape getCameraCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return TABLE_SHAPE;
    }

    @Override
    @SuppressWarnings("deprecation")
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return TABLE_SHAPE;
    }
}
