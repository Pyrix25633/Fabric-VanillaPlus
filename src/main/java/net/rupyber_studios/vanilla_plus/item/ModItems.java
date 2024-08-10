package net.rupyber_studios.vanilla_plus.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.rupyber_studios.vanilla_plus.VanillaPlus;
import net.rupyber_studios.vanilla_plus.item.custom.*;
import net.rupyber_studios.vanilla_plus.sounds.ModSounds;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    public static final List<Item> ALL = new ArrayList<>();

    public static final Item DECORATOR_TOOL = registerDecorativeBlocksItem("decorator_tool",
            new DecoratorToolItem(new Item.Settings().maxDamage(256)));

    //Dungeons items
    public static final Item AXE = registerDungeonsItemsItem("axe", createModAxeItem(
            ToolMaterials.IRON, 292, 6.2F, -2.9F));
    public static final Item DOUBLE_AXE = registerDungeonsItemsItem("double_axe", createModAxeItem(
            ToolMaterials.IRON, 336, 6.4F, -2.7F));
    public static final Item MACE = registerDungeonsItemsItem("mace", createModAxeItem(
            ToolMaterials.IRON, 368, 6.6F, -2.5F));
    public static final Item SWORD = registerDungeonsItemsItem("sword", createModSwordItem(
            ToolMaterials.IRON, 338, 4, -2.2F));
    public static final Item DIAMOND_SWORD = registerDungeonsItemsItem("diamond_sword", createModSwordItem(
            ToolMaterials.DIAMOND, 1745, 4, -2.2F));
    public static final Item DIAMOND_PICKAXE = registerDungeonsItemsItem("diamond_pickaxe", createModPickaxeItem(
            ToolMaterials.DIAMOND, 1745, 1, -2.8F));
    public static final Item POWER_BOW = registerDungeonsItemsItem("power_bow",
            new ModBowItem(new Item.Settings().maxDamage(426)));
    public static final Item ELITE_POWER_BOW = registerDungeonsItemsItem("elite_power_bow",
            new ModBowItem(new Item.Settings().maxDamage(528)));
    public static final Item EXPLODING_CROSSBOW = registerDungeonsItemsItem("exploding_crossbow",
            new ModCrossbowItem(new Item.Settings().maxDamage(497)));
    public static final Item HEAVY_CROSSBOW = registerDungeonsItemsItem("heavy_crossbow",
            new ModCrossbowItem(new Item.Settings().maxDamage(525)));
    public static final Item BUTTERFLY_CROSSBOW = registerDungeonsItemsItem("butterfly_crossbow",
            new ModCrossbowItem(new Item.Settings().maxDamage(558)));
    public static final Item FIREBOLT_THROWER = registerDungeonsItemsItem("firebolt_thrower",
            new ModCrossbowItem(new Item.Settings().maxDamage(587)));
    public static final Item RAPID_CROSSBOW = registerDungeonsItemsItem("rapid_crossbow",
            new ModCrossbowItem(new Item.Settings().maxDamage(612)));

    //Music discs
    public static final Item BLANK_MUSIC_DISC_PIECE = registerMusicDiscsItem("blank_music_disc_piece",
            new Item(new Item.Settings().maxCount(64)));
    public static final Item BLANK_MUSIC_DISC = registerMusicDiscsItem("blank_music_disc",
            new Item(new Item.Settings().maxCount(64)));
    public static final Item BLANK_LOFI_MUSIC_DISC = registerMusicDiscsItem("blank_lofi_music_disc",
            new BlankMusicDiscItem(new Item.Settings().maxCount(64)));
    public static final Item BLANK_POP_MUSIC_DISC = registerMusicDiscsItem("blank_pop_music_disc",
            new BlankMusicDiscItem(new Item.Settings().maxCount(64)));
    public static final Item BLANK_RAP_MUSIC_DISC = registerMusicDiscsItem("blank_rap_music_disc",
            new BlankMusicDiscItem(new Item.Settings().maxCount(64)));
    public static final Item BLANK_ROCK_MUSIC_DISC = registerMusicDiscsItem("blank_rock_music_disc",
            new BlankMusicDiscItem(new Item.Settings().maxCount(64)));
    public static final Item BLANK_ELECTRO_MUSIC_DISC = registerMusicDiscsItem("blank_electro_music_disc",
            new BlankMusicDiscItem(new Item.Settings().maxCount(64)));

    //Lofi
    public static final Item MUSIC_DISC_EVERYTHING_S_A_SYMPTOM = registerMusicDiscsItem("music_disc_everything_s_a_symptom",
            new ModMusicDiscItem(4, ModSounds.EVERYTHING_S_A_SYMPTOM, new Item.Settings()
                    .maxCount(1), 137));
    public static final Item MUSIC_DISC_DAWN = registerMusicDiscsItem("music_disc_dawn",
            new ModMusicDiscItem(4, ModSounds.DAWN, new Item.Settings()
                    .maxCount(1), 123));
    public static final Item MUSIC_DISC_HERON = registerMusicDiscsItem("music_disc_heron",
            new ModMusicDiscItem(4, ModSounds.HERON, new Item.Settings()
                    .maxCount(1), 135));
    public static final Item MUSIC_DISC_SWEET_LOOK = registerMusicDiscsItem("music_disc_sweet_look",
            new ModMusicDiscItem(4, ModSounds.SWEET_LOOK, new Item.Settings()
                    .maxCount(1), 195));
    public static final Item MUSIC_DISC_LOST_TREASURE = registerMusicDiscsItem("music_disc_lost_treasure",
            new ModMusicDiscItem(4, ModSounds.LOST_TREASURE, new Item.Settings()
                    .maxCount(1), 174));
    public static final Item MUSIC_DISC_ALIEN_SKY = registerMusicDiscsItem("music_disc_alien_sky",
            new ModMusicDiscItem(4, ModSounds.ALIEN_SKY, new Item.Settings()
                    .maxCount(1), 186));
    public static final Item MUSIC_DISC_BACKPACK_CITY = registerMusicDiscsItem("music_disc_backpack_city",
            new ModMusicDiscItem(4, ModSounds.BACKPACK_CITY, new Item.Settings()
                    .maxCount(1), 151));
    public static final Item MUSIC_DISC_LEVITATE = registerMusicDiscsItem("music_disc_levitate",
            new ModMusicDiscItem(4, ModSounds.LEVITATE, new Item.Settings()
                    .maxCount(1), 202));
    public static final Item MUSIC_DISC_SNAPS = registerMusicDiscsItem("music_disc_snaps",
            new ModMusicDiscItem(4, ModSounds.SNAPS, new Item.Settings()
                    .maxCount(1), 142));
    public static final Item MUSIC_DISC_MOUNT_AND_BLADE = registerMusicDiscsItem("music_disc_mount_and_blade",
            new ModMusicDiscItem(4, ModSounds.MOUNT_AND_BLADE, new Item.Settings()
                    .maxCount(1), 144));
    public static final Item MUSIC_DISC_PINK_NIGHT_SKY = registerMusicDiscsItem("music_disc_pink_night_sky",
            new ModMusicDiscItem(4, ModSounds.PINK_NIGHT_SKY, new Item.Settings()
                    .maxCount(1), 160));
    public static final Item MUSIC_DISC_YERBA_MATE = registerMusicDiscsItem("music_disc_yerba_mate",
            new ModMusicDiscItem(4, ModSounds.YERBA_MATE, new Item.Settings()
                    .maxCount(1), 113));
    public static final Item MUSIC_DISC_PALE_MOON = registerMusicDiscsItem("music_disc_pale_moon",
            new ModMusicDiscItem(4, ModSounds.PALE_MOON, new Item.Settings()
                    .maxCount(1), 211));
    public static final Item MUSIC_DISC_MISTY = registerMusicDiscsItem("music_disc_misty",
            new ModMusicDiscItem(4, ModSounds.MISTY, new Item.Settings()
                    .maxCount(1), 112));
    public static final Item MUSIC_DISC_FINDING = registerMusicDiscsItem("music_disc_finding",
            new ModMusicDiscItem(4, ModSounds.FINDING, new Item.Settings()
                    .maxCount(1), 153));
    public static final Item MUSIC_DISC_DECAY = registerMusicDiscsItem("music_disc_decay",
            new ModMusicDiscItem(4, ModSounds.DECAY, new Item.Settings()
                    .maxCount(1), 145));
    public static final Item MUSIC_DISC_MOVING_ON = registerMusicDiscsItem("music_disc_moving_on",
            new ModMusicDiscItem(4, ModSounds.MOVING_ON, new Item.Settings()
                    .maxCount(1), 150));
    public static final Item MUSIC_DISC_MY_PERSON = registerMusicDiscsItem("music_disc_my_person",
            new ModMusicDiscItem(4, ModSounds.MY_PERSON, new Item.Settings()
                    .maxCount(1), 135));
    public static final Item MUSIC_DISC_NO_WORRIES = registerMusicDiscsItem("music_disc_no_worries",
            new ModMusicDiscItem(4, ModSounds.NO_WORRIES, new Item.Settings()
                    .maxCount(1), 178));
    public static final Item MUSIC_DISC_WISTFUL = registerMusicDiscsItem("music_disc_wistful",
            new ModMusicDiscItem(4, ModSounds.WISTFUL, new Item.Settings()
                    .maxCount(1), 195));
    public static final Item MUSIC_DISC_ALONE_ON_D_BEACH = registerMusicDiscsItem("music_disc_alone_on_d_beach",
            new ModMusicDiscItem(4, ModSounds.ALONE_ON_D_BEACH, new Item.Settings()
                    .maxCount(1), 184));
    public static final Item MUSIC_DISC_NOT_ME = registerMusicDiscsItem("music_disc_not_me",
            new ModMusicDiscItem(4, ModSounds.NOT_ME, new Item.Settings()
                    .maxCount(1), 160));

    //Pop
    public static final Item MUSIC_DISC_BACKYARD_BOY = registerMusicDiscsItem("music_disc_backyard_boy",
            new ModMusicDiscItem(5, ModSounds.BACKYARD_BOY, new Item.Settings()
                    .maxCount(1), 136));
    public static final Item MUSIC_DISC_LOSING_MY_GRIP = registerMusicDiscsItem("music_disc_losing_my_grip",
            new ModMusicDiscItem(5, ModSounds.LOSING_MY_GRIP, new Item.Settings()
                    .maxCount(1), 145));
    public static final Item MUSIC_DISC_PENNY_RABBIT_AND_SUMMER_BEAR = registerMusicDiscsItem("music_disc_penny_rabbit_and_summer_bear",
            new ModMusicDiscItem(5, ModSounds.PENNY_RABBIT_AND_SUMMER_BEAR, new Item.Settings()
                    .maxCount(1), 212));
    public static final Item MUSIC_DISC_REMEMBER_WHEN = registerMusicDiscsItem("music_disc_remember_when",
            new ModMusicDiscItem(5, ModSounds.REMEMBER_WHEN, new Item.Settings()
                    .maxCount(1), 144));
    public static final Item MUSIC_DISC_I_LOVE_YOU_BABY = registerMusicDiscsItem("music_disc_i_love_you_baby",
            new ModMusicDiscItem(5, ModSounds.I_LOVE_YOU_BABY, new Item.Settings()
                    .maxCount(1), 181));
    public static final Item MUSIC_DISC_TIME = registerMusicDiscsItem("music_disc_time",
            new ModMusicDiscItem(5, ModSounds.TIME, new Item.Settings()
                    .maxCount(1), 270));
    public static final Item MUSIC_DISC_PANIC_AT_THE_DISCO = registerMusicDiscsItem("music_disc_panic_at_the_disco",
            new ModMusicDiscItem(5, ModSounds.PANIC_AT_THE_DISCO, new Item.Settings()
                    .maxCount(1), 196));
    public static final Item MUSIC_DISC_DANCE_MONKEY = registerMusicDiscsItem("music_disc_dance_monkey",
            new ModMusicDiscItem(5, ModSounds.DANCE_MONKEY, new Item.Settings()
                    .maxCount(1), 236));

    //Rap
    public static final Item MUSIC_DISC_I_WONDER = registerMusicDiscsItem("music_disc_i_wonder",
            new ModMusicDiscItem(6, ModSounds.I_WONDER, new Item.Settings()
                    .maxCount(1), 187));

    //Rock
    public static final Item MUSIC_DISC_LIBERTY_BELLE = registerMusicDiscsItem("music_disc_liberty_belle",
            new ModMusicDiscItem(7, ModSounds.LIBERTY_BELLE, new Item.Settings()
                    .maxCount(1), 149));

    //Electro
    public static final Item MUSIC_DISC_I_HAVE_SEEN_A_GHOST = registerMusicDiscsItem("music_disc_i_have_seen_a_ghost",
            new ModMusicDiscItem(8, ModSounds.I_HAVE_SEEN_A_GHOST, new Item.Settings()
                    .maxCount(1), 199));
    public static final Item MUSIC_DISC_THE_DISTANCE_BETWEEN_US = registerMusicDiscsItem("music_disc_the_distance_between_us",
            new ModMusicDiscItem(8, ModSounds.THE_DISTANCE_BETWEEN_US, new Item.Settings()
                    .maxCount(1), 325));

    //Other
    public static final Item MUSIC_DISC_LUSH = registerMusicDiscsItem("music_disc_lush",
            new ModMusicDiscItem(9, ModSounds.LUSH, new Item.Settings()
                    .maxCount(1), 100));

    private static Item registerDecorativeBlocksItem(String name, Item item) {
        return registerItem(name, item, ModItemGroups.DECORATIVE_BLOCKS);
    }

    private static Item registerDungeonsItemsItem(String name, Item item) {
        return registerItem(name, item, ModItemGroups.DUNGEONS_ITEMS);
    }

    private static Item registerMusicDiscsItem(String name, Item item) {
        return registerItem(name, item, ModItemGroups.MUSIC_DISCS);
    }

    @Contract("_, _, _, _ -> new")
    private static @NotNull Item createModAxeItem(ToolMaterials materials, int maxDamage, float baseAttackDamage, float attackSpeed) {
        return new ModAxeItem(materials, new Item.Settings().maxDamage(maxDamage).attributeModifiers(
                AxeItem.createAttributeModifiers(materials, baseAttackDamage, attackSpeed)));
    }

    @Contract("_, _, _, _ -> new")
    private static @NotNull Item createModSwordItem(ToolMaterials materials, int maxDamage, int baseAttackDamage, float attackSpeed) {
        return new ModSwordItem(materials, new Item.Settings().maxDamage(maxDamage).attributeModifiers(
                SwordItem.createAttributeModifiers(materials, baseAttackDamage, attackSpeed)));
    }

    @Contract("_, _, _, _ -> new")
    private static @NotNull Item createModPickaxeItem(ToolMaterials materials, int maxDamage, int baseAttackDamage, float attackSpeed) {
        return new ModPickaxeItem(materials, new Item.Settings().maxDamage(maxDamage).attributeModifiers(
                SwordItem.createAttributeModifiers(materials, baseAttackDamage, attackSpeed)));
    }

    private static Item registerItem(String name, Item item, RegistryKey<ItemGroup> group) {
        ALL.add(item);
        Item registered = Registry.register(Registries.ITEM, new Identifier(VanillaPlus.MOD_ID, name), item);
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(registered));
        return registered;
    }

    public static void registerModItems() {
        System.out.println("Registering ModItems for " + VanillaPlus.MOD_ID);
    }
}
