package net.rupyber_studios.vanilla_plus.item.custom;

import net.minecraft.item.Item;

import java.util.List;

public interface DungeonItem {
    List<Item> getInputs();

    String getGroup();
}