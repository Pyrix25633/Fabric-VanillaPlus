package net.rupyber_studios.vanilla_plus.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.rupyber_studios.vanilla_plus.VanillaPlus;
import net.rupyber_studios.vanilla_plus.item.custom.*;
import net.rupyber_studios.vanilla_plus.sounds.ModSounds;

public class ModItems {

    public static final Item DECORATOR_TOOL = registerItem("decorator_tool",
            new DecoratorToolItem(new FabricItemSettings()
                    .group(ModItemGroup.DECORATIVE_BLOCKS).maxDamage(256)));

    //Dungeons items
    public static final Item AXE = registerItem("axe",
            new ModAxeItem(ToolMaterials.IRON, 6.2F, -2.9F,
                    new FabricItemSettings().group(ModItemGroup.DUNGEONS_ITEMS)));
    public static final Item DOUBLE_AXE = registerItem("double_axe",
            new ModAxeItem(ToolMaterials.IRON, 6.4F, -2.7F,
                    new FabricItemSettings().group(ModItemGroup.DUNGEONS_ITEMS)));
    public static final Item MACE = registerItem("mace",
            new ModAxeItem(ToolMaterials.IRON, 6.6F, -2.5F,
                    new FabricItemSettings().group(ModItemGroup.DUNGEONS_ITEMS)));
    public static final Item SWORD = registerItem("sword",
            new SwordItem(ToolMaterials.IRON, 4, -2.2F,
                    new FabricItemSettings().group(ModItemGroup.DUNGEONS_ITEMS)));
    public static final Item DIAMOND_SWORD = registerItem("diamond_sword",
            new SwordItem(ToolMaterials.DIAMOND, 4, -2.2F,
                    new FabricItemSettings().group(ModItemGroup.DUNGEONS_ITEMS)));
    public static final Item DIAMOND_PICKAXE = registerItem("diamond_pickaxe",
            new ModPickaxeItem(ToolMaterials.DIAMOND, 2, -2.6F,
                    new FabricItemSettings().group(ModItemGroup.DUNGEONS_ITEMS)));
    public static final Item POWER_BOW = registerItem("power_bow",
            new BowItem(new FabricItemSettings().maxDamage(412).group(ModItemGroup.DUNGEONS_ITEMS)));
    public static final Item ELITE_POWER_BOW = registerItem("elite_power_bow",
            new BowItem(new FabricItemSettings().maxDamage(462).group(ModItemGroup.DUNGEONS_ITEMS)));
    //public static final Item POWER_BOW = registerItem("power_bow",
    //        new CrossbowItem(new FabricItemSettings().maxDamage(384).group(ModItemGroup.DUNGEONS_ITEMS)));

    //Music discs
    public static final Item BLANK_MUSIC_DISC_PIECE = registerItem("blank_music_disc_piece",
            new Item(new FabricItemSettings().maxCount(64).group(ModItemGroup.MUSIC_DISCS)));
    public static final Item BLANK_MUSIC_DISC = registerItem("blank_music_disc",
            new Item(new FabricItemSettings().maxCount(64).group(ModItemGroup.MUSIC_DISCS)));
    public static final Item BLANK_LOFI_MUSIC_DISC = registerItem("blank_lofi_music_disc",
            new Item(new FabricItemSettings().maxCount(64).group(ModItemGroup.MUSIC_DISCS)));
    public static final Item BLANK_POP_MUSIC_DISC = registerItem("blank_pop_music_disc",
            new Item(new FabricItemSettings().maxCount(64).group(ModItemGroup.MUSIC_DISCS)));
    public static final Item BLANK_RAP_MUSIC_DISC = registerItem("blank_rap_music_disc",
            new Item(new FabricItemSettings().maxCount(64).group(ModItemGroup.MUSIC_DISCS)));
    public static final Item BLANK_ROCK_MUSIC_DISC = registerItem("blank_rock_music_disc",
            new Item(new FabricItemSettings().maxCount(64).group(ModItemGroup.MUSIC_DISCS)));
    public static final Item BLANK_ELECTRO_MUSIC_DISC = registerItem("blank_electro_music_disc",
            new Item(new FabricItemSettings().maxCount(64).group(ModItemGroup.MUSIC_DISCS)));

    //Lofi
    public static final Item MUSIC_DISC_EVERYTHING_S_A_SYMPTOM = registerItem("music_disc_everything_s_a_symptom",
            new ModMusicDiscItem(4, ModSounds.EVERYTHING_S_A_SYMPTOM, new FabricItemSettings()
                    .group(ModItemGroup.MUSIC_DISCS).maxCount(1)));
    public static final Item MUSIC_DISC_DAWN = registerItem("music_disc_dawn",
            new ModMusicDiscItem(4, ModSounds.DAWN, new FabricItemSettings()
                    .group(ModItemGroup.MUSIC_DISCS).maxCount(1)));
    public static final Item MUSIC_DISC_HERON = registerItem("music_disc_heron",
            new ModMusicDiscItem(4, ModSounds.HERON, new FabricItemSettings()
                    .group(ModItemGroup.MUSIC_DISCS).maxCount(1)));
    public static final Item MUSIC_DISC_SWEET_LOOK = registerItem("music_disc_sweet_look",
            new ModMusicDiscItem(4, ModSounds.SWEET_LOOK, new FabricItemSettings()
                    .group(ModItemGroup.MUSIC_DISCS).maxCount(1)));
    public static final Item MUSIC_DISC_LOST_TREASURE = registerItem("music_disc_lost_treasure",
            new ModMusicDiscItem(4, ModSounds.LOST_TREASURE, new FabricItemSettings()
                    .group(ModItemGroup.MUSIC_DISCS).maxCount(1)));
    public static final Item MUSIC_DISC_ALIEN_SKY = registerItem("music_disc_alien_sky",
            new ModMusicDiscItem(4, ModSounds.ALIEN_SKY, new FabricItemSettings()
                    .group(ModItemGroup.MUSIC_DISCS).maxCount(1)));
    public static final Item MUSIC_DISC_BACKPACK_CITY = registerItem("music_disc_backpack_city",
            new ModMusicDiscItem(4, ModSounds.BACKPACK_CITY, new FabricItemSettings()
                    .group(ModItemGroup.MUSIC_DISCS).maxCount(1)));
    public static final Item MUSIC_DISC_LEVITATE = registerItem("music_disc_levitate",
            new ModMusicDiscItem(4, ModSounds.LEVITATE, new FabricItemSettings()
                    .group(ModItemGroup.MUSIC_DISCS).maxCount(1)));
    public static final Item MUSIC_DISC_SNAPS = registerItem("music_disc_snaps",
            new ModMusicDiscItem(4, ModSounds.SNAPS, new FabricItemSettings()
                    .group(ModItemGroup.MUSIC_DISCS).maxCount(1)));
    public static final Item MUSIC_DISC_MOUNT_AND_BLADE = registerItem("music_disc_mount_and_blade",
            new ModMusicDiscItem(4, ModSounds.MOUNT_AND_BLADE, new FabricItemSettings()
                    .group(ModItemGroup.MUSIC_DISCS).maxCount(1)));
    public static final Item MUSIC_DISC_PINK_NIGHT_SKY = registerItem("music_disc_pink_night_sky",
            new ModMusicDiscItem(4, ModSounds.PINK_NIGHT_SKY, new FabricItemSettings()
                    .group(ModItemGroup.MUSIC_DISCS).maxCount(1)));
    public static final Item MUSIC_DISC_YERBA_MATE = registerItem("music_disc_yerba_mate",
            new ModMusicDiscItem(4, ModSounds.YERBA_MATE, new FabricItemSettings()
                    .group(ModItemGroup.MUSIC_DISCS).maxCount(1)));
    public static final Item MUSIC_DISC_PALE_MOON = registerItem("music_disc_pale_moon",
            new ModMusicDiscItem(4, ModSounds.PALE_MOON, new FabricItemSettings()
                    .group(ModItemGroup.MUSIC_DISCS).maxCount(1)));
    public static final Item MUSIC_DISC_MISTY = registerItem("music_disc_misty",
            new ModMusicDiscItem(4, ModSounds.MISTY, new FabricItemSettings()
                    .group(ModItemGroup.MUSIC_DISCS).maxCount(1)));
    public static final Item MUSIC_DISC_FINDING = registerItem("music_disc_finding",
            new ModMusicDiscItem(4, ModSounds.FINDING, new FabricItemSettings()
                    .group(ModItemGroup.MUSIC_DISCS).maxCount(1)));
    public static final Item MUSIC_DISC_DECAY = registerItem("music_disc_decay",
            new ModMusicDiscItem(4, ModSounds.DECAY, new FabricItemSettings()
                    .group(ModItemGroup.MUSIC_DISCS).maxCount(1)));
    public static final Item MUSIC_DISC_MOVING_ON = registerItem("music_disc_moving_on",
            new ModMusicDiscItem(4, ModSounds.MOVING_ON, new FabricItemSettings()
                    .group(ModItemGroup.MUSIC_DISCS).maxCount(1)));
    public static final Item MUSIC_DISC_MY_PERSON = registerItem("music_disc_my_person",
            new ModMusicDiscItem(4, ModSounds.MY_PERSON, new FabricItemSettings()
                    .group(ModItemGroup.MUSIC_DISCS).maxCount(1)));
    public static final Item MUSIC_DISC_NO_WORRIES = registerItem("music_disc_no_worries",
            new ModMusicDiscItem(4, ModSounds.NO_WORRIES, new FabricItemSettings()
                    .group(ModItemGroup.MUSIC_DISCS).maxCount(1)));
    public static final Item MUSIC_DISC_WISTFUL = registerItem("music_disc_wistful",
            new ModMusicDiscItem(4, ModSounds.WISTFUL, new FabricItemSettings()
                    .group(ModItemGroup.MUSIC_DISCS).maxCount(1)));
    public static final Item MUSIC_DISC_ALONE_ON_D_BEACH = registerItem("music_disc_alone_on_d_beach",
            new ModMusicDiscItem(4, ModSounds.ALONE_ON_D_BEACH, new FabricItemSettings()
                    .group(ModItemGroup.MUSIC_DISCS).maxCount(1)));
    public static final Item MUSIC_DISC_NOT_ME = registerItem("music_disc_not_me",
            new ModMusicDiscItem(4, ModSounds.NOT_ME, new FabricItemSettings()
                    .group(ModItemGroup.MUSIC_DISCS).maxCount(1)));

    //Pop
    public static final Item MUSIC_DISC_BACKYARD_BOY = registerItem("music_disc_backyard_boy",
            new ModMusicDiscItem(4, ModSounds.BACKYARD_BOY, new FabricItemSettings()
                    .group(ModItemGroup.MUSIC_DISCS).maxCount(1)));
    public static final Item MUSIC_DISC_LOSING_MY_GRIP = registerItem("music_disc_losing_my_grip",
            new ModMusicDiscItem(4, ModSounds.LOSING_MY_GRIP, new FabricItemSettings()
                    .group(ModItemGroup.MUSIC_DISCS).maxCount(1)));
    public static final Item MUSIC_DISC_PENNY_RABBIT_AND_SUMMER_BEAR = registerItem("music_disc_penny_rabbit_and_summer_bear",
            new ModMusicDiscItem(4, ModSounds.PENNY_RABBIT_AND_SUMMER_BEAR, new FabricItemSettings()
                    .group(ModItemGroup.MUSIC_DISCS).maxCount(1)));
    public static final Item MUSIC_DISC_REMEMBER_WHEN = registerItem("music_disc_remember_when",
            new ModMusicDiscItem(4, ModSounds.REMEMBER_WHEN, new FabricItemSettings()
                    .group(ModItemGroup.MUSIC_DISCS).maxCount(1)));
    public static final Item MUSIC_DISC_I_LOVE_YOU_BABY = registerItem("music_disc_i_love_you_baby",
            new ModMusicDiscItem(4, ModSounds.I_LOVE_YOU_BABY, new FabricItemSettings()
                    .group(ModItemGroup.MUSIC_DISCS).maxCount(1)));
    public static final Item MUSIC_DISC_TIME = registerItem("music_disc_time",
            new ModMusicDiscItem(4, ModSounds.TIME, new FabricItemSettings()
                    .group(ModItemGroup.MUSIC_DISCS).maxCount(1)));
    public static final Item MUSIC_DISC_PANIC_AT_THE_DISCO = registerItem("music_disc_panic_at_the_disco",
            new ModMusicDiscItem(4, ModSounds.PANIC_AT_THE_DISCO, new FabricItemSettings()
                    .group(ModItemGroup.MUSIC_DISCS).maxCount(1)));
    public static final Item MUSIC_DISC_DANCE_MONKEY = registerItem("music_disc_dance_monkey",
            new ModMusicDiscItem(4, ModSounds.DANCE_MONKEY, new FabricItemSettings()
                    .group(ModItemGroup.MUSIC_DISCS).maxCount(1)));

    //Rap
    public static final Item MUSIC_DISC_I_WONDER = registerItem("music_disc_i_wonder",
            new ModMusicDiscItem(4, ModSounds.I_WONDER, new FabricItemSettings()
                    .group(ModItemGroup.MUSIC_DISCS).maxCount(1)));

    //Rock
    public static final Item MUSIC_DISC_LIBERTY_BELLE = registerItem("music_disc_liberty_belle",
            new ModMusicDiscItem(4, ModSounds.LIBERTY_BELLE, new FabricItemSettings()
                    .group(ModItemGroup.MUSIC_DISCS).maxCount(1)));

    //Electro
    public static final Item MUSIC_DISC_I_HAVE_SEEN_A_GHOST = registerItem("music_disc_i_have_seen_a_ghost",
            new ModMusicDiscItem(4, ModSounds.I_HAVE_SEEN_A_GHOST, new FabricItemSettings()
                    .group(ModItemGroup.MUSIC_DISCS).maxCount(1)));
    public static final Item MUSIC_DISC_THE_DISTANCE_BETWEEN_US = registerItem("music_disc_the_distance_between_us",
            new ModMusicDiscItem(4, ModSounds.THE_DISTANCE_BETWEEN_US, new FabricItemSettings()
                    .group(ModItemGroup.MUSIC_DISCS).maxCount(1)));

    private static Item registerItem(String name, Item item ) {
        return Registry.register(Registry.ITEM, new Identifier(VanillaPlus.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + VanillaPlus.MOD_ID);
    }
}
