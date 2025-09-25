package com.m4nd3l.moremc.items;

import com.m4nd3l.moremc.MoreMC;
import com.m4nd3l.moremc.blocks.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;


public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoreMC.MOD_ID);


    // MoreMC - Scute
    public static final RegistryObject<CreativeModeTab> SCUTE_ITEMS_TAB = CREATIVE_MODE_TABS.register("scute_items_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(Items.TURTLE_SCUTE))
                    .title(Component.translatable("creativetab.moremc.scute_items_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(Items.TURTLE_SCUTE);
                        output.accept(ModBlocks.SCUTE_BLOCK.get());
                        output.accept(ModItems.SCUTE_INGOT.get());
                        output.accept(ModBlocks.SCUTE_INGOT_BLOCK.get());

                        output.accept(ModItems.REINFORCED_SCUTE.get());
                        output.accept(ModBlocks.REINFORCED_SCUTE_BLOCK.get());
                        output.accept(ModItems.REINFORCED_SCUTE_INGOT.get());
                        output.accept(ModBlocks.REINFORCED_SCUTE_INGOT_BLOCK.get());

                        output.accept(ModItems.HARDENED_SCUTE.get());
                        output.accept(ModBlocks.HARDENED_SCUTE_BLOCK.get());
                        output.accept(ModItems.HARDENED_SCUTE_INGOT.get());
                        output.accept(ModBlocks.HARDENED_SCUTE_INGOT_BLOCK.get());

                        output.accept(ModItems.SCUTE_SWORD.get());
                        output.accept(ModItems.SCUTE_PICKAXE.get());
                        output.accept(ModItems.SCUTE_AXE.get());
                        output.accept(ModItems.SCUTE_SHOVEL.get());
                        output.accept(ModItems.SCUTE_HOE.get());

                        output.accept(ModItems.SCUTE_HELMET.get());
                        output.accept(ModItems.SCUTE_CHESTPLATE.get());
                        output.accept(ModItems.SCUTE_LEGGINGS.get());
                        output.accept(ModItems.SCUTE_BOOTS.get());

                        output.accept(ModItems.REINFORCED_SCUTE_SWORD.get());
                        output.accept(ModItems.REINFORCED_SCUTE_PICKAXE.get());
                        output.accept(ModItems.REINFORCED_SCUTE_AXE.get());
                        output.accept(ModItems.REINFORCED_SCUTE_SHOVEL.get());
                        output.accept(ModItems.REINFORCED_SCUTE_HOE.get());

                        output.accept(ModItems.REINFORCED_SCUTE_HELMET.get());
                        output.accept(ModItems.REINFORCED_SCUTE_CHESTPLATE.get());
                        output.accept(ModItems.REINFORCED_SCUTE_LEGGINGS.get());
                        output.accept(ModItems.REINFORCED_SCUTE_BOOTS.get());

                        output.accept(ModItems.HARDENED_SCUTE_SWORD.get());
                        output.accept(ModItems.HARDENED_SCUTE_PICKAXE.get());
                        output.accept(ModItems.HARDENED_SCUTE_AXE.get());
                        output.accept(ModItems.HARDENED_SCUTE_SHOVEL.get());
                        output.accept(ModItems.HARDENED_SCUTE_HOE.get());

                        output.accept(ModItems.HARDENED_SCUTE_HELMET.get());
                        output.accept(ModItems.HARDENED_SCUTE_CHESTPLATE.get());
                        output.accept(ModItems.HARDENED_SCUTE_LEGGINGS.get());
                        output.accept(ModItems.HARDENED_SCUTE_BOOTS.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> BUILDING_TAB = CREATIVE_MODE_TABS.register("building_tab",
            () -> CreativeModeTab.builder()
                    .withTabsBefore(SCUTE_ITEMS_TAB.getId())
                    .icon(() -> new ItemStack(ModBlocks.PEDESTAL_BLOCK.get()))
                    .title(Component.translatable("creativetab.moremc.building_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                                output.accept(ModBlocks.PEDESTAL_BLOCK.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
