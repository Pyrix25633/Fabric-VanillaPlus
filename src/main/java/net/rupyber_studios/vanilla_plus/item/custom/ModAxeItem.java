package net.rupyber_studios.vanilla_plus.item.custom;

import net.minecraft.client.item.TooltipType;
import net.minecraft.item.*;
import net.minecraft.text.Text;
import net.rupyber_studios.vanilla_plus.item.ModItems;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ModAxeItem extends AxeItem implements DungeonItem {
    public ModAxeItem(ToolMaterial material, Settings settings) {
        super(material, settings);
    }

    @Override
    public List<Item> getInputs() {
        if(this == ModItems.AXE) return List.of(Items.IRON_AXE, Items.IRON_INGOT);
        if(this == ModItems.DOUBLE_AXE) return List.of(ModItems.AXE, Items.IRON_INGOT);
        if(this == ModItems.MACE) return List.of(ModItems.DOUBLE_AXE, Items.IRON_INGOT);
        return List.of(Items.AIR);
    }

    @Override
    public String getGroup() {
        return "axe";
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