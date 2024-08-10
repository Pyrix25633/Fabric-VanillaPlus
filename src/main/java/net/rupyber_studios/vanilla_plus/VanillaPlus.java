package net.rupyber_studios.vanilla_plus;

import net.fabricmc.api.ModInitializer;
import net.rupyber_studios.vanilla_plus.block.ModBlocks;
import net.rupyber_studios.vanilla_plus.item.ModItemGroups;
import net.rupyber_studios.vanilla_plus.item.ModItems;
import net.rupyber_studios.vanilla_plus.sounds.ModSounds;
import net.rupyber_studios.vanilla_plus.util.ModRegistries;
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
		ModItemGroups.buildItemGroups();

		ModSounds.registerSounds();

		ModItems.registerModItems();

		ModBlocks.registerModBlocks();

		ModRegistries.registerFlammables();

		ModRegistries.registerCommands();

		ModRegistries.modifyLootTables();

		LOGGER.info("Vanilla Plus initialized");

		// TODO: crafting recipes 70%
		// TODO: block loot tables 50%
		// TODO: advancements 0%
		// TODO: custom totems 20%
		// TODO: mangrove, cherry blossom -> table, vertical slabs, hollow logs, decorated logs, decorated hollow logs, decorated planks 0%
		// TODO: bamboo and bamboo mosaic -> vertical slab 0%
	}
}