package net.rupyber_studios.vanilla_plus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.rupyber_studios.vanilla_plus.block.ModBlocks;
import net.rupyber_studios.vanilla_plus.block.custom.*;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        for(Block block : ModBlocks.ALL) {
            if(block instanceof TableBlock table)
                generateTable(exporter, table);
            else if(block instanceof HollowLogBlock hollowLog)
                generateHollowLog(exporter, hollowLog);
            else if(block instanceof DecoratedPlanksBlock decoratedPlanks) {
                String id = Registries.BLOCK.getId(block).getPath();
                generateDecoratedPlanks(exporter, decoratedPlanks, decoratedPlanks.getDecoratedLog(),
                        id + "_from_decorated_log");
                generateDecoratedPlanks(exporter, decoratedPlanks, decoratedPlanks.getDecoratedStrippedLog(),
                        id + "_from_decorated_stripped_log");
                generateDecoratedPlanks(exporter, decoratedPlanks, decoratedPlanks.getDecoratedWood(),
                        id + "_from_decorated_wood");
                generateDecoratedPlanks(exporter, decoratedPlanks, decoratedPlanks.getDecoratedStrippedWood(),
                        id + "_from_decorated_stripped_wood");
            }
            else if(block instanceof DecoratedWoodBlock decoratedWood)
                generateDecoratedWood(exporter, decoratedWood);
            else if(block instanceof VerticalSlabBlock verticalSlab)
                generateVerticalSlab(exporter, verticalSlab);
            else if(block instanceof ModLanternBlock lantern)
                generateLantern(exporter, lantern);
        }
        generateDeepOcean(exporter);
    }

    private static void generateTable(RecipeExporter exporter, @NotNull TableBlock table) {
        Block planks = table.getPlanks();
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, table).group("table")
                .pattern("###").pattern("/ /")
                .input('#', planks).input('/', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(planks),
                        FabricRecipeProvider.conditionsFromItem(planks))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter);
    }

    private static void generateHollowLog(RecipeExporter exporter, @NotNull HollowLogBlock hollowLog) {
        Block log = hollowLog.getLog();
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, hollowLog, 8).group("hollow_log")
                .pattern("###").pattern("# #").pattern("###")
                .input('#', log)
                .criterion(FabricRecipeProvider.hasItem(log),
                        FabricRecipeProvider.conditionsFromItem(log))
                .offerTo(exporter);
    }

    private static void generateDecoratedPlanks(RecipeExporter exporter, @NotNull DecoratedPlanksBlock decoratedPlanks,
                                                Block logOrWood, String path) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, decoratedPlanks, 4).group("decorated_planks")
                .input(logOrWood)
                .criterion(FabricRecipeProvider.hasItem(logOrWood),
                        FabricRecipeProvider.conditionsFromItem(logOrWood))
                .offerTo(exporter, path);
    }

    private static void generateDecoratedWood(RecipeExporter exporter, @NotNull DecoratedWoodBlock decoratedWood) {
        Block decoratedLog = decoratedWood.getDecoratedLog();
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, decoratedWood, 4).group("decorated_wood")
                .pattern("##").pattern("##")
                .input('#', decoratedLog)
                .criterion(FabricRecipeProvider.hasItem(decoratedLog),
                        FabricRecipeProvider.conditionsFromItem(decoratedLog))
                .offerTo(exporter);
    }

    private static void generateVerticalSlab(RecipeExporter exporter, @NotNull VerticalSlabBlock verticalSlab) {
        Block fullBlock = verticalSlab.getFullBlock();
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, verticalSlab, 6).group("vertical_slab")
                .pattern("#").pattern("#").pattern("#")
                .input('#', fullBlock)
                .criterion(FabricRecipeProvider.hasItem(fullBlock),
                        FabricRecipeProvider.conditionsFromItem(fullBlock))
                .offerTo(exporter);
    }

    private static void generateLantern(RecipeExporter exporter, @NotNull ModLanternBlock lantern) {
        Item dye = lantern.getDye();
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, lantern).group("lantern")
                .input(Blocks.LANTERN)
                .input(dye)
                .criterion(FabricRecipeProvider.hasItem(Blocks.LANTERN),
                        FabricRecipeProvider.conditionsFromItem(Blocks.LANTERN))
                .criterion(FabricRecipeProvider.hasItem(dye),
                        FabricRecipeProvider.conditionsFromItem(dye))
                .offerTo(exporter);
    }

    private static void generateDeepOcean(RecipeExporter exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DEEP_OCEAN_BRICKS, 8).group("deep_ocean")
                .input(Items.BLUE_DYE)
                .input(Blocks.CLAY, 4)
                .input(Blocks.PRISMARINE, 4)
                .criterion(FabricRecipeProvider.hasItem(Items.BLUE_DYE),
                        FabricRecipeProvider.conditionsFromItem(Items.BLUE_DYE))
                .criterion(FabricRecipeProvider.hasItem(Blocks.CLAY),
                        FabricRecipeProvider.conditionsFromItem(Blocks.CLAY))
                .criterion(FabricRecipeProvider.hasItem(Blocks.PRISMARINE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.PRISMARINE))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DEEP_OCEAN_BRICK_SLAB, 4).group("deep_ocean")
                .pattern("###")
                .input('#', ModBlocks.DEEP_OCEAN_BRICKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.DEEP_OCEAN_BRICKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.DEEP_OCEAN_BRICKS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DEEP_OCEAN_BRICK_STAIRS, 4).group("deep_ocean")
                .pattern("#  ").pattern("## ").pattern("###")
                .input('#', ModBlocks.DEEP_OCEAN_BRICKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.DEEP_OCEAN_BRICKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.DEEP_OCEAN_BRICKS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DEEP_OCEAN_BRICK_WALL, 6).group("deep_ocean")
                .pattern("###").pattern("###")
                .input('#', ModBlocks.DEEP_OCEAN_BRICKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.DEEP_OCEAN_BRICKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.DEEP_OCEAN_BRICKS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CHISELED_DEEP_OCEAN_BRICKS).group("deep_ocean")
                .pattern("#").pattern("#")
                .input('#', ModBlocks.DEEP_OCEAN_BRICK_SLAB)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.DEEP_OCEAN_BRICK_SLAB),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.DEEP_OCEAN_BRICK_SLAB))
                .offerTo(exporter);
    }
}