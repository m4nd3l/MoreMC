package com.m4nd3l.moremc.item;

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
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup SCUTE = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MoreMC.MOD_ID, "a_scute"), FabricItemGroup.builder()
                    .displayName(Text.translatable("creativetab.moremc.scute_items_tab"))
                    .icon(() -> new ItemStack(Items.TURTLE_SCUTE))
                    .entries((displayContext, entries) -> {
                        entries.add(Items.TURTLE_SCUTE);
                        entries.add(ScuteItems.SCUTE_INGOT);
                        entries.add(ScuteBlocks.SCUTE_BLOCK);
                        entries.add(ScuteBlocks.SCUTE_INGOT_BLOCK);

                        entries.add(ScuteTools.SCUTE_SWORD);
                        entries.add(ScuteTools.SCUTE_PICKAXE);
                        entries.add(ScuteTools.SCUTE_AXE);
                        entries.add(ScuteTools.SCUTE_SHOVEL);
                        entries.add(ScuteTools.SCUTE_HOE);


                        entries.add(ScuteItems.REINFORCED_SCUTE);
                        entries.add(ScuteItems.REINFORCED_SCUTE_INGOT);
                        entries.add(ScuteBlocks.REINFORCED_SCUTE_BLOCK);
                        entries.add(ScuteBlocks.REINFORCED_SCUTE_INGOT_BLOCK);

                        entries.add(ScuteTools.REINFORCED_SCUTE_SWORD);
                        entries.add(ScuteTools.REINFORCED_SCUTE_PICKAXE);
                        entries.add(ScuteTools.REINFORCED_SCUTE_AXE);
                        entries.add(ScuteTools.REINFORCED_SCUTE_SHOVEL);
                        entries.add(ScuteTools.REINFORCED_SCUTE_HOE);

                        
                        entries.add(ScuteItems.HARDENED_SCUTE);
                        entries.add(ScuteItems.HARDENED_SCUTE_INGOT);
                        entries.add(ScuteBlocks.HARDENED_SCUTE_BLOCK);
                        entries.add(ScuteBlocks.HARDENED_SCUTE_INGOT_BLOCK);

                        entries.add(ScuteTools.HARDENED_SCUTE_SWORD);
                        entries.add(ScuteTools.HARDENED_SCUTE_PICKAXE);
                        entries.add(ScuteTools.HARDENED_SCUTE_AXE);
                        entries.add(ScuteTools.HARDENED_SCUTE_SHOVEL);
                        entries.add(ScuteTools.HARDENED_SCUTE_HOE);

                        entries.add(ScuteArmor.SCUTE_HELMET);
                        entries.add(ScuteArmor.SCUTE_CHESTPLATE);
                        entries.add(ScuteArmor.SCUTE_LEGGINGS);
                        entries.add(ScuteArmor.SCUTE_BOOTS);


                        entries.add(ScuteArmor.REINFORCED_SCUTE_HELMET);
                        entries.add(ScuteArmor.REINFORCED_SCUTE_CHESTPLATE);
                        entries.add(ScuteArmor.REINFORCED_SCUTE_LEGGINGS);
                        entries.add(ScuteArmor.REINFORCED_SCUTE_BOOTS);


                        entries.add(ScuteArmor.HARDENED_SCUTE_HELMET);
                        entries.add(ScuteArmor.HARDENED_SCUTE_CHESTPLATE);
                        entries.add(ScuteArmor.HARDENED_SCUTE_LEGGINGS);
                        entries.add(ScuteArmor.HARDENED_SCUTE_BOOTS);


                        entries.add(ScuteItems.TURTLED_SMITHING_TEMPLATE);
                    }).build());

    public static final ItemGroup BUILDING = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MoreMC.MOD_ID, "b_building"), FabricItemGroup.builder()
                    .displayName(Text.translatable("creativetab.moremc.building_tab"))
                    .icon(() -> new ItemStack(ScuteBlocks.SCUTE_BLOCK))
                    .entries((displayContext, entries) -> {
                        entries.add(ScuteBlocks.SCUTE_BLOCK);
                        entries.add(ScuteBlocks.SCUTE_INGOT_BLOCK);

                        entries.add(ScuteBlocks.REINFORCED_SCUTE_BLOCK);
                        entries.add(ScuteBlocks.REINFORCED_SCUTE_INGOT_BLOCK);

                        entries.add(ScuteBlocks.HARDENED_SCUTE_BLOCK);
                        entries.add(ScuteBlocks.HARDENED_SCUTE_INGOT_BLOCK);

                        entries.add(SkyWoodBlocks.SKYWOOD_LOG);
                        entries.add(SkyWoodBlocks.SKYWOOD_WOOD);
                        entries.add(SkyWoodBlocks.STRIPPED_SKYWOOD_LOG);
                        entries.add(SkyWoodBlocks.STRIPPED_SKYWOOD_WOOD);
                        entries.add(SkyWoodBlocks.SKYWOOD_LEAVES);
                        entries.add(SkyWoodBlocks.SKYWOOD_PLANKS);
                        entries.add(SkyWoodBlocks.SKYWOOD_STAIRS);
                        entries.add(SkyWoodBlocks.SKYWOOD_SLAB);

                        entries.add(SkyWoodBlocks.SKYWOOD_LAMP);
                    }).build());

    public static final ItemGroup TREES = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MoreMC.MOD_ID, "c_trees"), FabricItemGroup.builder()
                    .displayName(Text.translatable("creativetab.moremc.trees"))
                    .icon(() -> new ItemStack(SkyWoodBlocks.SKYWOOD_LOG))
                    .entries((displayContext, entries) -> {
                        entries.add(SkyWoodBlocks.SKYWOOD_LOG);
                        entries.add(SkyWoodBlocks.SKYWOOD_WOOD);

                        entries.add(SkyWoodBlocks.STRIPPED_SKYWOOD_LOG);
                        entries.add(SkyWoodBlocks.STRIPPED_SKYWOOD_WOOD);

                        entries.add(SkyWoodBlocks.SKYWOOD_LEAVES);

                        entries.add(SkyWoodBlocks.SKYWOOD_PLANKS);

                        entries.add(SkyWoodBlocks.SKYWOOD_STAIRS);
                        entries.add(SkyWoodBlocks.SKYWOOD_SLAB);

                        entries.add(SkyWoodBlocks.SKYWOOD_FENCE);
					    entries.add(SkyWoodBlocks.SKYWOOD_FENCE_GATE);

					    entries.add(SkyWoodBlocks.SKYWOOD_DOOR);
					    entries.add(SkyWoodBlocks.SKYWOOD_TRAPDOOR);

                        entries.add(SkyWoodBlocks.SKYWOOD_BUTTON);
                        entries.add(SkyWoodBlocks.SKYWOOD_PRESSURE_PLATE);

                        entries.add(SkyWoodBlocks.SKYWOOD_LAMP);
                    }).build());

    public static final ItemGroup ORES = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MoreMC.MOD_ID, "d_ores"), FabricItemGroup.builder()
                    .displayName(Text.translatable("creativetab.moremc.ores"))
                    .icon(() -> new ItemStack(EnderiteBlocks.ENDERITE_ORE))
                    .entries((displayContext, entries) -> {
                        entries.add(EnderiteBlocks.ENDERITE_ORE);
                        entries.add(EnderiteItems.RAW_ENDERITE);

                        entries.add(EnderiteBlocks.ENDERITE_BLOCK);
                        entries.add(EnderiteItems.ENDERITE_INGOT);

                        entries.add(EnderiteBlocks.RAW_ENDERITE_BLOCK);

                        entries.add(EnderiteTools.ENDERITE_SWORD);
                        entries.add(EnderiteTools.ENDERITE_PICKAXE);
                        entries.add(EnderiteTools.ENDERITE_AXE);
                        entries.add(EnderiteTools.ENDERITE_SHOVEL);
                        entries.add(EnderiteTools.ENDERITE_HOE);

                        entries.add(EnderiteArmor.ENDERITE_HELMET);
                        entries.add(EnderiteArmor.ENDERITE_CHESTPLATE);
                        entries.add(EnderiteArmor.ENDERITE_LEGGINGS);
                        entries.add(EnderiteArmor.ENDERITE_BOOTS);
                    }).build());


    public static final ItemGroup FOOD = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MoreMC.MOD_ID, "e_food"), FabricItemGroup.builder()
                    .displayName(Text.translatable("creativetab.moremc.food"))
                    .icon(() -> new ItemStack(FoodItems.RICE))
                    .entries((displayContext, entries) -> {
                        entries.add(FoodItems.RICE);
                        entries.add(FoodItems.BOWL_OF_RICE);
                        entries.add(FoodItems.COOKED_RICE);
                    }).build());

    public static final ItemGroup MISC = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MoreMC.MOD_ID, "z_misc"), FabricItemGroup.builder()
                    .displayName(Text.translatable("creativetab.moremc.misc"))
                    .icon(() -> new ItemStack(MiscItems.TORN_PAPER))
                    .entries((displayContext, entries) -> {
                        entries.add(MiscItems.ANVIL_REPAIR);
                        entries.add(MiscItems.TORN_PAPER);
                    }).build());


    public static void registerItemGroups() {
        MoreMC.LOGGER.info(MoreMC.getThis() + ": Registering Mod Item Groups...");
    }
}
