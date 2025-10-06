package com.m4nd3l.moremc.datagen.lang;

import com.m4nd3l.moremc.block.blocks.ScuteBlocks;
import com.m4nd3l.moremc.block.blocks.trees.SkyWoodBlocks;
import com.m4nd3l.moremc.item.armor.ScuteArmor;
import com.m4nd3l.moremc.item.items.FoodItems;
import com.m4nd3l.moremc.item.items.MiscItems;
import com.m4nd3l.moremc.item.items.ScuteItems;
import com.m4nd3l.moremc.item.tools.ScuteTools;
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

        translationBuilder.add(ScuteTools.SCUTE_SWORD, "Scute sword");
        translationBuilder.add(ScuteTools.SCUTE_PICKAXE, "Scute pickaxe");
        translationBuilder.add(ScuteTools.SCUTE_AXE, "Scute axe");
        translationBuilder.add(ScuteTools.SCUTE_SHOVEL, "Scute shovel");
        translationBuilder.add(ScuteTools.SCUTE_HOE, "Scute hoe");

        translationBuilder.add(ScuteArmor.SCUTE_HELMET, "Scute helmet");
        translationBuilder.add(ScuteArmor.SCUTE_CHESTPLATE, "Scute chestplate");
        translationBuilder.add(ScuteArmor.SCUTE_LEGGINGS, "Scute leggings");
        translationBuilder.add(ScuteArmor.SCUTE_BOOTS, "Scute boots");
        translationBuilder.add(ScuteArmor.SCUTE_HORSE_ARMOR, "Scute horse armor");
    }

    public void generateReinforcedScuteTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ScuteItems.REINFORCED_SCUTE, "Reinforced scute");
        translationBuilder.add(ScuteItems.REINFORCED_SCUTE_INGOT, "Reinforced scute ingot");

        translationBuilder.add(ScuteBlocks.REINFORCED_SCUTE_BLOCK, "Reinforced scute block");
        translationBuilder.add(ScuteBlocks.REINFORCED_SCUTE_INGOT_BLOCK, "Reinforced scute ingot block");

        translationBuilder.add(ScuteTools.REINFORCED_SCUTE_SWORD, "Reinforced scute sword");
        translationBuilder.add(ScuteTools.REINFORCED_SCUTE_PICKAXE, "Reinforced scute pickaxe");
        translationBuilder.add(ScuteTools.REINFORCED_SCUTE_AXE, "Reinforced scute axe");
        translationBuilder.add(ScuteTools.REINFORCED_SCUTE_SHOVEL, "Reinforced scute shovel");
        translationBuilder.add(ScuteTools.REINFORCED_SCUTE_HOE, "Reinforced scute hoe");

        translationBuilder.add(ScuteArmor.REINFORCED_SCUTE_HELMET, "Reinforced scute helmet");
        translationBuilder.add(ScuteArmor.REINFORCED_SCUTE_CHESTPLATE, "Reinforced scute chestplate");
        translationBuilder.add(ScuteArmor.REINFORCED_SCUTE_LEGGINGS, "Reinforced scute leggings");
        translationBuilder.add(ScuteArmor.REINFORCED_SCUTE_BOOTS, "Reinforced scute boots");
        translationBuilder.add(ScuteArmor.REINFORCED_SCUTE_HORSE_ARMOR, "Reinforced scute horse armor");
    }

    public void generateHardenedScuteTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ScuteItems.HARDENED_SCUTE, "Hardened scute");
        translationBuilder.add(ScuteItems.HARDENED_SCUTE_INGOT, "Hardened scute ingot");

        translationBuilder.add(ScuteBlocks.HARDENED_SCUTE_BLOCK, "Hardened scute block");
        translationBuilder.add(ScuteBlocks.HARDENED_SCUTE_INGOT_BLOCK, "Hardened scute ingot block");

        translationBuilder.add(ScuteTools.HARDENED_SCUTE_SWORD, "Hardened scute sword");
        translationBuilder.add(ScuteTools.HARDENED_SCUTE_PICKAXE, "Hardened scute pickaxe");
        translationBuilder.add(ScuteTools.HARDENED_SCUTE_AXE, "Hardened scute axe");
        translationBuilder.add(ScuteTools.HARDENED_SCUTE_SHOVEL, "Hardened scute shovel");
        translationBuilder.add(ScuteTools.HARDENED_SCUTE_HOE, "Hardened scute hoe");

        translationBuilder.add(ScuteArmor.HARDENED_SCUTE_HELMET, "Hardened scute helmet");
        translationBuilder.add(ScuteArmor.HARDENED_SCUTE_CHESTPLATE, "Hardened scute chestplate");
        translationBuilder.add(ScuteArmor.HARDENED_SCUTE_LEGGINGS, "Hardened scute leggings");
        translationBuilder.add(ScuteArmor.HARDENED_SCUTE_BOOTS, "Hardened scute boots");
        translationBuilder.add(ScuteArmor.HARDENED_SCUTE_HORSE_ARMOR, "Hardened scute horse armor");
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
