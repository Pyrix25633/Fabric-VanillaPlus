package net.rupyber_studios.vanilla_plus.item.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;
import net.rupyber_studios.vanilla_plus.item.ModItems;

import javax.annotation.Nullable;
import java.util.List;

public class ModSwordItem extends SwordItem {
    public ModSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if(stack.getItem() == ModItems.SWORD)
            tooltip.add(new TranslatableText("item.vanilla_plus.sword.tooltip"));
        else if(stack.getItem() == ModItems.DIAMOND_SWORD)
            tooltip.add(new TranslatableText("item.vanilla_plus.diamond_sword.tooltip"));
    }
}