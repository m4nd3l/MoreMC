package com.m4nd3l.moremc.datagen;

import com.m4nd3l.moremc.blocks.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider pRegistries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), pRegistries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.SCUTE_BLOCK.get());
        dropSelf(ModBlocks.SCUTE_INGOT_BLOCK.get());
        dropSelf(ModBlocks.REINFORCED_SCUTE_BLOCK.get());
        dropSelf(ModBlocks.REINFORCED_SCUTE_INGOT_BLOCK.get());
        dropSelf(ModBlocks.HARDENED_SCUTE_BLOCK.get());
        dropSelf(ModBlocks.HARDENED_SCUTE_INGOT_BLOCK.get());
        dropSelf(ModBlocks.PEDESTAL_BLOCK.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
