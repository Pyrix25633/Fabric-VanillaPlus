package net.rupyber_studios.vanilla_plus.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.rupyber_studios.vanilla_plus.block.ModBlocks;

public class ModLogBlock extends Block {
    public static final EnumProperty<Direction.Axis> AXIS = Properties.AXIS;

    public ModLogBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(AXIS, Direction.Axis.Y));
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(AXIS, ctx.getSide().getAxis());
    }

    @Override
    @SuppressWarnings("deprecation")
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack playerItem = player.getStackInHand(hand);
        Block toPlace = Blocks.AIR;
        boolean finished = false;

        if(state.isOf(this)){
            if ((playerItem.getItem() == Items.WOODEN_AXE || playerItem.getItem() == Items.STONE_AXE || playerItem.getItem() == Items.GOLDEN_AXE ||
                    playerItem.getItem() == Items.IRON_AXE || playerItem.getItem() == Items.DIAMOND_AXE || playerItem.getItem() == Items.NETHERITE_AXE)) {
                //Strip Log
                finished = true;
                if (state.isOf(ModBlocks.DECORATED_OAK_LOG)) {
                    toPlace = ModBlocks.DECORATED_STRIPPED_OAK_LOG;
                } else if (state.isOf(ModBlocks.DECORATED_OAK_WOOD)) {
                    toPlace = ModBlocks.DECORATED_STRIPPED_OAK_WOOD;
                } else if (state.isOf(ModBlocks.DECORATED_ACACIA_LOG)) {
                    toPlace = ModBlocks.DECORATED_STRIPPED_ACACIA_LOG;
                } else if (state.isOf(ModBlocks.DECORATED_ACACIA_WOOD)) {
                    toPlace = ModBlocks.DECORATED_STRIPPED_ACACIA_WOOD;
                } else if (state.isOf(ModBlocks.DECORATED_BIRCH_LOG)) {
                    toPlace = ModBlocks.DECORATED_STRIPPED_BIRCH_LOG;
                } else if (state.isOf(ModBlocks.DECORATED_BIRCH_WOOD)) {
                    toPlace = ModBlocks.DECORATED_STRIPPED_BIRCH_WOOD;
                } else if (state.isOf(ModBlocks.DECORATED_SPRUCE_LOG)) {
                    toPlace = ModBlocks.DECORATED_STRIPPED_SPRUCE_LOG;
                } else if (state.isOf(ModBlocks.DECORATED_SPRUCE_WOOD)) {
                    toPlace = ModBlocks.DECORATED_STRIPPED_SPRUCE_WOOD;
                } else if (state.isOf(ModBlocks.DECORATED_JUNGLE_LOG)) {
                    toPlace = ModBlocks.DECORATED_STRIPPED_JUNGLE_LOG;
                } else if (state.isOf(ModBlocks.DECORATED_JUNGLE_WOOD)) {
                    toPlace = ModBlocks.DECORATED_STRIPPED_JUNGLE_WOOD;
                } else if (state.isOf(ModBlocks.DECORATED_DARK_OAK_LOG)) {
                    toPlace = ModBlocks.DECORATED_STRIPPED_DARK_OAK_LOG;
                } else if (state.isOf(ModBlocks.DECORATED_DARK_OAK_WOOD)) {
                    toPlace = ModBlocks.DECORATED_STRIPPED_DARK_OAK_WOOD;
                } else if (state.isOf(ModBlocks.DECORATED_CRIMSON_STEM)) {
                    toPlace = ModBlocks.DECORATED_STRIPPED_CRIMSON_STEM;
                } else if (state.isOf(ModBlocks.DECORATED_CRIMSON_HYPHAE)) {
                    toPlace = ModBlocks.DECORATED_STRIPPED_CRIMSON_HYPHAE;
                } else if (state.isOf(ModBlocks.DECORATED_WARPED_STEM)) {
                    toPlace = ModBlocks.DECORATED_STRIPPED_WARPED_STEM;
                } else if (state.isOf(ModBlocks.DECORATED_WARPED_HYPHAE)) {
                    toPlace = ModBlocks.DECORATED_STRIPPED_WARPED_HYPHAE;
                }
                else {
                    finished = false;
                }

                if(finished) {
                    world.setBlockState(pos, toPlace.getDefaultState().with(ModLogBlock.AXIS, state.get(ModLogBlock.AXIS)));
                    playerItem.damage(1, player, (p) -> p.sendToolBreakStatus(hand));
                    world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_AXE_STRIP, SoundCategory.NEUTRAL, 1.0f, 1.0f);
                }
            }
        }

        if(finished){
            return ActionResult.success(true);
        }

        return super.onUse(state, world, pos, player, hand, hit);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(ModLogBlock.AXIS);
    }
}