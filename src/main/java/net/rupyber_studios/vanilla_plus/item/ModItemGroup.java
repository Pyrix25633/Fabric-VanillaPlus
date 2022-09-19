package net.rupyber_studios.vanilla_plus.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.rupyber_studios.vanilla_plus.VanillaPlus;

public class ModItemGroup {
    public static final ItemGroup DECORATIVE_BLOCKS = FabricItemGroupBuilder.build(new Identifier(VanillaPlus.MOD_ID,
                    "decorative_blocks"),
             () -> new ItemStack(ModItems.DECORATOR_TOOL));

    public static final ItemGroup DUNGEONS_ITEMS = FabricItemGroupBuilder.build(new Identifier(VanillaPlus.MOD_ID,
                    "dungeons_items"),
            () -> new ItemStack(ModItems.AXE));

    public static final ItemGroup MUSIC_DISCS = FabricItemGroupBuilder.build(new Identifier(VanillaPlus.MOD_ID,
                    "music_discs"),
            () -> new ItemStack(ModItems.BLANK_MUSIC_DISC));
}
