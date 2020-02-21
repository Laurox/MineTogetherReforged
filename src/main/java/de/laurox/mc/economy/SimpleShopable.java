package de.laurox.mc.economy;

import de.laurox.mc.economy.items.ShopItem;
import de.laurox.mc.util.Storeable;
import org.bukkit.entity.NPC;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import java.util.List;

public class SimpleShopable<T extends ShopItem> implements Shopable<T>, Storeable {

    private NPC npc;
    private String name;
    private String subTitle;
    private List<ShopItem> offers;
    private Inventory basicInventory;
    private Inventory multipleInventory;

    @Override
    public void sell(T item, Player player) {

    }

    @Override
    public void buy(T item, Player player) {

    }

    @Override
    public void openShop(Player player) {

    }

    @Override
    public void openMultiple(Player player) {

    }

    @Override
    public String toCSV() {
        return null;
    }

    @Override
    public <A> A parseFromString() {
        return null;
    }
}
