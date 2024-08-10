package net.rupyber_studios.vanilla_plus.item.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
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
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class DecoratorToolItem extends Item {
    public DecoratorToolItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(@NotNull ItemUsageContext context) {
        boolean finished = false;
        BlockPos positionClicked = context.getBlockPos();
        Block clickedBlock = context.getWorld().getBlockState(positionClicked).getBlock();
        PlayerEntity player = Objects.requireNonNull(context.getPlayer());
        World world = context.getWorld();
        BlockState state = context.getWorld().getBlockState(positionClicked);
        EquipmentSlot slot = context.getHand() == Hand.MAIN_HAND ? EquipmentSlot.MAINHAND : EquipmentSlot.OFFHAND;

        if(clickedBlock == Blocks.OAK_PLANKS) {
            world.setBlockState(positionClicked, ModBlocks.DECORATED_OAK_PLANKS.getDefaultState());
            context.getStack().damage(1, context.getPlayer(), slot);
            world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_AXE_STRIP, SoundCategory.NEUTRAL, 1.0f, 1.0f);
            finished = true;
        }
        else if(clickedBlock == Blocks.OAK_LOG) {
            world.setBlockState(positionClicked, ModBlocks.DECORATED_OAK_LOG.getDefaultState().with(DecoratedLogBlock.AXIS, state.get(DecoratedLogBlock.AXIS)));
            context.getStack().damage(1, context.getPlayer(), slot);
            world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_AXE_STRIP, SoundCategory.NEUTRAL, 1.0f, 1.0f);
            finished = true;
        }
        else if(clickedBlock == Blocks.OAK_WOOD) {
            world.setBlockState(positionClicked, ModBlocks.DECORATED_OAK_WOOD.getDefaultState().with(DecoratedLogBlock.AXIS, state.get(DecoratedLogBlock.AXIS)));
            context.getStack().damage(1, context.getPlayer(), slot);
            world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_AXE_STRIP, SoundCategory.NEUTRAL, 1.0f, 1.0f);
            finished = true;
        }
        else if(clickedBlock == Blocks.STRIPPED_OAK_LOG) {
            world.setBlockState(positionClicked, ModBlocks.DECORATED_STRIPPED_OAK_LOG.getDefaultState().with(DecoratedLogBlock.AXIS, state.get(DecoratedLogBlock.AXIS)));
            context.getStack().damage(1, context.getPlayer(), slot);
            world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_AXE_STRIP, SoundCategory.NEUTRAL, 1.0f, 1.0f);
            finished = true;
        }
        else if(clickedBlock == Blocks.STRIPPED_OAK_WOOD) {
            world.setBlockState(positionClicked, ModBlocks.DECORATED_STRIPPED_OAK_WOOD.getDefaultState().with(DecoratedLogBlock.AXIS, state.get(DecoratedLogBlock.AXIS)));
            context.getStack().damage(1, context.getPlayer(), slot);
            world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_AXE_STRIP, SoundCategory.NEUTRAL, 1.0f, 1.0f);
            finished = true;
        }
        //Acacia
        else if(clickedBlock == Blocks.ACACIA_PLANKS) {
            world.setBlockState(positionClicked, ModBlocks.DECORATED_ACACIA_PLANKS.getDefaultState());
            context.getStack().damage(1, context.getPlayer(), slot);
            world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_AXE_STRIP, SoundCategory.NEUTRAL, 1.0f, 1.0f);
            finished = true;
        }
        else if(clickedBlock == Blocks.ACACIA_LOG) {
            world.setBlockState(positionClicked, ModBlocks.DECORATED_ACACIA_LOG.getDefaultState().with(DecoratedLogBlock.AXIS, state.get(DecoratedLogBlock.AXIS)));
            context.getStack().damage(1, context.getPlayer(), slot);
            world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_AXE_STRIP, SoundCategory.NEUTRAL, 1.0f, 1.0f);
            finished = true;
        }
        else if(clickedBlock == Blocks.ACACIA_WOOD) {
            world.setBlockState(positionClicked, ModBlocks.DECORATED_ACACIA_WOOD.getDefaultState().with(DecoratedLogBlock.AXIS, state.get(DecoratedLogBlock.AXIS)));
            context.getStack().damage(1, context.getPlayer(), slot);
            world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_AXE_STRIP, SoundCategory.NEUTRAL, 1.0f, 1.0f);
            finished = true;
        }
        else if(clickedBlock == Blocks.STRIPPED_ACACIA_LOG) {
            world.setBlockState(positionClicked, ModBlocks.DECORATED_STRIPPED_ACACIA_LOG.getDefaultState().with(DecoratedLogBlock.AXIS, state.get(DecoratedLogBlock.AXIS)));
            context.getStack().damage(1, context.getPlayer(), slot);
            world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_AXE_STRIP, SoundCategory.NEUTRAL, 1.0f, 1.0f);
            finished = true;
        }
        else if(clickedBlock == Blocks.STRIPPED_ACACIA_WOOD) {
            world.setBlockState(positionClicked, ModBlocks.DECORATED_STRIPPED_ACACIA_WOOD.getDefaultState().with(DecoratedLogBlock.AXIS, state.get(DecoratedLogBlock.AXIS)));
            context.getStack().damage(1, context.getPlayer(), slot);
            world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_AXE_STRIP, SoundCategory.NEUTRAL, 1.0f, 1.0f);
            finished = true;
        }
        //Birch
        else if(clickedBlock == Blocks.BIRCH_PLANKS) {
            world.setBlockState(positionClicked, ModBlocks.DECORATED_BIRCH_PLANKS.getDefaultState());
            context.getStack().damage(1, context.getPlayer(), slot);
            world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_AXE_STRIP, SoundCategory.NEUTRAL, 1.0f, 1.0f);
            finished = true;
        }
        else if(clickedBlock == Blocks.BIRCH_LOG) {
            world.setBlockState(positionClicked, ModBlocks.DECORATED_BIRCH_LOG.getDefaultState().with(DecoratedLogBlock.AXIS, state.get(DecoratedLogBlock.AXIS)));
            context.getStack().damage(1, context.getPlayer(), slot);
            world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_AXE_STRIP, SoundCategory.NEUTRAL, 1.0f, 1.0f);
            finished = true;
        }
        else if(clickedBlock == Blocks.BIRCH_WOOD) {
            world.setBlockState(positionClicked, ModBlocks.DECORATED_BIRCH_WOOD.getDefaultState().with(DecoratedLogBlock.AXIS, state.get(DecoratedLogBlock.AXIS)));
            context.getStack().damage(1, context.getPlayer(), slot);
            world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_AXE_STRIP, SoundCategory.NEUTRAL, 1.0f, 1.0f);
            finished = true;
        }
        else if(clickedBlock == Blocks.STRIPPED_BIRCH_LOG) {
            world.setBlockState(positionClicked, ModBlocks.DECORATED_STRIPPED_BIRCH_LOG.getDefaultState().with(DecoratedLogBlock.AXIS, state.get(DecoratedLogBlock.AXIS)));
            context.getStack().damage(1, context.getPlayer(), slot);
            world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_AXE_STRIP, SoundCategory.NEUTRAL, 1.0f, 1.0f);
            finished = true;
        }
        else if(clickedBlock == Blocks.STRIPPED_BIRCH_WOOD) {
            world.setBlockState(positionClicked, ModBlocks.DECORATED_STRIPPED_BIRCH_WOOD.getDefaultState().with(DecoratedLogBlock.AXIS, state.get(DecoratedLogBlock.AXIS)));
            context.getStack().damage(1, context.getPlayer(), slot);
            world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_AXE_STRIP, SoundCategory.NEUTRAL, 1.0f, 1.0f);
            finished = true;
        }
        //Birch
        else if(clickedBlock == Blocks.SPRUCE_PLANKS) {
            world.setBlockState(positionClicked, ModBlocks.DECORATED_SPRUCE_PLANKS.getDefaultState());
            context.getStack().damage(1, context.getPlayer(), slot);
            world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_AXE_STRIP, SoundCategory.NEUTRAL, 1.0f, 1.0f);
            finished = true;
        }
        else if(clickedBlock == Blocks.SPRUCE_LOG) {
            world.setBlockState(positionClicked, ModBlocks.DECORATED_SPRUCE_LOG.getDefaultState().with(DecoratedLogBlock.AXIS, state.get(DecoratedLogBlock.AXIS)));
            context.getStack().damage(1, context.getPlayer(), slot);
            world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_AXE_STRIP, SoundCategory.NEUTRAL, 1.0f, 1.0f);
            finished = true;
        }
        else if(clickedBlock == Blocks.SPRUCE_WOOD) {
            world.setBlockState(positionClicked, ModBlocks.DECORATED_SPRUCE_WOOD.getDefaultState().with(DecoratedLogBlock.AXIS, state.get(DecoratedLogBlock.AXIS)));
            context.getStack().damage(1, context.getPlayer(), slot);
            world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_AXE_STRIP, SoundCategory.NEUTRAL, 1.0f, 1.0f);
            finished = true;
        }
        else if(clickedBlock == Blocks.STRIPPED_SPRUCE_LOG) {
            world.setBlockState(positionClicked, ModBlocks.DECORATED_STRIPPED_SPRUCE_LOG.getDefaultState().with(DecoratedLogBlock.AXIS, state.get(DecoratedLogBlock.AXIS)));
            context.getStack().damage(1, context.getPlayer(), slot);
            world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_AXE_STRIP, SoundCategory.NEUTRAL, 1.0f, 1.0f);
            finished = true;
        }
        else if(clickedBlock == Blocks.STRIPPED_SPRUCE_WOOD) {
            world.setBlockState(positionClicked, ModBlocks.DECORATED_STRIPPED_SPRUCE_WOOD.getDefaultState().with(DecoratedLogBlock.AXIS, state.get(DecoratedLogBlock.AXIS)));
            context.getStack().damage(1, context.getPlayer(), slot);
            world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_AXE_STRIP, SoundCategory.NEUTRAL, 1.0f, 1.0f);
            finished = true;
        }
        //Birch
        else if(clickedBlock == Blocks.JUNGLE_PLANKS) {
            world.setBlockState(positionClicked, ModBlocks.DECORATED_JUNGLE_PLANKS.getDefaultState());
            context.getStack().damage(1, context.getPlayer(), slot);
            world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_AXE_STRIP, SoundCategory.NEUTRAL, 1.0f, 1.0f);
            finished = true;
        }
        else if(clickedBlock == Blocks.JUNGLE_LOG) {
            world.setBlockState(positionClicked, ModBlocks.DECORATED_JUNGLE_LOG.getDefaultState().with(DecoratedLogBlock.AXIS, state.get(DecoratedLogBlock.AXIS)));
            context.getStack().damage(1, context.getPlayer(), slot);
            world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_AXE_STRIP, SoundCategory.NEUTRAL, 1.0f, 1.0f);
            finished = true;
        }
        else if(clickedBlock == Blocks.JUNGLE_WOOD) {
            world.setBlockState(positionClicked, ModBlocks.DECORATED_JUNGLE_WOOD.getDefaultState().with(DecoratedLogBlock.AXIS, state.get(DecoratedLogBlock.AXIS)));
            context.getStack().damage(1, context.getPlayer(), slot);
            world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_AXE_STRIP, SoundCategory.NEUTRAL, 1.0f, 1.0f);
            finished = true;
        }
        else if(clickedBlock == Blocks.STRIPPED_JUNGLE_LOG) {
            world.setBlockState(positionClicked, ModBlocks.DECORATED_STRIPPED_JUNGLE_LOG.getDefaultState().with(DecoratedLogBlock.AXIS, state.get(DecoratedLogBlock.AXIS)));
            context.getStack().damage(1, context.getPlayer(), slot);
            world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_AXE_STRIP, SoundCategory.NEUTRAL, 1.0f, 1.0f);
            finished = true;
        }
        else if(clickedBlock == Blocks.STRIPPED_JUNGLE_WOOD) {
            world.setBlockState(positionClicked, ModBlocks.DECORATED_STRIPPED_JUNGLE_WOOD.getDefaultState().with(DecoratedLogBlock.AXIS, state.get(DecoratedLogBlock.AXIS)));
            context.getStack().damage(1, context.getPlayer(), slot);
            world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_AXE_STRIP, SoundCategory.NEUTRAL, 1.0f, 1.0f);
            finished = true;
        }
        //Dark Oak
        else if(clickedBlock == Blocks.DARK_OAK_PLANKS) {
            world.setBlockState(positionClicked, ModBlocks.DECORATED_DARK_OAK_PLANKS.getDefaultState());
            context.getStack().damage(1, context.getPlayer(), slot);
            world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_AXE_STRIP, SoundCategory.NEUTRAL, 1.0f, 1.0f);
            finished = true;
        }
        else if(clickedBlock == Blocks.DARK_OAK_LOG) {
            world.setBlockState(positionClicked, ModBlocks.DECORATED_DARK_OAK_LOG.getDefaultState().with(DecoratedLogBlock.AXIS, state.get(DecoratedLogBlock.AXIS)));
            context.getStack().damage(1, context.getPlayer(), slot);
            world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_AXE_STRIP, SoundCategory.NEUTRAL, 1.0f, 1.0f);
            finished = true;
        }
        else if(clickedBlock == Blocks.DARK_OAK_WOOD) {
            world.setBlockState(positionClicked, ModBlocks.DECORATED_DARK_OAK_WOOD.getDefaultState().with(DecoratedLogBlock.AXIS, state.get(DecoratedLogBlock.AXIS)));
            context.getStack().damage(1, context.getPlayer(), slot);
            world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_AXE_STRIP, SoundCategory.NEUTRAL, 1.0f, 1.0f);
            finished = true;
        }
        else if(clickedBlock == Blocks.STRIPPED_DARK_OAK_LOG) {
            world.setBlockState(positionClicked, ModBlocks.DECORATED_STRIPPED_DARK_OAK_LOG.getDefaultState().with(DecoratedLogBlock.AXIS, state.get(DecoratedLogBlock.AXIS)));
            context.getStack().damage(1, context.getPlayer(), slot);
            world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_AXE_STRIP, SoundCategory.NEUTRAL, 1.0f, 1.0f);
            finished = true;
        }
        else if(clickedBlock == Blocks.STRIPPED_DARK_OAK_WOOD) {
            world.setBlockState(positionClicked, ModBlocks.DECORATED_STRIPPED_DARK_OAK_WOOD.getDefaultState().with(DecoratedLogBlock.AXIS, state.get(DecoratedLogBlock.AXIS)));
            context.getStack().damage(1, context.getPlayer(), slot);
            world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_AXE_STRIP, SoundCategory.NEUTRAL, 1.0f, 1.0f);
            finished = true;
        }
        //Crimson
        else if(clickedBlock == Blocks.CRIMSON_PLANKS) {
            world.setBlockState(positionClicked, ModBlocks.DECORATED_CRIMSON_PLANKS.getDefaultState());
            context.getStack().damage(1, context.getPlayer(), slot);
            world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_AXE_STRIP, SoundCategory.NEUTRAL, 1.0f, 1.0f);
            finished = true;
        }
        else if(clickedBlock == Blocks.CRIMSON_STEM) {
            world.setBlockState(positionClicked, ModBlocks.DECORATED_CRIMSON_STEM.getDefaultState().with(DecoratedLogBlock.AXIS, state.get(DecoratedLogBlock.AXIS)));
            context.getStack().damage(1, context.getPlayer(), slot);
            world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_AXE_STRIP, SoundCategory.NEUTRAL, 1.0f, 1.0f);
            finished = true;
        }
        else if(clickedBlock == Blocks.CRIMSON_HYPHAE) {
            world.setBlockState(positionClicked, ModBlocks.DECORATED_CRIMSON_HYPHAE.getDefaultState().with(DecoratedLogBlock.AXIS, state.get(DecoratedLogBlock.AXIS)));
            context.getStack().damage(1, context.getPlayer(), slot);
            world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_AXE_STRIP, SoundCategory.NEUTRAL, 1.0f, 1.0f);
            finished = true;
        }
        else if(clickedBlock == Blocks.STRIPPED_CRIMSON_STEM) {
            world.setBlockState(positionClicked, ModBlocks.DECORATED_STRIPPED_CRIMSON_STEM.getDefaultState().with(DecoratedLogBlock.AXIS, state.get(DecoratedLogBlock.AXIS)));
            context.getStack().damage(1, context.getPlayer(), slot);
            world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_AXE_STRIP, SoundCategory.NEUTRAL, 1.0f, 1.0f);
            finished = true;
        }
        else if(clickedBlock == Blocks.STRIPPED_CRIMSON_HYPHAE) {
            world.setBlockState(positionClicked, ModBlocks.DECORATED_STRIPPED_CRIMSON_HYPHAE.getDefaultState().with(DecoratedLogBlock.AXIS, state.get(DecoratedLogBlock.AXIS)));
            context.getStack().damage(1, context.getPlayer(), slot);
            world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_AXE_STRIP, SoundCategory.NEUTRAL, 1.0f, 1.0f);
            finished = true;
        }
        //Warped
        else if(clickedBlock == Blocks.WARPED_PLANKS) {
            world.setBlockState(positionClicked, ModBlocks.DECORATED_WARPED_PLANKS.getDefaultState());
            context.getStack().damage(1, context.getPlayer(), slot);
            world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_AXE_STRIP, SoundCategory.NEUTRAL, 1.0f, 1.0f);
            finished = true;
        }
        else if(clickedBlock == Blocks.WARPED_STEM) {
            world.setBlockState(positionClicked, ModBlocks.DECORATED_WARPED_STEM.getDefaultState().with(DecoratedLogBlock.AXIS, state.get(DecoratedLogBlock.AXIS)));
            context.getStack().damage(1, context.getPlayer(), slot);
            world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_AXE_STRIP, SoundCategory.NEUTRAL, 1.0f, 1.0f);
            finished = true;
        }
        else if(clickedBlock == Blocks.WARPED_HYPHAE) {
            world.setBlockState(positionClicked, ModBlocks.DECORATED_WARPED_HYPHAE.getDefaultState().with(DecoratedLogBlock.AXIS, state.get(DecoratedLogBlock.AXIS)));
            context.getStack().damage(1, context.getPlayer(), slot);
            world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_AXE_STRIP, SoundCategory.NEUTRAL, 1.0f, 1.0f);
            finished = true;
        }
        else if(clickedBlock == Blocks.STRIPPED_WARPED_STEM) {
            world.setBlockState(positionClicked, ModBlocks.DECORATED_STRIPPED_WARPED_STEM.getDefaultState().with(DecoratedLogBlock.AXIS, state.get(DecoratedLogBlock.AXIS)));
            context.getStack().damage(1, context.getPlayer(), slot);
            world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_AXE_STRIP, SoundCategory.NEUTRAL, 1.0f, 1.0f);
            finished = true;
        }
        else if(clickedBlock == Blocks.STRIPPED_WARPED_HYPHAE) {
            world.setBlockState(positionClicked, ModBlocks.DECORATED_STRIPPED_WARPED_HYPHAE.getDefaultState().with(DecoratedLogBlock.AXIS, state.get(DecoratedLogBlock.AXIS)));
            context.getStack().damage(1, context.getPlayer(), slot);
            world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_AXE_STRIP, SoundCategory.NEUTRAL, 1.0f, 1.0f);
            finished = true;
        }

        if(finished)
            return ActionResult.success(true);

        return super.useOnBlock(context);
    }
}
