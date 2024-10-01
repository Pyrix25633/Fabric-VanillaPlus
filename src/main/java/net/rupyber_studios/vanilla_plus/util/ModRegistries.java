package net.rupyber_studios.vanilla_plus.util;


import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.command.v2.ArgumentTypeRegistry;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.block.Block;
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
        for(Block block : ModBlocks.ALL) {
            if(block.getDefaultState().isBurnable())
                FlammableBlockRegistry.getDefaultInstance().add(block, 5, 20);
        }
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