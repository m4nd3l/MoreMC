package com.m4nd3l.moremc;

import com.m4nd3l.moremc.datagen.*;
import com.m4nd3l.moremc.datagen.lang.ModEnglishLangProvider;
import com.m4nd3l.moremc.datagen.lang.ModItalianLangProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class MoreMCDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ModBlockTagProvider::new);
        pack.addProvider(ModItemTagProvider::new);
        pack.addProvider(ModModelProvider::new);
        pack.addProvider(ModLootTableGenerator::new);
        pack.addProvider(ModEnglishLangProvider::new);
        pack.addProvider(ModItalianLangProvider::new);
        pack.addProvider(ModRecipeGenerator::new);
	}
}
