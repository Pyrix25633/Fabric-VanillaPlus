package net.rupyber_studios.vanilla_plus.item.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.PillarBlock;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.rupyber_studios.vanilla_plus.block.ModBlocks;
import net.rupyber_studios.vanilla_plus.block.custom.DecoratedLogBlock;
import net.rupyber_studios.vanilla_plus.block.custom.DecoratedWoodBlock;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class DecoratorToolItem extends Item {
    public DecoratorToolItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(@NotNull ItemUsageContext context) {
        boolean success = true;
        BlockPos positionClicked = context.getBlockPos();
        PlayerEntity player = Objects.requireNonNull(context.getPlayer());
        World world = context.getWorld();
        BlockState state = context.getWorld().getBlockState(positionClicked);
        EquipmentSlot slot = context.getHand() == Hand.MAIN_HAND ? EquipmentSlot.MAINHAND : EquipmentSlot.OFFHAND;
        Block replacement = Blocks.AIR;

        if(state.isOf(Blocks.OAK_PLANKS)) replacement = ModBlocks.DECORATED_OAK_PLANKS;
        else if(state.isOf(Blocks.OAK_LOG)) replacement = ModBlocks.DECORATED_OAK_LOG;
        else if(state.isOf(Blocks.OAK_WOOD)) replacement = ModBlocks.DECORATED_OAK_WOOD;
        else if(state.isOf(Blocks.STRIPPED_OAK_LOG)) replacement = ModBlocks.DECORATED_STRIPPED_OAK_LOG;
        else if(state.isOf(Blocks.STRIPPED_OAK_WOOD)) replacement = ModBlocks.DECORATED_STRIPPED_OAK_WOOD;
        else if(state.isOf(Blocks.SPRUCE_PLANKS)) replacement = ModBlocks.DECORATED_SPRUCE_PLANKS;
        else if(state.isOf(Blocks.SPRUCE_LOG)) replacement = ModBlocks.DECORATED_SPRUCE_LOG;
        else if(state.isOf(Blocks.SPRUCE_WOOD)) replacement = ModBlocks.DECORATED_SPRUCE_WOOD;
        else if(state.isOf(Blocks.STRIPPED_SPRUCE_LOG)) replacement = ModBlocks.DECORATED_STRIPPED_SPRUCE_LOG;
        else if(state.isOf(Blocks.STRIPPED_SPRUCE_WOOD)) replacement = ModBlocks.DECORATED_STRIPPED_SPRUCE_WOOD;
        else if(state.isOf(Blocks.BIRCH_PLANKS)) replacement = ModBlocks.DECORATED_BIRCH_PLANKS;
        else if(state.isOf(Blocks.BIRCH_LOG)) replacement = ModBlocks.DECORATED_BIRCH_LOG;
        else if(state.isOf(Blocks.BIRCH_WOOD)) replacement = ModBlocks.DECORATED_BIRCH_WOOD;
        else if(state.isOf(Blocks.STRIPPED_BIRCH_LOG)) replacement = ModBlocks.DECORATED_STRIPPED_BIRCH_LOG;
        else if(state.isOf(Blocks.STRIPPED_BIRCH_WOOD)) replacement = ModBlocks.DECORATED_STRIPPED_BIRCH_WOOD;
        else if(state.isOf(Blocks.ACACIA_PLANKS)) replacement = ModBlocks.DECORATED_ACACIA_PLANKS;
        else if(state.isOf(Blocks.ACACIA_LOG)) replacement = ModBlocks.DECORATED_ACACIA_LOG;
        else if(state.isOf(Blocks.ACACIA_WOOD)) replacement = ModBlocks.DECORATED_ACACIA_WOOD;
        else if(state.isOf(Blocks.STRIPPED_ACACIA_LOG)) replacement = ModBlocks.DECORATED_STRIPPED_ACACIA_LOG;
        else if(state.isOf(Blocks.STRIPPED_ACACIA_WOOD)) replacement = ModBlocks.DECORATED_STRIPPED_ACACIA_WOOD;
        else if(state.isOf(Blocks.JUNGLE_PLANKS)) replacement = ModBlocks.DECORATED_JUNGLE_PLANKS;
        else if(state.isOf(Blocks.JUNGLE_LOG)) replacement = ModBlocks.DECORATED_JUNGLE_LOG;
        else if(state.isOf(Blocks.JUNGLE_WOOD)) replacement = ModBlocks.DECORATED_JUNGLE_WOOD;
        else if(state.isOf(Blocks.STRIPPED_JUNGLE_LOG)) replacement = ModBlocks.DECORATED_STRIPPED_JUNGLE_LOG;
        else if(state.isOf(Blocks.STRIPPED_JUNGLE_WOOD)) replacement = ModBlocks.DECORATED_STRIPPED_JUNGLE_WOOD;
        else if(state.isOf(Blocks.DARK_OAK_PLANKS)) replacement = ModBlocks.DECORATED_DARK_OAK_PLANKS;
        else if(state.isOf(Blocks.DARK_OAK_LOG)) replacement = ModBlocks.DECORATED_DARK_OAK_LOG;
        else if(state.isOf(Blocks.DARK_OAK_WOOD)) replacement = ModBlocks.DECORATED_DARK_OAK_WOOD;
        else if(state.isOf(Blocks.STRIPPED_DARK_OAK_LOG)) replacement = ModBlocks.DECORATED_STRIPPED_DARK_OAK_LOG;
        else if(state.isOf(Blocks.STRIPPED_DARK_OAK_WOOD)) replacement = ModBlocks.DECORATED_STRIPPED_DARK_OAK_WOOD;
        else if(state.isOf(Blocks.CRIMSON_PLANKS)) replacement = ModBlocks.DECORATED_CRIMSON_PLANKS;
        else if(state.isOf(Blocks.CRIMSON_STEM)) replacement = ModBlocks.DECORATED_CRIMSON_STEM;
        else if(state.isOf(Blocks.CRIMSON_HYPHAE)) replacement = ModBlocks.DECORATED_CRIMSON_HYPHAE;
        else if(state.isOf(Blocks.STRIPPED_CRIMSON_STEM)) replacement = ModBlocks.DECORATED_STRIPPED_CRIMSON_STEM;
        else if(state.isOf(Blocks.STRIPPED_CRIMSON_HYPHAE)) replacement = ModBlocks.DECORATED_STRIPPED_CRIMSON_HYPHAE;
        else if(state.isOf(Blocks.WARPED_PLANKS)) replacement = ModBlocks.DECORATED_WARPED_PLANKS;
        else if(state.isOf(Blocks.WARPED_STEM)) replacement = ModBlocks.DECORATED_WARPED_STEM;
        else if(state.isOf(Blocks.WARPED_HYPHAE)) replacement = ModBlocks.DECORATED_WARPED_HYPHAE;
        else if(state.isOf(Blocks.STRIPPED_WARPED_STEM)) replacement = ModBlocks.DECORATED_STRIPPED_WARPED_STEM;
        else if(state.isOf(Blocks.STRIPPED_WARPED_HYPHAE)) replacement = ModBlocks.DECORATED_STRIPPED_WARPED_HYPHAE;
        else if(state.isOf(Blocks.MANGROVE_PLANKS)) replacement = ModBlocks.DECORATED_MANGROVE_PLANKS;
        else if(state.isOf(Blocks.MANGROVE_LOG)) replacement = ModBlocks.DECORATED_MANGROVE_LOG;
        else if(state.isOf(Blocks.MANGROVE_WOOD)) replacement = ModBlocks.DECORATED_MANGROVE_WOOD;
        else if(state.isOf(Blocks.STRIPPED_MANGROVE_LOG)) replacement = ModBlocks.DECORATED_STRIPPED_MANGROVE_LOG;
        else if(state.isOf(Blocks.STRIPPED_MANGROVE_WOOD)) replacement = ModBlocks.DECORATED_STRIPPED_MANGROVE_WOOD;
        else if(state.isOf(Blocks.CHERRY_PLANKS)) replacement = ModBlocks.DECORATED_CHERRY_PLANKS;
        else if(state.isOf(Blocks.CHERRY_LOG)) replacement = ModBlocks.DECORATED_CHERRY_LOG;
        else if(state.isOf(Blocks.CHERRY_WOOD)) replacement = ModBlocks.DECORATED_CHERRY_WOOD;
        else if(state.isOf(Blocks.STRIPPED_CHERRY_LOG)) replacement = ModBlocks.DECORATED_STRIPPED_CHERRY_LOG;
        else if(state.isOf(Blocks.STRIPPED_CHERRY_WOOD)) replacement = ModBlocks.DECORATED_STRIPPED_CHERRY_WOOD;
        else success = false;

        if(success) {
            BlockState replacementBlockState = replacement.getDefaultState();
            if(replacement instanceof DecoratedLogBlock)
                replacementBlockState = replacementBlockState.with(DecoratedLogBlock.AXIS, state.get(PillarBlock.AXIS));
            else if(replacement instanceof DecoratedWoodBlock)
                replacementBlockState = replacementBlockState.with(DecoratedWoodBlock.AXIS, state.get(PillarBlock.AXIS));
            world.setBlockState(positionClicked, replacementBlockState);
            context.getStack().damage(1, context.getPlayer(), slot);
            world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_AXE_STRIP, SoundCategory.NEUTRAL, 1.0f, 1.0f);
            return ActionResult.success(true);
        }

        return super.useOnBlock(context);
    }
}