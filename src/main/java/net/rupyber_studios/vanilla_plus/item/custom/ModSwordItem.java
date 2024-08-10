package net.rupyber_studios.vanilla_plus.item.custom;

import net.minecraft.client.item.TooltipType;
import net.minecraft.item.*;
import net.minecraft.text.Text;
import net.rupyber_studios.vanilla_plus.item.ModItems;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ModSwordItem extends SwordItem implements DungeonItem {
    public ModSwordItem(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
    }

    @Override
    public List<Item> getInputs() {
        if(this == ModItems.SWORD) return List.of(Items.IRON_SWORD, Items.IRON_INGOT);
        if(this == ModItems.DIAMOND_SWORD) return List.of(Items.DIAMOND_SWORD, Items.DIAMOND);
        return List.of(Items.AIR);
    }

    @Override
    public String getGroup() {
        return "sword";
    }

    @Override
    public void appendTooltip(@NotNull ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        if(stack.getItem() == ModItems.SWORD)
            tooltip.add(Text.translatable("item.vanilla_plus.sword.tooltip"));
        else if(stack.getItem() == ModItems.DIAMOND_SWORD)
            tooltip.add(Text.translatable("item.vanilla_plus.diamond_sword.tooltip"));
    }
}