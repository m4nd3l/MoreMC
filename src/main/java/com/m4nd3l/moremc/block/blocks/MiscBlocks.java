package com.m4nd3l.moremc.block.blocks;

import com.m4nd3l.moremc.MoreMC;
import com.m4nd3l.moremc.block.blocks.custom.SushiGetaBlock;
import com.mojang.serialization.MapCodec;
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

public class MiscBlocks {

    /**
     * RICE & ASIAN
     */

    public static final Block SUSHI_GETA = registerBlock("sushi_geta", new SushiGetaBlock(AbstractBlock.Settings.create()
            .sounds(BlockSoundGroup.WOOD)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block, Rarity.COMMON);
        return Registry.register(Registries.BLOCK, Identifier.of(MoreMC.MOD_ID, name), block);
    }

    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        registerBlockItem(name, block, Rarity.COMMON);
        return Registry.register(Registries.BLOCK, Identifier.of(MoreMC.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block, Rarity rarity) {
        registerBlockItem(name, block, rarity);
        return Registry.register(Registries.BLOCK, Identifier.of(MoreMC.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block, Rarity rarity) {
        Registry.register(Registries.ITEM, Identifier.of(MoreMC.MOD_ID, name), new BlockItem(block, new Item.Settings().rarity(rarity)));
    }

    public static void registerModBlocks() {
        MoreMC.LOGGER.info(MoreMC.getThis() + ": Registering Misc Blocks...");
    }

}

