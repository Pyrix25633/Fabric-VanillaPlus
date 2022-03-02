package net.pyrix25633.vanilla_plus.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.pyrix25633.vanilla_plus.VanillaPlus;
import net.pyrix25633.vanilla_plus.block.custom.*;
import net.pyrix25633.vanilla_plus.item.ModItemGroup;

public class ModBlocks {

    static final float woodHardness = 2f, woodResistance = 2f,
            deepOceanHardness = 1.5f, deepOceanResistance = 2.2f,
            stoneHardness = 1.5f, stoneResistance = 2.2f;
    static final FabricBlockSettings woodSettings = FabricBlockSettings.of(Material.WOOD)
            .strength(woodHardness, woodResistance).sounds(BlockSoundGroup.WOOD);
    static final FabricBlockSettings deepOceanSettings = FabricBlockSettings.of(Material.STONE)
            .strength(deepOceanHardness, deepOceanResistance).sounds(BlockSoundGroup.STONE)
            .requiresTool();
    static final FabricBlockSettings stoneSettings = FabricBlockSettings.of(Material.STONE)
            .strength(stoneHardness, stoneResistance).sounds(BlockSoundGroup.STONE)
            .requiresTool();
    static final FabricBlockSettings lanternSettings = FabricBlockSettings.of(Material.METAL)
            .strength(3.5f).sounds(BlockSoundGroup.LANTERN).luminance(15)
            .requiresTool().nonOpaque();

    // Oak
    public static final Block DECORATED_OAK_PLANKS = registerDecorativeBlock("decorated_oak_planks",
            new Block(woodSettings));
    public static final Block DECORATED_OAK_LOG = registerDecorativeBlock("decorated_oak_log",
            new ModLogBlock(woodSettings));
    public static final Block DECORATED_OAK_WOOD = registerDecorativeBlock("decorated_oak_wood",
            new ModLogBlock(woodSettings));
    public static final Block DECORATED_STRIPPED_OAK_LOG = registerDecorativeBlock("decorated_stripped_oak_log",
            new ModLogBlock(woodSettings));
    public static final Block DECORATED_STRIPPED_OAK_WOOD = registerDecorativeBlock("decorated_stripped_oak_wood",
            new ModLogBlock(woodSettings));
    public static final Block OAK_TABLE = registerDecorativeBlock("oak_table",
            new ModTableBlock(woodSettings.nonOpaque()));
    public static final Block HOLLOW_OAK_LOG = registerDecorativeBlock("hollow_oak_log",
            new HollowLog(woodSettings.nonOpaque()));
    public static final Block STRIPPED_HOLLOW_OAK_LOG = registerDecorativeBlock("stripped_hollow_oak_log",
            new HollowLog(woodSettings.nonOpaque()));
    //Spruce
    public static final Block DECORATED_SPRUCE_PLANKS = registerDecorativeBlock("decorated_spruce_planks",
            new Block(woodSettings));
    public static final Block DECORATED_SPRUCE_LOG = registerDecorativeBlock("decorated_spruce_log",
            new ModLogBlock(woodSettings));
    public static final Block DECORATED_SPRUCE_WOOD = registerDecorativeBlock("decorated_spruce_wood",
            new ModLogBlock(woodSettings));
    public static final Block DECORATED_STRIPPED_SPRUCE_LOG = registerDecorativeBlock("decorated_stripped_spruce_log",
            new ModLogBlock(woodSettings));
    public static final Block DECORATED_STRIPPED_SPRUCE_WOOD = registerDecorativeBlock("decorated_stripped_spruce_wood",
            new ModLogBlock(woodSettings));
    public static final Block SPRUCE_TABLE = registerDecorativeBlock("spruce_table",
            new ModTableBlock(woodSettings.nonOpaque()));
    public static final Block HOLLOW_SPRUCE_LOG = registerDecorativeBlock("hollow_spruce_log",
            new HollowLog(woodSettings.nonOpaque()));
    public static final Block STRIPPED_HOLLOW_SPRUCE_LOG = registerDecorativeBlock("stripped_hollow_spruce_log",
            new HollowLog(woodSettings.nonOpaque()));
    //Birch
    public static final Block DECORATED_BIRCH_PLANKS = registerDecorativeBlock("decorated_birch_planks",
            new Block(woodSettings));
    public static final Block DECORATED_BIRCH_LOG = registerDecorativeBlock("decorated_birch_log",
            new ModLogBlock(woodSettings));
    public static final Block DECORATED_BIRCH_WOOD = registerDecorativeBlock("decorated_birch_wood",
            new ModLogBlock(woodSettings));
    public static final Block DECORATED_STRIPPED_BIRCH_LOG = registerDecorativeBlock("decorated_stripped_birch_log",
            new ModLogBlock(woodSettings));
    public static final Block DECORATED_STRIPPED_BIRCH_WOOD = registerDecorativeBlock("decorated_stripped_birch_wood",
            new ModLogBlock(woodSettings));
    public static final Block BIRCH_TABLE = registerDecorativeBlock("birch_table",
            new ModTableBlock(woodSettings.nonOpaque()));
    public static final Block HOLLOW_BIRCH_LOG = registerDecorativeBlock("hollow_birch_log",
            new HollowLog(woodSettings.nonOpaque()));
    public static final Block STRIPPED_HOLLOW_BIRCH_LOG = registerDecorativeBlock("stripped_hollow_birch_log",
            new HollowLog(woodSettings.nonOpaque()));
    //Acacia
    public static final Block DECORATED_ACACIA_PLANKS = registerDecorativeBlock("decorated_acacia_planks",
            new Block(woodSettings));
    public static final Block DECORATED_ACACIA_LOG = registerDecorativeBlock("decorated_acacia_log",
            new ModLogBlock(woodSettings));
    public static final Block DECORATED_ACACIA_WOOD = registerDecorativeBlock("decorated_acacia_wood",
            new ModLogBlock(woodSettings));
    public static final Block DECORATED_STRIPPED_ACACIA_LOG = registerDecorativeBlock("decorated_stripped_acacia_log",
            new ModLogBlock(woodSettings));
    public static final Block DECORATED_STRIPPED_ACACIA_WOOD = registerDecorativeBlock("decorated_stripped_acacia_wood",
            new ModLogBlock(woodSettings));
    public static final Block ACACIA_TABLE = registerDecorativeBlock("acacia_table",
            new ModTableBlock(woodSettings.nonOpaque()));
    public static final Block HOLLOW_ACACIA_LOG = registerDecorativeBlock("hollow_acacia_log",
            new HollowLog(woodSettings.nonOpaque()));
    public static final Block STRIPPED_HOLLOW_ACACIA_LOG = registerDecorativeBlock("stripped_hollow_acacia_log",
            new HollowLog(woodSettings.nonOpaque()));
    //Jungle
    public static final Block DECORATED_JUNGLE_PLANKS = registerDecorativeBlock("decorated_jungle_planks",
            new Block(woodSettings));
    public static final Block DECORATED_JUNGLE_LOG = registerDecorativeBlock("decorated_jungle_log",
            new ModLogBlock(woodSettings));
    public static final Block DECORATED_JUNGLE_WOOD = registerDecorativeBlock("decorated_jungle_wood",
            new ModLogBlock(woodSettings));
    public static final Block DECORATED_STRIPPED_JUNGLE_LOG = registerDecorativeBlock("decorated_stripped_jungle_log",
            new ModLogBlock(woodSettings));
    public static final Block DECORATED_STRIPPED_JUNGLE_WOOD = registerDecorativeBlock("decorated_stripped_jungle_wood",
            new ModLogBlock(woodSettings));
    public static final Block JUNGLE_TABLE = registerDecorativeBlock("jungle_table",
            new ModTableBlock(woodSettings.nonOpaque()));
    public static final Block HOLLOW_JUNGLE_LOG = registerDecorativeBlock("hollow_jungle_log",
            new HollowLog(woodSettings.nonOpaque()));
    public static final Block STRIPPED_HOLLOW_JUNGLE_LOG = registerDecorativeBlock("stripped_hollow_jungle_log",
            new HollowLog(woodSettings.nonOpaque()));
    //Dark Oak
    public static final Block DECORATED_DARK_OAK_PLANKS = registerDecorativeBlock("decorated_dark_oak_planks",
            new Block(woodSettings));
    public static final Block DECORATED_DARK_OAK_LOG = registerDecorativeBlock("decorated_dark_oak_log",
            new ModLogBlock(woodSettings));
    public static final Block DECORATED_DARK_OAK_WOOD = registerDecorativeBlock("decorated_dark_oak_wood",
            new ModLogBlock(woodSettings));
    public static final Block DECORATED_STRIPPED_DARK_OAK_LOG = registerDecorativeBlock("decorated_stripped_dark_oak_log",
            new ModLogBlock(woodSettings));
    public static final Block DECORATED_STRIPPED_DARK_OAK_WOOD = registerDecorativeBlock("decorated_stripped_dark_oak_wood",
            new ModLogBlock(woodSettings));
    public static final Block DARK_OAK_TABLE = registerDecorativeBlock("dark_oak_table",
            new ModTableBlock(woodSettings.nonOpaque()));
    public static final Block HOLLOW_DARK_OAK_LOG = registerDecorativeBlock("hollow_dark_oak_log",
            new HollowLog(woodSettings.nonOpaque()));
    public static final Block STRIPPED_HOLLOW_DARK_OAK_LOG = registerDecorativeBlock("stripped_hollow_dark_oak_log",
            new HollowLog(woodSettings.nonOpaque()));
    //Crimson
    public static final Block DECORATED_CRIMSON_PLANKS = registerDecorativeBlock("decorated_crimson_planks",
            new Block(woodSettings));
    public static final Block DECORATED_CRIMSON_STEM = registerDecorativeBlock("decorated_crimson_stem",
            new ModLogBlock(woodSettings));
    public static final Block DECORATED_CRIMSON_HYPHAE = registerDecorativeBlock("decorated_crimson_hyphae",
            new ModLogBlock(woodSettings));
    public static final Block DECORATED_STRIPPED_CRIMSON_STEM = registerDecorativeBlock("decorated_stripped_crimson_stem",
            new ModLogBlock(woodSettings));
    public static final Block DECORATED_STRIPPED_CRIMSON_HYPHAE = registerDecorativeBlock("decorated_stripped_crimson_hyphae",
            new ModLogBlock(woodSettings));
    public static final Block CRIMSON_TABLE = registerDecorativeBlock("crimson_table",
            new ModTableBlock(woodSettings.nonOpaque()));
    public static final Block HOLLOW_CRIMSON_STEM = registerDecorativeBlock("hollow_crimson_stem",
            new HollowLog(woodSettings.nonOpaque()));
    public static final Block STRIPPED_HOLLOW_CRIMSON_STEM = registerDecorativeBlock("stripped_hollow_crimson_stem",
            new HollowLog(woodSettings.nonOpaque()));
    //Warped
    public static final Block DECORATED_WARPED_PLANKS = registerDecorativeBlock("decorated_warped_planks",
            new Block(woodSettings));
    public static final Block DECORATED_WARPED_STEM = registerDecorativeBlock("decorated_warped_stem",
            new ModLogBlock(woodSettings));
    public static final Block DECORATED_WARPED_HYPHAE = registerDecorativeBlock("decorated_warped_hyphae",
            new ModLogBlock(woodSettings));
    public static final Block DECORATED_STRIPPED_WARPED_STEM = registerDecorativeBlock("decorated_stripped_warped_stem",
            new ModLogBlock(woodSettings));
    public static final Block DECORATED_STRIPPED_WARPED_HYPHAE = registerDecorativeBlock("decorated_stripped_warped_hyphae",
            new ModLogBlock(woodSettings));
    public static final Block WARPED_TABLE = registerDecorativeBlock("warped_table",
            new ModTableBlock(woodSettings.nonOpaque()));
    public static final Block HOLLOW_WARPED_STEM = registerDecorativeBlock("hollow_warped_stem",
            new HollowLog(woodSettings.nonOpaque()));
    public static final Block STRIPPED_HOLLOW_WARPED_STEM = registerDecorativeBlock("stripped_hollow_warped_stem",
            new HollowLog(woodSettings.nonOpaque()));

    //Deep Ocean
    public static final Block DEEP_OCEAN_BRICKS = registerDecorativeBlock("deep_ocean_bricks",
            new Block(deepOceanSettings));
    public static final Block DEEP_OCEAN_BRICK_SLAB = registerDecorativeBlock("deep_ocean_brick_slab",
            new SlabBlock(deepOceanSettings));
    public static final Block DEEP_OCEAN_BRICK_VERTICAL_SLAB = registerDecorativeBlock("deep_ocean_brick_vertical_slab",
            new VerticalSlabBlock(deepOceanSettings));
    public static final Block DEEP_OCEAN_BRICK_STAIRS = registerDecorativeBlock("deep_ocean_brick_stairs",
            new ModStairsBlocks(ModBlocks.DEEP_OCEAN_BRICKS.getDefaultState(), deepOceanSettings));
    public static final Block DEEP_OCEAN_BRICK_WALL = registerDecorativeBlock("deep_ocean_brick_wall",
            new WallBlock(deepOceanSettings));
    public static final Block CHISELED_DEEP_OCEAN_BRICKS = registerDecorativeBlock("chiseled_deep_ocean_bricks",
            new Block(deepOceanSettings));

    //Vertical Slabs
    public static final Block OAK_VERTICAL_SLAB = registerDecorativeBlock("oak_vertical_slab",
            new VerticalSlabBlock(woodSettings));
    public static final Block SPRUCE_VERTICAL_SLAB = registerDecorativeBlock("spruce_vertical_slab",
            new VerticalSlabBlock(woodSettings));
    public static final Block BIRCH_VERTICAL_SLAB = registerDecorativeBlock("birch_vertical_slab",
            new VerticalSlabBlock(woodSettings));
    public static final Block JUNGLE_VERTICAL_SLAB = registerDecorativeBlock("jungle_vertical_slab",
            new VerticalSlabBlock(woodSettings));
    public static final Block ACACIA_VERTICAL_SLAB = registerDecorativeBlock("acacia_vertical_slab",
            new VerticalSlabBlock(woodSettings));
    public static final Block DARK_OAK_VERTICAL_SLAB = registerDecorativeBlock("dark_oak_vertical_slab",
            new VerticalSlabBlock(woodSettings));
    public static final Block CRIMSON_VERTICAL_SLAB = registerDecorativeBlock("crimson_vertical_slab",
            new VerticalSlabBlock(woodSettings));
    public static final Block WARPED_VERTICAL_SLAB = registerDecorativeBlock("warped_vertical_slab",
            new VerticalSlabBlock(woodSettings));
    public static final Block STONE_VERTICAL_SLAB = registerDecorativeBlock("stone_vertical_slab",
            new VerticalSlabBlock(stoneSettings));
    public static final Block SMOOTH_STONE_VERTICAL_SLAB = registerDecorativeBlock("smooth_stone_vertical_slab",
            new SmoothStoneVerticalSlabBlock(stoneSettings));
    public static final Block COBBLESTONE_VERTICAL_SLAB = registerDecorativeBlock("cobblestone_vertical_slab",
            new VerticalSlabBlock(stoneSettings));
    public static final Block MOSSY_COBBLESTONE_VERTICAL_SLAB = registerDecorativeBlock("mossy_cobblestone_vertical_slab",
            new VerticalSlabBlock(stoneSettings));
    public static final Block STONE_BRICK_VERTICAL_SLAB = registerDecorativeBlock("stone_brick_vertical_slab",
            new VerticalSlabBlock(stoneSettings));
    public static final Block MOSSY_STONE_BRICK_VERTICAL_SLAB = registerDecorativeBlock("mossy_stone_brick_vertical_slab",
            new VerticalSlabBlock(stoneSettings));
    public static final Block ANDESITE_VERTICAL_SLAB = registerDecorativeBlock("andesite_vertical_slab",
            new VerticalSlabBlock(stoneSettings));
    public static final Block POLISHED_ANDESITE_VERTICAL_SLAB = registerDecorativeBlock("polished_andesite_vertical_slab",
            new VerticalSlabBlock(stoneSettings));
    public static final Block DIORITE_VERTICAL_SLAB = registerDecorativeBlock("diorite_vertical_slab",
            new VerticalSlabBlock(stoneSettings));
    public static final Block POLISHED_DIORITE_VERTICAL_SLAB = registerDecorativeBlock("polished_diorite_vertical_slab",
            new VerticalSlabBlock(stoneSettings));
    public static final Block GRANITE_VERTICAL_SLAB = registerDecorativeBlock("granite_vertical_slab",
            new VerticalSlabBlock(stoneSettings));
    public static final Block POLISHED_GRANITE_VERTICAL_SLAB = registerDecorativeBlock("polished_granite_vertical_slab",
            new VerticalSlabBlock(stoneSettings));
    public static final Block SANDSTONE_VERTICAL_SLAB = registerDecorativeBlock("sandstone_vertical_slab",
            new VerticalSlabBlock(stoneSettings));
    public static final Block CUT_SANDSTONE_VERTICAL_SLAB = registerDecorativeBlock("cut_sandstone_vertical_slab",
            new VerticalSlabBlock(stoneSettings));
    public static final Block SMOOTH_SANDSTONE_VERTICAL_SLAB = registerDecorativeBlock("smooth_sandstone_vertical_slab",
            new VerticalSlabBlock(stoneSettings));
    public static final Block RED_SANDSTONE_VERTICAL_SLAB = registerDecorativeBlock("red_sandstone_vertical_slab",
            new VerticalSlabBlock(stoneSettings));
    public static final Block CUT_RED_SANDSTONE_VERTICAL_SLAB = registerDecorativeBlock("cut_red_sandstone_vertical_slab",
            new VerticalSlabBlock(stoneSettings));
    public static final Block SMOOTH_RED_SANDSTONE_VERTICAL_SLAB = registerDecorativeBlock("smooth_red_sandstone_vertical_slab",
            new VerticalSlabBlock(stoneSettings));
    public static final Block BRICK_VERTICAL_SLAB = registerDecorativeBlock("brick_vertical_slab",
            new VerticalSlabBlock(stoneSettings));

    //Lanterns
    public static final Block GREEN_LANTERN = registerDecorativeBlock("green_lantern",
            new LanternBlock(lanternSettings));
    public static final Block YELLOW_LANTERN = registerDecorativeBlock("yellow_lantern",
            new LanternBlock(lanternSettings));
    public static final Block RED_LANTERN = registerDecorativeBlock("red_lantern",
            new LanternBlock(lanternSettings));

    private static Block registerDecorativeBlock(String name, Block block) {
        registerDecorativeBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(VanillaPlus.MOD_ID, name), block);
    }

    private static Item registerDecorativeBlockItem(String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(VanillaPlus.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(ModItemGroup.DECORATIVE_BLOCKS)));
    }

    public static void registerModBlocks() {
        System.out.println("Registering ModBlocks for " + VanillaPlus.MOD_ID);
    }
}
