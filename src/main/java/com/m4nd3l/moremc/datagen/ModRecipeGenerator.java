package com.m4nd3l.moremc.datagen;

import com.m4nd3l.moremc.MoreMC;
import com.m4nd3l.moremc.block.blocks.EnderiteBlocks;
import com.m4nd3l.moremc.block.blocks.ScuteBlocks;
import com.m4nd3l.moremc.block.blocks.trees.SkyWoodBlocks;
import com.m4nd3l.moremc.item.armor.EnderiteArmor;
import com.m4nd3l.moremc.item.armor.ScuteArmor;
import com.m4nd3l.moremc.item.items.EnderiteItems;
import com.m4nd3l.moremc.item.items.FoodItems;
import com.m4nd3l.moremc.item.items.MiscItems;
import com.m4nd3l.moremc.item.items.ScuteItems;
import com.m4nd3l.moremc.item.tools.EnderiteTools;
import com.m4nd3l.moremc.item.tools.ScuteTools;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.SmokingRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        generateScute(recipeExporter);
        generateReinforcedScute(recipeExporter);
        generateHardenedScute(recipeExporter);
        generateTrees(recipeExporter);
        generateFood(recipeExporter);
        generateMisc(recipeExporter);
    }


    /**GENERATE SCUTE RECIPES*/
    public void generateScute(RecipeExporter recipeExporter) {
        //Scute, Scute Block
        compactingRecipe(recipeExporter, RecipeCategory.MISC, Items.TURTLE_SCUTE,
                RecipeCategory.BUILDING_BLOCKS, ScuteBlocks.SCUTE_BLOCK);

        //Scute Ingot
        offerSmelting(recipeExporter, List.of(Items.TURTLE_SCUTE), RecipeCategory.MISC,
                ScuteItems.SCUTE_INGOT, 0.035f, 400, "scute");

        //Scute Ingot, Scute Ingot Block
        compactingRecipe(recipeExporter, RecipeCategory.MISC, ScuteItems.SCUTE_INGOT,
                RecipeCategory.BUILDING_BLOCKS, ScuteBlocks.SCUTE_INGOT_BLOCK);

        //Tools
        offerBaseToolsRecipe(recipeExporter, ScuteTools.SCUTE_SWORD, ScuteTools.SCUTE_PICKAXE,
                ScuteTools.SCUTE_AXE, ScuteTools.SCUTE_SHOVEL, ScuteTools.SCUTE_HOE, ScuteItems.SCUTE_INGOT,
                Items.STICK, "scute");

        //Armor
        offerBaseArmorRecipe(recipeExporter, ScuteArmor.SCUTE_HELMET, ScuteArmor.SCUTE_CHESTPLATE,
                ScuteArmor.SCUTE_LEGGINGS, ScuteArmor.SCUTE_BOOTS, ScuteItems.SCUTE_INGOT, "scute");

        //Trim
        offerTrimRecipe(recipeExporter, RecipeCategory.MISC, ScuteItems.TURTLED_SMITHING_TEMPLATE, ScuteBlocks.SCUTE_BLOCK, Items.DIAMOND);
        offerSmithingTrimRecipe(recipeExporter, ScuteItems.TURTLED_SMITHING_TEMPLATE, Identifier.of(MoreMC.MOD_ID, "turtled"));
    }

    /**GENERATE REINFORCED SCUTE RECIPES*/
    public void generateReinforcedScute(RecipeExporter recipeExporter) {

        //TO ADD: CUSTOM BLOCK ENTITY: 1 scute -> 1 reinforced scute

        //Reinforced Scute, Reinforced Scute Block
        compactingRecipe(recipeExporter, RecipeCategory.MISC, ScuteItems.REINFORCED_SCUTE,
                RecipeCategory.BUILDING_BLOCKS, ScuteBlocks.REINFORCED_SCUTE_BLOCK);

        //Reinforced Scute Ingot
        offerSmelting(recipeExporter, List.of(ScuteItems.REINFORCED_SCUTE), RecipeCategory.MISC,
                ScuteItems.REINFORCED_SCUTE_INGOT, 0.035f, 400, "reinforced_scute");

        //Reinforced Scute Ingot, Reinforced Scute Ingot Block
        compactingRecipe(recipeExporter, RecipeCategory.MISC, ScuteItems.REINFORCED_SCUTE_INGOT,
                RecipeCategory.BUILDING_BLOCKS, ScuteBlocks.REINFORCED_SCUTE_INGOT_BLOCK);

        //Tools
        offerBaseToolsRecipe(recipeExporter, ScuteTools.REINFORCED_SCUTE_SWORD, ScuteTools.REINFORCED_SCUTE_PICKAXE,
                ScuteTools.REINFORCED_SCUTE_AXE, ScuteTools.REINFORCED_SCUTE_SHOVEL, ScuteTools.REINFORCED_SCUTE_HOE,
                ScuteItems.REINFORCED_SCUTE_INGOT, Items.STICK, "reinforced_scute");

        //Armor
        offerBaseArmorRecipe(recipeExporter, ScuteArmor.REINFORCED_SCUTE_HELMET, ScuteArmor.REINFORCED_SCUTE_CHESTPLATE,
                ScuteArmor.REINFORCED_SCUTE_LEGGINGS, ScuteArmor.REINFORCED_SCUTE_BOOTS,
                ScuteItems.REINFORCED_SCUTE_INGOT, "reinforced_scute");
    }

    /**GENERATE HARDENED SCUTE RECIPES*/
    public void generateHardenedScute(RecipeExporter recipeExporter) {

        //TO ADD: CUSTOM BLOCK ENTITY: 1 reinforced scute -> 1 hardened scute

        //Hardened Scute, Hardened Scute Block
        compactingRecipe(recipeExporter, RecipeCategory.MISC, ScuteItems.HARDENED_SCUTE,
                RecipeCategory.BUILDING_BLOCKS, ScuteBlocks.HARDENED_SCUTE_BLOCK);

        //Hardened Scute Ingot
        offerSmelting(recipeExporter, List.of(ScuteItems.HARDENED_SCUTE), RecipeCategory.MISC,
                ScuteItems.HARDENED_SCUTE_INGOT, 0.035f, 400, "hardened_scute");

        //Hardened Scute Ingot, Hardened Scute Ingot Block
        compactingRecipe(recipeExporter, RecipeCategory.MISC, ScuteItems.HARDENED_SCUTE_INGOT,
                RecipeCategory.BUILDING_BLOCKS, ScuteBlocks.HARDENED_SCUTE_INGOT_BLOCK);

        //Tools
        offerBaseToolsRecipe(recipeExporter, ScuteTools.HARDENED_SCUTE_SWORD, ScuteTools.HARDENED_SCUTE_PICKAXE,
                ScuteTools.HARDENED_SCUTE_AXE, ScuteTools.HARDENED_SCUTE_SHOVEL, ScuteTools.HARDENED_SCUTE_HOE,
                ScuteItems.HARDENED_SCUTE_INGOT, Items.STICK, "hardened_scute");

        //Armor
        offerBaseArmorRecipe(recipeExporter, ScuteArmor.HARDENED_SCUTE_HELMET, ScuteArmor.HARDENED_SCUTE_CHESTPLATE,
                ScuteArmor.HARDENED_SCUTE_LEGGINGS, ScuteArmor.HARDENED_SCUTE_BOOTS,
                ScuteItems.HARDENED_SCUTE_INGOT, "hardened_scute");
    }

    /**GENERATE HARDENED SCUTE RECIPES*/
    public void generateEnderiteRecipes(RecipeExporter recipeExporter) {
        //Raw
        compactingRecipe(recipeExporter, RecipeCategory.MISC, EnderiteItems.RAW_ENDERITE,
                RecipeCategory.BUILDING_BLOCKS, EnderiteBlocks.RAW_ENDERITE_BLOCK);

        //Ingot
        compactingRecipe(recipeExporter, RecipeCategory.MISC, EnderiteItems.ENDERITE_INGOT,
                RecipeCategory.BUILDING_BLOCKS, EnderiteBlocks.ENDERITE_BLOCK);

        //Ingot
        offerSmelting(recipeExporter, List.of(EnderiteItems.RAW_ENDERITE), RecipeCategory.MISC,
                EnderiteItems.ENDERITE_INGOT, 0.3f, 200, "enderite");

        //Tools
        offerBaseToolsRecipe(recipeExporter, EnderiteTools.ENDERITE_SWORD, EnderiteTools.ENDERITE_PICKAXE,
                EnderiteTools.ENDERITE_AXE, EnderiteTools.ENDERITE_SHOVEL, EnderiteTools.ENDERITE_HOE,
                EnderiteItems.ENDERITE_INGOT, Items.STICK, "enderite");

        //Armor
        offerBaseArmorRecipe(recipeExporter, EnderiteArmor.ENDERITE_HELMET, EnderiteArmor.ENDERITE_CHESTPLATE,
                EnderiteArmor.ENDERITE_LEGGINGS, EnderiteArmor.ENDERITE_BOOTS, EnderiteItems.ENDERITE_INGOT, "enderite");
    }

    /**GENERATE TREES RECIPES*/
    public void generateTrees(RecipeExporter recipeExporter) {
        offerBaseTree(recipeExporter, SkyWoodBlocks.SKYWOOD_LOG, SkyWoodBlocks.SKYWOOD_WOOD,
                SkyWoodBlocks.STRIPPED_SKYWOOD_LOG, SkyWoodBlocks.STRIPPED_SKYWOOD_WOOD, SkyWoodBlocks.SKYWOOD_PLANKS,
                SkyWoodBlocks.SKYWOOD_STAIRS, SkyWoodBlocks.SKYWOOD_SLAB, SkyWoodBlocks.SKYWOOD_BUTTON,
                SkyWoodBlocks.SKYWOOD_PRESSURE_PLATE, SkyWoodBlocks.SKYWOOD_FENCE, SkyWoodBlocks.SKYWOOD_FENCE_GATE,
                SkyWoodBlocks.SKYWOOD_DOOR, SkyWoodBlocks.SKYWOOD_TRAPDOOR, "skywood");

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, SkyWoodBlocks.SKYWOOD_LAMP.asItem())
                .pattern("#|#")
                .pattern("#-#")
                .pattern("#|#")
                .input('#', SkyWoodBlocks.SKYWOOD_PLANKS.asItem())
                .input('-', Blocks.REDSTONE_LAMP.asItem())
                .input('|', Blocks.REDSTONE_BLOCK.asItem())
                .criterion(hasItem(SkyWoodBlocks.SKYWOOD_PLANKS.asItem()), conditionsFromItem(SkyWoodBlocks.SKYWOOD_PLANKS.asItem()))
                .criterion(hasItem(Blocks.REDSTONE_LAMP.asItem()), conditionsFromItem(Blocks.REDSTONE_LAMP.asItem()))
                .criterion(hasItem(Blocks.REDSTONE_BLOCK.asItem()), conditionsFromItem(Blocks.REDSTONE_BLOCK.asItem()))
                .offerTo(recipeExporter, MoreMC.MOD_ID + "_from_" + getUsableName(SkyWoodBlocks.SKYWOOD_PLANKS)
                        + "_and_" + getUsableName(Blocks.REDSTONE_LAMP) + "_and_" + getUsableName(Blocks.REDSTONE_BLOCK)
                        + "_to_" + getUsableName(SkyWoodBlocks.SKYWOOD_LAMP));
    }

    /**GENERATE FOOD RECIPES*/
    public void generateFood(RecipeExporter recipeExporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, FoodItems.BOWL_OF_RICE)
                .input(FoodItems.RICE)
                .input(Items.BOWL)
                .criterion(hasItem(Items.BOWL), conditionsFromItem(Items.BOWL))
                .criterion(hasItem(FoodItems.RICE), conditionsFromItem(FoodItems.RICE))
                .offerTo(recipeExporter, MoreMC.MOD_ID + "_from_rice_to_bowl-of-rice");

        offerSmelting(recipeExporter, List.of(FoodItems.BOWL_OF_RICE), RecipeCategory.FOOD,
                FoodItems.COOKED_RICE, 0.035f, 200, "rice");

        offerSmoking(recipeExporter, List.of(FoodItems.BOWL_OF_RICE), RecipeCategory.FOOD,
                FoodItems.COOKED_RICE, 0.06f, 100, "rice");

    }

    /**GENERATE MISC RECIPES*/
    public void generateMisc(RecipeExporter recipeExporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, MiscItems.TORN_PAPER, 6)
                .input(Items.PAPER)
                .criterion(hasItem(Items.PAPER), conditionsFromItem(Items.PAPER))
                .offerTo(recipeExporter, MoreMC.MOD_ID + "_from_paper_to_torn-paper");

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, MiscItems.ANVIL_REPAIR)
                .pattern("###")
                .pattern("#|#")
                .pattern(" | ")
                .input('#', Items.IRON_INGOT)
                .input('|', Items.STICK)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(recipeExporter, MoreMC.MOD_ID + "_anvil_repair");
    }

    public void offerSmoking(RecipeExporter exporter, List<ItemConvertible> inputs, RecipeCategory category,
                            ItemConvertible output, float experience, int cookingTime, String group) {
        offerMultipleOptions(exporter, RecipeSerializer.SMOKING, SmokingRecipe::new, inputs,
                category, output, experience, cookingTime, group, "_from_smoking");
    }

    public void offerBaseTree(RecipeExporter exporter, Block log, Block wood,
                              Block stripped_log, Block stripped_wood, Block planks,
                              Block stairs, Block slab, Block button, Block pressurePlate,
                              Block fence, Block fenceGate, Block door, Block trapdoor, String group) {
        //Planks from log
        offerPlanksRecipeFromXWithCustomName(exporter, log, planks, group);

        //Planks from wood
        offerPlanksRecipeFromXWithCustomName(exporter, wood, planks, group);

        //Planks from stripped log
        offerPlanksRecipeFromXWithCustomName(exporter, stripped_log, planks, group);

        //Planks from stripped wood
        offerPlanksRecipeFromXWithCustomName(exporter, stripped_wood, planks, group);

        //Wood from log
        offerBarkBlockRecipe(exporter, wood, log);

        //Stripped wood from stripped log
        offerBarkBlockRecipe(exporter, stripped_wood, stripped_log);

        //Stairs
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, stairs.asItem())
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', planks.asItem())
                .criterion(hasItem(planks.asItem()), conditionsFromItem(planks.asItem()))
                .offerTo(exporter, MoreMC.MOD_ID + "_from_" + getUsableName(planks) + "_to_" + getUsableName(stairs));


        //Slab
        offerSlabRecipeWood(exporter, RecipeCategory.BUILDING_BLOCKS, planks, slab);

        //Button
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, button.asItem(), 1)
                .input(planks)
                .group(group)
                .criterion(hasItem(planks.asItem()), conditionsFromItem(planks.asItem()))
                .offerTo(exporter, MoreMC.MOD_ID + "_from_" + getUsableName(planks) + "_to_" + getUsableName(button));

        //Pressure Plate
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, pressurePlate.asItem())
                .pattern("__")
                .input('_', planks.asItem())
                .criterion(hasItem(planks.asItem()), conditionsFromItem(planks.asItem()))
                .offerTo(exporter, MoreMC.MOD_ID + "_from_" + getUsableName(planks) + "_to_" + getUsableName(pressurePlate));

        //Fence
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, fence.asItem())
                .pattern("#|#")
                .pattern("#|#")
                .input('#', planks.asItem())
                .input('|', Items.STICK.asItem())
                .criterion(hasItem(planks.asItem()), conditionsFromItem(planks.asItem()))
                .criterion(hasItem(Items.STICK.asItem()), conditionsFromItem(Items.STICK.asItem()))
                .offerTo(exporter, MoreMC.MOD_ID + "_from_" + getUsableName(planks) + "_to_" + getUsableName(fence));

        //Fence
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, fenceGate.asItem())
                .pattern("|#|")
                .pattern("|#|")
                .input('#', planks.asItem())
                .input('|', Items.STICK.asItem())
                .criterion(hasItem(planks.asItem()), conditionsFromItem(planks.asItem()))
                .criterion(hasItem(Items.STICK.asItem()), conditionsFromItem(Items.STICK.asItem()))
                .offerTo(exporter, MoreMC.MOD_ID + "_from_" + getUsableName(planks) + "_to_" + getUsableName(fenceGate));

        //Door
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, door.asItem())
                .pattern("##")
                .pattern("##")
                .input('#', planks.asItem())
                .criterion(hasItem(planks.asItem()), conditionsFromItem(planks.asItem()))
                .offerTo(exporter, MoreMC.MOD_ID + "_from_" + getUsableName(planks) + "_to_" + getUsableName(door));

        //Door
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, trapdoor.asItem())
                .pattern("###")
                .pattern("###")
                .input('#', planks.asItem())
                .criterion(hasItem(planks.asItem()), conditionsFromItem(planks.asItem()))
                .offerTo(exporter, MoreMC.MOD_ID + "_from_" + getUsableName(planks) + "_to_" + getUsableName(trapdoor));
    }

    public void offerBaseToolsRecipe(RecipeExporter recipeExporter, Item sword, Item pickaxe, Item axe,
                                     Item shovel, Item hoe, ItemConvertible material, ItemConvertible stick, String group) {
        //Sword
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, sword.asItem())
                .pattern("-")
                .pattern("-")
                .pattern("|")
                .input('|', stick.asItem())
                .input('-', material.asItem())
                .group(group)
                .criterion(hasItem(material.asItem()), conditionsFromItem(material.asItem()))
                .criterion(hasItem(stick.asItem()), conditionsFromItem(stick.asItem()))
                .offerTo(recipeExporter, MoreMC.MOD_ID + "_from_" + getUsableName(stick)
                        + "_and_" + getUsableName(material) + "_to_" + getUsableName(sword));

        //Pickaxe
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, pickaxe.asItem())
                .pattern("---")
                .pattern(" | ")
                .pattern(" | ")
                .input('|', stick.asItem())
                .input('-', material.asItem())
                .group(group)
                .criterion(hasItem(material.asItem()), conditionsFromItem(material.asItem()))
                .criterion(hasItem(stick.asItem()), conditionsFromItem(stick.asItem()))
                .offerTo(recipeExporter, MoreMC.MOD_ID + "_from_" + getUsableName(stick)
                        + "_and_" + getUsableName(material) + "_to_" + getUsableName(pickaxe));

        //Axe
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, axe.asItem())
                .pattern(" --")
                .pattern(" |-")
                .pattern(" | ")
                .input('|', stick.asItem())
                .input('-', material.asItem())
                .group(group)
                .criterion(hasItem(material.asItem()), conditionsFromItem(material.asItem()))
                .criterion(hasItem(stick.asItem()), conditionsFromItem(stick.asItem()))
                .offerTo(recipeExporter, MoreMC.MOD_ID + "_from_" + getUsableName(stick)
                        + "_and_" + getUsableName(material) + "_to_" + getUsableName(axe));

        //Axe
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, axe.asItem())
                .pattern("-- ")
                .pattern("-| ")
                .pattern(" | ")
                .input('|', stick.asItem())
                .input('-', material.asItem())
                .group(group)
                .criterion(hasItem(material.asItem()), conditionsFromItem(material.asItem()))
                .criterion(hasItem(stick.asItem()), conditionsFromItem(stick.asItem()))
                .offerTo(recipeExporter, MoreMC.MOD_ID + "_from_" + getUsableName(stick)
                        + "_and_" + getUsableName(material) + "_to_" + getUsableName(axe) + "_other_side");

        //Shovel
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, shovel.asItem())
                .pattern(" - ")
                .pattern(" | ")
                .pattern(" | ")
                .input('|', stick.asItem())
                .input('-', material.asItem())
                .group(group)
                .criterion(hasItem(material.asItem()), conditionsFromItem(material.asItem()))
                .criterion(hasItem(stick.asItem()), conditionsFromItem(stick.asItem()))
                .offerTo(recipeExporter, MoreMC.MOD_ID + "_from_" + getUsableName(stick)
                        + "_and_" + getUsableName(material) + "_to_" + getUsableName(shovel));

        //Hoe
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, hoe.asItem())
                .pattern("-- ")
                .pattern(" | ")
                .pattern(" | ")
                .input('|', stick.asItem())
                .input('-', material.asItem())
                .group(group)
                .criterion(hasItem(material.asItem()), conditionsFromItem(material.asItem()))
                .criterion(hasItem(stick.asItem()), conditionsFromItem(stick.asItem()))
                .offerTo(recipeExporter, MoreMC.MOD_ID + "_from_" + getUsableName(stick)
                        + "_and_" + getUsableName(material) + "_to_" + getUsableName(hoe));

        //Hoe
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, hoe.asItem())
                .pattern(" --")
                .pattern(" | ")
                .pattern(" | ")
                .input('|', stick.asItem())
                .input('-', material.asItem())
                .group(group)
                .criterion(hasItem(material.asItem()), conditionsFromItem(material.asItem()))
                .criterion(hasItem(stick.asItem()), conditionsFromItem(stick.asItem()))
                .offerTo(recipeExporter, MoreMC.MOD_ID + "_from_" + getUsableName(stick)
                        + "_and_" + getUsableName(material) + "_to_" + getUsableName(hoe) + "_other_side");

    }

    public void offerBaseArmorRecipe(RecipeExporter recipeExporter, Item helmet, Item chestplate, Item leggings,
                                     Item boots, ItemConvertible material, String group) {
        //Helmet
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, helmet.asItem())
                .pattern("---")
                .pattern("- -")
                .input('-', material.asItem())
                .group(group)
                .criterion(hasItem(material.asItem()), conditionsFromItem(material.asItem()))
                .offerTo(recipeExporter, MoreMC.MOD_ID + "_from_" + getUsableName(material)
                        + "_to_" + getUsableName(helmet));

        //Chestplate
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, chestplate.asItem())
                .pattern("- -")
                .pattern("---")
                .pattern("---")
                .input('-', material.asItem())
                .group(group)
                .criterion(hasItem(material.asItem()), conditionsFromItem(material.asItem()))
                .offerTo(recipeExporter, MoreMC.MOD_ID + "_from_" + getUsableName(material)
                        + "_to_" + getUsableName(chestplate));

        //Leggings
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, leggings.asItem())
                .pattern("---")
                .pattern("- -")
                .pattern("- -")
                .input('-', material.asItem())
                .group(group)
                .criterion(hasItem(material.asItem()), conditionsFromItem(material.asItem()))
                .offerTo(recipeExporter, MoreMC.MOD_ID + "_from_" + getUsableName(material)
                        + "_to_" + getUsableName(leggings));

        //Boots
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, boots.asItem())
                .pattern("- -")
                .pattern("- -")
                .input('-', material.asItem())
                .group(group)
                .criterion(hasItem(material.asItem()), conditionsFromItem(material.asItem()))
                .offerTo(recipeExporter, MoreMC.MOD_ID + "_from_" + getUsableName(material)
                        + "_to_" + getUsableName(boots));
    }

    public void compactingRecipe(RecipeExporter recipeExporter, RecipeCategory itemCategory, ItemConvertible diamond,
                                 RecipeCategory blockCategory, ItemConvertible diamondBlock) {

        ShapedRecipeJsonBuilder.create(itemCategory, diamondBlock.asItem())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', diamond)
                .criterion(hasItem(diamond.asItem()), conditionsFromItem(diamond.asItem()))
                .offerTo(recipeExporter, MoreMC.MOD_ID + "_from_" + getUsableName(diamond) + "_to_" + getUsableName(diamondBlock));

        ShapelessRecipeJsonBuilder.create(blockCategory, diamond.asItem(), 9)
                .input(diamondBlock.asItem())
                .criterion(hasItem(diamondBlock.asItem()), conditionsFromItem(diamondBlock.asItem()))
                .offerTo(recipeExporter, MoreMC.MOD_ID + "_from_" + getUsableName(diamondBlock) + "_to_" + getUsableName(diamond));
    }

    public void offerPlanksRecipeFromXWithCustomName(RecipeExporter exporter, Block from, Block planks, String group) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, planks.asItem(), 4)
                .input(from)
                .group(group)
                .criterion("has_logs", conditionsFromItem(from.asItem()))
                .offerTo(exporter, MoreMC.MOD_ID + "_from_" + getUsableName(from) + "_to_" + getUsableName(planks));
    }

    public void offerTrimRecipe(RecipeExporter exporter, RecipeCategory category, ItemConvertible trim, ItemConvertible material, ItemConvertible around) {
        ShapedRecipeJsonBuilder.create(category, trim.asItem(), 2)
                .pattern("|-|")
                .pattern("|#|")
                .pattern("|||")
                .input('-', trim.asItem())
                .input('#', material.asItem())
                .input('|', around.asItem())
                .criterion(hasItem(trim.asItem()), conditionsFromItem(trim.asItem()))
                .criterion(hasItem(material.asItem()), conditionsFromItem(material.asItem()))
                .criterion(hasItem(around.asItem()), conditionsFromItem(around.asItem()))
                .offerTo(exporter, MoreMC.MOD_ID + "_from_" + getUsableName(trim) + "_and_" + getUsableName(material)
                        + "_and_" + getUsableName(around) + "_to_two_" + getUsableName(trim));
    }

    public void offerSlabRecipeWood(RecipeExporter exporter, RecipeCategory category, ItemConvertible input, ItemConvertible output) {
        createSlabRecipe(category, output, Ingredient.ofItems(input)).criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter, MoreMC.MOD_ID + "_from_" + getUsableName(input) + "_to_"
                        + getUsableName(output) + "_slab_recipe");
    }

    public String getUsableName(ItemConvertible item) {
        return item.asItem().getName().getString().toLowerCase().replace(" ", "-");
    }
}