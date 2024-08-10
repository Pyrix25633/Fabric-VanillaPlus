package net.rupyber_studios.vanilla_plus.block.custom;

import net.minecraft.block.LanternBlock;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.rupyber_studios.vanilla_plus.block.ModBlocks;

public class ModLanternBlock extends LanternBlock {
    public ModLanternBlock(Settings settings) {
        super(settings);
    }

    public Item getDye() {
        if(this == ModBlocks.GREEN_LANTERN) return Items.GREEN_DYE;
        if(this == ModBlocks.YELLOW_LANTERN) return Items.YELLOW_DYE;
        if(this == ModBlocks.RED_LANTERN) return Items.RED_DYE;
        return Items.AIR;
    }
}