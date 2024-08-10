package net.rupyber_studios.vanilla_plus.util.totem;

import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class Rarity {
    public static final Rarity COMMON = new Rarity("Common", Formatting.DARK_AQUA);
    public static final Rarity UNCOMMON = new Rarity("Uncommon", Formatting.DARK_GREEN);
    public static final Rarity RARE = new Rarity("Rare", Formatting.DARK_RED);
    public static final Rarity EPIC = new Rarity("Epic", Formatting.DARK_PURPLE);

    private final String text;
    private final Formatting formatting;

    public Rarity(String text, Formatting formatting) {
        this.text = text;
        this.formatting = formatting;
    }

    public Text toText() {
        return Text.literal(this.text).formatted(this.formatting);
    }
}