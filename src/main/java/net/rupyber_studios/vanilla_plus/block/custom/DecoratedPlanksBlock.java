package net.rupyber_studios.vanilla_plus.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.rupyber_studios.vanilla_plus.block.ModBlocks;

public class DecoratedPlanksBlock extends Block {
    public DecoratedPlanksBlock(Settings settings) {
        super(settings);
    }

    public Block getDecoratedLog() {
        if(this == ModBlocks.DECORATED_OAK_PLANKS) return ModBlocks.DECORATED_OAK_LOG;
        if(this == ModBlocks.DECORATED_SPRUCE_PLANKS) return ModBlocks.DECORATED_SPRUCE_LOG;
        if(this == ModBlocks.DECORATED_BIRCH_PLANKS) return ModBlocks.DECORATED_BIRCH_LOG;
        if(this == ModBlocks.DECORATED_ACACIA_PLANKS) return ModBlocks.DECORATED_ACACIA_LOG;
        if(this == ModBlocks.DECORATED_JUNGLE_PLANKS) return ModBlocks.DECORATED_JUNGLE_LOG;
        if(this == ModBlocks.DECORATED_DARK_OAK_PLANKS) return ModBlocks.DECORATED_DARK_OAK_LOG;
        if(this == ModBlocks.DECORATED_CRIMSON_PLANKS) return ModBlocks.DECORATED_CRIMSON_STEM;
        if(this == ModBlocks.DECORATED_WARPED_PLANKS) return ModBlocks.DECORATED_WARPED_STEM;
        return Blocks.AIR;
    }

    public Block getDecoratedStrippedLog() {
        if(this == ModBlocks.DECORATED_OAK_PLANKS) return ModBlocks.DECORATED_STRIPPED_OAK_LOG;
        if(this == ModBlocks.DECORATED_SPRUCE_PLANKS) return ModBlocks.DECORATED_STRIPPED_SPRUCE_LOG;
        if(this == ModBlocks.DECORATED_BIRCH_PLANKS) return ModBlocks.DECORATED_STRIPPED_BIRCH_LOG;
        if(this == ModBlocks.DECORATED_ACACIA_PLANKS) return ModBlocks.DECORATED_STRIPPED_ACACIA_LOG;
        if(this == ModBlocks.DECORATED_JUNGLE_PLANKS) return ModBlocks.DECORATED_STRIPPED_JUNGLE_LOG;
        if(this == ModBlocks.DECORATED_DARK_OAK_PLANKS) return ModBlocks.DECORATED_STRIPPED_DARK_OAK_LOG;
        if(this == ModBlocks.DECORATED_CRIMSON_PLANKS) return ModBlocks.DECORATED_STRIPPED_CRIMSON_STEM;
        if(this == ModBlocks.DECORATED_WARPED_PLANKS) return ModBlocks.DECORATED_STRIPPED_WARPED_STEM;
        return Blocks.AIR;
    }

    public Block getDecoratedWood() {
        if(this == ModBlocks.DECORATED_OAK_PLANKS) return ModBlocks.DECORATED_OAK_WOOD;
        if(this == ModBlocks.DECORATED_SPRUCE_PLANKS) return ModBlocks.DECORATED_SPRUCE_WOOD;
        if(this == ModBlocks.DECORATED_BIRCH_PLANKS) return ModBlocks.DECORATED_BIRCH_WOOD;
        if(this == ModBlocks.DECORATED_ACACIA_PLANKS) return ModBlocks.DECORATED_ACACIA_WOOD;
        if(this == ModBlocks.DECORATED_JUNGLE_PLANKS) return ModBlocks.DECORATED_JUNGLE_WOOD;
        if(this == ModBlocks.DECORATED_DARK_OAK_PLANKS) return ModBlocks.DECORATED_DARK_OAK_WOOD;
        if(this == ModBlocks.DECORATED_CRIMSON_PLANKS) return ModBlocks.DECORATED_CRIMSON_HYPHAE;
        if(this == ModBlocks.DECORATED_WARPED_PLANKS) return ModBlocks.DECORATED_WARPED_HYPHAE;
        return Blocks.AIR;
    }

    public Block getDecoratedStrippedWood() {
        if(this == ModBlocks.DECORATED_OAK_PLANKS) return ModBlocks.DECORATED_STRIPPED_OAK_WOOD;
        if(this == ModBlocks.DECORATED_SPRUCE_PLANKS) return ModBlocks.DECORATED_STRIPPED_SPRUCE_WOOD;
        if(this == ModBlocks.DECORATED_BIRCH_PLANKS) return ModBlocks.DECORATED_STRIPPED_BIRCH_WOOD;
        if(this == ModBlocks.DECORATED_ACACIA_PLANKS) return ModBlocks.DECORATED_STRIPPED_ACACIA_WOOD;
        if(this == ModBlocks.DECORATED_JUNGLE_PLANKS) return ModBlocks.DECORATED_STRIPPED_JUNGLE_WOOD;
        if(this == ModBlocks.DECORATED_DARK_OAK_PLANKS) return ModBlocks.DECORATED_STRIPPED_DARK_OAK_WOOD;
        if(this == ModBlocks.DECORATED_CRIMSON_PLANKS) return ModBlocks.DECORATED_STRIPPED_CRIMSON_HYPHAE;
        if(this == ModBlocks.DECORATED_WARPED_PLANKS) return ModBlocks.DECORATED_STRIPPED_WARPED_HYPHAE;
        return Blocks.AIR;
    }
}