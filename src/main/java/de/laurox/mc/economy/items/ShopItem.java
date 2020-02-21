package de.laurox.mc.economy.items;

import org.bukkit.inventory.ItemStack;

public abstract class ShopItem {

    // unique id to identify the items in list
    private String id;

    // shop related attributes
    private int sellPrice;
    private int buyPrice;
    private boolean multiple;

    // Ingame Item ItSelf
    private ItemStack itemStack;

    public ShopItem(int buyPrice, int sellPrice, boolean multiple, ItemStack itemStack) {
        this.id = itemStack.hashCode() + "_" + (sellPrice * 3 + buyPrice * 7) + "_" +(multiple ? "A" : "B");

        this.sellPrice = sellPrice;
        this.buyPrice = buyPrice;
        this.multiple = multiple;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public ItemStack getItemStack() {
        return itemStack;
    }

    public boolean isMultiple() {
        return multiple;
    }
}
