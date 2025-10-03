package com.m4nd3l.moremc;

import com.m4nd3l.moremc.block.ModBlocks;
import com.m4nd3l.moremc.item.ModItemGroup;
import com.m4nd3l.moremc.item.ModItems;
import net.fabricmc.api.ModInitializer;

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
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
	}

    public static String getThis() {
        return "[ " + MOD_NAME + " ]";
    }
}