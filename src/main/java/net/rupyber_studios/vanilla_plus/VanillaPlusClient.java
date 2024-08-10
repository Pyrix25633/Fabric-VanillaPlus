package net.rupyber_studios.vanilla_plus;

import net.fabricmc.api.ClientModInitializer;
import net.rupyber_studios.vanilla_plus.item.ModItems;
import net.rupyber_studios.vanilla_plus.sounds.ModSounds;
import net.rupyber_studios.vanilla_plus.util.ModModelPredicateProvider;
import net.rupyber_studios.vanilla_plus.util.ModRegistries;
import net.rupyber_studios.vanilla_plus.util.UniqueItemRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class VanillaPlusClient implements ClientModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LogManager.getLogger("vanilla_plus");

	@Override
	public void onInitializeClient() {
		ModSounds.registerSounds();

		ModRegistries.getCutouts();

		ModModelPredicateProvider.registerModModels();

		UniqueItemRegistry.BOW.addItemToRegistry(ModItems.POWER_BOW);
		UniqueItemRegistry.BOW.addItemToRegistry(ModItems.ELITE_POWER_BOW);
		UniqueItemRegistry.CROSSBOW.addItemToRegistry(ModItems.EXPLODING_CROSSBOW);
		UniqueItemRegistry.CROSSBOW.addItemToRegistry(ModItems.HEAVY_CROSSBOW);
		UniqueItemRegistry.CROSSBOW.addItemToRegistry(ModItems.BUTTERFLY_CROSSBOW);
		UniqueItemRegistry.CROSSBOW.addItemToRegistry(ModItems.FIREBOLT_THROWER);
		UniqueItemRegistry.CROSSBOW.addItemToRegistry(ModItems.RAPID_CROSSBOW);

		LOGGER.info("Vanilla Plus Client initialized");
	}
}