package net.rupyber_studios.vanilla_plus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.rupyber_studios.vanilla_plus.block.ModBlocks;
import net.rupyber_studios.vanilla_plus.block.custom.HollowLogBlock;
import net.rupyber_studios.vanilla_plus.block.custom.TableBlock;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        for(Block block : ModBlocks.ALL) {
            if(block instanceof TableBlock table) {
                Block planks = table.getPlanks();
                ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, block).group("table")
                        .pattern("###").pattern("/ /")
                        .input('#', planks).input('/', Items.STICK)
                        .criterion(FabricRecipeProvider.hasItem(planks),
                                FabricRecipeProvider.conditionsFromItem(planks))
                        .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                                FabricRecipeProvider.conditionsFromItem(Items.STICK))
                        .offerTo(exporter);
            }
            else if(block instanceof HollowLogBlock hollowLog) {
                Block log = hollowLog.getLog();
                ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, block, 8).group("hollow_log")
                        .pattern("###").pattern("# #").pattern("###")
                        .input('#', log)
                        .criterion(FabricRecipeProvider.hasItem(log),
                                FabricRecipeProvider.conditionsFromItem(log))
                        .offerTo(exporter);
            }
        }
    }
}