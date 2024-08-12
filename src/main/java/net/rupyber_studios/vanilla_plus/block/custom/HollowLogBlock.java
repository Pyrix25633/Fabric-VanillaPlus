package net.rupyber_studios.vanilla_plus.block.custom;

import net.minecraft.block.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.rupyber_studios.vanilla_plus.block.ModBlocks;
import org.jetbrains.annotations.NotNull;

public class HollowLogBlock extends Block implements Waterloggable {
    public static final EnumProperty<Direction.Axis> AXIS = Properties.AXIS;
    public static final BooleanProperty MOSSY = BooleanProperty.of("mossy");
    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;

    public HollowLogBlock(AbstractBlock.Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(AXIS, Direction.Axis.Y).with(MOSSY, false)
                .with(WATERLOGGED, false));
    }

    public Block getLog() {
        if(this == ModBlocks.HOLLOW_OAK_LOG) return Blocks.OAK_LOG;
        if(this == ModBlocks.HOLLOW_SPRUCE_LOG) return Blocks.SPRUCE_LOG;
        if(this == ModBlocks.HOLLOW_BIRCH_LOG) return Blocks.BIRCH_LOG;
        if(this == ModBlocks.HOLLOW_ACACIA_LOG) return Blocks.ACACIA_LOG;
        if(this == ModBlocks.HOLLOW_JUNGLE_LOG) return Blocks.JUNGLE_LOG;
        if(this == ModBlocks.HOLLOW_DARK_OAK_LOG) return Blocks.DARK_OAK_LOG;
        if(this == ModBlocks.HOLLOW_CRIMSON_STEM) return Blocks.CRIMSON_STEM;
        if(this == ModBlocks.HOLLOW_WARPED_STEM) return Blocks.WARPED_STEM;
        if(this == ModBlocks.HOLLOW_MANGROVE_LOG) return Blocks.MANGROVE_LOG;
        if(this == ModBlocks.HOLLOW_CHERRY_LOG) return Blocks.CHERRY_LOG;
        if(this == ModBlocks.STRIPPED_HOLLOW_OAK_LOG) return Blocks.STRIPPED_OAK_LOG;
        if(this == ModBlocks.STRIPPED_HOLLOW_SPRUCE_LOG) return Blocks.STRIPPED_SPRUCE_LOG;
        if(this == ModBlocks.STRIPPED_HOLLOW_BIRCH_LOG) return Blocks.STRIPPED_BIRCH_LOG;
        if(this == ModBlocks.STRIPPED_HOLLOW_ACACIA_LOG) return Blocks.STRIPPED_ACACIA_LOG;
        if(this == ModBlocks.STRIPPED_HOLLOW_JUNGLE_LOG) return Blocks.STRIPPED_JUNGLE_LOG;
        if(this == ModBlocks.STRIPPED_HOLLOW_DARK_OAK_LOG) return Blocks.STRIPPED_DARK_OAK_LOG;
        if(this == ModBlocks.STRIPPED_HOLLOW_CRIMSON_STEM) return Blocks.STRIPPED_CRIMSON_STEM;
        if(this == ModBlocks.STRIPPED_HOLLOW_WARPED_STEM) return Blocks.STRIPPED_WARPED_STEM;
        if(this == ModBlocks.STRIPPED_HOLLOW_MANGROVE_LOG) return Blocks.STRIPPED_MANGROVE_LOG;
        if(this == ModBlocks.STRIPPED_HOLLOW_CHERRY_LOG) return Blocks.STRIPPED_CHERRY_LOG;
        return Blocks.AIR;
    }

    @Override
    public boolean hasSidedTransparency(BlockState state) {
        return true;
    }

    @Override
    public BlockState getPlacementState(@NotNull ItemPlacementContext ctx) {
        FluidState fluidState = ctx.getWorld().getFluidState(ctx.getBlockPos());
        return this.getDefaultState()
                .with(AXIS, ctx.getSide().getAxis())
                .with(MOSSY, false)
                .with(WATERLOGGED, fluidState.getFluid() == Fluids.WATER);
    }

    @Override
    public FluidState getFluidState(@NotNull BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    @Override
    public void neighborUpdate(BlockState state, @NotNull World world, BlockPos pos, Block sourceBlock,
                               BlockPos sourcePos, boolean notify) {
        if(!world.isClient && state.get(WATERLOGGED))
            world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
    }

    @Override
    public BlockState getStateForNeighborUpdate(@NotNull BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if(state.get(WATERLOGGED))
            world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    private static final VoxelShape X_1 = Block.createCuboidShape(0,0,0,16,2,16);
    private static final VoxelShape X_2 = Block.createCuboidShape(0,14,0,16,16,16);
    private static final VoxelShape X_3 = Block.createCuboidShape(0,2,0,16,14,2);
    private static final VoxelShape X_4 = Block.createCuboidShape(0,2,14,16,14,16);
    private static final VoxelShape X_MOSS = Block.createCuboidShape(0,2,2,16,3,14);
    private static final VoxelShape X = VoxelShapes.union(X_1, X_2, X_3, X_4);
    private static final VoxelShape X_MOSSY = VoxelShapes.union(X_1, X_2, X_3, X_4, X_MOSS);
    private static final VoxelShape Y_1 = Block.createCuboidShape(0,0,0,16,16,2);
    private static final VoxelShape Y_2 = Block.createCuboidShape(0,0,2,2,16,14);
    private static final VoxelShape Y_3 = Block.createCuboidShape(0,0,14,16,16,16);
    private static final VoxelShape Y_4 = Block.createCuboidShape(14,0,2,16,16,14);
    private static final VoxelShape Y_MOSS = Block.createCuboidShape(2,0,2,14,1,14);
    private static final VoxelShape Y = VoxelShapes.union(Y_1, Y_2, Y_3, Y_4);
    private static final VoxelShape Y_MOSSY = VoxelShapes.union(Y_1, Y_2, Y_3, Y_4, Y_MOSS);
    private static final VoxelShape Z_1 = Block.createCuboidShape(0,0,0,16,2,16);
    private static final VoxelShape Z_2 = Block.createCuboidShape(0,14,0,16,16,16);
    private static final VoxelShape Z_3 = Block.createCuboidShape(0,2,0,2,14,16);
    private static final VoxelShape Z_4 = Block.createCuboidShape(14,2,0,16,14,16);
    private static final VoxelShape Z_MOSS = Block.createCuboidShape(2,2,0,14,3,16);
    private static final VoxelShape Z = VoxelShapes.union(Z_1, Z_2, Z_3, Z_4);
    private static final VoxelShape Z_MOSSY = VoxelShapes.union(Z_1, Z_2, Z_3, Z_4, Z_MOSS);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return getShape(state);
    }

    @Override
    public VoxelShape getCameraCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return getShape(state);
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return getShape(state);
    }

    private VoxelShape getShape(@NotNull BlockState state) {
        if(state.get(AXIS) == Direction.Axis.X) {
            if(state.get(MOSSY))
                return X_MOSSY;
            return X;
        }
        else if(state.get(AXIS) == Direction.Axis.Z) {
            if(state.get(MOSSY))
                return Z_MOSSY;
            return Z;
        }
        else {
            if(state.get(MOSSY))
                return Y_MOSSY;
            return Y;
        }
    }

    @Override
    public ActionResult onUse(@NotNull BlockState state, World world, BlockPos pos, @NotNull PlayerEntity player, BlockHitResult hit) {
        ItemStack playerItem = player.getStackInHand(Hand.MAIN_HAND);
        boolean success = false;
        Block toPlace = Blocks.AIR;
        if(state.isOf(this)) {
            if(playerItem.getItem() == Items.MOSS_CARPET && !state.get(MOSSY)) {
                world.setBlockState(pos, state.with(AXIS, state.get(AXIS)).with(MOSSY, true)
                        .with(WATERLOGGED, state.get(WATERLOGGED)));
                world.playSound(player, player.getX(), player.getY(), player.getZ(),
                        SoundEvents.BLOCK_MOSS_CARPET_PLACE, SoundCategory.NEUTRAL, 1.0f, 1.0f);
                if(!player.isCreative())
                    playerItem.decrement(1);
                success = true;
            }
            else if(playerItem.getItem() == Items.SHEARS && state.get(MOSSY)) {
                world.setBlockState(pos, state.with(AXIS, state.get(AXIS)).with(MOSSY, false)
                        .with(WATERLOGGED, state.get(WATERLOGGED)));
                world.playSound(player, player.getX(), player.getY(), player.getZ(),
                        SoundEvents.BLOCK_MOSS_CARPET_BREAK, SoundCategory.NEUTRAL, 1.0f, 1.0f);
                world.addBlockBreakParticles(pos, Blocks.MOSS_CARPET.getDefaultState());
                dropStack(world, pos, new ItemStack(Items.MOSS_CARPET));
                playerItem.damage(1, player, EquipmentSlot.MAINHAND);
                success = true;
            }
            else if(playerItem.isIn(ItemTags.AXES)) {
                success = true;
                if(state.isOf(ModBlocks.HOLLOW_OAK_LOG))
                    toPlace = ModBlocks.STRIPPED_HOLLOW_OAK_LOG;
                else if(state.isOf(ModBlocks.HOLLOW_SPRUCE_LOG))
                    toPlace = ModBlocks.STRIPPED_HOLLOW_SPRUCE_LOG;
                else if(state.isOf(ModBlocks.HOLLOW_BIRCH_LOG))
                    toPlace = ModBlocks.STRIPPED_HOLLOW_BIRCH_LOG;
                else if(state.isOf(ModBlocks.HOLLOW_ACACIA_LOG))
                    toPlace = ModBlocks.STRIPPED_HOLLOW_ACACIA_LOG;
                else if(state.isOf(ModBlocks.HOLLOW_JUNGLE_LOG))
                    toPlace = ModBlocks.STRIPPED_HOLLOW_JUNGLE_LOG;
                else if(state.isOf(ModBlocks.HOLLOW_DARK_OAK_LOG))
                    toPlace = ModBlocks.STRIPPED_HOLLOW_DARK_OAK_LOG;
                else if(state.isOf(ModBlocks.HOLLOW_CRIMSON_STEM))
                    toPlace = ModBlocks.STRIPPED_HOLLOW_CRIMSON_STEM;
                else if(state.isOf(ModBlocks.HOLLOW_WARPED_STEM))
                    toPlace = ModBlocks.STRIPPED_HOLLOW_WARPED_STEM;
                else if(state.isOf(ModBlocks.HOLLOW_MANGROVE_LOG))
                    toPlace = ModBlocks.STRIPPED_HOLLOW_ACACIA_LOG;
                else if(state.isOf(ModBlocks.HOLLOW_CHERRY_LOG))
                    toPlace = ModBlocks.STRIPPED_HOLLOW_JUNGLE_LOG;
                else
                    success = false;
                if(success) {
                    world.setBlockState(pos, toPlace.getDefaultState()
                            .with(AXIS, state.get(AXIS)).with(MOSSY, state.get(MOSSY))
                            .with(WATERLOGGED, state.get(WATERLOGGED)));
                    playerItem.damage(1, player, EquipmentSlot.MAINHAND);
                    world.playSound(player, player.getX(), player.getY(), player.getZ(),
                            SoundEvents.ITEM_AXE_STRIP, SoundCategory.NEUTRAL, 1.0f, 1.0f);
                }
            }
        }

        if(success)
            return ActionResult.success(true);

        return super.onUse(state, world, pos, player, hit);
    }

    @Override
    protected void appendProperties(StateManager.@NotNull Builder<Block, BlockState> builder) {
        builder.add(HollowLogBlock.AXIS, MOSSY, WATERLOGGED);
    }
}