package net.rupyber_studios.vanilla_plus;

import net.fabricmc.api.ModInitializer;
import net.rupyber_studios.vanilla_plus.block.ModBlocks;
import net.rupyber_studios.vanilla_plus.item.ModItems;
import net.rupyber_studios.vanilla_plus.registries.ModFlammableBlocks;
import net.rupyber_studios.vanilla_plus.sounds.ModSounds;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class VanillaPlus implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LogManager.getLogger("vanilla_plus");

	public static final String MOD_ID = "vanilla_plus";

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModFlammableBlocks.registerFlammables();

		ModSounds.registerSounds();


		LOGGER.info("Hello Fabric world!");
	}
}
