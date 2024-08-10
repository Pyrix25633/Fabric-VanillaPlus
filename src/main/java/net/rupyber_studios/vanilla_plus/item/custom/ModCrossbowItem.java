package net.rupyber_studios.vanilla_plus.item.custom;

import net.minecraft.client.item.TooltipType;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.rupyber_studios.vanilla_plus.item.ModItems;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ModCrossbowItem extends CrossbowItem implements DungeonItem {
    public ModCrossbowItem(Settings settings) {
        super(settings);
    }

    @Override
    public List<Item> getInputs() {
        if(this == ModItems.EXPLODING_CROSSBOW) return List.of(Items.CROSSBOW, Items.TRIPWIRE_HOOK);
        if(this == ModItems.HEAVY_CROSSBOW) return List.of(ModItems.EXPLODING_CROSSBOW, Items.TRIPWIRE_HOOK);
        if(this == ModItems.BUTTERFLY_CROSSBOW) return List.of(ModItems.HEAVY_CROSSBOW, Items.TRIPWIRE_HOOK);
        if(this == ModItems.FIREBOLT_THROWER) return List.of(ModItems.BUTTERFLY_CROSSBOW, Items.TRIPWIRE_HOOK);
        if(this == ModItems.RAPID_CROSSBOW) return List.of(ModItems.FIREBOLT_THROWER, Items.TRIPWIRE_HOOK);
        return List.of(Items.AIR);
    }

    @Override
    public String getGroup() {
        return "crossbow";
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