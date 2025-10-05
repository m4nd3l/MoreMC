package com.m4nd3l.moremc;

import com.m4nd3l.moremc.block.blocks.trees.SkyWoodBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class MoreMCModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(SkyWoodBlocks.SKYWOOD_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkyWoodBlocks.SKYWOOD_TRAPDOOR, RenderLayer.getCutout());
    }
}
