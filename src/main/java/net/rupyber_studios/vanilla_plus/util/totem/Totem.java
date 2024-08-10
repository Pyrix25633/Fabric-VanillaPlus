package net.rupyber_studios.vanilla_plus.util.totem;

import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.CustomModelDataComponent;
import net.minecraft.component.type.LoreComponent;
import net.minecraft.component.type.NbtComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.*;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.StringIdentifiable;
import net.rupyber_studios.vanilla_plus.util.MinecraftColor;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
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
    private final Text customName;
    private final List<Text> lore;
    private final NbtComponent customData;

    Totem(@NotNull String name, int customModelData, @NotNull Rarity rarity) {
        this.name = name;
        this.customModelData = customModelData;
        this.rarity = rarity;
        this.customName = Text.literal(this.name + " Totem of Undying");
        this.lore = List.of(Text.literal("Obtained from a" + (List.of('a', 'e', 'i', 'o', 'u')
                        .contains(this.name.toLowerCase().charAt(0)) ? "n" : "") + " " + this.name)
                        .withColor(MinecraftColor.BLUE), rarity.toText());
        NbtCompound nbt = new NbtCompound();
        nbt.putByte(name.toLowerCase().charAt(0) + this.name.replaceAll(" ", "") + "Totem", (byte)1);
        this.customData = NbtComponent.of(nbt);
    }

    public @NotNull ItemStack getItemStack() {
        ItemStack totem = Items.TOTEM_OF_UNDYING.getDefaultStack();
        totem.set(DataComponentTypes.CUSTOM_MODEL_DATA, new CustomModelDataComponent(customModelData));
        totem.set(DataComponentTypes.CUSTOM_NAME, this.customName);
        totem.set(DataComponentTypes.LORE, new LoreComponent(this.lore));
        totem.set(DataComponentTypes.CUSTOM_DATA, this.customData);
        return totem;
    }

    public LootTable.Builder getLootTableBuilder() {
        LeafEntry.Builder<?> item = ItemEntry.builder(Items.TOTEM_OF_UNDYING)
                .apply(SetNameLootFunction.builder(this.customName, SetNameLootFunction.Target.CUSTOM_NAME))
                .apply(SetLoreLootFunction.builder()
                        .lore(this.lore.getFirst())
                        .lore(this.lore.getLast()));
        if(this.rarity != Rarity.EPIC)
            item.apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(0.0F, 2.0F)))
                    .apply(LootingEnchantLootFunction.builder(UniformLootNumberProvider.create(0.0F, 1.0F)).withLimit(1));
        return LootTable.builder()
                .randomSequenceId(new Identifier("minecraft", "entities/vanilla/" + this.name.toLowerCase()
                        .replaceAll(" ", "_")))
                .pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F))
                        .with(item));
    }

    @Override
    public @NotNull String asString() {
        return this.name.toLowerCase().replaceAll(" ", "_");
    }
}