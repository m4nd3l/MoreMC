package com.m4nd3l.moremc.item.tools;

import com.m4nd3l.moremc.MoreMC;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ScuteTools {
    /**
     * SCUTE
     */

    public static final Item SCUTE_SWORD = registerItem("scute_sword",
            new SwordItem(ModToolMaterial.SCUTE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(
                    ModToolMaterial.SCUTE, 4, -2.4F))));

    public static final Item SCUTE_PICKAXE = registerItem("scute_pickaxe",
            new PickaxeItem(ModToolMaterial.SCUTE, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(
                    ModToolMaterial.SCUTE, 1, -2.8F))));

    public static final Item SCUTE_AXE = registerItem("scute_axe",
            new AxeItem(ModToolMaterial.SCUTE, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(
                    ModToolMaterial.SCUTE, 6, -3.0F))));

    public static final Item SCUTE_SHOVEL = registerItem("scute_shovel",
            new ShovelItem(ModToolMaterial.SCUTE, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(
                    ModToolMaterial.SCUTE, 1, -3.0F))));

    public static final Item SCUTE_HOE = registerItem("scute_hoe",
            new HoeItem(ModToolMaterial.SCUTE, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(
                    ModToolMaterial.SCUTE, -4, 0.0F))));

    /**
     * REINFORCED SCUTE
     */

    public static final Item REINFORCED_SCUTE_SWORD = registerItem("reinforced_scute_sword",
            new SwordItem(ModToolMaterial.REINFORCED_SCUTE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(
                    ModToolMaterial.REINFORCED_SCUTE, 5, -2.4F))));

    public static final Item REINFORCED_SCUTE_PICKAXE = registerItem("reinforced_scute_pickaxe",
            new PickaxeItem(ModToolMaterial.REINFORCED_SCUTE, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(
                    ModToolMaterial.REINFORCED_SCUTE, 2, -2.8F))));

    public static final Item REINFORCED_SCUTE_AXE = registerItem("reinforced_scute_axe",
            new AxeItem(ModToolMaterial.REINFORCED_SCUTE, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(
                    ModToolMaterial.REINFORCED_SCUTE, 7, -3.0F))));

    public static final Item REINFORCED_SCUTE_SHOVEL = registerItem("reinforced_scute_shovel",
            new ShovelItem(ModToolMaterial.REINFORCED_SCUTE, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(
                    ModToolMaterial.REINFORCED_SCUTE, 2, -3.0F))));

    public static final Item REINFORCED_SCUTE_HOE = registerItem("reinforced_scute_hoe",
            new HoeItem(ModToolMaterial.REINFORCED_SCUTE, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(
                    ModToolMaterial.REINFORCED_SCUTE, -3, 0.0F))));

    /**
     * HARDENED SCUTE
     */

    public static final Item HARDENED_SCUTE_SWORD = registerItem("hardened_scute_sword",
            new SwordItem(ModToolMaterial.HARDENED_SCUTE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(
                    ModToolMaterial.HARDENED_SCUTE, 6, -2.4F))));

    public static final Item HARDENED_SCUTE_PICKAXE = registerItem("hardened_scute_pickaxe",
            new PickaxeItem(ModToolMaterial.HARDENED_SCUTE, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(
                    ModToolMaterial.HARDENED_SCUTE, 3, -2.8F))));

    public static final Item HARDENED_SCUTE_AXE = registerItem("hardened_scute_axe",
            new AxeItem(ModToolMaterial.HARDENED_SCUTE, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(
                    ModToolMaterial.HARDENED_SCUTE, 8, -3.0F))));

    public static final Item HARDENED_SCUTE_SHOVEL = registerItem("hardened_scute_shovel",
            new ShovelItem(ModToolMaterial.HARDENED_SCUTE, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(
                    ModToolMaterial.HARDENED_SCUTE, 3, -3.0F))));

    public static final Item HARDENED_SCUTE_HOE = registerItem("hardened_scute_hoe",
            new HoeItem(ModToolMaterial.HARDENED_SCUTE, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(
                    ModToolMaterial.HARDENED_SCUTE, -4, 0.0F))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MoreMC.MOD_ID, name), item);
    }

    private static void customCombat(FabricItemGroupEntries entries) {
        entries.add(SCUTE_SWORD);

        entries.add(REINFORCED_SCUTE_SWORD);

        entries.add(HARDENED_SCUTE_SWORD);
    }

    private static void customTools(FabricItemGroupEntries entries) {
        entries.add(SCUTE_PICKAXE);
        entries.add(SCUTE_AXE);
        entries.add(SCUTE_SHOVEL);
        entries.add(SCUTE_HOE);

        entries.add(REINFORCED_SCUTE_PICKAXE);
        entries.add(REINFORCED_SCUTE_AXE);
        entries.add(REINFORCED_SCUTE_SHOVEL);
        entries.add(REINFORCED_SCUTE_HOE);

        entries.add(HARDENED_SCUTE_PICKAXE);
        entries.add(HARDENED_SCUTE_AXE);
        entries.add(HARDENED_SCUTE_SHOVEL);
        entries.add(HARDENED_SCUTE_HOE);
    }

    public static void registerModItems() {
        MoreMC.LOGGER.info(MoreMC.getThis() + ": Registering Scute Tools...");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ScuteTools::customCombat);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ScuteTools::customTools);
    }

}
