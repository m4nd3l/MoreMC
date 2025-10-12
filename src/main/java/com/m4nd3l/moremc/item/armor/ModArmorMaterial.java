package com.m4nd3l.moremc.item.armor;

import com.m4nd3l.moremc.MoreMC;
import com.m4nd3l.moremc.item.items.EnderiteItems;
import com.m4nd3l.moremc.item.items.ScuteItems;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterial {

    public static final RegistryEntry<ArmorMaterial> SCUTE_ARMOR_MATERIAL = registerArmorMateria("scute",
            () -> new ArmorMaterial(
                    Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                        map.put(ArmorItem.Type.BOOTS, 4);
                        map.put(ArmorItem.Type.LEGGINGS, 7);
                        map.put(ArmorItem.Type.CHESTPLATE, 9);
                        map.put(ArmorItem.Type.HELMET, 4);
                        map.put(ArmorItem.Type.BODY, 12);
                    }), 17, SoundEvents.ITEM_ARMOR_EQUIP_TURTLE, () -> Ingredient.ofItems(ScuteItems.SCUTE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(MoreMC.MOD_ID, "scute"))), 0, 0));

    public static final RegistryEntry<ArmorMaterial> REINFORCED_SCUTE_ARMOR_MATERIAL = registerArmorMateria("reinforced_scute",
            () -> new ArmorMaterial(
                    Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                        map.put(ArmorItem.Type.BOOTS, 5);
                        map.put(ArmorItem.Type.LEGGINGS, 8);
                        map.put(ArmorItem.Type.CHESTPLATE, 10);
                        map.put(ArmorItem.Type.HELMET, 5);
                        map.put(ArmorItem.Type.BODY, 13);
                    }), 19, SoundEvents.ITEM_ARMOR_EQUIP_TURTLE, () -> Ingredient.ofItems(ScuteItems.REINFORCED_SCUTE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(MoreMC.MOD_ID, "reinforced_scute"))), 0, 0));

    public static final RegistryEntry<ArmorMaterial> HARDENED_SCUTE_ARMOR_MATERIAL = registerArmorMateria("hardened_scute",
            () -> new ArmorMaterial(
                    Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                        map.put(ArmorItem.Type.BOOTS, 6);
                        map.put(ArmorItem.Type.LEGGINGS, 9);
                        map.put(ArmorItem.Type.CHESTPLATE, 11);
                        map.put(ArmorItem.Type.HELMET, 6);
                        map.put(ArmorItem.Type.BODY, 14);
                    }), 22, SoundEvents.ITEM_ARMOR_EQUIP_TURTLE, () -> Ingredient.ofItems(ScuteItems.HARDENED_SCUTE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(MoreMC.MOD_ID, "hardened_scute"))), 0, 0));

    public static final RegistryEntry<ArmorMaterial> ENDERITE_ARMOR_MATERIAL = registerArmorMateria("enderite_scute",
            () -> new ArmorMaterial(
                    Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                        map.put(ArmorItem.Type.BOOTS, 5);
                        map.put(ArmorItem.Type.LEGGINGS, 8);
                        map.put(ArmorItem.Type.CHESTPLATE, 10);
                        map.put(ArmorItem.Type.HELMET, 5);
                        map.put(ArmorItem.Type.BODY, 13);
                    }), 19, SoundEvents.ITEM_ARMOR_EQUIP_ELYTRA, () -> Ingredient.ofItems(EnderiteItems.ENDERITE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(MoreMC.MOD_ID, "enderite"))), 0, 0));

    public static RegistryEntry<ArmorMaterial> registerArmorMateria(String name, Supplier<ArmorMaterial> material) {
        return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(MoreMC.MOD_ID, name), material.get());
    }

}
