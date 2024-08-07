package net.rupyber_studios.vanilla_plus.item.custom;

import net.minecraft.client.item.TooltipType;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.rupyber_studios.vanilla_plus.item.ModItems;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ModCrossbowItem extends CrossbowItem {
    public ModCrossbowItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(@NotNull ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        if(stack.getItem() == ModItems.EXPLODING_CROSSBOW)
            tooltip.add(Text.translatable("item.vanilla_plus.exploding_crossbow.tooltip"));
        else if(stack.getItem() == ModItems.HEAVY_CROSSBOW)
            tooltip.add(Text.translatable("item.vanilla_plus.heavy_crossbow.tooltip"));
        else if(stack.getItem() == ModItems.BUTTERFLY_CROSSBOW)
            tooltip.add(Text.translatable("item.vanilla_plus.butterfly_crossbow.tooltip"));
        else if(stack.getItem() == ModItems.FIREBOLT_THROWER)
            tooltip.add(Text.translatable("item.vanilla_plus.firebolt_thrower.tooltip"));
        else if(stack.getItem() == ModItems.RAPID_CROSSBOW)
            tooltip.add(Text.translatable("item.vanilla_plus.rapid_crossbow.tooltip"));
    }
}