package net.rupyber_studios.vanilla_plus.util.totem;

import net.minecraft.text.Text;
import net.rupyber_studios.vanilla_plus.util.MinecraftColor;

public class Rarity {
    public static final Rarity COMMON = new Rarity("Common", MinecraftColor.DARK_AQUA);
    public static final Rarity UNCOMMON = new Rarity("Uncommon", MinecraftColor.DARK_GREEN);
    public static final Rarity RARE = new Rarity("Rare", MinecraftColor.DARK_RED);
    public static final Rarity EPIC = new Rarity("Epic", MinecraftColor.DARK_PURPLE);

    private final String text;
    private final int color;

    public Rarity(String text, int color) {
        this.text = text;
        this.color = color;
    }

    public Text toText() {
        return Text.literal(text).withColor(color);
    }
}