package net.rupyber_studios.vanilla_plus.util;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.ArrayList;
import java.util.List;

public final class UniqueItemRegistry {

    public static final UniqueItemRegistry BOW = new UniqueItemRegistry(Items.BOW);
    public static final UniqueItemRegistry CROSSBOW = new UniqueItemRegistry(Items.CROSSBOW);

    private final List<Item> itemList;

    private final Item defaultItem;

    private UniqueItemRegistry(Item defaultItem) {
        this.defaultItem = defaultItem;
        itemList = new ArrayList<>();
        addItemToRegistry(defaultItem);
    }

    public void addItemToRegistry(Item item) {
        itemList.add(item);
    }

    public Item getDefaultItem(Item item) {
        if(isItemInRegistry(item))
            return defaultItem;
        return item;
    }

    public boolean isItemInRegistry(Item item) {
        return itemList.contains(item);
    }
}