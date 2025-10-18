package com.m4nd3l.moremc.item.items;

import com.m4nd3l.moremc.MoreMC;
import com.m4nd3l.moremc.block.blocks.CropBlocks;
import com.m4nd3l.moremc.item.custom.AnvilRepairItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MiscItems {
    /**MISC*/
    public static final Item ANVIL_REPAIR = registerItem("anvil_repair",
            new AnvilRepairItem(new Item.Settings()
                    .maxDamage(8)));

    public static final Item TORN_PAPER = registerItem("torn_paper",
            new Item(new Item.Settings().maxCount(99)));

    public static final Item RICE_SEEDS = registerItem("rice_seeds",
            new AliasedBlockItem(CropBlocks.RICE_CROP, new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MoreMC.MOD_ID, name), item);
    }

    private static void customIngredients(FabricItemGroupEntries entries) {
        entries.add(TORN_PAPER);
    }

    private static void customTools(FabricItemGroupEntries entries) {
        entries.add(ANVIL_REPAIR);
    }

    private static void customNatural(FabricItemGroupEntries entries) {
        entries.add(RICE_SEEDS);
    }

    public static void registerModItems() {
        MoreMC.LOGGER.info(MoreMC.getThis() + ": Registering Misc Items...");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(MiscItems::customIngredients);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(MiscItems::customTools);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(MiscItems::customNatural);
    }

}
