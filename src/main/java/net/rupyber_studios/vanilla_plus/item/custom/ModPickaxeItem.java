package net.rupyber_studios.vanilla_plus.item.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import net.rupyber_studios.vanilla_plus.item.ModItems;

import java.util.List;

public class ModPickaxeItem extends PickaxeItem {
    public ModPickaxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        if(stack.getItem() == ModItems.DIAMOND_PICKAXE)
            tooltip.add(Text.translatable("item.vanilla_plus.diamond_pickaxe.tooltip"));
    }
}