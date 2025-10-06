package com.m4nd3l.moremc.item.armor;

import com.m4nd3l.moremc.MoreMC;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.datafixer.fix.HorseArmorFix;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ScuteArmor {
    /**
     * SCUTE
     */

    public static final Item SCUTE_HELMET = registerItem("scute_helmet",
            new ModArmorItem(ModArmorMaterial.SCUTE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(38))));

    public static final Item SCUTE_CHESTPLATE = registerItem("scute_chestplate",
            new ModArmorItem(ModArmorMaterial.SCUTE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(38))));

    public static final Item SCUTE_LEGGINGS = registerItem("scute_leggings",
            new ModArmorItem(ModArmorMaterial.SCUTE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(38))));

    public static final Item SCUTE_BOOTS = registerItem("scute_boots",
            new ModArmorItem(ModArmorMaterial.SCUTE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(38))));

    public static final Item SCUTE_HORSE_ARMOR = registerItem("scute_horse_armor",
            new AnimalArmorItem(ModArmorMaterial.SCUTE_ARMOR_MATERIAL, AnimalArmorItem.Type.EQUESTRIAN, false,
                    new Item.Settings()));


    /**
     * REINFORCED SCUTE
     */

    public static final Item REINFORCED_SCUTE_HELMET = registerItem("reinforced_scute_helmet",
            new ModArmorItem(ModArmorMaterial.REINFORCED_SCUTE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(40))));

    public static final Item REINFORCED_SCUTE_CHESTPLATE = registerItem("reinforced_scute_chestplate",
            new ModArmorItem(ModArmorMaterial.REINFORCED_SCUTE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(40))));

    public static final Item REINFORCED_SCUTE_LEGGINGS = registerItem("reinforced_scute_leggings",
            new ModArmorItem(ModArmorMaterial.REINFORCED_SCUTE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(40))));

    public static final Item REINFORCED_SCUTE_BOOTS = registerItem("reinforced_scute_boots",
            new ModArmorItem(ModArmorMaterial.REINFORCED_SCUTE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(40))));

    public static final Item REINFORCED_SCUTE_HORSE_ARMOR = registerItem("reinforced_scute_horse_armor",
            new AnimalArmorItem(ModArmorMaterial.REINFORCED_SCUTE_ARMOR_MATERIAL, AnimalArmorItem.Type.EQUESTRIAN, false,
                    new Item.Settings()));

    /**
     * HARDENED SCUTE
     */

    public static final Item HARDENED_SCUTE_HELMET = registerItem("hardened_scute_helmet",
            new ModArmorItem(ModArmorMaterial.HARDENED_SCUTE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(42))));

    public static final Item HARDENED_SCUTE_CHESTPLATE = registerItem("hardened_scute_chestplate",
            new ModArmorItem(ModArmorMaterial.HARDENED_SCUTE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(42))));

    public static final Item HARDENED_SCUTE_LEGGINGS = registerItem("hardened_scute_leggings",
            new ModArmorItem(ModArmorMaterial.HARDENED_SCUTE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(42))));

    public static final Item HARDENED_SCUTE_BOOTS = registerItem("hardened_scute_boots",
            new ModArmorItem(ModArmorMaterial.HARDENED_SCUTE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(42))));

    public static final Item HARDENED_SCUTE_HORSE_ARMOR = registerItem("hardened_scute_horse_armor",
            new AnimalArmorItem(ModArmorMaterial.HARDENED_SCUTE_ARMOR_MATERIAL, AnimalArmorItem.Type.EQUESTRIAN, false,
                    new Item.Settings()));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MoreMC.MOD_ID, name), item);
    }

    private static void customCombat(FabricItemGroupEntries entries) {
        entries.add(SCUTE_HELMET);
        entries.add(SCUTE_CHESTPLATE);
        entries.add(SCUTE_LEGGINGS);
        entries.add(SCUTE_BOOTS);
        entries.add(SCUTE_HORSE_ARMOR);

        entries.add(REINFORCED_SCUTE_HELMET);
        entries.add(REINFORCED_SCUTE_CHESTPLATE);
        entries.add(REINFORCED_SCUTE_LEGGINGS);
        entries.add(REINFORCED_SCUTE_BOOTS);
        entries.add(REINFORCED_SCUTE_HORSE_ARMOR);

        entries.add(HARDENED_SCUTE_HELMET);
        entries.add(HARDENED_SCUTE_CHESTPLATE);
        entries.add(HARDENED_SCUTE_LEGGINGS);
        entries.add(HARDENED_SCUTE_BOOTS);
        entries.add(HARDENED_SCUTE_HORSE_ARMOR);
    }


    public static void registerModItems() {
        MoreMC.LOGGER.info(MoreMC.getThis() + ": Registering Scute Armor...");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ScuteArmor::customCombat);
    }

}
