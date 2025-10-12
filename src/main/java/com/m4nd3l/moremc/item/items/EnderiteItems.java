package com.m4nd3l.moremc.item.items;

import com.m4nd3l.moremc.MoreMC;
import com.m4nd3l.moremc.item.custom.AnvilRepairItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class EnderiteItems {
    /**ENDERITE*/

    public static final Item RAW_ENDERITE = registerItem("raw_enderite",
            new Item(new Item.Settings()
                    .rarity(Rarity.COMMON)));

    public static final Item ENDERITE_INGOT = registerItem("enderite_ingot",
            new Item(new Item.Settings()
                    .rarity(Rarity.UNCOMMON)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MoreMC.MOD_ID, name), item);
    }

    private static void customIngredients(FabricItemGroupEntries entries) {
        entries.add(RAW_ENDERITE);
        entries.add(ENDERITE_INGOT);
    }

    public static void registerModItems() {
        MoreMC.LOGGER.info(MoreMC.getThis() + ": Registering Enderite Items...");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(EnderiteItems::customIngredients);

    }

}
