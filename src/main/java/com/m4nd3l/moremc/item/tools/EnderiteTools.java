package com.m4nd3l.moremc.item.tools;

import com.m4nd3l.moremc.MoreMC;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class EnderiteTools {
    /**
     * SCUTE
     */

    public static final Item ENDERITE_SWORD = registerItem("enderite_sword",
            new SwordItem(ModToolMaterial.ENDERITE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(
                    ModToolMaterial.ENDERITE, 5, -2.4F))));

    public static final Item ENDERITE_PICKAXE = registerItem("enderite_pickaxe",
            new PickaxeItem(ModToolMaterial.ENDERITE, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(
                    ModToolMaterial.ENDERITE, 2, -2.8F))));

    public static final Item ENDERITE_AXE = registerItem("enderite_axe",
            new AxeItem(ModToolMaterial.ENDERITE, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(
                    ModToolMaterial.ENDERITE, 7, -3.0F))));

    public static final Item ENDERITE_SHOVEL = registerItem("enderite_shovel",
            new ShovelItem(ModToolMaterial.ENDERITE, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(
                    ModToolMaterial.ENDERITE, 2, -3.0F))));

    public static final Item ENDERITE_HOE = registerItem("enderite_hoe",
            new HoeItem(ModToolMaterial.ENDERITE, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(
                    ModToolMaterial.ENDERITE, -3, 0.0F))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MoreMC.MOD_ID, name), item);
    }

    private static void customCombat(FabricItemGroupEntries entries) {
        entries.add(ENDERITE_SWORD);
    }

    private static void customTools(FabricItemGroupEntries entries) {
        entries.add(ENDERITE_PICKAXE);
        entries.add(ENDERITE_AXE);
        entries.add(ENDERITE_SHOVEL);
        entries.add(ENDERITE_HOE);
    }

    public static void registerModItems() {
        MoreMC.LOGGER.info(MoreMC.getThis() + ": Registering Enderite Tools...");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(EnderiteTools::customCombat);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(EnderiteTools::customTools);
    }
}
