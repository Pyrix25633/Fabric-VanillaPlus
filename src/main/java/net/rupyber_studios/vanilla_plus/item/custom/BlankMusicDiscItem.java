package net.rupyber_studios.vanilla_plus.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.rupyber_studios.vanilla_plus.item.ModItems;

public class BlankMusicDiscItem extends Item {
    public BlankMusicDiscItem(Settings settings) {
        super(settings);
    }

    public Item getDye() {
        if(this == ModItems.BLANK_LOFI_MUSIC_DISC) return Items.PURPLE_DYE;
        if(this == ModItems.BLANK_POP_MUSIC_DISC) return Items.BLUE_DYE;
        if(this == ModItems.BLANK_RAP_MUSIC_DISC) return Items.YELLOW_DYE;
        if(this == ModItems.BLANK_ROCK_MUSIC_DISC) return Items.RED_DYE;
        if(this == ModItems.BLANK_ELECTRO_MUSIC_DISC) return Items.PURPLE_DYE;
        return Items.AIR;
    }
}