package net.rupyber_studios.vanilla_plus.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.rupyber_studios.vanilla_plus.VanillaPlus;

public class ModItemGroups {
    public static ItemGroup DECORATIVE_BLOCKS;
    public static ItemGroup DUNGEONS_ITEMS;
    public static ItemGroup MUSIC_DISCS;

    public static void registerItemGroups() {
        DECORATIVE_BLOCKS = FabricItemGroup.builder(new Identifier(VanillaPlus.MOD_ID, "decorative_blocks"))
                .displayName(Text.translatable("item_group.vanilla_plus.decorative_blocks"))
                .icon(() -> new ItemStack(ModItems.DECORATOR_TOOL)).build();
        DUNGEONS_ITEMS = FabricItemGroup.builder(new Identifier(VanillaPlus.MOD_ID, "dungeons_items"))
                .displayName(Text.translatable("item_group.vanilla_plus.dungeons_items"))
                .icon(() -> new ItemStack(ModItems.AXE)).build();
        MUSIC_DISCS = FabricItemGroup.builder(new Identifier(VanillaPlus.MOD_ID, "music_discs"))
                .displayName(Text.translatable("item_group.vanilla_plus.music_discs"))
                .icon(() -> new ItemStack(ModItems.BLANK_MUSIC_DISC)).build();
    }
}
