package com.m4nd3l.moremc.datagen;

import com.m4nd3l.moremc.block.blocks.EnderiteBlocks;
import com.m4nd3l.moremc.block.blocks.ScuteBlocks;
import com.m4nd3l.moremc.block.blocks.trees.SkyWoodBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(   ScuteBlocks.SCUTE_BLOCK,
                        ScuteBlocks.SCUTE_INGOT_BLOCK,

                        ScuteBlocks.REINFORCED_SCUTE_BLOCK,
                        ScuteBlocks.REINFORCED_SCUTE_INGOT_BLOCK,

                        ScuteBlocks.HARDENED_SCUTE_BLOCK,
                        ScuteBlocks.HARDENED_SCUTE_INGOT_BLOCK,

                        EnderiteBlocks.ENDERITE_ORE,
                        EnderiteBlocks.ENDERITE_BLOCK,
                        EnderiteBlocks.RAW_ENDERITE_BLOCK           );

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(   ScuteBlocks.SCUTE_BLOCK,
                        ScuteBlocks.SCUTE_INGOT_BLOCK               );

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(   ScuteBlocks.REINFORCED_SCUTE_BLOCK,
                        ScuteBlocks.REINFORCED_SCUTE_INGOT_BLOCK,
                        ScuteBlocks.HARDENED_SCUTE_BLOCK,
                        ScuteBlocks.HARDENED_SCUTE_INGOT_BLOCK,

                        EnderiteBlocks.ENDERITE_ORE,
                        EnderiteBlocks.ENDERITE_BLOCK,
                        EnderiteBlocks.RAW_ENDERITE_BLOCK           );

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(   SkyWoodBlocks.SKYWOOD_LOG,
                        SkyWoodBlocks.SKYWOOD_WOOD,

                        SkyWoodBlocks.STRIPPED_SKYWOOD_LOG,
                        SkyWoodBlocks.STRIPPED_SKYWOOD_WOOD,

                        SkyWoodBlocks.SKYWOOD_PLANKS,

                        SkyWoodBlocks.SKYWOOD_STAIRS,
                        SkyWoodBlocks.SKYWOOD_SLAB,

                        SkyWoodBlocks.SKYWOOD_BUTTON,
                        SkyWoodBlocks.SKYWOOD_PRESSURE_PLATE,

                        SkyWoodBlocks.SKYWOOD_FENCE,
                        SkyWoodBlocks.SKYWOOD_FENCE_GATE,

                        SkyWoodBlocks.SKYWOOD_DOOR,
                        SkyWoodBlocks.SKYWOOD_TRAPDOOR              );

        getOrCreateTagBuilder(BlockTags.LEAVES)
                .add(   SkyWoodBlocks.SKYWOOD_LEAVES                );

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(   SkyWoodBlocks.SKYWOOD_LOG,
                        SkyWoodBlocks.SKYWOOD_WOOD,
                        SkyWoodBlocks.STRIPPED_SKYWOOD_LOG,
                        SkyWoodBlocks.STRIPPED_SKYWOOD_WOOD         );

        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(   SkyWoodBlocks.SKYWOOD_FENCE                 );

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(   SkyWoodBlocks.SKYWOOD_FENCE_GATE            );

        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                .add(   SkyWoodBlocks.SKYWOOD_DOOR                  );

        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(   SkyWoodBlocks.SKYWOOD_TRAPDOOR              );
    }
}
