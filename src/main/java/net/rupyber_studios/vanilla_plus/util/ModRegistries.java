package net.rupyber_studios.vanilla_plus.util;


import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.command.v2.ArgumentTypeRegistry;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.command.argument.serialize.ConstantArgumentSerializer;
import net.minecraft.util.Identifier;
import net.rupyber_studios.vanilla_plus.VanillaPlus;
import net.rupyber_studios.vanilla_plus.block.ModBlocks;
import net.rupyber_studios.vanilla_plus.command.GiveTotemsCommand;
import net.rupyber_studios.vanilla_plus.command.argument.TotemArgumentType;

public class ModRegistries {
    public static void registerFlammables() {
        final int Encouragement = 5, Flammability = 20;
        //Oak
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_OAK_PLANKS, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_OAK_LOG, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_OAK_WOOD, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_STRIPPED_OAK_LOG, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_STRIPPED_OAK_WOOD, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.OAK_TABLE, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.HOLLOW_OAK_LOG, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_HOLLOW_OAK_LOG, Encouragement, Flammability);
        //Spruce
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_SPRUCE_PLANKS, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_SPRUCE_LOG, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_SPRUCE_WOOD, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_STRIPPED_SPRUCE_LOG, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_STRIPPED_SPRUCE_WOOD, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SPRUCE_TABLE, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.HOLLOW_SPRUCE_LOG, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_HOLLOW_SPRUCE_LOG, Encouragement, Flammability);
        //Birch
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_BIRCH_PLANKS, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_BIRCH_LOG, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_BIRCH_WOOD, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_STRIPPED_BIRCH_LOG, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_STRIPPED_BIRCH_WOOD, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BIRCH_TABLE, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.HOLLOW_BIRCH_LOG, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_HOLLOW_BIRCH_LOG, Encouragement, Flammability);
        //Acacia
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_ACACIA_PLANKS, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_ACACIA_LOG, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_ACACIA_WOOD, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_STRIPPED_ACACIA_LOG, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_STRIPPED_ACACIA_WOOD, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ACACIA_TABLE, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.HOLLOW_ACACIA_LOG, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_HOLLOW_ACACIA_LOG, Encouragement, Flammability);
        //Jungle
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_JUNGLE_PLANKS, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_JUNGLE_LOG, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_JUNGLE_WOOD, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_STRIPPED_JUNGLE_LOG, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_STRIPPED_JUNGLE_WOOD, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.JUNGLE_TABLE, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.HOLLOW_JUNGLE_LOG, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_HOLLOW_JUNGLE_LOG, Encouragement, Flammability);
        //Dark Oak
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_DARK_OAK_PLANKS, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_DARK_OAK_LOG, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_DARK_OAK_WOOD, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_STRIPPED_DARK_OAK_LOG, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_STRIPPED_DARK_OAK_WOOD, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DARK_OAK_TABLE, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.HOLLOW_DARK_OAK_LOG, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_HOLLOW_DARK_OAK_LOG, Encouragement, Flammability);

        //Vertical Slabs
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.OAK_VERTICAL_SLAB, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SPRUCE_VERTICAL_SLAB, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ACACIA_VERTICAL_SLAB, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BIRCH_VERTICAL_SLAB, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.JUNGLE_VERTICAL_SLAB, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DARK_OAK_VERTICAL_SLAB, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CRIMSON_VERTICAL_SLAB, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WARPED_VERTICAL_SLAB, Encouragement, Flammability);
    }

    public static void registerCommands() {
        ArgumentTypeRegistry.registerArgumentType(new Identifier(VanillaPlus.MOD_ID, "totem"),
                TotemArgumentType.class, ConstantArgumentSerializer.of(TotemArgumentType::new));
        CommandRegistrationCallback.EVENT.register(GiveTotemsCommand::register);
    }

    public static void getCutouts() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GREEN_LANTERN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.YELLOW_LANTERN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RED_LANTERN, RenderLayer.getCutout());
    }
}