package com.m4nd3l.moremc.datagen.lang;

import com.m4nd3l.moremc.block.blocks.ScuteBlocks;
import com.m4nd3l.moremc.block.blocks.trees.SkyWoodBlocks;
import com.m4nd3l.moremc.item.items.FoodItems;
import com.m4nd3l.moremc.item.items.MiscItems;
import com.m4nd3l.moremc.item.items.ScuteItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModEnglishLangProvider extends FabricLanguageProvider {

    public ModEnglishLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        generateScuteTranslations(translationBuilder);
        generateReinforcedScuteTranslations(translationBuilder);
        generateHardenedScuteTranslations(translationBuilder);
        generateMiscTranslations(translationBuilder);
        generateFoodTranslations(translationBuilder);
        generateItemGroupTranslations(translationBuilder);
        generateTooltipTranslations(translationBuilder);
        generateTreesTranslations(translationBuilder);
    }

    public void generateScuteTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(Items.TURTLE_SCUTE, "Turtle scute");
        translationBuilder.add(ScuteItems.SCUTE_INGOT, "Scute ingot");

        translationBuilder.add(ScuteBlocks.SCUTE_BLOCK, "Scute block");
        translationBuilder.add(ScuteBlocks.SCUTE_INGOT_BLOCK, "Scute ingot block");
    }

    public void generateReinforcedScuteTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ScuteItems.REINFORCED_SCUTE, "Reinforced scute");
        translationBuilder.add(ScuteItems.REINFORCED_SCUTE_INGOT, "Reinforced scute ingot");

        translationBuilder.add(ScuteBlocks.REINFORCED_SCUTE_BLOCK, "Reinforced scute block");
        translationBuilder.add(ScuteBlocks.REINFORCED_SCUTE_INGOT_BLOCK, "Reinforced scute ingot block");
    }

    public void generateHardenedScuteTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ScuteItems.HARDENED_SCUTE, "Hardened scute");
        translationBuilder.add(ScuteItems.HARDENED_SCUTE_INGOT, "Hardened scute ingot");

        translationBuilder.add(ScuteBlocks.HARDENED_SCUTE_BLOCK, "Hardened scute block");
        translationBuilder.add(ScuteBlocks.HARDENED_SCUTE_INGOT_BLOCK, "Hardened scute ingot block");
    }

    public void generateTreesTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(SkyWoodBlocks.SKYWOOD_LOG, "Skywood log");
        translationBuilder.add(SkyWoodBlocks.SKYWOOD_WOOD, "Skywood wood");
        translationBuilder.add(SkyWoodBlocks.STRIPPED_SKYWOOD_LOG, "Stripped skywood log");
        translationBuilder.add(SkyWoodBlocks.STRIPPED_SKYWOOD_WOOD, "Stripped skywood wood");
        translationBuilder.add(SkyWoodBlocks.SKYWOOD_LEAVES, "Skywood leaves");
        translationBuilder.add(SkyWoodBlocks.SKYWOOD_PLANKS, "Skywood planks");
        translationBuilder.add(SkyWoodBlocks.SKYWOOD_STAIRS, "Skywood stairs");
        translationBuilder.add(SkyWoodBlocks.SKYWOOD_SLAB, "Skywood slab");
        translationBuilder.add(SkyWoodBlocks.SKYWOOD_BUTTON, "Skywood button");
        translationBuilder.add(SkyWoodBlocks.SKYWOOD_PRESSURE_PLATE, "Skywood pressure plate");
        translationBuilder.add(SkyWoodBlocks.SKYWOOD_FENCE, "Skywood fence");
        translationBuilder.add(SkyWoodBlocks.SKYWOOD_FENCE_GATE, "Skywood fence gate");
        translationBuilder.add(SkyWoodBlocks.SKYWOOD_TRAPDOOR, "Skywood trapdoor");
        translationBuilder.add(SkyWoodBlocks.SKYWOOD_DOOR, "Skywood door");
    }

    public void generateMiscTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(MiscItems.TORN_PAPER, "Torn paper");
        translationBuilder.add(MiscItems.ANVIL_REPAIR, "Anvil repair tool");
    }

    public void generateFoodTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(FoodItems.RICE, "Raw rice");
        translationBuilder.add(FoodItems.BOWL_OF_RICE, "Bowl of raw rice");
        translationBuilder.add(FoodItems.COOKED_RICE, "Cooked rice");
    }

    public void generateItemGroupTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add("creativetab.moremc.scute_items_tab", "MoreMC - Scute");
        translationBuilder.add("creativetab.moremc.building_tab", "MoreMC - Building");
        translationBuilder.add("creativetab.moremc.trees", "MoreMC - Trees");
        translationBuilder.add("creativetab.moremc.food", "MoreMC - Food");
        translationBuilder.add("creativetab.moremc.misc", "MoreMC - Misc");
    }

    public void generateTooltipTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add("tooltip.moremc.anvil_repair.shift",
                "§oHold §eShift§r for more §l§nInformation!");
        translationBuilder.add("tooltip.moremc.anvil_repair.tooltip",
                "This item is used to §6§rrepair anvils!");
        translationBuilder.add("tooltip.moremc.anvil_repair.tooltip1",
                "Be careful! You can use it only §l§n8 times§r.");
    }
}
