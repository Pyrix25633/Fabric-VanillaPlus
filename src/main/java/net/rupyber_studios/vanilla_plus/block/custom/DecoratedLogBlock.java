package net.rupyber_studios.vanilla_plus.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.ItemTags;
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
import org.jetbrains.annotations.NotNull;

public class DecoratedLogBlock extends Block {
    public static final EnumProperty<Direction.Axis> AXIS = Properties.AXIS;

    public DecoratedLogBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(AXIS, Direction.Axis.Y));
    }

    @Override
    public BlockState getPlacementState(@NotNull ItemPlacementContext ctx) {
        return this.getDefaultState().with(AXIS, ctx.getSide().getAxis());
    }

    @Override
    public ActionResult onUse(@NotNull BlockState state, World world, BlockPos pos, @NotNull PlayerEntity player, BlockHitResult hit) {
        ItemStack playerItem = player.getStackInHand(Hand.MAIN_HAND);
        Block toPlace = Blocks.AIR;
        boolean success = false;

        if(state.isOf(this)) {
            if(playerItem.isIn(ItemTags.AXES)) {
                success = true;
                if(state.isOf(ModBlocks.DECORATED_OAK_LOG))
                    toPlace = ModBlocks.DECORATED_STRIPPED_OAK_LOG;
                else if(state.isOf(ModBlocks.DECORATED_OAK_WOOD))
                    toPlace = ModBlocks.DECORATED_STRIPPED_OAK_WOOD;
                else if(state.isOf(ModBlocks.DECORATED_ACACIA_LOG))
                    toPlace = ModBlocks.DECORATED_STRIPPED_ACACIA_LOG;
                else if(state.isOf(ModBlocks.DECORATED_ACACIA_WOOD))
                    toPlace = ModBlocks.DECORATED_STRIPPED_ACACIA_WOOD;
                else if(state.isOf(ModBlocks.DECORATED_BIRCH_LOG))
                    toPlace = ModBlocks.DECORATED_STRIPPED_BIRCH_LOG;
                else if(state.isOf(ModBlocks.DECORATED_BIRCH_WOOD))
                    toPlace = ModBlocks.DECORATED_STRIPPED_BIRCH_WOOD;
                else if(state.isOf(ModBlocks.DECORATED_SPRUCE_LOG))
                    toPlace = ModBlocks.DECORATED_STRIPPED_SPRUCE_LOG;
                else if(state.isOf(ModBlocks.DECORATED_SPRUCE_WOOD))
                    toPlace = ModBlocks.DECORATED_STRIPPED_SPRUCE_WOOD;
                else if(state.isOf(ModBlocks.DECORATED_JUNGLE_LOG))
                    toPlace = ModBlocks.DECORATED_STRIPPED_JUNGLE_LOG;
                else if(state.isOf(ModBlocks.DECORATED_JUNGLE_WOOD))
                    toPlace = ModBlocks.DECORATED_STRIPPED_JUNGLE_WOOD;
                else if(state.isOf(ModBlocks.DECORATED_DARK_OAK_LOG))
                    toPlace = ModBlocks.DECORATED_STRIPPED_DARK_OAK_LOG;
                else if(state.isOf(ModBlocks.DECORATED_DARK_OAK_WOOD))
                    toPlace = ModBlocks.DECORATED_STRIPPED_DARK_OAK_WOOD;
                else if(state.isOf(ModBlocks.DECORATED_CRIMSON_STEM))
                    toPlace = ModBlocks.DECORATED_STRIPPED_CRIMSON_STEM;
                else if(state.isOf(ModBlocks.DECORATED_CRIMSON_HYPHAE))
                    toPlace = ModBlocks.DECORATED_STRIPPED_CRIMSON_HYPHAE;
                else if(state.isOf(ModBlocks.DECORATED_WARPED_STEM))
                    toPlace = ModBlocks.DECORATED_STRIPPED_WARPED_STEM;
                else if(state.isOf(ModBlocks.DECORATED_WARPED_HYPHAE))
                    toPlace = ModBlocks.DECORATED_STRIPPED_WARPED_HYPHAE;
                else
                    success = false;

                if(success) {
                    world.setBlockState(pos, toPlace.getDefaultState().with(DecoratedLogBlock.AXIS, state.get(DecoratedLogBlock.AXIS)));
                    playerItem.damage(1, player, EquipmentSlot.MAINHAND);
                    world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_AXE_STRIP, SoundCategory.NEUTRAL, 1.0f, 1.0f);
                }
            }
        }

        if(success)
            return ActionResult.success(true);

        return super.onUse(state, world, pos, player, hit);
    }

    @Override
    protected void appendProperties(StateManager.@NotNull Builder<Block, BlockState> builder) {
        builder.add(DecoratedLogBlock.AXIS);
    }
}