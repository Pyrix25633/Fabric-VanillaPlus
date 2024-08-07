package net.rupyber_studios.vanilla_plus.item.custom;

import net.minecraft.client.item.TooltipType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.rupyber_studios.vanilla_plus.item.ModItems;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ModSwordItem extends SwordItem {
    public ModSwordItem(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
    }

    @Override
    public void appendTooltip(@NotNull ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        if(stack.getItem() == ModItems.SWORD)
            tooltip.add(Text.translatable("item.vanilla_plus.sword.tooltip"));
        else if(stack.getItem() == ModItems.DIAMOND_SWORD)
            tooltip.add(Text.translatable("item.vanilla_plus.diamond_sword.tooltip"));
    }
}