package net.rupyber_studios.vanilla_plus.item.custom;

import net.minecraft.client.item.TooltipType;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.rupyber_studios.vanilla_plus.item.ModItems;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ModAxeItem extends AxeItem {
    public ModAxeItem(ToolMaterial material, Settings settings) {
        super(material, settings);
    }

    @Override
    public void appendTooltip(@NotNull ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        if(stack.getItem() == ModItems.AXE)
            tooltip.add(Text.translatable("item.vanilla_plus.axe.tooltip"));
        else if(stack.getItem() == ModItems.DOUBLE_AXE)
            tooltip.add(Text.translatable("item.vanilla_plus.double_axe.tooltip"));
        else if(stack.getItem() == ModItems.MACE)
            tooltip.add(Text.translatable("item.vanilla_plus.mace.tooltip"));
    }
}