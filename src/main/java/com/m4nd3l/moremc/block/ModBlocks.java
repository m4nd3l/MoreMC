package com.m4nd3l.moremc.block;

import com.m4nd3l.moremc.MoreMC;
import com.m4nd3l.moremc.block.blocks.CropBlocks;
import com.m4nd3l.moremc.block.blocks.EnderiteBlocks;
import com.m4nd3l.moremc.block.blocks.MiscBlocks;
import com.m4nd3l.moremc.block.blocks.ScuteBlocks;
import com.m4nd3l.moremc.block.blocks.trees.SkyWoodBlocks;

public class ModBlocks {
    public static void registerAllModBlocks() {
        MoreMC.LOGGER.info(MoreMC.getThis() + ": Registering All Mod Blocks...");
        ScuteBlocks.registerModBlocks();
        SkyWoodBlocks.registerModBlocks();
        EnderiteBlocks.registerModBlocks();
        CropBlocks.registerModBlocks();
        MiscBlocks.registerModBlocks();
    }
}
