package com.m4nd3l.moremc.item.items;

import com.m4nd3l.moremc.MoreMC;
import com.m4nd3l.moremc.item.ModFoodComponents;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class FoodItems {
    /**FOOD*/
    public static final Item RICE = registerItem("rice",
            new Item(new Item.Settings().food(ModFoodComponents.RICE)));

    public static final Item BOWL_OF_RICE = registerItem("bowl_of_rice",
            new Item(new Item.Settings().food(ModFoodComponents.BOWL_OF_RICE)));

    public static final Item COOKED_RICE = registerItem("cooked_rice",
            new Item(new Item.Settings().food(ModFoodComponents.COOKED_RICE)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MoreMC.MOD_ID, name), item);
    }

    private static void customFood(FabricItemGroupEntries entries) {
        entries.add(RICE);
        entries.add(BOWL_OF_RICE);
        entries.add(COOKED_RICE);
    }

    public static void registerModItems() {
        MoreMC.LOGGER.info(MoreMC.getThis() + ": Registering Food Items...");
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(FoodItems::customFood);
    }

}
