package net.rupyber_studios.vanilla_plus.item.custom;

import com.ibm.icu.lang.UCharacter;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;
import net.rupyber_studios.vanilla_plus.item.ModItems;

import javax.annotation.Nullable;
import java.util.List;

public class ModBowItem extends BowItem {
    public ModBowItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if(stack.getItem() == ModItems.POWER_BOW)
            tooltip.add(new TranslatableText("item.vanilla_plus.power_bow.tooltip"));
        else if(stack.getItem() == ModItems.ELITE_POWER_BOW)
            tooltip.add(new TranslatableText("item.vanilla_plus.elite_power_bow.tooltip"));
    }
}