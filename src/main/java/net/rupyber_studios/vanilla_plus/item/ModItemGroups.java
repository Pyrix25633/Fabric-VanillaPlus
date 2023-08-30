package net.rupyber_studios.vanilla_plus.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.rupyber_studios.vanilla_plus.VanillaPlus;

public class ModItemGroups {
    private static final Identifier DECORATIVE_BLOCKS_ID = new Identifier(VanillaPlus.MOD_ID, "decorative_blocks");
    private static final Identifier DUNGEONS_ITEMS_ID = new Identifier(VanillaPlus.MOD_ID, "dungeons_items");
    private static final Identifier MUSIC_DISCS_ID = new Identifier(VanillaPlus.MOD_ID, "music_discs");

    public static final RegistryKey<ItemGroup> DECORATIVE_BLOCKS = RegistryKey.of(RegistryKeys.ITEM_GROUP, DECORATIVE_BLOCKS_ID);
    public static final RegistryKey<ItemGroup> DUNGEONS_ITEMS = RegistryKey.of(RegistryKeys.ITEM_GROUP, DUNGEONS_ITEMS_ID);
    public static final RegistryKey<ItemGroup> MUSIC_DISCS = RegistryKey.of(RegistryKeys.ITEM_GROUP, MUSIC_DISCS_ID);

    public static void buildItemGroups() {
        Registry.register(Registries.ITEM_GROUP, DECORATIVE_BLOCKS_ID,
                FabricItemGroup.builder().displayName(Text.translatable("item_group.vanilla_plus.decorative_blocks"))
                        .icon(() -> new ItemStack(ModItems.DECORATOR_TOOL)).build());
        Registry.register(Registries.ITEM_GROUP, DUNGEONS_ITEMS_ID,
                FabricItemGroup.builder().displayName(Text.translatable("item_group.vanilla_plus.dungeons_items"))
                        .icon(() -> new ItemStack(ModItems.AXE)).build());
        Registry.register(Registries.ITEM_GROUP, MUSIC_DISCS_ID,
                FabricItemGroup.builder().displayName(Text.translatable("item_group.vanilla_plus.music_discs"))
                        .icon(() -> new ItemStack(ModItems.BLANK_MUSIC_DISC)).build());
    }
}