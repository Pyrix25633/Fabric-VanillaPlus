package net.rupyber_studios.vanilla_plus;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.rupyber_studios.vanilla_plus.datagen.ModBlockLootTableProvider;
import net.rupyber_studios.vanilla_plus.datagen.ModRecipeProvider;
import net.rupyber_studios.vanilla_plus.loot_table.ModEntityLootTables;
import org.jetbrains.annotations.NotNull;

public class VanillaPlusDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(@NotNull FabricDataGenerator generator) {
        FabricDataGenerator.Pack pack = generator.createPack();
        //pack.addProvider(ModEntityLootTables::new);
        pack.addProvider(ModRecipeProvider::new);
        pack.addProvider(ModBlockLootTableProvider::new);
    }
}