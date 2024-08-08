package net.rupyber_studios.vanilla_plus.sounds;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.rupyber_studios.vanilla_plus.VanillaPlus;

public class ModSounds {
    //Lofi
    public static SoundEvent EVERYTHING_S_A_SYMPTOM = registerSoundEvent("everything_s_a_symptom");
    public static SoundEvent DAWN = registerSoundEvent("dawn");
    public static SoundEvent HERON = registerSoundEvent("heron");
    public static SoundEvent SWEET_LOOK = registerSoundEvent("sweet_look");
    public static SoundEvent LOST_TREASURE = registerSoundEvent("lost_treasure");
    public static SoundEvent ALIEN_SKY = registerSoundEvent("alien_sky");
    public static SoundEvent BACKPACK_CITY = registerSoundEvent("backpack_city");
    public static SoundEvent LEVITATE = registerSoundEvent("levitate");
    public static SoundEvent SNAPS = registerSoundEvent("snaps");
    public static SoundEvent MOUNT_AND_BLADE = registerSoundEvent("mount_and_blade");
    public static SoundEvent PINK_NIGHT_SKY = registerSoundEvent("pink_night_sky");
    public static SoundEvent YERBA_MATE = registerSoundEvent("yerba_mate");
    public static SoundEvent PALE_MOON = registerSoundEvent("pale_moon");
    public static SoundEvent MISTY = registerSoundEvent("misty");
    public static SoundEvent FINDING = registerSoundEvent("finding");
    public static SoundEvent DECAY = registerSoundEvent("decay");
    public static SoundEvent MOVING_ON = registerSoundEvent("moving_on");
    public static SoundEvent MY_PERSON = registerSoundEvent("my_person");
    public static SoundEvent NO_WORRIES = registerSoundEvent("no_worries");
    public static SoundEvent WISTFUL = registerSoundEvent("wistful");
    public static SoundEvent ALONE_ON_D_BEACH = registerSoundEvent("alone_on_d_beach");
    public static SoundEvent NOT_ME = registerSoundEvent("not_me");

    //Pop
    public static SoundEvent BACKYARD_BOY = registerSoundEvent("backyard_boy");
    public static SoundEvent LOSING_MY_GRIP = registerSoundEvent("losing_my_grip");
    public static SoundEvent PENNY_RABBIT_AND_SUMMER_BEAR = registerSoundEvent("penny_rabbit_and_summer_bear");
    public static SoundEvent REMEMBER_WHEN = registerSoundEvent("remember_when");
    public static SoundEvent I_LOVE_YOU_BABY = registerSoundEvent("i_love_you_baby");
    public static SoundEvent TIME = registerSoundEvent("time");
    public static SoundEvent PANIC_AT_THE_DISCO = registerSoundEvent("panic_at_the_disco");
    public static SoundEvent DANCE_MONKEY = registerSoundEvent("dance_monkey");

    //Rap
    public static SoundEvent I_WONDER = registerSoundEvent("i_wonder");

    //Rock
    public static SoundEvent LIBERTY_BELLE = registerSoundEvent("liberty_belle");

    //Electro
    public static SoundEvent I_HAVE_SEEN_A_GHOST = registerSoundEvent("i_have_seen_a_ghost");
    public static SoundEvent THE_DISTANCE_BETWEEN_US = registerSoundEvent("the_distance_between_us");

    //Other
    public static SoundEvent LUSH = registerSoundEvent("lush");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(VanillaPlus.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        System.out.println("Registering ModSounds for " + VanillaPlus.MOD_ID);
    }
}
