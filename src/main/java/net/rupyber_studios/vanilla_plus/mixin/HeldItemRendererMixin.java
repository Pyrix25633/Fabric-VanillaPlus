package net.rupyber_studios.vanilla_plus.util.multiitemlib.mixin.render;

import net.minecraft.client.render.item.HeldItemRenderer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.rupyber_studios.vanilla_plus.util.multiitemlib.api.UniqueItemRegistry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(HeldItemRenderer.class)
public class HeldItemRendererMixin {
    @Redirect(method = "renderFirstPersonItem", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;isOf(Lnet/minecraft/item/Item;)Z", ordinal = 1))
    private boolean renderFirstPersonItem(ItemStack stack, Item isOfItem) {
        return UniqueItemRegistry.CROSSBOW.isItemInRegistry(stack.getItem());
    }

    @Redirect(method = "getHandRenderType", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;isOf(Lnet/minecraft/item/Item;)Z"))
    private static boolean getHandRenderType(ItemStack stack, Item isOfItem) {
        return UniqueItemRegistry.BOW.isItemInRegistry(stack.getItem()) || UniqueItemRegistry.CROSSBOW.isItemInRegistry(stack.getItem());
    }
}