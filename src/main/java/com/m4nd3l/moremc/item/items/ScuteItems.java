package com.m4nd3l.moremc.item.items;

import com.m4nd3l.moremc.MoreMC;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ScuteItems {

    /**SCUTE*/

    public static final Item SCUTE_INGOT = registerItem("scute_ingot",
            new Item(new Item.Settings()));


    /**REINFORCED SCUTE*/
    public static final Item REINFORCED_SCUTE = registerItem("reinforced_scute",
            new Item(new Item.Settings().rarity(Rarity.UNCOMMON)));

    public static final Item REINFORCED_SCUTE_INGOT = registerItem("reinforced_scute_ingot",
            new Item(new Item.Settings().rarity(Rarity.UNCOMMON)));


    /**HARDENED SCUTE*/
    public static final Item HARDENED_SCUTE = registerItem("hardened_scute",
            new Item(new Item.Settings().rarity(Rarity.RARE)));

    public static final Item HARDENED_SCUTE_INGOT = registerItem("hardened_scute_ingot",
            new Item(new Item.Settings().rarity(Rarity.RARE)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MoreMC.MOD_ID, name), item);
    }

    private static void customIngredients(FabricItemGroupEntries entries) {
        entries.add(SCUTE_INGOT);

        entries.add(REINFORCED_SCUTE);
        entries.add(REINFORCED_SCUTE_INGOT);

        entries.add(HARDENED_SCUTE);
        entries.add(HARDENED_SCUTE_INGOT);
    }

    public static void registerModItems() {
        MoreMC.LOGGER.info(MoreMC.getThis() + ": Registering Scute Items...");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ScuteItems::customIngredients);
    }

}
