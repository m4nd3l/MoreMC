package com.m4nd3l.moremc.datagen;

import com.m4nd3l.moremc.block.blocks.trees.SkyWoodBlocks;
import com.m4nd3l.moremc.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(   SkyWoodBlocks.SKYWOOD_LOG.asItem(),
                        SkyWoodBlocks.SKYWOOD_WOOD.asItem(),
                        SkyWoodBlocks.STRIPPED_SKYWOOD_LOG.asItem(),
                        SkyWoodBlocks.STRIPPED_SKYWOOD_WOOD.asItem()    );

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(   SkyWoodBlocks.SKYWOOD_PLANKS.asItem()           );
    }
}
