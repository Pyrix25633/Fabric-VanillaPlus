package net.rupyber_studios.vanilla_plus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryWrapper;
import net.rupyber_studios.vanilla_plus.block.ModBlocks;
import net.rupyber_studios.vanilla_plus.block.custom.HollowLogBlock;
import net.rupyber_studios.vanilla_plus.block.custom.VerticalSlabBlock;

import java.util.concurrent.CompletableFuture;

public class ModBlockLootTableProvider extends FabricBlockLootTableProvider {
    public ModBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        for(Block block : ModBlocks.ALL) {
            if(block instanceof HollowLogBlock) {
                addDrop(block);
            }
            else if(block instanceof VerticalSlabBlock) {
                addDrop(block);
            }
            else
                addDrop(block);
        }
    }
}