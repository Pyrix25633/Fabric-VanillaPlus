package net.rupyber_studios.vanilla_plus.item.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import net.rupyber_studios.vanilla_plus.item.ModItems;

import java.util.List;

public class ModCrossbowItem extends CrossbowItem {
    public ModCrossbowItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
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