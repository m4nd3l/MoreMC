package com.m4nd3l.moremc.block.blocks;

import com.m4nd3l.moremc.MoreMC;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ScuteBlocks {

    /**SCUTE*/
    public static final Block SCUTE_BLOCK = registerBlock("scute_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(4f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.SCAFFOLDING)));

    public static final Block SCUTE_INGOT_BLOCK = registerBlock("scute_ingot_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(4f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.BONE)));


    /**REINFORCED SCUTE*/
    public static final Block REINFORCED_SCUTE_BLOCK = registerBlock("reinforced_scute_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.SCAFFOLDING)), Rarity.UNCOMMON);

    public static final Block REINFORCED_SCUTE_INGOT_BLOCK = registerBlock("reinforced_scute_ingot_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)), Rarity.UNCOMMON);


    /**REINFORCED SCUTE*/
    public static final Block HARDENED_SCUTE_BLOCK = registerBlock("hardened_scute_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(8f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)), Rarity.RARE);

    public static final Block HARDENED_SCUTE_INGOT_BLOCK = registerBlock("hardened_scute_ingot_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(8f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)), Rarity.RARE);

    /**
     * FOR ORES:
     * <pre>
     * public static final Block X_ORE = registerBlock("x_ore",
     *     new ExperienceDroppingBlock(
     *         UniformIntProvider.create(a, b),
     *         AbstractBlock.Settings.create()
     *             .strength(xf)
     *             .requiresTool()
     *             .blablabla));</pre>
     */

    private static void customBuildingBlocks(FabricItemGroupEntries entries) {
        entries.add(SCUTE_BLOCK);
        entries.add(SCUTE_INGOT_BLOCK);

        entries.add(REINFORCED_SCUTE_BLOCK);
        entries.add(REINFORCED_SCUTE_INGOT_BLOCK);

        entries.add(HARDENED_SCUTE_BLOCK);
        entries.add(HARDENED_SCUTE_INGOT_BLOCK);
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
        MoreMC.LOGGER.info(MoreMC.getThis() + ": Registering Scute Blocks...");
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ScuteBlocks::customBuildingBlocks);
    }

}
