package com.m4nd3l.moremc.item;

import com.m4nd3l.moremc.MoreMC;
import com.m4nd3l.moremc.item.items.FoodItems;
import com.m4nd3l.moremc.item.items.MiscItems;
import com.m4nd3l.moremc.item.items.ScuteItems;

public class ModItems {
    public static void registerAllModItems() {
        MoreMC.LOGGER.info(MoreMC.getThis() + ": Registering All Mod Items...");
        ScuteItems.registerModItems();
        FoodItems.registerModItems();
        MiscItems.registerModItems();
    }
}
