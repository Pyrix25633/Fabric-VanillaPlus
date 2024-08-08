package net.rupyber_studios.vanilla_plus.util.totem;

import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.CustomModelDataComponent;
import net.minecraft.component.type.LoreComponent;
import net.minecraft.component.type.NbtComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.text.Text;
import net.minecraft.util.StringIdentifiable;
import net.rupyber_studios.vanilla_plus.util.MinecraftColor;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public enum Totem implements StringIdentifiable {
    SKELETON("Skeleton", 1, Rarity.COMMON),
    ZOMBIE("Zombie", 2, Rarity.COMMON),
    CREEPER("Creeper", 3, Rarity.COMMON),
    SHULKER("Shulker", 4, Rarity.RARE),
    ENDER_DRAGON("Ender Dragon", 5, Rarity.EPIC),
    GHAST("Ghast", 6, Rarity.UNCOMMON),
    SLIME("Slime", 7, Rarity.UNCOMMON),
    ENDERMAN("Enderman", 8, Rarity.UNCOMMON),
    GUARDIAN("Guardian", 9, Rarity.RARE),
    ELDER_GUARDIAN("Elder Guardian", 10, Rarity.EPIC);

    private final String name;
    private final int customModelData;
    private final Rarity rarity;

    Totem(String name, int customModelData, Rarity rarity) {
        this.name = name;
        this.customModelData = customModelData;
        this.rarity = rarity;
    }

    public @NotNull ItemStack getItemStack() {
        NbtCompound nbt = new NbtCompound();
        nbt.putByte(name.toLowerCase().charAt(0) + this.name.replaceAll(" ", "") + "Totem", (byte)1);
        ItemStack totem = Items.TOTEM_OF_UNDYING.getDefaultStack();
        totem.set(DataComponentTypes.CUSTOM_MODEL_DATA, new CustomModelDataComponent(customModelData));
        totem.set(DataComponentTypes.CUSTOM_NAME, Text.literal(this.name + " Totem of Undying"));
        totem.set(DataComponentTypes.LORE, new LoreComponent(List.of(
                Text.literal("Obtained from a" + (List.of('a', 'e', 'i', 'o', 'u')
                        .contains(this.name.toLowerCase().charAt(0)) ? "n" : "") + " " + this.name).withColor(MinecraftColor.BLUE),
                rarity.toText())));
        totem.set(DataComponentTypes.CUSTOM_DATA, NbtComponent.of(nbt));
        return totem;
    }

    @Override
    public @NotNull String asString() {
        return this.name.toLowerCase().replaceAll(" ", "_");
    }
}