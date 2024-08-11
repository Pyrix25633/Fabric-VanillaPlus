package net.rupyber_studios.vanilla_plus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.registry.RegistryWrapper;
import net.rupyber_studios.vanilla_plus.block.ModBlocks;
import net.rupyber_studios.vanilla_plus.block.custom.HollowLogBlock;
import net.rupyber_studios.vanilla_plus.block.custom.VerticalSlabBlock;
import net.rupyber_studios.vanilla_plus.block.type.VerticalSlabType;

import java.util.concurrent.CompletableFuture;

public class ModBlockLootTableProvider extends FabricBlockLootTableProvider {
    public ModBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        for(Block block : ModBlocks.ALL) {
            if(block instanceof HollowLogBlock) {
                addDrop(block, LootTable.builder()
                        .pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F))
                                .with(this.applyExplosionDecay(block, ItemEntry.builder(block))))
                        .pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F))
                                .with(this.applyExplosionDecay(Blocks.MOSS_CARPET, ItemEntry.builder(Blocks.MOSS_CARPET)
                                        .conditionally(BlockStatePropertyLootCondition.builder(block)
                                                .properties(StatePredicate.Builder.create()
                                                        .exactMatch(HollowLogBlock.MOSSY, true)))))));
            }
            else if(block instanceof VerticalSlabBlock) {
                addDrop(block, LootTable.builder().pool(LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1.0F))
                        .with(this.applyExplosionDecay(block, ItemEntry.builder(block)
                                .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0F)))
                                .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0F), true)
                                        .conditionally(BlockStatePropertyLootCondition.builder(block)
                                                .properties(StatePredicate.Builder.create()
                                                        .exactMatch(VerticalSlabBlock.TYPE, VerticalSlabType.DOUBLE))))))));
            }
            else
                addDrop(block);
        }
    }
}