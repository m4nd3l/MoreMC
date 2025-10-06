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

public class ModItalianLangProvider extends FabricLanguageProvider {

    public ModItalianLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "it_it", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        generateScuteTranslations(translationBuilder);
        generateReinforcedScuteTranslations(translationBuilder);
        generateHardenedScuteTranslations(translationBuilder);
        generateTreesTranslations(translationBuilder);
        generateMiscTranslations(translationBuilder);
        generateFoodTranslations(translationBuilder);
        generateItemGroupTranslations(translationBuilder);
        generateTooltipTranslations(translationBuilder);
    }

    public void generateScuteTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(Items.TURTLE_SCUTE, "Scuto di tartaruga");
        translationBuilder.add(ScuteItems.SCUTE_INGOT, "Lingotto di scuto di tartaruga");

        translationBuilder.add(ScuteBlocks.SCUTE_BLOCK, "Blocco di scuto di tartaruga");
        translationBuilder.add(ScuteBlocks.SCUTE_INGOT_BLOCK, "Blocco di lingotto di scuto di tartaruga");

        translationBuilder.add(ScuteTools.SCUTE_SWORD, "Spada di scuto di tartaruga");
        translationBuilder.add(ScuteTools.SCUTE_PICKAXE, "Piccone di scuto di tartaruga");
        translationBuilder.add(ScuteTools.SCUTE_AXE, "Ascia di scuto di tartaruga");
        translationBuilder.add(ScuteTools.SCUTE_SHOVEL, "Pala di scuto di tartaruga");
        translationBuilder.add(ScuteTools.SCUTE_HOE, "Zappa di scuto di tartaruga");

        translationBuilder.add(ScuteArmor.SCUTE_HELMET, "Elmo di scuto di tartaruga");
        translationBuilder.add(ScuteArmor.SCUTE_CHESTPLATE, "Corazza di scuto di tartaruga");
        translationBuilder.add(ScuteArmor.SCUTE_LEGGINGS, "Gambiere di scuto di tartaruga");
        translationBuilder.add(ScuteArmor.SCUTE_BOOTS, "Stivali di scuto di tartaruga");
        translationBuilder.add(ScuteArmor.SCUTE_HORSE_ARMOR, "Bardatura di scuto di tartaruga");
    }

    public void generateReinforcedScuteTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ScuteItems.REINFORCED_SCUTE, "Scuto di tartaruga rinforzato");
        translationBuilder.add(ScuteItems.REINFORCED_SCUTE_INGOT, "Lingotto di suto di tartaruga rinforzato");

        translationBuilder.add(ScuteBlocks.REINFORCED_SCUTE_BLOCK, "Blocco di scuto di tartaruga rinforzato");
        translationBuilder.add(ScuteBlocks.REINFORCED_SCUTE_INGOT_BLOCK, "Blocco di lingotto di scuto di tartaruga rinforzato");

        translationBuilder.add(ScuteTools.REINFORCED_SCUTE_SWORD, "Spada di scuto di tartaruga rinforzato");
        translationBuilder.add(ScuteTools.REINFORCED_SCUTE_PICKAXE, "Piccone di scuto di tartaruga rinforzato");
        translationBuilder.add(ScuteTools.REINFORCED_SCUTE_AXE, "Ascia di scuto di tartaruga rinforzato");
        translationBuilder.add(ScuteTools.REINFORCED_SCUTE_SHOVEL, "Pala di scuto di tartaruga rinforzato");
        translationBuilder.add(ScuteTools.REINFORCED_SCUTE_HOE, "Zappa di scuto di tartaruga rinforzato");

        translationBuilder.add(ScuteArmor.REINFORCED_SCUTE_HELMET, "Elmo di scuto di tartaruga rinforzato");
        translationBuilder.add(ScuteArmor.REINFORCED_SCUTE_CHESTPLATE, "Corazza di scuto di tartaruga rinforzato");
        translationBuilder.add(ScuteArmor.REINFORCED_SCUTE_LEGGINGS, "Gambiere di scuto di tartaruga rinforzato");
        translationBuilder.add(ScuteArmor.REINFORCED_SCUTE_BOOTS, "Stivali di scuto di tartaruga rinforzato");
        translationBuilder.add(ScuteArmor.REINFORCED_SCUTE_HORSE_ARMOR, "Bardatura di scuto di tartaruga rinforzato");
    }

    public void generateHardenedScuteTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ScuteItems.HARDENED_SCUTE, "Scuto di tartaruga indurito");
        translationBuilder.add(ScuteItems.HARDENED_SCUTE_INGOT, "Lingotto di scuto di Tartaruga indurito");

        translationBuilder.add(ScuteBlocks.HARDENED_SCUTE_BLOCK, "Blocco di scuto di Tartaruga indurito");
        translationBuilder.add(ScuteBlocks.HARDENED_SCUTE_INGOT_BLOCK, "Blocco di lingotto di scuto di tartaruga indurito");

        translationBuilder.add(ScuteTools.HARDENED_SCUTE_SWORD, "Spada di scuto di tartaruga indurito");
        translationBuilder.add(ScuteTools.HARDENED_SCUTE_PICKAXE, "Piccone di scuto di tartaruga indurito");
        translationBuilder.add(ScuteTools.HARDENED_SCUTE_AXE, "Ascia di scuto di tartaruga indurito");
        translationBuilder.add(ScuteTools.HARDENED_SCUTE_SHOVEL, "Pala di scuto di tartaruga indurito");
        translationBuilder.add(ScuteTools.HARDENED_SCUTE_HOE, "Zappa di scuto di tartaruga indurito");

        translationBuilder.add(ScuteArmor.HARDENED_SCUTE_HELMET, "Elmo di scuto di tartaruga indurito");
        translationBuilder.add(ScuteArmor.HARDENED_SCUTE_CHESTPLATE, "Corazza di scuto di tartaruga indurito");
        translationBuilder.add(ScuteArmor.HARDENED_SCUTE_LEGGINGS, "Gambiere di scuto di tartaruga indurito");
        translationBuilder.add(ScuteArmor.HARDENED_SCUTE_BOOTS, "Stivali di scuto di tartaruga indurito");
        translationBuilder.add(ScuteArmor.HARDENED_SCUTE_HORSE_ARMOR, "Bardatura di scuto di tartaruga indurito");
    }

    public void generateTreesTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(SkyWoodBlocks.SKYWOOD_LOG, "Tronco di legno del cielo");
        translationBuilder.add(SkyWoodBlocks.SKYWOOD_WOOD, "Legno del cielo");
        translationBuilder.add(SkyWoodBlocks.STRIPPED_SKYWOOD_LOG, "Tronco di legno del cielo scortecciato");
        translationBuilder.add(SkyWoodBlocks.STRIPPED_SKYWOOD_WOOD, "Legno del cielo scortecciato");
        translationBuilder.add(SkyWoodBlocks.SKYWOOD_LEAVES, "Foglie di legno del cielo");
        translationBuilder.add(SkyWoodBlocks.SKYWOOD_PLANKS, "Assi di legno del cielo");
        translationBuilder.add(SkyWoodBlocks.SKYWOOD_STAIRS, "Scalini di legno del cielo");
        translationBuilder.add(SkyWoodBlocks.SKYWOOD_SLAB, "Lastra di legno del cielo");
        translationBuilder.add(SkyWoodBlocks.SKYWOOD_BUTTON, "Pulsante di legno del cielo");
        translationBuilder.add(SkyWoodBlocks.SKYWOOD_PRESSURE_PLATE, "Pedana a pressione di legno del cielo");
        translationBuilder.add(SkyWoodBlocks.SKYWOOD_FENCE, "Staccionata di legno del cielo");
        translationBuilder.add(SkyWoodBlocks.SKYWOOD_FENCE_GATE, "Cancelletto di legno del cielo");
        translationBuilder.add(SkyWoodBlocks.SKYWOOD_TRAPDOOR, "Botola di legno del cielo");
        translationBuilder.add(SkyWoodBlocks.SKYWOOD_DOOR, "Porta di legno del cielo");
    }

    public void generateMiscTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(MiscItems.TORN_PAPER, "Carta strappata");
        translationBuilder.add(MiscItems.ANVIL_REPAIR, "Riparatore di incudini");
    }

    public void generateFoodTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(FoodItems.RICE, "Riso crudo");
        translationBuilder.add(FoodItems.BOWL_OF_RICE, "Ciotola di riso crudo");
        translationBuilder.add(FoodItems.COOKED_RICE, "Riso cotto");
    }

    public void generateItemGroupTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add("creativetab.moremc.scute_items_tab", "MoreMC - Scuto");
        translationBuilder.add("creativetab.moremc.building_tab", "MoreMC - Costruzione");
        translationBuilder.add("creativetab.moremc.trees", "MoreMC - Alberi");
        translationBuilder.add("creativetab.moremc.food", "MoreMC - Cibo");
        translationBuilder.add("creativetab.moremc.misc", "MoreMC - Varie");
    }

    public void generateTooltipTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add("tooltip.moremc.anvil_repair.shift",
                "§oTieni premuto §eShift§r per più §l§nInformazioni!");
        translationBuilder.add("tooltip.moremc.anvil_repair.tooltip",
                "Questo oggetto è usato per §6§riparare le incudini!");
        translationBuilder.add("tooltip.moremc.anvil_repair.tooltip1",
                "Attenzione! Lo potrai usare solo §l§n8 volte§r.");
    }
}
