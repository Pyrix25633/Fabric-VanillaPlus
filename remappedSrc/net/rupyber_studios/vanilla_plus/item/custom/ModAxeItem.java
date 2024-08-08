package net.rupyber_studios.vanilla_plus.item.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import net.rupyber_studios.vanilla_plus.item.ModItems;

import java.util.List;

public class ModAxeItem extends AxeItem {
    public ModAxeItem(ToolMaterial material, float attackDamage, float attackSpeed, net.minecraft.item.Item.Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, net.minecraft.item.Item.TooltipContext context) {
        if(stack.getItem() == ModItems.AXE)
            tooltip.add(Text.translatable("item.vanilla_plus.axe.tooltip"));
        else if(stack.getItem() == ModItems.DOUBLE_AXE)
            tooltip.add(Text.translatable("item.vanilla_plus.double_axe.tooltip"));
        else if(stack.getItem() == ModItems.MACE)
            tooltip.add(Text.translatable("item.vanilla_plus.mace.tooltip"));
    }
}