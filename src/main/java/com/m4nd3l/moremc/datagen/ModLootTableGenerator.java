package com.m4nd3l.moremc.datagen;

import com.m4nd3l.moremc.block.blocks.ScuteBlocks;
import com.m4nd3l.moremc.block.blocks.trees.SkyWoodBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ScuteBlocks.SCUTE_BLOCK);
        addDrop(ScuteBlocks.SCUTE_INGOT_BLOCK);

        addDrop(ScuteBlocks.REINFORCED_SCUTE_BLOCK);
        addDrop(ScuteBlocks.REINFORCED_SCUTE_INGOT_BLOCK);

        addDrop(ScuteBlocks.HARDENED_SCUTE_BLOCK);
        addDrop(ScuteBlocks.HARDENED_SCUTE_INGOT_BLOCK);

        addDrop(SkyWoodBlocks.SKYWOOD_LOG);
        addDrop(SkyWoodBlocks.SKYWOOD_WOOD);
        addDrop(SkyWoodBlocks.STRIPPED_SKYWOOD_LOG);
        addDrop(SkyWoodBlocks.STRIPPED_SKYWOOD_WOOD);
        addDrop(SkyWoodBlocks.SKYWOOD_PLANKS);

        addDrop(SkyWoodBlocks.SKYWOOD_STAIRS);
        addDrop(SkyWoodBlocks.SKYWOOD_SLAB, slabDrops(SkyWoodBlocks.SKYWOOD_SLAB));

        addDrop(SkyWoodBlocks.SKYWOOD_BUTTON);
        addDrop(SkyWoodBlocks.SKYWOOD_PRESSURE_PLATE);

        addDrop(SkyWoodBlocks.SKYWOOD_FENCE);
        addDrop(SkyWoodBlocks.SKYWOOD_FENCE_GATE);

        addDrop(SkyWoodBlocks.SKYWOOD_DOOR, doorDrops(SkyWoodBlocks.SKYWOOD_DOOR));
        addDrop(SkyWoodBlocks.SKYWOOD_TRAPDOOR);


        addDrop(SkyWoodBlocks.SKYWOOD_LEAVES, leavesDrops(SkyWoodBlocks.SKYWOOD_LEAVES,
                /*SkyWoodBlocks.SKYWOOD_SAPLING*/Blocks.OAK_SAPLING,
                0.0625F));


        //FOR ORES: addDrop(ModBlocks.X_ORE, oreDrops(ModBlocks.X_ORE, ModItems.RAW_X));
    }
}
