package com.m4nd3l.moremc.block.blocks;

import com.m4nd3l.moremc.MoreMC;
import com.m4nd3l.moremc.block.blocks.crops.RiceCropBlock;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class CropBlocks {

    /**RICE*/
    public static final Block RICE_CROP = registerBlockWithoutBlockItem("rice_crop",
            new RiceCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT)));


    private static void customNatural(FabricItemGroupEntries entries) {
        entries.add(RICE_CROP);
    }

    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(MoreMC.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block, Rarity.COMMON);
        return Registry.register(Registries.BLOCK, Identifier.of(MoreMC.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block, Rarity rarity) {
        registerBlockItem(name, block, rarity);
        return Registry.register(Registries.BLOCK, Identifier.of(MoreMC.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block, Rarity rarity) {
        Registry.register(Registries.ITEM, Identifier.of(MoreMC.MOD_ID, name),
                new BlockItem(block, new Item.Settings().rarity(rarity)));
    }

    public static void registerModBlocks() {
        MoreMC.LOGGER.info(MoreMC.getThis() + ": Registering Crop Blocks...");
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(CropBlocks::customNatural);
    }

}
