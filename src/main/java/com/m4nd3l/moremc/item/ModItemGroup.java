package com.m4nd3l.moremc.item;

import com.m4nd3l.moremc.MoreMC;
import com.m4nd3l.moremc.block.ModBlocks;
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
                        entries.add(ModItems.SCUTE_INGOT);
                        entries.add(ModBlocks.SCUTE_BLOCK);
                    }).build());

    public static final ItemGroup BUILDING = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MoreMC.MOD_ID, "b_building"), FabricItemGroup.builder()
                    .displayName(Text.translatable("creativetab.moremc.building_tab"))
                    .icon(() -> new ItemStack(Items.STONE))
                    .entries((displayContext, entries) -> {
                        entries.add(Items.STONE);
                    }).build());

    public static final ItemGroup MISC = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MoreMC.MOD_ID, "z_misc"), FabricItemGroup.builder()
                    .displayName(Text.translatable("creativetab.moremc.misc"))
                    .icon(() -> new ItemStack(ModItems.ANVIL_REPAIR))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.ANVIL_REPAIR);
                    }).build());


    public static void registerItemGroups() {
        MoreMC.LOGGER.info(MoreMC.getThis() + ": Registering Mod Item Groups...");
    }
}
