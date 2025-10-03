package com.m4nd3l.moremc.block;

import com.m4nd3l.moremc.MoreMC;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block SCUTE_BLOCK = registerBlock("scute_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(4f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.SCAFFOLDING)));



    /*
    //REINFORCED SCUTE BLOCK
    public static final RegistryObject<Block> REINFORCED_SCUTE_BLOCK = registerBlock("reinforced_scute_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(6f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));

    //HARDENED SCUTE BLOCK
    public static final RegistryObject<Block> HARDENED_SCUTE_BLOCK = registerBlock("hardened_scute_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(8f).requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));

    //SCUTE INGOT BLOCK
    public static final RegistryObject<Block> SCUTE_INGOT_BLOCK = registerBlock("scute_ingot_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));

    //REINFORCED SCUTE INGOT BLOCK
    public static final RegistryObject<Block> REINFORCED_SCUTE_INGOT_BLOCK = registerBlock("reinforced_scute_ingot_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(6f).requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));

    //HARDENED SCUTE INGOT BLOCK
    public static final RegistryObject<Block> HARDENED_SCUTE_INGOT_BLOCK = registerBlock("hardened_scute_ingot_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(8f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    //PEDESTAL BLOCK
    public static final RegistryObject<Block> PEDESTAL_BLOCK = registerBlock("pedestal_block",
            () -> new PedestalBlock(BlockBehaviour.Properties.of()
                    .noOcclusion().strength(2f).requiresCorrectToolForDrops().sound(SoundType.STONE)));*/

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(MoreMC.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(MoreMC.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        MoreMC.LOGGER.info(MoreMC.getThis() + ": Registering Mod Blocks...");
    }

}
