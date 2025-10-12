package com.m4nd3l.moremc.block.blocks;

import com.m4nd3l.moremc.MoreMC;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class EnderiteBlocks {

    /**ENDERITE*/
    public static final Block ENDERITE_ORE = registerBlock("enderite_ore",
            new ExperienceDroppingBlock(
                    UniformIntProvider.create(3, 7),
                    AbstractBlock.Settings.create()
                            .strength(3.0F)
                            .requiresTool()
                            .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block RAW_ENDERITE_BLOCK = registerBlock("raw_enderite_block",
            new Block(
                    AbstractBlock.Settings.create()
                            .strength(3.0F)
                            .requiresTool()
                            .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block ENDERITE_BLOCK = registerBlock("enderite_block",
                new Block(AbstractBlock.Settings.create()
                        .sounds(BlockSoundGroup.STONE)
                        .strength(5.0F)
                        .requiresTool()));

    private static void customBuildingBlocks(FabricItemGroupEntries entries) {
        entries.add(ENDERITE_BLOCK);
    }

    private static void customNatural(FabricItemGroupEntries entries) {
        entries.add(RAW_ENDERITE_BLOCK);
        entries.add(ENDERITE_ORE);
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
        MoreMC.LOGGER.info(MoreMC.getThis() + ": Registering Enderite Blocks...");
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(EnderiteBlocks::customBuildingBlocks);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(EnderiteBlocks::customNatural);
    }

}
