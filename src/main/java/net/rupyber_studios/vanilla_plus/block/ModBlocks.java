package net.rupyber_studios.vanilla_plus.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.rupyber_studios.vanilla_plus.VanillaPlus;
import net.rupyber_studios.vanilla_plus.block.custom.*;
import net.rupyber_studios.vanilla_plus.item.ModItemGroups;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    private static final AbstractBlock.Settings WOOD_SETTINGS = AbstractBlock.Settings.copy(Blocks.OAK_PLANKS);
    private static final AbstractBlock.Settings NETHER_WOOD_SETTINGS = AbstractBlock.Settings.copy(Blocks.CRIMSON_PLANKS);
    private static final AbstractBlock.Settings DEEP_OCEAN_SETTINGS = AbstractBlock.Settings.copy(Blocks.STONE)
            .strength(2.0F, 60.F).mapColor(MapColor.DARK_AQUA);
    private static final AbstractBlock.Settings STONE_SETTINGS = AbstractBlock.Settings.copy(Blocks.STONE);
    private static final AbstractBlock.Settings LANTERN_SETTINGS = AbstractBlock.Settings.copy(Blocks.LANTERN).nonOpaque();

    public static final List<Block> ALL = new ArrayList<>();

    // Oak
    public static final Block DECORATED_OAK_PLANKS = registerDecorativeBlock("decorated_oak_planks",
            new Block(WOOD_SETTINGS.mapColor(MapColor.OAK_TAN)));
    public static final Block DECORATED_OAK_LOG = registerDecorativeBlock("decorated_oak_log",
            new DecoratedLogBlock(WOOD_SETTINGS.mapColor(MapColor.OAK_TAN)));
    public static final Block DECORATED_OAK_WOOD = registerDecorativeBlock("decorated_oak_wood",
            new DecoratedLogBlock(WOOD_SETTINGS.mapColor(MapColor.OAK_TAN)));
    public static final Block DECORATED_STRIPPED_OAK_LOG = registerDecorativeBlock("decorated_stripped_oak_log",
            new DecoratedLogBlock(WOOD_SETTINGS.mapColor(MapColor.OAK_TAN)));
    public static final Block DECORATED_STRIPPED_OAK_WOOD = registerDecorativeBlock("decorated_stripped_oak_wood",
            new DecoratedLogBlock(WOOD_SETTINGS.mapColor(MapColor.OAK_TAN)));
    public static final Block OAK_TABLE = registerDecorativeBlock("oak_table",
            new TableBlock(WOOD_SETTINGS.nonOpaque().mapColor(MapColor.OAK_TAN)));
    public static final Block HOLLOW_OAK_LOG = registerDecorativeBlock("hollow_oak_log",
            new HollowLogBlock(WOOD_SETTINGS.nonOpaque().mapColor(MapColor.OAK_TAN)));
    public static final Block STRIPPED_HOLLOW_OAK_LOG = registerDecorativeBlock("stripped_hollow_oak_log",
            new HollowLogBlock(WOOD_SETTINGS.nonOpaque().mapColor(MapColor.OAK_TAN)));
    //Spruce
    public static final Block DECORATED_SPRUCE_PLANKS = registerDecorativeBlock("decorated_spruce_planks",
            new Block(WOOD_SETTINGS.mapColor(MapColor.SPRUCE_BROWN)));
    public static final Block DECORATED_SPRUCE_LOG = registerDecorativeBlock("decorated_spruce_log",
            new DecoratedLogBlock(WOOD_SETTINGS.mapColor(MapColor.SPRUCE_BROWN)));
    public static final Block DECORATED_SPRUCE_WOOD = registerDecorativeBlock("decorated_spruce_wood",
            new DecoratedLogBlock(WOOD_SETTINGS.mapColor(MapColor.SPRUCE_BROWN)));
    public static final Block DECORATED_STRIPPED_SPRUCE_LOG = registerDecorativeBlock("decorated_stripped_spruce_log",
            new DecoratedLogBlock(WOOD_SETTINGS.mapColor(MapColor.SPRUCE_BROWN)));
    public static final Block DECORATED_STRIPPED_SPRUCE_WOOD = registerDecorativeBlock("decorated_stripped_spruce_wood",
            new DecoratedLogBlock(WOOD_SETTINGS.mapColor(MapColor.SPRUCE_BROWN)));
    public static final Block SPRUCE_TABLE = registerDecorativeBlock("spruce_table",
            new TableBlock(WOOD_SETTINGS.nonOpaque().mapColor(MapColor.SPRUCE_BROWN)));
    public static final Block HOLLOW_SPRUCE_LOG = registerDecorativeBlock("hollow_spruce_log",
            new HollowLogBlock(WOOD_SETTINGS.nonOpaque().mapColor(MapColor.SPRUCE_BROWN)));
    public static final Block STRIPPED_HOLLOW_SPRUCE_LOG = registerDecorativeBlock("stripped_hollow_spruce_log",
            new HollowLogBlock(WOOD_SETTINGS.nonOpaque().mapColor(MapColor.SPRUCE_BROWN)));
    //Birch
    public static final Block DECORATED_BIRCH_PLANKS = registerDecorativeBlock("decorated_birch_planks",
            new Block(WOOD_SETTINGS.mapColor(MapColor.PALE_YELLOW)));
    public static final Block DECORATED_BIRCH_LOG = registerDecorativeBlock("decorated_birch_log",
            new DecoratedLogBlock(WOOD_SETTINGS.mapColor(MapColor.PALE_YELLOW)));
    public static final Block DECORATED_BIRCH_WOOD = registerDecorativeBlock("decorated_birch_wood",
            new DecoratedLogBlock(WOOD_SETTINGS.mapColor(MapColor.PALE_YELLOW)));
    public static final Block DECORATED_STRIPPED_BIRCH_LOG = registerDecorativeBlock("decorated_stripped_birch_log",
            new DecoratedLogBlock(WOOD_SETTINGS.mapColor(MapColor.PALE_YELLOW)));
    public static final Block DECORATED_STRIPPED_BIRCH_WOOD = registerDecorativeBlock("decorated_stripped_birch_wood",
            new DecoratedLogBlock(WOOD_SETTINGS.mapColor(MapColor.PALE_YELLOW)));
    public static final Block BIRCH_TABLE = registerDecorativeBlock("birch_table",
            new TableBlock(WOOD_SETTINGS.nonOpaque().mapColor(MapColor.PALE_YELLOW)));
    public static final Block HOLLOW_BIRCH_LOG = registerDecorativeBlock("hollow_birch_log",
            new HollowLogBlock(WOOD_SETTINGS.nonOpaque().mapColor(MapColor.PALE_YELLOW)));
    public static final Block STRIPPED_HOLLOW_BIRCH_LOG = registerDecorativeBlock("stripped_hollow_birch_log",
            new HollowLogBlock(WOOD_SETTINGS.nonOpaque().mapColor(MapColor.PALE_YELLOW)));
    //Acacia
    public static final Block DECORATED_ACACIA_PLANKS = registerDecorativeBlock("decorated_acacia_planks",
            new Block(WOOD_SETTINGS.mapColor(MapColor.ORANGE)));
    public static final Block DECORATED_ACACIA_LOG = registerDecorativeBlock("decorated_acacia_log",
            new DecoratedLogBlock(WOOD_SETTINGS.mapColor(MapColor.ORANGE)));
    public static final Block DECORATED_ACACIA_WOOD = registerDecorativeBlock("decorated_acacia_wood",
            new DecoratedLogBlock(WOOD_SETTINGS.mapColor(MapColor.ORANGE)));
    public static final Block DECORATED_STRIPPED_ACACIA_LOG = registerDecorativeBlock("decorated_stripped_acacia_log",
            new DecoratedLogBlock(WOOD_SETTINGS.mapColor(MapColor.ORANGE)));
    public static final Block DECORATED_STRIPPED_ACACIA_WOOD = registerDecorativeBlock("decorated_stripped_acacia_wood",
            new DecoratedLogBlock(WOOD_SETTINGS.mapColor(MapColor.ORANGE)));
    public static final Block ACACIA_TABLE = registerDecorativeBlock("acacia_table",
            new TableBlock(WOOD_SETTINGS.nonOpaque().mapColor(MapColor.ORANGE)));
    public static final Block HOLLOW_ACACIA_LOG = registerDecorativeBlock("hollow_acacia_log",
            new HollowLogBlock(WOOD_SETTINGS.nonOpaque().mapColor(MapColor.ORANGE)));
    public static final Block STRIPPED_HOLLOW_ACACIA_LOG = registerDecorativeBlock("stripped_hollow_acacia_log",
            new HollowLogBlock(WOOD_SETTINGS.nonOpaque().mapColor(MapColor.ORANGE)));
    //Jungle
    public static final Block DECORATED_JUNGLE_PLANKS = registerDecorativeBlock("decorated_jungle_planks",
            new Block(WOOD_SETTINGS.mapColor(MapColor.DIRT_BROWN)));
    public static final Block DECORATED_JUNGLE_LOG = registerDecorativeBlock("decorated_jungle_log",
            new DecoratedLogBlock(WOOD_SETTINGS.mapColor(MapColor.DIRT_BROWN)));
    public static final Block DECORATED_JUNGLE_WOOD = registerDecorativeBlock("decorated_jungle_wood",
            new DecoratedLogBlock(WOOD_SETTINGS.mapColor(MapColor.DIRT_BROWN)));
    public static final Block DECORATED_STRIPPED_JUNGLE_LOG = registerDecorativeBlock("decorated_stripped_jungle_log",
            new DecoratedLogBlock(WOOD_SETTINGS.mapColor(MapColor.DIRT_BROWN)));
    public static final Block DECORATED_STRIPPED_JUNGLE_WOOD = registerDecorativeBlock("decorated_stripped_jungle_wood",
            new DecoratedLogBlock(WOOD_SETTINGS.mapColor(MapColor.DIRT_BROWN)));
    public static final Block JUNGLE_TABLE = registerDecorativeBlock("jungle_table",
            new TableBlock(WOOD_SETTINGS.nonOpaque().mapColor(MapColor.DIRT_BROWN)));
    public static final Block HOLLOW_JUNGLE_LOG = registerDecorativeBlock("hollow_jungle_log",
            new HollowLogBlock(WOOD_SETTINGS.nonOpaque().mapColor(MapColor.DIRT_BROWN)));
    public static final Block STRIPPED_HOLLOW_JUNGLE_LOG = registerDecorativeBlock("stripped_hollow_jungle_log",
            new HollowLogBlock(WOOD_SETTINGS.nonOpaque().mapColor(MapColor.DIRT_BROWN)));
    //Dark Oak
    public static final Block DECORATED_DARK_OAK_PLANKS = registerDecorativeBlock("decorated_dark_oak_planks",
            new Block(WOOD_SETTINGS.mapColor(MapColor.BROWN)));
    public static final Block DECORATED_DARK_OAK_LOG = registerDecorativeBlock("decorated_dark_oak_log",
            new DecoratedLogBlock(WOOD_SETTINGS.mapColor(MapColor.BROWN)));
    public static final Block DECORATED_DARK_OAK_WOOD = registerDecorativeBlock("decorated_dark_oak_wood",
            new DecoratedLogBlock(WOOD_SETTINGS.mapColor(MapColor.BROWN)));
    public static final Block DECORATED_STRIPPED_DARK_OAK_LOG = registerDecorativeBlock("decorated_stripped_dark_oak_log",
            new DecoratedLogBlock(WOOD_SETTINGS.mapColor(MapColor.BROWN)));
    public static final Block DECORATED_STRIPPED_DARK_OAK_WOOD = registerDecorativeBlock("decorated_stripped_dark_oak_wood",
            new DecoratedLogBlock(WOOD_SETTINGS.mapColor(MapColor.BROWN)));
    public static final Block DARK_OAK_TABLE = registerDecorativeBlock("dark_oak_table",
            new TableBlock(WOOD_SETTINGS.nonOpaque().mapColor(MapColor.BROWN)));
    public static final Block HOLLOW_DARK_OAK_LOG = registerDecorativeBlock("hollow_dark_oak_log",
            new HollowLogBlock(WOOD_SETTINGS.nonOpaque().mapColor(MapColor.BROWN)));
    public static final Block STRIPPED_HOLLOW_DARK_OAK_LOG = registerDecorativeBlock("stripped_hollow_dark_oak_log",
            new HollowLogBlock(WOOD_SETTINGS.nonOpaque().mapColor(MapColor.BROWN)));
    //Crimson
    public static final Block DECORATED_CRIMSON_PLANKS = registerDecorativeBlock("decorated_crimson_planks",
            new Block(NETHER_WOOD_SETTINGS.mapColor(Blocks.CRIMSON_PLANKS.getDefaultMapColor())));
    public static final Block DECORATED_CRIMSON_STEM = registerDecorativeBlock("decorated_crimson_stem",
            new DecoratedLogBlock(NETHER_WOOD_SETTINGS.mapColor(Blocks.CRIMSON_PLANKS.getDefaultMapColor())));
    public static final Block DECORATED_CRIMSON_HYPHAE = registerDecorativeBlock("decorated_crimson_hyphae",
            new DecoratedLogBlock(NETHER_WOOD_SETTINGS.mapColor(Blocks.CRIMSON_PLANKS.getDefaultMapColor())));
    public static final Block DECORATED_STRIPPED_CRIMSON_STEM = registerDecorativeBlock("decorated_stripped_crimson_stem",
            new DecoratedLogBlock(NETHER_WOOD_SETTINGS.mapColor(Blocks.CRIMSON_PLANKS.getDefaultMapColor())));
    public static final Block DECORATED_STRIPPED_CRIMSON_HYPHAE = registerDecorativeBlock("decorated_stripped_crimson_hyphae",
            new DecoratedLogBlock(NETHER_WOOD_SETTINGS.mapColor(Blocks.CRIMSON_PLANKS.getDefaultMapColor())));
    public static final Block CRIMSON_TABLE = registerDecorativeBlock("crimson_table",
            new TableBlock(NETHER_WOOD_SETTINGS.nonOpaque().mapColor(Blocks.CRIMSON_PLANKS.getDefaultMapColor())));
    public static final Block HOLLOW_CRIMSON_STEM = registerDecorativeBlock("hollow_crimson_stem",
            new HollowLogBlock(NETHER_WOOD_SETTINGS.nonOpaque().mapColor(Blocks.CRIMSON_PLANKS.getDefaultMapColor())));
    public static final Block STRIPPED_HOLLOW_CRIMSON_STEM = registerDecorativeBlock("stripped_hollow_crimson_stem",
            new HollowLogBlock(NETHER_WOOD_SETTINGS.nonOpaque().mapColor(Blocks.CRIMSON_PLANKS.getDefaultMapColor())));
    //Warped
    public static final Block DECORATED_WARPED_PLANKS = registerDecorativeBlock("decorated_warped_planks",
            new Block(NETHER_WOOD_SETTINGS.mapColor(Blocks.WARPED_PLANKS.getDefaultMapColor())));
    public static final Block DECORATED_WARPED_STEM = registerDecorativeBlock("decorated_warped_stem",
            new DecoratedLogBlock(NETHER_WOOD_SETTINGS.mapColor(Blocks.WARPED_PLANKS.getDefaultMapColor())));
    public static final Block DECORATED_WARPED_HYPHAE = registerDecorativeBlock("decorated_warped_hyphae",
            new DecoratedLogBlock(NETHER_WOOD_SETTINGS.mapColor(Blocks.WARPED_PLANKS.getDefaultMapColor())));
    public static final Block DECORATED_STRIPPED_WARPED_STEM = registerDecorativeBlock("decorated_stripped_warped_stem",
            new DecoratedLogBlock(NETHER_WOOD_SETTINGS.mapColor(Blocks.WARPED_PLANKS.getDefaultMapColor())));
    public static final Block DECORATED_STRIPPED_WARPED_HYPHAE = registerDecorativeBlock("decorated_stripped_warped_hyphae",
            new DecoratedLogBlock(NETHER_WOOD_SETTINGS.mapColor(Blocks.WARPED_PLANKS.getDefaultMapColor())));
    public static final Block WARPED_TABLE = registerDecorativeBlock("warped_table",
            new TableBlock(NETHER_WOOD_SETTINGS.nonOpaque().mapColor(Blocks.WARPED_PLANKS.getDefaultMapColor())));
    public static final Block HOLLOW_WARPED_STEM = registerDecorativeBlock("hollow_warped_stem",
            new HollowLogBlock(NETHER_WOOD_SETTINGS.nonOpaque().mapColor(Blocks.WARPED_PLANKS.getDefaultMapColor())));
    public static final Block STRIPPED_HOLLOW_WARPED_STEM = registerDecorativeBlock("stripped_hollow_warped_stem",
            new HollowLogBlock(NETHER_WOOD_SETTINGS.nonOpaque().mapColor(Blocks.WARPED_PLANKS.getDefaultMapColor())));

    //Deep Ocean
    public static final Block DEEP_OCEAN_BRICKS = registerDecorativeBlock("deep_ocean_bricks",
            new Block(DEEP_OCEAN_SETTINGS));
    public static final Block DEEP_OCEAN_BRICK_SLAB = registerDecorativeBlock("deep_ocean_brick_slab",
            new SlabBlock(DEEP_OCEAN_SETTINGS));
    public static final Block DEEP_OCEAN_BRICK_VERTICAL_SLAB = registerDecorativeBlock("deep_ocean_brick_vertical_slab",
            new VerticalSlabBlock(DEEP_OCEAN_SETTINGS));
    public static final Block DEEP_OCEAN_BRICK_STAIRS = registerDecorativeBlock("deep_ocean_brick_stairs",
            new StairsBlock(ModBlocks.DEEP_OCEAN_BRICKS.getDefaultState(), DEEP_OCEAN_SETTINGS));
    public static final Block DEEP_OCEAN_BRICK_WALL = registerDecorativeBlock("deep_ocean_brick_wall",
            new WallBlock(DEEP_OCEAN_SETTINGS));
    public static final Block CHISELED_DEEP_OCEAN_BRICKS = registerDecorativeBlock("chiseled_deep_ocean_bricks",
            new Block(DEEP_OCEAN_SETTINGS));

    //Vertical Slabs
    public static final Block OAK_VERTICAL_SLAB = registerDecorativeBlock("oak_vertical_slab",
            new VerticalSlabBlock(WOOD_SETTINGS.mapColor(MapColor.OAK_TAN)));
    public static final Block SPRUCE_VERTICAL_SLAB = registerDecorativeBlock("spruce_vertical_slab",
            new VerticalSlabBlock(WOOD_SETTINGS.mapColor(MapColor.SPRUCE_BROWN)));
    public static final Block BIRCH_VERTICAL_SLAB = registerDecorativeBlock("birch_vertical_slab",
            new VerticalSlabBlock(WOOD_SETTINGS.mapColor(MapColor.PALE_YELLOW)));
    public static final Block JUNGLE_VERTICAL_SLAB = registerDecorativeBlock("jungle_vertical_slab",
            new VerticalSlabBlock(WOOD_SETTINGS.mapColor(MapColor.DIRT_BROWN)));
    public static final Block ACACIA_VERTICAL_SLAB = registerDecorativeBlock("acacia_vertical_slab",
            new VerticalSlabBlock(WOOD_SETTINGS.mapColor(MapColor.ORANGE)));
    public static final Block DARK_OAK_VERTICAL_SLAB = registerDecorativeBlock("dark_oak_vertical_slab",
            new VerticalSlabBlock(WOOD_SETTINGS.mapColor(MapColor.BROWN)));
    public static final Block CRIMSON_VERTICAL_SLAB = registerDecorativeBlock("crimson_vertical_slab",
            new VerticalSlabBlock(NETHER_WOOD_SETTINGS.mapColor(Blocks.CRIMSON_PLANKS.getDefaultMapColor())));
    public static final Block WARPED_VERTICAL_SLAB = registerDecorativeBlock("warped_vertical_slab",
            new VerticalSlabBlock(NETHER_WOOD_SETTINGS.mapColor(Blocks.WARPED_PLANKS.getDefaultMapColor())));
    public static final Block STONE_VERTICAL_SLAB = registerDecorativeBlock("stone_vertical_slab",
            new VerticalSlabBlock(STONE_SETTINGS.mapColor(MapColor.STONE_GRAY)));
    public static final Block SMOOTH_STONE_VERTICAL_SLAB = registerDecorativeBlock("smooth_stone_vertical_slab",
            new SmoothStoneVerticalSlabBlock(STONE_SETTINGS.mapColor(MapColor.STONE_GRAY)));
    public static final Block COBBLESTONE_VERTICAL_SLAB = registerDecorativeBlock("cobblestone_vertical_slab",
            new VerticalSlabBlock(STONE_SETTINGS.mapColor(MapColor.STONE_GRAY)));
    public static final Block MOSSY_COBBLESTONE_VERTICAL_SLAB = registerDecorativeBlock("mossy_cobblestone_vertical_slab",
            new VerticalSlabBlock(STONE_SETTINGS));
    public static final Block STONE_BRICK_VERTICAL_SLAB = registerDecorativeBlock("stone_brick_vertical_slab",
            new VerticalSlabBlock(STONE_SETTINGS.mapColor(MapColor.STONE_GRAY)));
    public static final Block MOSSY_STONE_BRICK_VERTICAL_SLAB = registerDecorativeBlock("mossy_stone_brick_vertical_slab",
            new VerticalSlabBlock(STONE_SETTINGS));
    public static final Block ANDESITE_VERTICAL_SLAB = registerDecorativeBlock("andesite_vertical_slab",
            new VerticalSlabBlock(STONE_SETTINGS.mapColor(MapColor.STONE_GRAY)));
    public static final Block POLISHED_ANDESITE_VERTICAL_SLAB = registerDecorativeBlock("polished_andesite_vertical_slab",
            new VerticalSlabBlock(STONE_SETTINGS.mapColor(MapColor.STONE_GRAY)));
    public static final Block DIORITE_VERTICAL_SLAB = registerDecorativeBlock("diorite_vertical_slab",
            new VerticalSlabBlock(STONE_SETTINGS.mapColor(MapColor.OFF_WHITE)));
    public static final Block POLISHED_DIORITE_VERTICAL_SLAB = registerDecorativeBlock("polished_diorite_vertical_slab",
            new VerticalSlabBlock(STONE_SETTINGS.mapColor(MapColor.OFF_WHITE)));
    public static final Block GRANITE_VERTICAL_SLAB = registerDecorativeBlock("granite_vertical_slab",
            new VerticalSlabBlock(STONE_SETTINGS.mapColor(MapColor.DIRT_BROWN)));
    public static final Block POLISHED_GRANITE_VERTICAL_SLAB = registerDecorativeBlock("polished_granite_vertical_slab",
            new VerticalSlabBlock(STONE_SETTINGS.mapColor(MapColor.DIRT_BROWN)));
    public static final Block SANDSTONE_VERTICAL_SLAB = registerDecorativeBlock("sandstone_vertical_slab",
            new VerticalSlabBlock(STONE_SETTINGS.mapColor(MapColor.PALE_YELLOW)));
    public static final Block CUT_SANDSTONE_VERTICAL_SLAB = registerDecorativeBlock("cut_sandstone_vertical_slab",
            new VerticalSlabBlock(STONE_SETTINGS.mapColor(MapColor.PALE_YELLOW)));
    public static final Block SMOOTH_SANDSTONE_VERTICAL_SLAB = registerDecorativeBlock("smooth_sandstone_vertical_slab",
            new VerticalSlabBlock(STONE_SETTINGS.mapColor(MapColor.PALE_YELLOW)));
    public static final Block RED_SANDSTONE_VERTICAL_SLAB = registerDecorativeBlock("red_sandstone_vertical_slab",
            new VerticalSlabBlock(STONE_SETTINGS.mapColor(MapColor.ORANGE)));
    public static final Block CUT_RED_SANDSTONE_VERTICAL_SLAB = registerDecorativeBlock("cut_red_sandstone_vertical_slab",
            new VerticalSlabBlock(STONE_SETTINGS.mapColor(MapColor.ORANGE)));
    public static final Block SMOOTH_RED_SANDSTONE_VERTICAL_SLAB = registerDecorativeBlock("smooth_red_sandstone_vertical_slab",
            new VerticalSlabBlock(STONE_SETTINGS.mapColor(MapColor.ORANGE)));
    public static final Block BRICK_VERTICAL_SLAB = registerDecorativeBlock("brick_vertical_slab",
            new VerticalSlabBlock(STONE_SETTINGS.mapColor(MapColor.RED)));
    public static final Block PRISMARINE_VERTICAL_SLAB = registerDecorativeBlock("prismarine_vertical_slab",
            new VerticalSlabBlock(STONE_SETTINGS.mapColor(MapColor.CYAN)));
    public static final Block PRISMARINE_BRICK_VERTICAL_SLAB = registerDecorativeBlock("prismarine_brick_vertical_slab",
            new VerticalSlabBlock(STONE_SETTINGS.mapColor(MapColor.DIAMOND_BLUE)));
    public static final Block DARK_PRISMARINE_VERTICAL_SLAB = registerDecorativeBlock("dark_prismarine_vertical_slab",
            new VerticalSlabBlock(STONE_SETTINGS.mapColor(MapColor.DIAMOND_BLUE)));
    public static final Block NETHER_BRICK_VERTICAL_SLAB = registerDecorativeBlock("nether_brick_vertical_slab",
            new VerticalSlabBlock(STONE_SETTINGS.mapColor(MapColor.DARK_RED)));
    public static final Block RED_NETHER_BRICK_VERTICAL_SLAB = registerDecorativeBlock("red_nether_brick_vertical_slab",
            new VerticalSlabBlock(STONE_SETTINGS.mapColor(MapColor.DARK_RED)));
    public static final Block QUARTZ_VERTICAL_SLAB = registerDecorativeBlock("quartz_vertical_slab",
            new VerticalSlabBlock(STONE_SETTINGS.mapColor(MapColor.OFF_WHITE)));
    public static final Block SMOOTH_QUARTZ_VERTICAL_SLAB = registerDecorativeBlock("smooth_quartz_vertical_slab",
            new VerticalSlabBlock(STONE_SETTINGS.mapColor(MapColor.OFF_WHITE)));
    public static final Block PURPUR_VERTICAL_SLAB = registerDecorativeBlock("purpur_vertical_slab",
            new VerticalSlabBlock(STONE_SETTINGS.mapColor(MapColor.MAGENTA)));
    public static final Block END_STONE_BRICK_VERTICAL_SLAB = registerDecorativeBlock("end_stone_brick_vertical_slab",
            new VerticalSlabBlock(STONE_SETTINGS.mapColor(MapColor.PALE_YELLOW)));
    public static final Block BLACKSTONE_VERTICAL_SLAB = registerDecorativeBlock("blackstone_vertical_slab",
            new VerticalSlabBlock(STONE_SETTINGS.mapColor(MapColor.BLACK)));
    public static final Block POLISHED_BLACKSTONE_VERTICAL_SLAB = registerDecorativeBlock("polished_blackstone_vertical_slab",
            new VerticalSlabBlock(STONE_SETTINGS.mapColor(MapColor.BLACK)));
    public static final Block POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB = registerDecorativeBlock("polished_blackstone_brick_vertical_slab",
            new VerticalSlabBlock(STONE_SETTINGS.mapColor(MapColor.BLACK)));
    public static final Block WAXED_CUT_COPPER_VERTICAL_SLAB = registerDecorativeBlock("waxed_cut_copper_vertical_slab",
            new VerticalSlabBlock(STONE_SETTINGS.mapColor(MapColor.ORANGE).sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB = registerDecorativeBlock("waxed_exposed_cut_copper_vertical_slab",
            new VerticalSlabBlock(STONE_SETTINGS.mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB = registerDecorativeBlock("waxed_weathered_cut_copper_vertical_slab",
            new VerticalSlabBlock(STONE_SETTINGS.mapColor(MapColor.DARK_AQUA).sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB = registerDecorativeBlock("waxed_oxidized_cut_copper_vertical_slab",
            new VerticalSlabBlock(STONE_SETTINGS.mapColor(MapColor.TEAL).sounds(BlockSoundGroup.COPPER)));
    public static final Block COBBLED_DEEPSLATE_VERTICAL_SLAB = registerDecorativeBlock("cobbled_deepslate_vertical_slab",
            new VerticalSlabBlock(STONE_SETTINGS.mapColor(MapColor.DEEPSLATE_GRAY)));
    public static final Block POLISHED_DEEPSLATE_VERTICAL_SLAB = registerDecorativeBlock("polished_deepslate_vertical_slab",
            new VerticalSlabBlock(STONE_SETTINGS.mapColor(MapColor.DEEPSLATE_GRAY)));
    public static final Block DEEPSLATE_BRICK_VERTICAL_SLAB = registerDecorativeBlock("deepslate_brick_vertical_slab",
            new VerticalSlabBlock(STONE_SETTINGS.mapColor(MapColor.DEEPSLATE_GRAY)));
    public static final Block DEEPSLATE_TILE_VERTICAL_SLAB = registerDecorativeBlock("deepslate_tile_vertical_slab",
            new VerticalSlabBlock(STONE_SETTINGS.mapColor(MapColor.DEEPSLATE_GRAY)));

    //Lanterns
    public static final Block GREEN_LANTERN = registerDecorativeBlock("green_lantern",
            new LanternBlock(LANTERN_SETTINGS));
    public static final Block YELLOW_LANTERN = registerDecorativeBlock("yellow_lantern",
            new LanternBlock(LANTERN_SETTINGS));
    public static final Block RED_LANTERN = registerDecorativeBlock("red_lantern",
            new LanternBlock(LANTERN_SETTINGS));

    private static Block registerDecorativeBlock(String name, Block block) {
        registerDecorativeBlockItem(name, block);
        ALL.add(block);
        return Registry.register(Registries.BLOCK, new Identifier(VanillaPlus.MOD_ID, name), block);
    }

    private static void registerDecorativeBlockItem(String name, Block block) {
        Item registered = Registry.register(Registries.ITEM, new Identifier(VanillaPlus.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
        ItemGroupEvents.modifyEntriesEvent(ModItemGroups.DECORATIVE_BLOCKS).register(entries -> entries.add(registered));
    }

    public static void registerModBlocks() {
        System.out.println("Registering ModBlocks for " + VanillaPlus.MOD_ID);
    }
}