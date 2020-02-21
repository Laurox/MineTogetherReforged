package de.laurox.mc.economy;

import de.laurox.mc.economy.items.ShopItem;
import org.bukkit.entity.Player;

public interface Shopable<T extends ShopItem> {
    void sell(T r, Player player);
    void buy(T r, Player player);
    // simple Shop inventory
    void openShop(Player player);
    // changing options
    void openMultiple(Player player);
}
