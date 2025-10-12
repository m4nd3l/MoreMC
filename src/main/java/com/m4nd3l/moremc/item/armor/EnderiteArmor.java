package com.m4nd3l.moremc.item.armor;

import com.m4nd3l.moremc.MoreMC;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class EnderiteArmor {
    /**
     * ENDERITE
     */

    public static final Item ENDERITE_HELMET = registerItem("enderite_helmet",
            new ModArmorItem(ModArmorMaterial.ENDERITE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(40))));

    public static final Item ENDERITE_CHESTPLATE = registerItem("enderite_chestplate",
            new ModArmorItem(ModArmorMaterial.ENDERITE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(40))));

    public static final Item ENDERITE_LEGGINGS = registerItem("enderite_leggings",
            new ModArmorItem(ModArmorMaterial.ENDERITE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(40))));

    public static final Item ENDERITE_BOOTS = registerItem("enderite_boots",
            new ModArmorItem(ModArmorMaterial.ENDERITE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(40))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MoreMC.MOD_ID, name), item);
    }

    private static void customCombat(FabricItemGroupEntries entries) {
        entries.add(ENDERITE_HELMET);
        entries.add(ENDERITE_CHESTPLATE);
        entries.add(ENDERITE_LEGGINGS);
        entries.add(ENDERITE_BOOTS);
    }


    public static void registerModItems() {
        MoreMC.LOGGER.info(MoreMC.getThis() + ": Registering Enderite Armor...");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(EnderiteArmor::customCombat);
    }
}
