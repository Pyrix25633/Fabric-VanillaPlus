package net.rupyber_studios.vanilla_plus.item.custom;

import net.minecraft.client.item.TooltipType;
import net.minecraft.item.BowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.rupyber_studios.vanilla_plus.item.ModItems;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ModBowItem extends BowItem implements DungeonItem {
    public ModBowItem(Settings settings) {
        super(settings);
    }

    @Override
    public List<Item> getInputs() {
        if(this == ModItems.POWER_BOW) return List.of(Items.BOW, Items.STRING);
        if(this == ModItems.ELITE_POWER_BOW) return List.of(ModItems.POWER_BOW, Items.STRING);
        return List.of(Items.AIR);
    }

    @Override
    public String getGroup() {
        return "bow";
    }

    @Override
    public void appendTooltip(@NotNull ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        if(stack.getItem() == ModItems.POWER_BOW)
            tooltip.add(Text.translatable("item.vanilla_plus.power_bow.tooltip"));
        else if(stack.getItem() == ModItems.ELITE_POWER_BOW)
            tooltip.add(Text.translatable("item.vanilla_plus.elite_power_bow.tooltip"));
    }
}