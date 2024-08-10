package net.rupyber_studios.vanilla_plus.loot_table;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.SimpleFabricLootTableProvider;
import net.minecraft.entity.EntityType;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.context.LootContextTypes;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryWrapper;
import net.rupyber_studios.vanilla_plus.util.totem.Totem;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public class ModEntityLootTables extends SimpleFabricLootTableProvider {
    public ModEntityLootTables(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(output, registryLookup, LootContextTypes.ENTITY);
    }

    @Override
    public void accept(RegistryWrapper.WrapperLookup registryLookup, @NotNull BiConsumer<RegistryKey<LootTable>, LootTable.Builder> consumer) {
        consumer.accept(EntityType.SKELETON.getLootTableId(), Totem.SKELETON.getLootTableBuilder());
        consumer.accept(EntityType.ZOMBIE.getLootTableId(), Totem.ZOMBIE.getLootTableBuilder());
        consumer.accept(EntityType.CREEPER.getLootTableId(), Totem.CREEPER.getLootTableBuilder());
        consumer.accept(EntityType.SHULKER.getLootTableId(), Totem.SHULKER.getLootTableBuilder());
        consumer.accept(EntityType.ENDER_DRAGON.getLootTableId(), Totem.ENDER_DRAGON.getLootTableBuilder());
        consumer.accept(EntityType.GHAST.getLootTableId(), Totem.GHAST.getLootTableBuilder());
        consumer.accept(EntityType.SLIME.getLootTableId(), Totem.SLIME.getLootTableBuilder());
        consumer.accept(EntityType.ENDERMAN.getLootTableId(), Totem.ENDERMAN.getLootTableBuilder());
        consumer.accept(EntityType.GUARDIAN.getLootTableId(), Totem.GUARDIAN.getLootTableBuilder());
        consumer.accept(EntityType.ELDER_GUARDIAN.getLootTableId(), Totem.ELDER_GUARDIAN.getLootTableBuilder());
    }
}