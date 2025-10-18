package com.m4nd3l.moremc;

import com.m4nd3l.moremc.block.ModBlocks;
import com.m4nd3l.moremc.block.blocks.MiscBlocks;
import com.m4nd3l.moremc.block.blocks.trees.SkyWoodBlocks;
import com.m4nd3l.moremc.datagen.ModWorldGenerator;
import com.m4nd3l.moremc.item.ModItemGroup;
import com.m4nd3l.moremc.item.ModItems;
import com.m4nd3l.moremc.item.items.FoodItems;
import com.m4nd3l.moremc.item.items.MiscItems;
import com.m4nd3l.moremc.villager.ModTrades;
import com.m4nd3l.moremc.villager.ModVillagers;
import com.m4nd3l.moremc.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.block.ComposterBlock;
import net.minecraft.item.Items;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreMC implements ModInitializer {

	public static final String MOD_ID = "moremc";
    public static final String MOD_NAME = "MoreMC";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        LOGGER.info(getThis() + ": Initializing mod...");

        ModItemGroup.registerItemGroups();

        ModItems.registerAllModItems();

        ModBlocks.registerAllModBlocks();

        ModVillagers.registerVillagers();

        ModTrades.registerCustomTrades();

        ModWorldGeneration.generateModWorldGeneration();

        registerFuels();
        registerStrippable();
        registerFlammable();
        registerComposter();
	}

    public void registerFuels() {
        LOGGER.info(this.getThis() + ": Registering fuels...");
        FuelRegistry.INSTANCE.add(Items.PAPER, 100);
        FuelRegistry.INSTANCE.add(MiscItems.TORN_PAPER, 160/6);
    }

    public void registerStrippable() {
        LOGGER.info(this.getThis() + ": Registering strippable blocks...");
        StrippableBlockRegistry.register(SkyWoodBlocks.SKYWOOD_LOG, SkyWoodBlocks.STRIPPED_SKYWOOD_LOG);
        StrippableBlockRegistry.register(SkyWoodBlocks.SKYWOOD_WOOD, SkyWoodBlocks.STRIPPED_SKYWOOD_WOOD);
    }

    public void registerFlammable() {
        LOGGER.info(this.getThis() + ": Registering flammable blocks...");
        FlammableBlockRegistry.getDefaultInstance().add(SkyWoodBlocks.SKYWOOD_LOG, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(SkyWoodBlocks.STRIPPED_SKYWOOD_LOG, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(SkyWoodBlocks.SKYWOOD_WOOD, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(SkyWoodBlocks.STRIPPED_SKYWOOD_WOOD, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(SkyWoodBlocks.SKYWOOD_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(SkyWoodBlocks.SKYWOOD_LEAVES, 5, 20);

        FlammableBlockRegistry.getDefaultInstance().add(SkyWoodBlocks.SKYWOOD_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(SkyWoodBlocks.SKYWOOD_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(SkyWoodBlocks.SKYWOOD_BUTTON, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(SkyWoodBlocks.SKYWOOD_PRESSURE_PLATE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(SkyWoodBlocks.SKYWOOD_FENCE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(SkyWoodBlocks.SKYWOOD_FENCE_GATE, 5, 20);

        FlammableBlockRegistry.getDefaultInstance().add(MiscBlocks.SUSHI_GETA, 5, 20);
    }

    public void registerComposter() {
        LOGGER.info(this.getThis() + ": Registering composter items...");
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(FoodItems.COOKED_RICE, 0.5f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(FoodItems.RICE, 0.25f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(MiscItems.RICE_SEEDS, 0.25f);
    }

    public static String getThis() {
        return "[ " + MOD_NAME + " ]";
    }
}