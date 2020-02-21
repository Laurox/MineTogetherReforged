package de.laurox.mc.economy.handler;

import de.laurox.mc.Database;
import de.laurox.mc.economy.ShopKeeper;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;

public class InteractWithNPCHandler implements Listener {

    @EventHandler
    public void onInteractWithNPC(PlayerInteractAtEntityEvent event) {
        Entity entity = event.getRightClicked();
        Player player = event.getPlayer();

        String uuid = entity.getUniqueId().toString();
        ShopKeeper shopKeeper = Database.getShopKeepers().getOrDefault(uuid, null);
        if(shopKeeper == null) return;
        shopKeeper.openShop(player);
    }
}
