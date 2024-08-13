package net.rupyber_studios.vanilla_plus.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.rupyber_studios.vanilla_plus.VanillaPlus;
import net.rupyber_studios.vanilla_plus.block.custom.*;
import net.rupyber_studios.vanilla_plus.item.ModItemGroups;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    private static final AbstractBlock.Settings DEEP_OCEAN_SETTINGS = AbstractBlock.Settings.copy(Blocks.STONE)
            .strength(2.0F, 60.F).mapColor(MapColor.DARK_AQUA);
    private static final AbstractBlock.Settings LANTERN_SETTINGS = AbstractBlock.Settings.copy(Blocks.LANTERN);

    public static final List<Block> ALL = new ArrayList<>();
    public static final List<ItemConvertible> DECORATED_PLANKS = new ArrayList<>();
    public static final List<ItemConvertible> TABLES = new ArrayList<>();
    public static final List<ItemConvertible> VERTICAL_SLABS = new ArrayList<>();
    public static final List<ItemConvertible> LANTERNS = new ArrayList<>();

    // Oak
    public static final Block DECORATED_OAK_PLANKS = registerDecorativeBlock("decorated_oak_planks",
            new DecoratedPlanksBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block DECORATED_OAK_LOG = registerDecorativeBlock("decorated_oak_log",
            new DecoratedLogBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)));
    public static final Block DECORATED_OAK_WOOD = registerDecorativeBlock("decorated_oak_wood",
            new DecoratedWoodBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block DECORATED_STRIPPED_OAK_LOG = registerDecorativeBlock("decorated_stripped_oak_log",
            new DecoratedLogBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final Block DECORATED_STRIPPED_OAK_WOOD = registerDecorativeBlock("decorated_stripped_oak_wood",
            new DecoratedWoodBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block OAK_TABLE = registerDecorativeBlock("oak_table",
            new TableBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block HOLLOW_OAK_LOG = registerDecorativeBlock("hollow_oak_log",
            new HollowLogBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)));
    public static final Block STRIPPED_HOLLOW_OAK_LOG = registerDecorativeBlock("stripped_hollow_oak_log",
            new HollowLogBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)));
    // Spruce
    public static final Block DECORATED_SPRUCE_PLANKS = registerDecorativeBlock("decorated_spruce_planks",
            new DecoratedPlanksBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS)));
    public static final Block DECORATED_SPRUCE_LOG = registerDecorativeBlock("decorated_spruce_log",
            new DecoratedLogBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_LOG)));
    public static final Block DECORATED_SPRUCE_WOOD = registerDecorativeBlock("decorated_spruce_wood",
            new DecoratedWoodBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_WOOD)));
    public static final Block DECORATED_STRIPPED_SPRUCE_LOG = registerDecorativeBlock("decorated_stripped_spruce_log",
            new DecoratedLogBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_SPRUCE_LOG)));
    public static final Block DECORATED_STRIPPED_SPRUCE_WOOD = registerDecorativeBlock("decorated_stripped_spruce_wood",
            new DecoratedWoodBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_SPRUCE_WOOD)));
    public static final Block SPRUCE_TABLE = registerDecorativeBlock("spruce_table",
            new TableBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS)));
    public static final Block HOLLOW_SPRUCE_LOG = registerDecorativeBlock("hollow_spruce_log",
            new HollowLogBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_LOG)));
    public static final Block STRIPPED_HOLLOW_SPRUCE_LOG = registerDecorativeBlock("stripped_hollow_spruce_log",
            new HollowLogBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_SPRUCE_LOG)));
    // Birch
    public static final Block DECORATED_BIRCH_PLANKS = registerDecorativeBlock("decorated_birch_planks",
            new DecoratedPlanksBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_PLANKS)));
    public static final Block DECORATED_BIRCH_LOG = registerDecorativeBlock("decorated_birch_log",
            new DecoratedLogBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_LOG)));
    public static final Block DECORATED_BIRCH_WOOD = registerDecorativeBlock("decorated_birch_wood",
            new DecoratedWoodBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_WOOD)));
    public static final Block DECORATED_STRIPPED_BIRCH_LOG = registerDecorativeBlock("decorated_stripped_birch_log",
            new DecoratedLogBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_BIRCH_LOG)));
    public static final Block DECORATED_STRIPPED_BIRCH_WOOD = registerDecorativeBlock("decorated_stripped_birch_wood",
            new DecoratedWoodBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_BIRCH_WOOD)));
    public static final Block BIRCH_TABLE = registerDecorativeBlock("birch_table",
            new TableBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_PLANKS)));
    public static final Block HOLLOW_BIRCH_LOG = registerDecorativeBlock("hollow_birch_log",
            new HollowLogBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_LOG)));
    public static final Block STRIPPED_HOLLOW_BIRCH_LOG = registerDecorativeBlock("stripped_hollow_birch_log",
            new HollowLogBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_BIRCH_LOG)));
    // Acacia
    public static final Block DECORATED_ACACIA_PLANKS = registerDecorativeBlock("decorated_acacia_planks",
            new DecoratedPlanksBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_PLANKS)));
    public static final Block DECORATED_ACACIA_LOG = registerDecorativeBlock("decorated_acacia_log",
            new DecoratedLogBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_LOG)));
    public static final Block DECORATED_ACACIA_WOOD = registerDecorativeBlock("decorated_acacia_wood",
            new DecoratedWoodBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_WOOD)));
    public static final Block DECORATED_STRIPPED_ACACIA_LOG = registerDecorativeBlock("decorated_stripped_acacia_log",
            new DecoratedLogBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_ACACIA_LOG)));
    public static final Block DECORATED_STRIPPED_ACACIA_WOOD = registerDecorativeBlock("decorated_stripped_acacia_wood",
            new DecoratedWoodBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_ACACIA_WOOD)));
    public static final Block ACACIA_TABLE = registerDecorativeBlock("acacia_table",
            new TableBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_PLANKS)));
    public static final Block HOLLOW_ACACIA_LOG = registerDecorativeBlock("hollow_acacia_log",
            new HollowLogBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_LOG)));
    public static final Block STRIPPED_HOLLOW_ACACIA_LOG = registerDecorativeBlock("stripped_hollow_acacia_log",
            new HollowLogBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_ACACIA_LOG)));
    // Jungle
    public static final Block DECORATED_JUNGLE_PLANKS = registerDecorativeBlock("decorated_jungle_planks",
            new DecoratedPlanksBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_PLANKS)));
    public static final Block DECORATED_JUNGLE_LOG = registerDecorativeBlock("decorated_jungle_log",
            new DecoratedLogBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_LOG)));
    public static final Block DECORATED_JUNGLE_WOOD = registerDecorativeBlock("decorated_jungle_wood",
            new DecoratedWoodBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_WOOD)));
    public static final Block DECORATED_STRIPPED_JUNGLE_LOG = registerDecorativeBlock("decorated_stripped_jungle_log",
            new DecoratedLogBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_JUNGLE_LOG)));
    public static final Block DECORATED_STRIPPED_JUNGLE_WOOD = registerDecorativeBlock("decorated_stripped_jungle_wood",
            new DecoratedWoodBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_JUNGLE_WOOD)));
    public static final Block JUNGLE_TABLE = registerDecorativeBlock("jungle_table",
            new TableBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_PLANKS)));
    public static final Block HOLLOW_JUNGLE_LOG = registerDecorativeBlock("hollow_jungle_log",
            new HollowLogBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_LOG)));
    public static final Block STRIPPED_HOLLOW_JUNGLE_LOG = registerDecorativeBlock("stripped_hollow_jungle_log",
            new HollowLogBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_JUNGLE_LOG)));
    // Dark Oak
    public static final Block DECORATED_DARK_OAK_PLANKS = registerDecorativeBlock("decorated_dark_oak_planks",
            new DecoratedPlanksBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_PLANKS)));
    public static final Block DECORATED_DARK_OAK_LOG = registerDecorativeBlock("decorated_dark_oak_log",
            new DecoratedLogBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_LOG)));
    public static final Block DECORATED_DARK_OAK_WOOD = registerDecorativeBlock("decorated_dark_oak_wood",
            new DecoratedWoodBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_WOOD)));
    public static final Block DECORATED_STRIPPED_DARK_OAK_LOG = registerDecorativeBlock("decorated_stripped_dark_oak_log",
            new DecoratedLogBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_DARK_OAK_LOG)));
    public static final Block DECORATED_STRIPPED_DARK_OAK_WOOD = registerDecorativeBlock("decorated_stripped_dark_oak_wood",
            new DecoratedWoodBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_DARK_OAK_WOOD)));
    public static final Block DARK_OAK_TABLE = registerDecorativeBlock("dark_oak_table",
            new TableBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_PLANKS)));
    public static final Block HOLLOW_DARK_OAK_LOG = registerDecorativeBlock("hollow_dark_oak_log",
            new HollowLogBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_LOG)));
    public static final Block STRIPPED_HOLLOW_DARK_OAK_LOG = registerDecorativeBlock("stripped_hollow_dark_oak_log",
            new HollowLogBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_DARK_OAK_LOG)));
    // Crimson
    public static final Block DECORATED_CRIMSON_PLANKS = registerDecorativeBlock("decorated_crimson_planks",
            new DecoratedPlanksBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_PLANKS)));
    public static final Block DECORATED_CRIMSON_STEM = registerDecorativeBlock("decorated_crimson_stem",
            new DecoratedLogBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_STEM)));
    public static final Block DECORATED_CRIMSON_HYPHAE = registerDecorativeBlock("decorated_crimson_hyphae",
            new DecoratedWoodBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_HYPHAE)));
    public static final Block DECORATED_STRIPPED_CRIMSON_STEM = registerDecorativeBlock("decorated_stripped_crimson_stem",
            new DecoratedLogBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_CRIMSON_STEM)));
    public static final Block DECORATED_STRIPPED_CRIMSON_HYPHAE = registerDecorativeBlock("decorated_stripped_crimson_hyphae",
            new DecoratedWoodBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_CRIMSON_HYPHAE)));
    public static final Block CRIMSON_TABLE = registerDecorativeBlock("crimson_table",
            new TableBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_PLANKS)));
    public static final Block HOLLOW_CRIMSON_STEM = registerDecorativeBlock("hollow_crimson_stem",
            new HollowLogBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_STEM)));
    public static final Block STRIPPED_HOLLOW_CRIMSON_STEM = registerDecorativeBlock("stripped_hollow_crimson_stem",
            new HollowLogBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_CRIMSON_STEM)));
    // Warped
    public static final Block DECORATED_WARPED_PLANKS = registerDecorativeBlock("decorated_warped_planks",
            new DecoratedPlanksBlock(AbstractBlock.Settings.copy(Blocks.WARPED_PLANKS)));
    public static final Block DECORATED_WARPED_STEM = registerDecorativeBlock("decorated_warped_stem",
            new DecoratedLogBlock(AbstractBlock.Settings.copy(Blocks.WARPED_STEM)));
    public static final Block DECORATED_WARPED_HYPHAE = registerDecorativeBlock("decorated_warped_hyphae",
            new DecoratedWoodBlock(AbstractBlock.Settings.copy(Blocks.WARPED_HYPHAE)));
    public static final Block DECORATED_STRIPPED_WARPED_STEM = registerDecorativeBlock("decorated_stripped_warped_stem",
            new DecoratedLogBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_WARPED_STEM)));
    public static final Block DECORATED_STRIPPED_WARPED_HYPHAE = registerDecorativeBlock("decorated_stripped_warped_hyphae",
            new DecoratedWoodBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_WARPED_HYPHAE)));
    public static final Block WARPED_TABLE = registerDecorativeBlock("warped_table",
            new TableBlock(AbstractBlock.Settings.copy(Blocks.WARPED_PLANKS)));
    public static final Block HOLLOW_WARPED_STEM = registerDecorativeBlock("hollow_warped_stem",
            new HollowLogBlock(AbstractBlock.Settings.copy(Blocks.WARPED_STEM)));
    public static final Block STRIPPED_HOLLOW_WARPED_STEM = registerDecorativeBlock("stripped_hollow_warped_stem",
            new HollowLogBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_WARPED_STEM)));
    // Mangrove
    public static final Block DECORATED_MANGROVE_PLANKS = registerDecorativeBlock("decorated_mangrove_planks",
            new DecoratedPlanksBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_PLANKS)));
    public static final Block DECORATED_MANGROVE_LOG = registerDecorativeBlock("decorated_mangrove_log",
            new DecoratedLogBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_LOG)));
    public static final Block DECORATED_MANGROVE_WOOD = registerDecorativeBlock("decorated_mangrove_wood",
            new DecoratedWoodBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD)));
    public static final Block DECORATED_STRIPPED_MANGROVE_LOG = registerDecorativeBlock("decorated_stripped_mangrove_log",
            new DecoratedLogBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_MANGROVE_LOG)));
    public static final Block DECORATED_STRIPPED_MANGROVE_WOOD = registerDecorativeBlock("decorated_stripped_mangrove_wood",
            new DecoratedWoodBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_MANGROVE_WOOD)));
    public static final Block MANGROVE_TABLE = registerDecorativeBlock("mangrove_table",
            new TableBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_PLANKS)));
    public static final Block HOLLOW_MANGROVE_LOG = registerDecorativeBlock("hollow_mangrove_log",
            new HollowLogBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_LOG)));
    public static final Block STRIPPED_HOLLOW_MANGROVE_LOG = registerDecorativeBlock("stripped_hollow_mangrove_log",
            new HollowLogBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_MANGROVE_LOG)));
    // Cherry
    public static final Block DECORATED_CHERRY_PLANKS = registerDecorativeBlock("decorated_cherry_planks",
            new DecoratedPlanksBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_PLANKS)));
    public static final Block DECORATED_CHERRY_LOG = registerDecorativeBlock("decorated_cherry_log",
            new DecoratedLogBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_LOG)));
    public static final Block DECORATED_CHERRY_WOOD = registerDecorativeBlock("decorated_cherry_wood",
            new DecoratedWoodBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_WOOD)));
    public static final Block DECORATED_STRIPPED_CHERRY_LOG = registerDecorativeBlock("decorated_stripped_cherry_log",
            new DecoratedLogBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_CHERRY_LOG)));
    public static final Block DECORATED_STRIPPED_CHERRY_WOOD = registerDecorativeBlock("decorated_stripped_cherry_wood",
            new DecoratedWoodBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_CHERRY_WOOD)));
    public static final Block CHERRY_TABLE = registerDecorativeBlock("cherry_table",
            new TableBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_PLANKS)));
    public static final Block HOLLOW_CHERRY_LOG = registerDecorativeBlock("hollow_cherry_log",
            new HollowLogBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_LOG)));
    public static final Block STRIPPED_HOLLOW_CHERRY_LOG = registerDecorativeBlock("stripped_hollow_cherry_log",
            new HollowLogBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_CHERRY_LOG)));

    // Deep Ocean
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

    // Vertical Slabs
    public static final Block OAK_VERTICAL_SLAB = registerDecorativeBlock("oak_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_SLAB)));
    public static final Block SPRUCE_VERTICAL_SLAB = registerDecorativeBlock("spruce_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_SLAB)));
    public static final Block BIRCH_VERTICAL_SLAB = registerDecorativeBlock("birch_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_SLAB)));
    public static final Block JUNGLE_VERTICAL_SLAB = registerDecorativeBlock("jungle_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_SLAB)));
    public static final Block ACACIA_VERTICAL_SLAB = registerDecorativeBlock("acacia_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_SLAB)));
    public static final Block DARK_OAK_VERTICAL_SLAB = registerDecorativeBlock("dark_oak_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_SLAB)));
    public static final Block CRIMSON_VERTICAL_SLAB = registerDecorativeBlock("crimson_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_SLAB)));
    public static final Block WARPED_VERTICAL_SLAB = registerDecorativeBlock("warped_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.WARPED_SLAB)));
    public static final Block MANGROVE_VERTICAL_SLAB = registerDecorativeBlock("mangrove_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_SLAB)));
    public static final Block CHERRY_VERTICAL_SLAB = registerDecorativeBlock("cherry_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_SLAB)));
    public static final Block BAMBOO_VERTICAL_SLAB = registerDecorativeBlock("bamboo_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.BAMBOO_SLAB)));
    public static final Block BAMBOO_MOSAIC_VERTICAL_SLAB = registerDecorativeBlock("bamboo_mosaic_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.BAMBOO_MOSAIC_SLAB)));
    public static final Block STONE_VERTICAL_SLAB = registerDecorativeBlock("stone_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.STONE_SLAB)));
    public static final Block SMOOTH_STONE_VERTICAL_SLAB = registerDecorativeBlock("smooth_stone_vertical_slab",
            new SmoothStoneVerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE_SLAB)));
    public static final Block COBBLESTONE_VERTICAL_SLAB = registerDecorativeBlock("cobblestone_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.COBBLESTONE_SLAB)));
    public static final Block MOSSY_COBBLESTONE_VERTICAL_SLAB = registerDecorativeBlock("mossy_cobblestone_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.MOSSY_COBBLESTONE_SLAB)));
    public static final Block STONE_BRICK_VERTICAL_SLAB = registerDecorativeBlock("stone_brick_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICK_SLAB)));
    public static final Block MOSSY_STONE_BRICK_VERTICAL_SLAB = registerDecorativeBlock("mossy_stone_brick_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.MOSSY_STONE_BRICK_SLAB)));
    public static final Block ANDESITE_VERTICAL_SLAB = registerDecorativeBlock("andesite_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.ANDESITE_SLAB)));
    public static final Block POLISHED_ANDESITE_VERTICAL_SLAB = registerDecorativeBlock("polished_andesite_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE_SLAB)));
    public static final Block DIORITE_VERTICAL_SLAB = registerDecorativeBlock("diorite_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.DIORITE_SLAB)));
    public static final Block POLISHED_DIORITE_VERTICAL_SLAB = registerDecorativeBlock("polished_diorite_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE_SLAB)));
    public static final Block GRANITE_VERTICAL_SLAB = registerDecorativeBlock("granite_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.GRANITE_SLAB)));
    public static final Block POLISHED_GRANITE_VERTICAL_SLAB = registerDecorativeBlock("polished_granite_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE_SLAB)));
    public static final Block SANDSTONE_VERTICAL_SLAB = registerDecorativeBlock("sandstone_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.SANDSTONE_SLAB)));
    public static final Block CUT_SANDSTONE_VERTICAL_SLAB = registerDecorativeBlock("cut_sandstone_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.CUT_SANDSTONE_SLAB)));
    public static final Block SMOOTH_SANDSTONE_VERTICAL_SLAB = registerDecorativeBlock("smooth_sandstone_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_SANDSTONE_SLAB)));
    public static final Block RED_SANDSTONE_VERTICAL_SLAB = registerDecorativeBlock("red_sandstone_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.RED_SANDSTONE_SLAB)));
    public static final Block CUT_RED_SANDSTONE_VERTICAL_SLAB = registerDecorativeBlock("cut_red_sandstone_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.CUT_RED_SANDSTONE_SLAB)));
    public static final Block SMOOTH_RED_SANDSTONE_VERTICAL_SLAB = registerDecorativeBlock("smooth_red_sandstone_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_RED_SANDSTONE_SLAB)));
    public static final Block BRICK_VERTICAL_SLAB = registerDecorativeBlock("brick_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.BRICK_SLAB)));
    public static final Block PRISMARINE_VERTICAL_SLAB = registerDecorativeBlock("prismarine_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.PRISMARINE_SLAB)));
    public static final Block PRISMARINE_BRICK_VERTICAL_SLAB = registerDecorativeBlock("prismarine_brick_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.PRISMARINE_BRICK_SLAB)));
    public static final Block DARK_PRISMARINE_VERTICAL_SLAB = registerDecorativeBlock("dark_prismarine_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.DARK_PRISMARINE_SLAB)));
    public static final Block NETHER_BRICK_VERTICAL_SLAB = registerDecorativeBlock("nether_brick_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.NETHER_BRICK_SLAB)));
    public static final Block RED_NETHER_BRICK_VERTICAL_SLAB = registerDecorativeBlock("red_nether_brick_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICK_SLAB)));
    public static final Block QUARTZ_VERTICAL_SLAB = registerDecorativeBlock("quartz_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.QUARTZ_SLAB)));
    public static final Block SMOOTH_QUARTZ_VERTICAL_SLAB = registerDecorativeBlock("smooth_quartz_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_QUARTZ_SLAB)));
    public static final Block PURPUR_VERTICAL_SLAB = registerDecorativeBlock("purpur_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.PURPUR_SLAB)));
    public static final Block END_STONE_BRICK_VERTICAL_SLAB = registerDecorativeBlock("end_stone_brick_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.END_STONE_BRICK_SLAB)));
    public static final Block BLACKSTONE_VERTICAL_SLAB = registerDecorativeBlock("blackstone_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.BLACKSTONE_SLAB)));
    public static final Block POLISHED_BLACKSTONE_VERTICAL_SLAB = registerDecorativeBlock("polished_blackstone_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_SLAB)));
    public static final Block POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB = registerDecorativeBlock("polished_blackstone_brick_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_BRICK_SLAB)));
    public static final Block WAXED_CUT_COPPER_VERTICAL_SLAB = registerDecorativeBlock("waxed_cut_copper_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.WAXED_CUT_COPPER_SLAB)));
    public static final Block WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB = registerDecorativeBlock("waxed_exposed_cut_copper_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB)));
    public static final Block WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB = registerDecorativeBlock("waxed_weathered_cut_copper_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB)));
    public static final Block WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB = registerDecorativeBlock("waxed_oxidized_cut_copper_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB)));
    public static final Block COBBLED_DEEPSLATE_VERTICAL_SLAB = registerDecorativeBlock("cobbled_deepslate_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE_SLAB)));
    public static final Block POLISHED_DEEPSLATE_VERTICAL_SLAB = registerDecorativeBlock("polished_deepslate_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_DEEPSLATE_SLAB)));
    public static final Block DEEPSLATE_BRICK_VERTICAL_SLAB = registerDecorativeBlock("deepslate_brick_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICK_SLAB)));
    public static final Block DEEPSLATE_TILE_VERTICAL_SLAB = registerDecorativeBlock("deepslate_tile_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_TILE_SLAB)));

    // Lanterns
    public static final Block GREEN_LANTERN = registerDecorativeBlock("green_lantern",
            new ModLanternBlock(LANTERN_SETTINGS));
    public static final Block YELLOW_LANTERN = registerDecorativeBlock("yellow_lantern",
            new ModLanternBlock(LANTERN_SETTINGS));
    public static final Block RED_LANTERN = registerDecorativeBlock("red_lantern",
            new ModLanternBlock(LANTERN_SETTINGS));

    private static Block registerDecorativeBlock(String name, Block block) {
        registerDecorativeBlockItem(name, block);
        ALL.add(block);
        if(block instanceof DecoratedPlanksBlock)
            DECORATED_PLANKS.add(block);
        else if(block instanceof TableBlock)
            TABLES.add(block);
        else if(block instanceof VerticalSlabBlock)
            VERTICAL_SLABS.add(block);
        else if(block instanceof ModLanternBlock)
            LANTERNS.add(block);
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