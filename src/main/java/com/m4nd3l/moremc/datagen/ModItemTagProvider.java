package com.m4nd3l.moremc.datagen;

import com.m4nd3l.moremc.block.blocks.trees.SkyWoodBlocks;
import com.m4nd3l.moremc.item.armor.ScuteArmor;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
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

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(   ScuteArmor.SCUTE_HELMET,
                        ScuteArmor.SCUTE_CHESTPLATE,
                        ScuteArmor.SCUTE_LEGGINGS,
                        ScuteArmor.SCUTE_BOOTS,

                        ScuteArmor.REINFORCED_SCUTE_HELMET,
                        ScuteArmor.REINFORCED_SCUTE_CHESTPLATE,
                        ScuteArmor.REINFORCED_SCUTE_LEGGINGS,
                        ScuteArmor.REINFORCED_SCUTE_BOOTS,

                        ScuteArmor.HARDENED_SCUTE_HELMET,
                        ScuteArmor.HARDENED_SCUTE_CHESTPLATE,
                        ScuteArmor.HARDENED_SCUTE_LEGGINGS,
                        ScuteArmor.HARDENED_SCUTE_BOOTS                   );
    }
}
