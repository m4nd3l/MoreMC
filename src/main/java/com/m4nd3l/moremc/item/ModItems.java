package com.m4nd3l.moremc.item;

import com.m4nd3l.moremc.MoreMC;
import com.m4nd3l.moremc.item.armor.EnderiteArmor;
import com.m4nd3l.moremc.item.armor.ScuteArmor;
import com.m4nd3l.moremc.item.items.EnderiteItems;
import com.m4nd3l.moremc.item.items.FoodItems;
import com.m4nd3l.moremc.item.items.MiscItems;
import com.m4nd3l.moremc.item.items.ScuteItems;
import com.m4nd3l.moremc.item.tools.EnderiteTools;
import com.m4nd3l.moremc.item.tools.ScuteTools;

public class ModItems {
    public static void registerAllModItems() {
        MoreMC.LOGGER.info(MoreMC.getThis() + ": Registering All Mod Items...");
        ScuteItems.registerModItems();
        FoodItems.registerModItems();
        MiscItems.registerModItems();
        ScuteTools.registerModItems();
        ScuteArmor.registerModItems();
        EnderiteItems.registerModItems();
        EnderiteTools.registerModItems();
        EnderiteArmor.registerModItems();
    }
}
