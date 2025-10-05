package com.m4nd3l.moremc.datagen;

import com.m4nd3l.moremc.MoreMC;
import com.m4nd3l.moremc.block.blocks.ScuteBlocks;
import com.m4nd3l.moremc.block.blocks.trees.SkyWoodBlocks;
import com.m4nd3l.moremc.item.items.FoodItems;
import com.m4nd3l.moremc.item.items.MiscItems;
import com.m4nd3l.moremc.item.items.ScuteItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.SmokingRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

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
    }

    /**GENERATE TREES RECIPES*/
    public void generateTrees(RecipeExporter recipeExporter) {
        offerBaseTree(recipeExporter, SkyWoodBlocks.SKYWOOD_LOG, SkyWoodBlocks.SKYWOOD_WOOD,
                SkyWoodBlocks.STRIPPED_SKYWOOD_LOG, SkyWoodBlocks.STRIPPED_SKYWOOD_WOOD, SkyWoodBlocks.SKYWOOD_PLANKS,
                SkyWoodBlocks.SKYWOOD_STAIRS, SkyWoodBlocks.SKYWOOD_SLAB, SkyWoodBlocks.SKYWOOD_BUTTON,
                SkyWoodBlocks.SKYWOOD_PRESSURE_PLATE, SkyWoodBlocks.SKYWOOD_FENCE, SkyWoodBlocks.SKYWOOD_FENCE_GATE,
                SkyWoodBlocks.SKYWOOD_DOOR, SkyWoodBlocks.SKYWOOD_TRAPDOOR, "skywood");
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
                .offerTo(recipeExporter, MoreMC.MOD_ID + "anvil_repair");
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
                .group("planks")
                .criterion("has_logs", conditionsFromItem(from.asItem()))
                .group(group)
                .offerTo(exporter, MoreMC.MOD_ID + "_from_" + getUsableName(from) + "_to_" + getUsableName(planks));
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