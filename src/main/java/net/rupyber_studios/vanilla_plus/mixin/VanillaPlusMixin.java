package net.rupyber_studios.vanilla_plus.mixin;

import net.rupyber_studios.vanilla_plus.VanillaPlus;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class VanillaPlusMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		VanillaPlus.LOGGER.info("Vanilla Plus Test Mixin Working!");
	}
}
