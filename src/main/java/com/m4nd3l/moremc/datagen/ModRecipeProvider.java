package com.m4nd3l.moremc.datagen;

import com.m4nd3l.moremc.MoreMC;
import com.m4nd3l.moremc.blocks.ModBlocks;
import com.m4nd3l.moremc.items.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.SmeltingRecipe;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {



        //SCUTE

        //9 TURTLE SCUTE -> 1 SCUTE BLOCK
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.TURTLE_SCUTE, 9)
                .requires(ModBlocks.SCUTE_BLOCK.get())
                .unlockedBy("got_scute", has(ModBlocks.SCUTE_BLOCK.get())).save(pRecipeOutput);


        //SCUTE BLOCK -> 9 TURTLE SCUTE
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SCUTE_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Items.TURTLE_SCUTE)
                .unlockedBy("got_scute", has(Items.TURTLE_SCUTE)).save(pRecipeOutput);


        //1 SCUTE INGOT -> 1 TURTLE SCUTE
        SimpleCookingRecipeBuilder.smelting(
                Ingredient.of(Items.TURTLE_SCUTE),
                RecipeCategory.MISC,
                ModItems.SCUTE_INGOT.get(),
                0.05f,
                400)
                .unlockedBy("got_scute", has(Items.TURTLE_SCUTE)).save(pRecipeOutput);


        // 9 SCUTE INGOT -> 1 SCUTE INGOT BLOCK
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SCUTE_INGOT.get(), 9)
                .requires(ModBlocks.SCUTE_INGOT_BLOCK.get())
                .unlockedBy("got_scute", has(ModBlocks.SCUTE_INGOT_BLOCK.get()))
                .save(pRecipeOutput, MoreMC.MOD_ID + ":scute_ingot_from_block");


        // SCUTE INGOT BLOCK -> 9 SCUTE INGOT
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SCUTE_INGOT_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.SCUTE_INGOT.get())
                .unlockedBy("got_scute", has(ModItems.SCUTE_INGOT.get())).save(pRecipeOutput);
        //
        //
        //
        //
        // REINFORCED SCUTE

        //CUSTOM BLOCK ENTITY PER 1 TURTLE SCUTE -> 1 REINFORCED SCUTE


        //9 REINFORCED SCUTE -> 1 REINFORCED SCUTE BLOCK
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.REINFORCED_SCUTE.get(), 9)
                .requires(ModBlocks.REINFORCED_SCUTE_BLOCK.get())
                .unlockedBy("got_scute", has(ModBlocks.REINFORCED_SCUTE_BLOCK.get()))
                .save(pRecipeOutput, MoreMC.MOD_ID + ":reinforced_scute_from_block");


        //REINFORCED SCUTE BLOCK -> 9 REINFORCED SCUTE
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.REINFORCED_SCUTE_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.REINFORCED_SCUTE.get())
                .unlockedBy("got_scute", has(ModItems.REINFORCED_SCUTE.get())).save(pRecipeOutput);


        //1 REINFORCED SCUTE INGOT -> 1 REINFORCED SCUTE
        SimpleCookingRecipeBuilder.smelting(
                        Ingredient.of(ModItems.REINFORCED_SCUTE.get()),
                        RecipeCategory.MISC,
                        ModItems.REINFORCED_SCUTE_INGOT.get(),
                        0.05f,
                        400)
                .unlockedBy("got_scute", has(ModItems.REINFORCED_SCUTE.get())).save(pRecipeOutput);


        // 9 REINFORCED SCUTE INGOT -> 1 REINFORCED SCUTE INGOT BLOCK
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.REINFORCED_SCUTE_INGOT.get(), 9)
                .requires(ModBlocks.REINFORCED_SCUTE_INGOT_BLOCK.get())
                .unlockedBy("got_scute", has(ModBlocks.REINFORCED_SCUTE_INGOT_BLOCK.get()))
                .save(pRecipeOutput, MoreMC.MOD_ID + ":reinforced_scute_ingot_from_block");


        // SCUTE INGOT BLOCK -> 9 SCUTE INGOT
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.REINFORCED_SCUTE_INGOT_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.REINFORCED_SCUTE_INGOT.get())
                .unlockedBy("got_scute", has(ModItems.REINFORCED_SCUTE_INGOT.get())).save(pRecipeOutput);
        //
        //
        //
        //
        // HARDENED SCUTE


        //CUSTOM BLOCK ENTITY PER 1 REINFORCED  SCUTE -> 1 HARDENED SCUTE


        //9 HARDENED SCUTE -> 1 HARDENED SCUTE BLOCK
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.HARDENED_SCUTE.get(), 9)
                .requires(ModBlocks.HARDENED_SCUTE_BLOCK.get())
                .unlockedBy("got_scute", has(ModBlocks.HARDENED_SCUTE_BLOCK.get()))
                .save(pRecipeOutput, MoreMC.MOD_ID + ":hardened_scute_from_block");


        //HARDENED SCUTE BLOCK -> 9 HARDENED SCUTE
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.HARDENED_SCUTE_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.HARDENED_SCUTE.get())
                .unlockedBy("got_scute", has(ModItems.HARDENED_SCUTE.get())).save(pRecipeOutput);


        //1 HARDENED SCUTE INGOT -> 1 HARDENED SCUTE
        SimpleCookingRecipeBuilder.smelting(
                        Ingredient.of(ModItems.HARDENED_SCUTE.get()),
                        RecipeCategory.MISC,
                        ModItems.HARDENED_SCUTE_INGOT.get(),
                        0.05f,
                        600)
                .unlockedBy("got_scute", has(ModItems.HARDENED_SCUTE.get())).save(pRecipeOutput);


        // 9 HARDENED SCUTE INGOT -> 1 HARDENED SCUTE INGOT BLOCK
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.HARDENED_SCUTE_INGOT.get(), 9)
                .requires(ModBlocks.HARDENED_SCUTE_INGOT_BLOCK.get())
                .unlockedBy("got_scute", has(ModBlocks.HARDENED_SCUTE_INGOT_BLOCK.get()))
                .save(pRecipeOutput, MoreMC.MOD_ID + ":hardened_scute_ingot_from_block");


        // SCUTE INGOT BLOCK -> 9 SCUTE INGOT
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.HARDENED_SCUTE_INGOT_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.HARDENED_SCUTE_INGOT.get())
                .unlockedBy("got_scute", has(ModItems.HARDENED_SCUTE_INGOT.get())).save(pRecipeOutput);
        //
        //
        //
        //
        // SCUTE TOOLS

        //SCUTE SWORD -> 2 SCUTE INGOT + 1 STICK
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.SCUTE_SWORD.get())
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" | ")
                .define('#', ModItems.SCUTE_INGOT.get())
                .define('|', Items.STICK)
                .unlockedBy("got_scute", has(ModItems.SCUTE_INGOT.get()))
                .unlockedBy("has_stick", has(Items.STICK)).save(pRecipeOutput);


        //SCUTE PICKAXE -> 3 SCUTE INGOT + 2 STICK
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.SCUTE_PICKAXE.get())
                .pattern("###")
                .pattern(" | ")
                .pattern(" | ")
                .define('#', ModItems.SCUTE_INGOT.get())
                .define('|', Items.STICK)
                .unlockedBy("got_scute", has(ModItems.SCUTE_INGOT.get()))
                .unlockedBy("has_stick", has(Items.STICK)).save(pRecipeOutput);


        //SCUTE AXE -> 3 SCUTE INGOT + 2 STICK
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.SCUTE_AXE.get())
                .pattern(" ##")
                .pattern(" |#")
                .pattern(" | ")
                .define('#', ModItems.SCUTE_INGOT.get())
                .define('|', Items.STICK)
                .unlockedBy("got_scute", has(ModItems.SCUTE_INGOT.get()))
                .unlockedBy("has_stick", has(Items.STICK)).save(pRecipeOutput);


        //SCUTE SHOVEL -> 1 SCUTE INGOT + 2 STICK
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.SCUTE_SHOVEL.get())
                .pattern(" # ")
                .pattern(" | ")
                .pattern(" | ")
                .define('#', ModItems.SCUTE_INGOT.get())
                .define('|', Items.STICK)
                .unlockedBy("got_scute", has(ModItems.SCUTE_INGOT.get()))
                .unlockedBy("has_stick", has(Items.STICK)).save(pRecipeOutput);


        //SCUTE HOE -> 2 SCUTE INGOT + 2 STICK
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.SCUTE_HOE.get())
                .pattern(" ##")
                .pattern(" | ")
                .pattern(" | ")
                .define('#', ModItems.SCUTE_INGOT.get())
                .define('|', Items.STICK)
                .unlockedBy("got_scute", has(ModItems.SCUTE_INGOT.get()))
                .unlockedBy("has_stick", has(Items.STICK)).save(pRecipeOutput);
        //
        //
        //
        //
        // REINFORCED SCUTE TOOLS

        //REINFORCED SCUTE SWORD -> 2 SCUTE INGOT + 1 STICK
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.REINFORCED_SCUTE_SWORD.get())
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" | ")
                .define('#', ModItems.REINFORCED_SCUTE_INGOT.get())
                .define('|', Items.STICK)
                .unlockedBy("got_scute", has(ModItems.REINFORCED_SCUTE_INGOT.get()))
                .unlockedBy("has_stick", has(Items.STICK)).save(pRecipeOutput);


        //REINFORCED SCUTE PICKAXE -> 3 REINFORCED SCUTE INGOT + 2 STICK
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.REINFORCED_SCUTE_PICKAXE.get())
                .pattern("###")
                .pattern(" | ")
                .pattern(" | ")
                .define('#', ModItems.REINFORCED_SCUTE_INGOT.get())
                .define('|', Items.STICK)
                .unlockedBy("got_scute", has(ModItems.REINFORCED_SCUTE_INGOT.get()))
                .unlockedBy("has_stick", has(Items.STICK)).save(pRecipeOutput);


        //REINFORCED SCUTE AXE -> 3 REINFORCED SCUTE INGOT + 2 STICK
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.REINFORCED_SCUTE_AXE.get())
                .pattern(" ##")
                .pattern(" |#")
                .pattern(" | ")
                .define('#', ModItems.REINFORCED_SCUTE_INGOT.get())
                .define('|', Items.STICK)
                .unlockedBy("got_scute", has(ModItems.REINFORCED_SCUTE_INGOT.get()))
                .unlockedBy("has_stick", has(Items.STICK)).save(pRecipeOutput);


        //REINFORCED SCUTE SHOVEL -> 1 REINFORCED SCUTE INGOT + 2 STICK
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.REINFORCED_SCUTE_SHOVEL.get())
                .pattern(" # ")
                .pattern(" | ")
                .pattern(" | ")
                .define('#', ModItems.REINFORCED_SCUTE_INGOT.get())
                .define('|', Items.STICK)
                .unlockedBy("got_scute", has(ModItems.REINFORCED_SCUTE_INGOT.get()))
                .unlockedBy("has_stick", has(Items.STICK)).save(pRecipeOutput);


        //REINFORCED SCUTE HOE -> 2 REINFORCED SCUTE INGOT + 2 STICK
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.REINFORCED_SCUTE_HOE.get())
                .pattern(" ##")
                .pattern(" | ")
                .pattern(" | ")
                .define('#', ModItems.REINFORCED_SCUTE_INGOT.get())
                .define('|', Items.STICK)
                .unlockedBy("got_scute", has(ModItems.REINFORCED_SCUTE_INGOT.get()))
                .unlockedBy("has_stick", has(Items.STICK)).save(pRecipeOutput);
        //
        //
        //
        //
        // HARDENED SCUTE TOOLS

        //HARDENED SCUTE SWORD -> 2 HARDENED SCUTE INGOT + 1 STICK
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.HARDENED_SCUTE_SWORD.get())
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" | ")
                .define('#', ModItems.HARDENED_SCUTE_INGOT.get())
                .define('|', Items.STICK)
                .unlockedBy("got_scute", has(ModItems.HARDENED_SCUTE_INGOT.get()))
                .unlockedBy("has_stick", has(Items.STICK)).save(pRecipeOutput);


        //HARDENED SCUTE PICKAXE -> 3 HARDENED SCUTE INGOT + 2 STICK
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.HARDENED_SCUTE_PICKAXE.get())
                .pattern("###")
                .pattern(" | ")
                .pattern(" | ")
                .define('#', ModItems.HARDENED_SCUTE_INGOT.get())
                .define('|', Items.STICK)
                .unlockedBy("got_scute", has(ModItems.HARDENED_SCUTE_INGOT.get()))
                .unlockedBy("has_stick", has(Items.STICK)).save(pRecipeOutput);


        //HARDENED SCUTE AXE -> 3 HARDENED SCUTE INGOT + 2 STICK
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.HARDENED_SCUTE_AXE.get())
                .pattern(" ##")
                .pattern(" |#")
                .pattern(" | ")
                .define('#', ModItems.HARDENED_SCUTE_INGOT.get())
                .define('|', Items.STICK)
                .unlockedBy("got_scute", has(ModItems.HARDENED_SCUTE_INGOT.get()))
                .unlockedBy("has_stick", has(Items.STICK)).save(pRecipeOutput);


        //HARDENED SCUTE SHOVEL -> 1 HARDENED SCUTE INGOT + 2 STICK
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.HARDENED_SCUTE_SHOVEL.get())
                .pattern(" # ")
                .pattern(" | ")
                .pattern(" | ")
                .define('#', ModItems.HARDENED_SCUTE_INGOT.get())
                .define('|', Items.STICK)
                .unlockedBy("got_scute", has(ModItems.HARDENED_SCUTE_INGOT.get()))
                .unlockedBy("has_stick", has(Items.STICK)).save(pRecipeOutput);


        //HARDENED SCUTE HOE -> 2 HARDENED SCUTE INGOT + 2 STICK
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.HARDENED_SCUTE_HOE.get())
                .pattern(" ##")
                .pattern(" | ")
                .pattern(" | ")
                .define('#', ModItems.HARDENED_SCUTE_INGOT.get())
                .define('|', Items.STICK)
                .unlockedBy("got_scute", has(ModItems.HARDENED_SCUTE_INGOT.get()))
                .unlockedBy("has_stick", has(Items.STICK)).save(pRecipeOutput);
        //
        //
        //
        //
        // SCUTE ARMOR

        //SCUTE HELMET -> 5 SCUTE INGOT (UP)
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.SCUTE_HELMET.get())
                .pattern("###")
                .pattern("# #")
                .pattern("   ")
                .define('#', ModItems.SCUTE_INGOT.get())
                .unlockedBy("got_scute", has(ModItems.SCUTE_INGOT.get()))
                .save(pRecipeOutput, MoreMC.MOD_ID + ":scute_helmet_from_crafting_up");

        //SCUTE HELMET -> 5 SCUTE INGOT (DOWN)
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.SCUTE_HELMET.get())
                .pattern("   ")
                .pattern("###")
                .pattern("# #")
                .define('#', ModItems.SCUTE_INGOT.get())
                .unlockedBy("got_scute", has(ModItems.SCUTE_INGOT.get()))
                .save(pRecipeOutput, MoreMC.MOD_ID + ":scute_helmet_from_crafting_down");

        //SCUTE CHESTPLATE -> 5 SCUTE INGOT
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.SCUTE_CHESTPLATE.get())
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.SCUTE_INGOT.get())
                .unlockedBy("got_scute", has(ModItems.SCUTE_INGOT.get())).save(pRecipeOutput);

        //SCUTE LEGGINGS -> 5 SCUTE INGOT
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.SCUTE_LEGGINGS.get())
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .define('#', ModItems.SCUTE_INGOT.get())
                .unlockedBy("got_scute", has(ModItems.SCUTE_INGOT.get())).save(pRecipeOutput);

        //SCUTE BOOTS -> 5 SCUTE INGOT (UP)
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.SCUTE_BOOTS.get())
                .pattern("# #")
                .pattern("# #")
                .pattern("   ")
                .define('#', ModItems.SCUTE_INGOT.get())
                .unlockedBy("got_scute", has(ModItems.SCUTE_INGOT.get()))
                .save(pRecipeOutput, MoreMC.MOD_ID + ":scute_boots_from_crafting_up");

        //SCUTE BOOTS -> 5 SCUTE INGOT (DOWN)
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.SCUTE_BOOTS.get())
                .pattern("   ")
                .pattern("# #")
                .pattern("# #")
                .define('#', ModItems.SCUTE_INGOT.get())
                .unlockedBy("got_scute", has(ModItems.SCUTE_INGOT.get()))
                .save(pRecipeOutput, MoreMC.MOD_ID + ":scute_boots_from_crafting_down");
        //
        //
        //
        //
        // REINFORCED SCUTE ARMOR

        //REINFORCED SCUTE HELMET -> 5 REINFORCED SCUTE INGOT (UP)
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.REINFORCED_SCUTE_HELMET.get())
                .pattern("###")
                .pattern("# #")
                .pattern("   ")
                .define('#', ModItems.REINFORCED_SCUTE_INGOT.get())
                .unlockedBy("got_scute", has(ModItems.REINFORCED_SCUTE_INGOT.get()))
                .save(pRecipeOutput, MoreMC.MOD_ID + ":reinforced_scute_helmet_from_crafting_up");

        //REINFORCED SCUTE HELMET -> 5 REINFORCED SCUTE INGOT (DOWN)
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.REINFORCED_SCUTE_HELMET.get())
                .pattern("   ")
                .pattern("###")
                .pattern("# #")
                .define('#', ModItems.REINFORCED_SCUTE_INGOT.get())
                .unlockedBy("got_scute", has(ModItems.REINFORCED_SCUTE_INGOT.get()))
                .save(pRecipeOutput, MoreMC.MOD_ID + ":reinforced_scute_helmet_from_crafting_down");

        //REINFORCED SCUTE CHESTPLATE -> 5 REINFORCED SCUTE INGOT
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.REINFORCED_SCUTE_CHESTPLATE.get())
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.REINFORCED_SCUTE_INGOT.get())
                .unlockedBy("got_scute", has(ModItems.REINFORCED_SCUTE_INGOT.get())).save(pRecipeOutput);

        //REINFORCED SCUTE LEGGINGS -> 5 REINFORCED SCUTE INGOT
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.REINFORCED_SCUTE_LEGGINGS.get())
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .define('#', ModItems.REINFORCED_SCUTE_INGOT.get())
                .unlockedBy("got_scute", has(ModItems.REINFORCED_SCUTE_INGOT.get())).save(pRecipeOutput);

        //REINFORCED SCUTE BOOTS -> 5 REINFORCED SCUTE INGOT (UP)
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.REINFORCED_SCUTE_BOOTS.get())
                .pattern("# #")
                .pattern("# #")
                .pattern("   ")
                .define('#', ModItems.REINFORCED_SCUTE_INGOT.get())
                .unlockedBy("got_scute", has(ModItems.REINFORCED_SCUTE_INGOT.get()))
                .save(pRecipeOutput, MoreMC.MOD_ID + ":reinforced_scute_boots_from_crafting_up");

        //REINFORCED SCUTE BOOTS -> 5 REINFORCED SCUTE INGOT (DOWN)
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.REINFORCED_SCUTE_BOOTS.get())
                .pattern("   ")
                .pattern("# #")
                .pattern("# #")
                .define('#', ModItems.REINFORCED_SCUTE_INGOT.get())
                .unlockedBy("got_scute", has(ModItems.REINFORCED_SCUTE_INGOT.get()))
                .save(pRecipeOutput, MoreMC.MOD_ID + ":reinforced_scute_boots_from_crafting_down");
        //
        //
        //
        //
        // HARDENED SCUTE ARMOR

        //HARDENED SCUTE HELMET -> 5 HARDENED SCUTE INGOT (UP)
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.HARDENED_SCUTE_HELMET.get())
                .pattern("###")
                .pattern("# #")
                .pattern("   ")
                .define('#', ModItems.HARDENED_SCUTE_INGOT.get())
                .unlockedBy("got_scute", has(ModItems.HARDENED_SCUTE_INGOT.get()))
                .save(pRecipeOutput, MoreMC.MOD_ID + ":hardened_scute_helmet_from_crafting_up");

        //HARDENED SCUTE HELMET -> 5 HARDENED SCUTE INGOT (DOWN)
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.HARDENED_SCUTE_HELMET.get())
                .pattern("   ")
                .pattern("###")
                .pattern("# #")
                .define('#', ModItems.HARDENED_SCUTE_INGOT.get())
                .unlockedBy("got_scute", has(ModItems.HARDENED_SCUTE_INGOT.get()))
                .save(pRecipeOutput, MoreMC.MOD_ID + ":hardened_scute_helmet_from_crafting_down");

        //HARDENED SCUTE CHESTPLATE -> 5 HARDENED SCUTE INGOT
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.HARDENED_SCUTE_CHESTPLATE.get())
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.HARDENED_SCUTE_INGOT.get())
                .unlockedBy("got_scute", has(ModItems.HARDENED_SCUTE_INGOT.get())).save(pRecipeOutput);

        //HARDENED SCUTE LEGGINGS -> 5 HARDENED SCUTE INGOT
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.HARDENED_SCUTE_LEGGINGS.get())
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .define('#', ModItems.HARDENED_SCUTE_INGOT.get())
                .unlockedBy("got_scute", has(ModItems.HARDENED_SCUTE_INGOT.get())).save(pRecipeOutput);

        //HARDENED SCUTE BOOTS -> 5 HARDENED SCUTE INGOT (UP)
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.HARDENED_SCUTE_BOOTS.get())
                .pattern("# #")
                .pattern("# #")
                .pattern("   ")
                .define('#', ModItems.HARDENED_SCUTE_INGOT.get())
                .unlockedBy("got_scute", has(ModItems.HARDENED_SCUTE_INGOT.get()))
                .save(pRecipeOutput, MoreMC.MOD_ID + ":hardened_scute_boots_from_crafting_up");

        //HARDENED SCUTE BOOTS -> 5 HARDENED SCUTE INGOT (DOWN)
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.HARDENED_SCUTE_BOOTS.get())
                .pattern("   ")
                .pattern("# #")
                .pattern("# #")
                .define('#', ModItems.HARDENED_SCUTE_INGOT.get())
                .unlockedBy("got_scute", has(ModItems.HARDENED_SCUTE_INGOT.get()))
                .save(pRecipeOutput, MoreMC.MOD_ID + ":hardened_scute_boots_from_crafting_down");
        //
        //
        //
        //
        // BUILDING BLOCKS

        //PEDESTAL BLOCK -> 5 HARDENED SCUTE INGOT (DOWN)
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PEDESTAL_BLOCK.get())
                .pattern(" - ")
                .pattern(" # ")
                .pattern(":::")
                .define('#', Items.STONE)
                .define('-', Items.ITEM_FRAME)
                .define(':', Items.SMOOTH_STONE)
                .unlockedBy("got_stone", has(Items.STONE))
                .save(pRecipeOutput);
    }
}
