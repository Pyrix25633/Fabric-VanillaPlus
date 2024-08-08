package net.rupyber_studios.vanilla_plus.util;

import java.util.HashSet;
import java.util.Set;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

public final class UniqueItemRegistry {

    public static final UniqueItemRegistry BOW = new UniqueItemRegistry(Items.BOW);
    public static final UniqueItemRegistry CROSSBOW = new UniqueItemRegistry(Items.CROSSBOW);

    private final Set<Item> itemList;

    private final Item defaultItem;

    private UniqueItemRegistry(Item defaultItem) {
        this.defaultItem = defaultItem;
        itemList = new HashSet<>();
        addItemToRegistry(defaultItem);
    }

    public void addItemToRegistry(Item item) {
        itemList.add(item);
    }

    public Item getDefaultItem(Item item) {
        if (isItemInRegistry(item)) {
            return defaultItem;
        }
        return item;
    }

    public boolean isItemInRegistry(Item item) {
        return itemList.contains(item);
    }
}