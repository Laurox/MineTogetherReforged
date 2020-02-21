package de.laurox.mc;

import de.laurox.mc.economy.ShopKeeper;

import java.nio.file.Path;
import java.util.Map;
import java.util.UUID;

public class Database {

    // todo validate path
    private final static Path shopPath = Path.of("data", "shopkeepers.csv");

    private static Map<String, ShopKeeper> shopKeepers;

    public Database() {
        // todo
    }

    public static Map<String, ShopKeeper> getShopKeepers() {
        return shopKeepers;
    }
}
