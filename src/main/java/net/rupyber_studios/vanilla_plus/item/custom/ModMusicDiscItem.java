package net.rupyber_studios.vanilla_plus.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.sound.SoundEvent;
import net.rupyber_studios.vanilla_plus.item.ModItems;

import java.util.ArrayList;
import java.util.List;

public class ModMusicDiscItem extends MusicDiscItem {
    public ModMusicDiscItem(int comparatorOutput, SoundEvent sound, Settings settings, int lengthInSeconds) {
        super(comparatorOutput, sound, settings, lengthInSeconds);
    }

    public List<Item> getInputs() {
        List<Item> inputs = new ArrayList<>();

        inputs.add(ModItems.BLANK_LOFI_MUSIC_DISC);
        if(this == ModItems.MUSIC_DISC_EVERYTHING_S_A_SYMPTOM) {
            inputs.add(Items.YELLOW_DYE);
            inputs.add(Items.PURPLE_DYE);
        }
        else if(this == ModItems.MUSIC_DISC_DAWN) {
            inputs.add(Items.LIGHT_BLUE_DYE);
            inputs.add(Items.ORANGE_DYE);
        }
        else if(this == ModItems.MUSIC_DISC_HERON) {
            inputs.add(Items.LIME_DYE);
            inputs.add(Items.PURPLE_DYE);
        }
        else if(this == ModItems.MUSIC_DISC_SWEET_LOOK) {
            inputs.add(Items.LIME_DYE);
            inputs.add(Items.RED_DYE);
        }
        else if(this == ModItems.MUSIC_DISC_LOST_TREASURE) {
            inputs.add(Items.BROWN_DYE);
            inputs.add(Items.GREEN_DYE);
        }else if(this == ModItems.MUSIC_DISC_ALIEN_SKY) {
            inputs.add(Items.BLUE_DYE);
            inputs.add(Items.YELLOW_DYE);
        }
        else if(this == ModItems.MUSIC_DISC_BACKPACK_CITY) {
            inputs.add(Items.RED_DYE);
            inputs.add(Items.ORANGE_DYE);
        }
        else if(this == ModItems.MUSIC_DISC_LEVITATE) {
            inputs.add(Items.RED_DYE);
            inputs.add(Items.YELLOW_DYE);
        }
        else if(this == ModItems.MUSIC_DISC_SNAPS) {
            inputs.add(Items.LIGHT_BLUE_DYE);
            inputs.add(Items.PURPLE_DYE);
        }
        else if(this == ModItems.MUSIC_DISC_MOUNT_AND_BLADE) {
            inputs.add(Items.GREEN_DYE);
            inputs.add(Items.ORANGE_DYE);
        }
        else if(this == ModItems.MUSIC_DISC_PINK_NIGHT_SKY) {
            inputs.add(Items.MAGENTA_DYE);
            inputs.add(Items.WHITE_DYE);
        }
        else if(this == ModItems.MUSIC_DISC_YERBA_MATE) {
            inputs.add(Items.BLACK_DYE);
            inputs.add(Items.RED_DYE);
        }
        else if(this == ModItems.MUSIC_DISC_PALE_MOON) {
            inputs.add(Items.CYAN_DYE);
            inputs.add(Items.BLACK_DYE);
        }
        else if(this == ModItems.MUSIC_DISC_MISTY) {
            inputs.add(Items.LIME_DYE);
            inputs.add(Items.BLACK_DYE);
        }
        else if(this == ModItems.MUSIC_DISC_FINDING) {
            inputs.add(Items.YELLOW_DYE);
            inputs.add(Items.LIME_DYE);
        }
        else if(this == ModItems.MUSIC_DISC_DECAY) {
            inputs.add(Items.RED_DYE);
            inputs.add(Items.WHITE_DYE);
        }
        else if(this == ModItems.MUSIC_DISC_MOVING_ON) {
            inputs.add(Items.PURPLE_DYE);
            inputs.add(Items.RED_DYE);
        }
        else if(this == ModItems.MUSIC_DISC_MY_PERSON) {
            inputs.add(Items.GREEN_DYE);
            inputs.add(Items.RED_DYE);
        }
        else if(this == ModItems.MUSIC_DISC_NO_WORRIES) {
            inputs.add(Items.PINK_DYE);
            inputs.add(Items.GREEN_DYE);
        }
        else if(this == ModItems.MUSIC_DISC_WISTFUL) {
            inputs.add(Items.BLUE_DYE);
            inputs.add(Items.RED_DYE);
        }
        else if(this == ModItems.MUSIC_DISC_ALONE_ON_D_BEACH) {
            inputs.add(Items.LIGHT_BLUE_DYE);
            inputs.add(Items.YELLOW_DYE);
        }
        else if(this == ModItems.MUSIC_DISC_NOT_ME) {
            inputs.add(Items.BLUE_DYE);
            inputs.add(Items.ORANGE_DYE);
        }
        if(inputs.size() > 1) return inputs;

        inputs.clear();
        inputs.add(ModItems.BLANK_POP_MUSIC_DISC);
        if(this == ModItems.MUSIC_DISC_BACKYARD_BOY) {
            inputs.add(Items.CYAN_DYE);
            inputs.add(Items.PURPLE_DYE);
        }
        else if(this == ModItems.MUSIC_DISC_LOSING_MY_GRIP) {
            inputs.add(Items.BLACK_DYE);
            inputs.add(Items.WHITE_DYE);
        }
        else if(this == ModItems.MUSIC_DISC_PENNY_RABBIT_AND_SUMMER_BEAR) {
            inputs.add(Items.ORANGE_DYE);
            inputs.add(Items.BROWN_DYE);
        }
        else if(this == ModItems.MUSIC_DISC_REMEMBER_WHEN) {
            inputs.add(Items.BLUE_DYE);
            inputs.add(Items.YELLOW_DYE);
        }
        else if(this == ModItems.MUSIC_DISC_I_LOVE_YOU_BABY) {
            inputs.add(Items.BLACK_DYE);
            inputs.add(Items.BLUE_DYE);
        }
        else if(this == ModItems.MUSIC_DISC_TIME) {
            inputs.add(Items.BLUE_DYE);
            inputs.add(Items.LIGHT_BLUE_DYE);
        }
        else if(this == ModItems.MUSIC_DISC_PANIC_AT_THE_DISCO) {
            inputs.add(Items.RED_DYE);
            inputs.add(Items.YELLOW_DYE);
        }
        else if(this == ModItems.MUSIC_DISC_DANCE_MONKEY) {
            inputs.add(Items.PINK_DYE);
            inputs.add(Items.BLACK_DYE);
        }
        if(inputs.size() > 1) return inputs;

        inputs.clear();
        inputs.add(ModItems.BLANK_RAP_MUSIC_DISC);
        if(this == ModItems.MUSIC_DISC_I_WONDER) {
            inputs.add(Items.YELLOW_DYE);
            inputs.add(Items.GREEN_DYE);
        }
        if(inputs.size() > 1) return inputs;

        inputs.clear();
        inputs.add(ModItems.BLANK_ROCK_MUSIC_DISC);
        if(this == ModItems.MUSIC_DISC_LIBERTY_BELLE) {
            inputs.add(Items.ORANGE_DYE);
            inputs.add(Items.RED_DYE);
        }
        if(inputs.size() > 1) return inputs;

        inputs.clear();
        inputs.add(ModItems.BLANK_ELECTRO_MUSIC_DISC);
        if(this == ModItems.MUSIC_DISC_I_HAVE_SEEN_A_GHOST) {
            inputs.add(Items.WHITE_DYE);
            inputs.add(Items.ORANGE_DYE);
        }
        else if(this == ModItems.MUSIC_DISC_THE_DISTANCE_BETWEEN_US) {
            inputs.add(Items.GREEN_DYE);
            inputs.add(Items.LIME_DYE);
        }
        if(inputs.size() > 1) return inputs;

        inputs.clear();
        inputs.add(ModItems.BLANK_MUSIC_DISC);
        if(this == ModItems.MUSIC_DISC_LUSH) {
            inputs.add(Items.MOSS_BLOCK);
        }
        if(inputs.size() > 1) return inputs;
        return List.of(Items.AIR);
    }
}