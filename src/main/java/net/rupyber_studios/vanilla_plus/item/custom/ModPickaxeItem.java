package net.rupyber_studios.vanilla_plus.item.custom;

import net.minecraft.client.item.TooltipType;
import net.minecraft.item.*;
import net.minecraft.text.Text;
import net.rupyber_studios.vanilla_plus.item.ModItems;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ModPickaxeItem extends PickaxeItem implements DungeonItem {
    public ModPickaxeItem(ToolMaterial material, Settings settings) {
        super(material, settings);
    }

    @Override
    public List<Item> getInputs() {
        if(this == ModItems.DIAMOND_PICKAXE) return List.of(Items.DIAMOND_PICKAXE, Items.DIAMOND);
        return List.of(Items.AIR);
    }

    @Override
    public String getGroup() {
        return "pickaxe";
    }

    @Override
    public void appendTooltip(@NotNull ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        if(stack.getItem() == ModItems.DIAMOND_PICKAXE)
            tooltip.add(Text.translatable("item.vanilla_plus.diamond_pickaxe.tooltip"));
    }
}