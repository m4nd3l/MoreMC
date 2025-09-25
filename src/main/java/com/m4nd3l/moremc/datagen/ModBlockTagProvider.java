package com.m4nd3l.moremc.datagen;

import com.m4nd3l.moremc.MoreMC;
import com.m4nd3l.moremc.blocks.ModBlocks;
import com.m4nd3l.moremc.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MoreMC.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.SCUTE_BLOCK.get())
                .add(ModBlocks.SCUTE_INGOT_BLOCK.get())

                .add(ModBlocks.REINFORCED_SCUTE_BLOCK.get())
                .add(ModBlocks.REINFORCED_SCUTE_INGOT_BLOCK.get())

                .add(ModBlocks.HARDENED_SCUTE_BLOCK.get())
                .add(ModBlocks.REINFORCED_SCUTE_INGOT_BLOCK.get());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.PEDESTAL_BLOCK.get());

        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.SCUTE_BLOCK.get())
                .add(ModBlocks.SCUTE_INGOT_BLOCK.get())

                .add(ModBlocks.REINFORCED_SCUTE_BLOCK.get())
                .add(ModBlocks.REINFORCED_SCUTE_INGOT_BLOCK.get())

                .add(ModBlocks.HARDENED_SCUTE_BLOCK.get())
                .add(ModBlocks.REINFORCED_SCUTE_INGOT_BLOCK.get());


        tag(ModTags.Blocks.NEEDS_SCUTE_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_SCUTE_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_NETHERITE_TOOL)
                .remove(ModTags.Blocks.NEEDS_SCUTE_TOOL);



        tag(ModTags.Blocks.NEEDS_REINFORCED_SCUTE_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_REINFORCED_SCUTE_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_NETHERITE_TOOL)
                .remove(ModTags.Blocks.NEEDS_REINFORCED_SCUTE_TOOL);



        tag(ModTags.Blocks.NEEDS_HARDENED_SCUTE_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_HARDENED_SCUTE_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_NETHERITE_TOOL)
                .remove(ModTags.Blocks.NEEDS_HARDENED_SCUTE_TOOL);
    }
}
