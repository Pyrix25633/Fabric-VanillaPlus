package net.rupyber_studios.vanilla_plus.util;


import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.command.v2.ArgumentTypeRegistry;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.command.argument.serialize.ConstantArgumentSerializer;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.LootingEnchantLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;
import net.rupyber_studios.vanilla_plus.VanillaPlus;
import net.rupyber_studios.vanilla_plus.block.ModBlocks;
import net.rupyber_studios.vanilla_plus.command.GiveTotemsCommand;
import net.rupyber_studios.vanilla_plus.command.argument.TotemArgumentType;

public class ModRegistries {
    public static void registerFlammables() {
        final int encouragement = 5, flammability = 20;
        //Oak
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_OAK_PLANKS, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_OAK_LOG, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_OAK_WOOD, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_STRIPPED_OAK_LOG, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_STRIPPED_OAK_WOOD, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.OAK_TABLE, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.HOLLOW_OAK_LOG, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_HOLLOW_OAK_LOG, encouragement, flammability);
        //Spruce
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_SPRUCE_PLANKS, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_SPRUCE_LOG, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_SPRUCE_WOOD, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_STRIPPED_SPRUCE_LOG, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_STRIPPED_SPRUCE_WOOD, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SPRUCE_TABLE, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.HOLLOW_SPRUCE_LOG, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_HOLLOW_SPRUCE_LOG, encouragement, flammability);
        //Birch
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_BIRCH_PLANKS, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_BIRCH_LOG, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_BIRCH_WOOD, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_STRIPPED_BIRCH_LOG, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_STRIPPED_BIRCH_WOOD, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BIRCH_TABLE, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.HOLLOW_BIRCH_LOG, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_HOLLOW_BIRCH_LOG, encouragement, flammability);
        //Acacia
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_ACACIA_PLANKS, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_ACACIA_LOG, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_ACACIA_WOOD, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_STRIPPED_ACACIA_LOG, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_STRIPPED_ACACIA_WOOD, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ACACIA_TABLE, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.HOLLOW_ACACIA_LOG, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_HOLLOW_ACACIA_LOG, encouragement, flammability);
        //Jungle
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_JUNGLE_PLANKS, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_JUNGLE_LOG, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_JUNGLE_WOOD, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_STRIPPED_JUNGLE_LOG, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_STRIPPED_JUNGLE_WOOD, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.JUNGLE_TABLE, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.HOLLOW_JUNGLE_LOG, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_HOLLOW_JUNGLE_LOG, encouragement, flammability);
        //Dark Oak
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_DARK_OAK_PLANKS, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_DARK_OAK_LOG, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_DARK_OAK_WOOD, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_STRIPPED_DARK_OAK_LOG, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_STRIPPED_DARK_OAK_WOOD, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DARK_OAK_TABLE, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.HOLLOW_DARK_OAK_LOG, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_HOLLOW_DARK_OAK_LOG, encouragement, flammability);

        //Vertical Slabs
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.OAK_VERTICAL_SLAB, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SPRUCE_VERTICAL_SLAB, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ACACIA_VERTICAL_SLAB, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BIRCH_VERTICAL_SLAB, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.JUNGLE_VERTICAL_SLAB, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DARK_OAK_VERTICAL_SLAB, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CRIMSON_VERTICAL_SLAB, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WARPED_VERTICAL_SLAB, encouragement, flammability);
    }

    public static void registerCommands() {
        ArgumentTypeRegistry.registerArgumentType(new Identifier(VanillaPlus.MOD_ID, "totem"),
                TotemArgumentType.class, ConstantArgumentSerializer.of(TotemArgumentType::new));
        CommandRegistrationCallback.EVENT.register(GiveTotemsCommand::register);
    }

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            System.out.println(key);
            String minecraft = "minecraft";
            if(source.isBuiltin() && new Identifier(minecraft, "entities/creeper").equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1F))
                        .with(ItemEntry.builder(Items.TOTEM_OF_UNDYING))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(0.0F, 1.0F)))
                        .apply(LootingEnchantLootFunction.builder(UniformLootNumberProvider.create(0.0F, 1.0F)));
                tableBuilder.pool(poolBuilder.build());
            }
        });
    }

    public static void getCutouts() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GREEN_LANTERN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.YELLOW_LANTERN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RED_LANTERN, RenderLayer.getCutout());
    }
}