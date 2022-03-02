package net.pyrix25633.vanilla_plus;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.pyrix25633.vanilla_plus.block.ModBlocks;
import net.pyrix25633.vanilla_plus.item.ModItems;
import net.pyrix25633.vanilla_plus.registries.ModFlammableBlocks;
import net.pyrix25633.vanilla_plus.sounds.ModSounds;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class VanillaPlusClient implements ClientModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LogManager.getLogger("vanilla_plus");

	public static final String MOD_ID = "vanilla_plus";

	@Override
	public void onInitializeClient() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModFlammableBlocks.registerFlammables();

		ModSounds.registerSounds();

		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GREEN_LANTERN, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.YELLOW_LANTERN, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RED_LANTERN, RenderLayer.getCutout());

		LOGGER.info("Hello Fabric world!");
	}
}
