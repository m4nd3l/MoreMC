package com.m4nd3l.moremc.blocks;

import com.m4nd3l.moremc.MoreMC;
import com.m4nd3l.moremc.blocks.custom.PedestalBlock;
import com.m4nd3l.moremc.items.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
        DeferredRegister.create(ForgeRegistries.BLOCKS, MoreMC.MOD_ID);

    //SCUTE BLOCK
    public static final RegistryObject<Block> SCUTE_BLOCK = registerBlock("scute_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.SCAFFOLDING)));

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
                    .noOcclusion().strength(2f).requiresCorrectToolForDrops().sound(SoundType.STONE)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
