package com.m4nd3l.moremc.datagen;

import com.m4nd3l.moremc.block.blocks.ScuteBlocks;
import com.m4nd3l.moremc.block.blocks.trees.SkyWoodBlocks;
import com.m4nd3l.moremc.item.armor.ScuteArmor;
import com.m4nd3l.moremc.item.items.FoodItems;
import com.m4nd3l.moremc.item.items.MiscItems;
import com.m4nd3l.moremc.item.items.ScuteItems;
import com.m4nd3l.moremc.item.tools.ScuteTools;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TexturedModel;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        generateBlockStatesModelsScute(blockStateModelGenerator);

        generateSkyWoodModels(blockStateModelGenerator);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        generateItemModelsAllScute(itemModelGenerator);

        generateItemModelsFood(itemModelGenerator);

        generateScuteToolsModelsFood(itemModelGenerator);

        generateScuteArmorModelsFood(itemModelGenerator);

        generateItemModelsMisc(itemModelGenerator);
    }


    private void generateBlockStatesModelsScute(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ScuteBlocks.SCUTE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ScuteBlocks.SCUTE_INGOT_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ScuteBlocks.REINFORCED_SCUTE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ScuteBlocks.REINFORCED_SCUTE_INGOT_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ScuteBlocks.HARDENED_SCUTE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ScuteBlocks.HARDENED_SCUTE_INGOT_BLOCK);
    }

    private void generateSkyWoodModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerLog(SkyWoodBlocks.SKYWOOD_LOG)
                .log(SkyWoodBlocks.SKYWOOD_LOG)
                .wood(SkyWoodBlocks.SKYWOOD_WOOD);

        blockStateModelGenerator.registerLog(SkyWoodBlocks.STRIPPED_SKYWOOD_LOG)
                .log(SkyWoodBlocks.STRIPPED_SKYWOOD_LOG)
                .wood(SkyWoodBlocks.STRIPPED_SKYWOOD_WOOD);

        blockStateModelGenerator.registerSingleton(SkyWoodBlocks.SKYWOOD_LEAVES, TexturedModel.LEAVES);

        BlockStateModelGenerator.BlockTexturePool skywoodTexturePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(SkyWoodBlocks.SKYWOOD_PLANKS);

        skywoodTexturePool.stairs(SkyWoodBlocks.SKYWOOD_STAIRS);
        skywoodTexturePool.slab(SkyWoodBlocks.SKYWOOD_SLAB);

        skywoodTexturePool.button(SkyWoodBlocks.SKYWOOD_BUTTON);
        skywoodTexturePool.pressurePlate(SkyWoodBlocks.SKYWOOD_PRESSURE_PLATE);

        skywoodTexturePool.fence(SkyWoodBlocks.SKYWOOD_FENCE);
        skywoodTexturePool.fenceGate(SkyWoodBlocks.SKYWOOD_FENCE_GATE);

        blockStateModelGenerator.registerDoor(SkyWoodBlocks.SKYWOOD_DOOR);
        blockStateModelGenerator.registerTrapdoor(SkyWoodBlocks.SKYWOOD_TRAPDOOR);

        /*blockStateModelGenerator.registerTintableCrossBlockState(SkyWoodBlocks.SKYWOOD_SAPLING,
                BlockStateModelGenerator.TintType.NOT_TINTED);*/
    }



    private void generateItemModelsAllScute(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ScuteItems.SCUTE_INGOT, Models.GENERATED);

        itemModelGenerator.register(ScuteItems.REINFORCED_SCUTE, Models.GENERATED);
        itemModelGenerator.register(ScuteItems.REINFORCED_SCUTE_INGOT, Models.GENERATED);

        itemModelGenerator.register(ScuteItems.HARDENED_SCUTE, Models.GENERATED);
        itemModelGenerator.register(ScuteItems.HARDENED_SCUTE_INGOT, Models.GENERATED);
    }

    private void generateItemModelsFood(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(FoodItems.RICE, Models.GENERATED);
        itemModelGenerator.register(FoodItems.BOWL_OF_RICE, Models.GENERATED);
        itemModelGenerator.register(FoodItems.COOKED_RICE, Models.GENERATED);
    }

    private void generateScuteToolsModelsFood(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ScuteTools.SCUTE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ScuteTools.SCUTE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ScuteTools.SCUTE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ScuteTools.SCUTE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ScuteTools.SCUTE_HOE, Models.HANDHELD);

        itemModelGenerator.register(ScuteTools.REINFORCED_SCUTE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ScuteTools.REINFORCED_SCUTE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ScuteTools.REINFORCED_SCUTE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ScuteTools.REINFORCED_SCUTE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ScuteTools.REINFORCED_SCUTE_HOE, Models.HANDHELD);

        itemModelGenerator.register(ScuteTools.HARDENED_SCUTE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ScuteTools.HARDENED_SCUTE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ScuteTools.HARDENED_SCUTE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ScuteTools.HARDENED_SCUTE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ScuteTools.HARDENED_SCUTE_HOE, Models.HANDHELD);
    }

    private void generateScuteArmorModelsFood(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.registerArmor(((ArmorItem)ScuteArmor.SCUTE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ScuteArmor.SCUTE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ScuteArmor.SCUTE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ScuteArmor.SCUTE_BOOTS));
        itemModelGenerator.register(ScuteArmor.SCUTE_HORSE_ARMOR, Models.GENERATED);

        itemModelGenerator.registerArmor(((ArmorItem)ScuteArmor.REINFORCED_SCUTE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ScuteArmor.REINFORCED_SCUTE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ScuteArmor.REINFORCED_SCUTE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ScuteArmor.REINFORCED_SCUTE_BOOTS));
        itemModelGenerator.register(ScuteArmor.REINFORCED_SCUTE_HORSE_ARMOR, Models.GENERATED);

        itemModelGenerator.registerArmor(((ArmorItem)ScuteArmor.HARDENED_SCUTE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ScuteArmor.HARDENED_SCUTE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ScuteArmor.HARDENED_SCUTE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ScuteArmor.HARDENED_SCUTE_BOOTS));
        itemModelGenerator.register(ScuteArmor.HARDENED_SCUTE_HORSE_ARMOR, Models.GENERATED);
    }

    private void generateItemModelsMisc(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(MiscItems.TORN_PAPER, Models.GENERATED);
    }
}
