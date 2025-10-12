package com.m4nd3l.moremc.block.blocks.trees;

import com.m4nd3l.moremc.MoreMC;
import com.m4nd3l.moremc.block.blocks.custom.SkyWoodLampBlock;
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

public class SkyWoodBlocks {

    /**SKYWOOD*/
    public static final Block SKYWOOD_LOG = registerBlock("skywood_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)));

    public static final Block STRIPPED_SKYWOOD_LOG = registerBlock("stripped_skywood_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)));

    public static final Block SKYWOOD_WOOD = registerBlock("skywood_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));

    public static final Block STRIPPED_SKYWOOD_WOOD = registerBlock("stripped_skywood_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block SKYWOOD_LEAVES = registerBlock("skywood_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)
                    .luminance(state -> 10)));

    public static final Block SKYWOOD_PLANKS = registerBlock("skywood_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));

    /*public static final Block SKYWOOD_SAPLING = registerBlock("skywood_sapling",
            new SaplingBlock(, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));

    public static final Block POTTED_SKYWOOD_SAPLING = registerBlock("skywood_sapling",
            new FlowerPotBlock(SKYWOOD_SAPLING, AbstractBlock.Settings.create()
                    .breakInstantly()
                    .nonOpaque()
                    .pistonBehavior(PistonBehavior.DESTROY)));*/

    public static final Block SKYWOOD_STAIRS = registerBlock("skywood_stairs",
            new StairsBlock(SkyWoodBlocks.SKYWOOD_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.OAK_STAIRS)));

    public static final Block SKYWOOD_SLAB = registerBlock("skywood_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_SLAB)));

    public static final Block SKYWOOD_BUTTON = registerBlock("skywood_button",
            new ButtonBlock(BlockSetType.OAK, 10,
                    AbstractBlock.Settings.copy(Blocks.OAK_BUTTON)));

    public static final Block SKYWOOD_PRESSURE_PLATE = registerBlock("skywood_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.copy(Blocks.OAK_PRESSURE_PLATE)));

    public static final Block SKYWOOD_FENCE = registerBlock("skywood_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.OAK_FENCE)));

    public static final Block SKYWOOD_FENCE_GATE = registerBlock("skywood_fence_gate",
            new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.copy(Blocks.OAK_FENCE_GATE)));

    public static final Block SKYWOOD_DOOR = registerBlock("skywood_door",
            new DoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_DOOR)));

    public static final Block SKYWOOD_TRAPDOOR = registerBlock("skywood_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR)));

    public static final Block SKYWOOD_LAMP = registerBlock("skywood_lamp",
            new SkyWoodLampBlock(AbstractBlock.Settings.create()
                    .strength(0.6F)
                    .burnable()
                    .sounds(BlockSoundGroup.GLASS)
                    .luminance(state -> state.get(SkyWoodLampBlock.CLICKED) ? 15 : 0)));


    private static void customBuildingBlocks(FabricItemGroupEntries entries) {
        entries.add(SKYWOOD_LOG);
        entries.add(STRIPPED_SKYWOOD_LOG);

        entries.add(SKYWOOD_WOOD);
        entries.add(STRIPPED_SKYWOOD_WOOD);

        entries.add(SKYWOOD_PLANKS);

        entries.add(SKYWOOD_STAIRS);
        entries.add(SKYWOOD_SLAB);

        entries.add(SKYWOOD_DOOR);
        entries.add(SKYWOOD_TRAPDOOR);

        entries.add(SKYWOOD_FENCE);
        entries.add(SKYWOOD_FENCE_GATE);
    }

    private static void customRedstone(FabricItemGroupEntries entries) {
        entries.add(SKYWOOD_BUTTON);
        entries.add(SKYWOOD_PRESSURE_PLATE);
        entries.add(SKYWOOD_LAMP);
    }

    private static void customNatural(FabricItemGroupEntries entries) {
        entries.add(SKYWOOD_LEAVES);
        //entries.add(SKYWOOD_SAPLING);
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
        MoreMC.LOGGER.info(MoreMC.getThis() + ": Registering SkyWood Blocks...");
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(SkyWoodBlocks::customBuildingBlocks);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(SkyWoodBlocks::customRedstone);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(SkyWoodBlocks::customNatural);
    }

}
