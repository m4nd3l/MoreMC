package com.m4nd3l.moremc;

import com.m4nd3l.moremc.datagen.*;
import com.m4nd3l.moremc.datagen.lang.ModEnglishLangProvider;
import com.m4nd3l.moremc.datagen.lang.ModItalianLangProvider;
import com.m4nd3l.moremc.trim.ModTrimMaterials;
import com.m4nd3l.moremc.trim.ModTrimPatterns;
import com.m4nd3l.moremc.world.ModConfiguredFeatures;
import com.m4nd3l.moremc.world.ModPlaceFeatures;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

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
        pack.addProvider(ModRegistryDataGenerator::new);
        pack.addProvider(ModAdvancementProvider::new);
        pack.addProvider(ModPOITagProvider::new);
        pack.addProvider(ModWorldGenerator::new);
	}

    @Override
    public void buildRegistry(RegistryBuilder registryBuilder) {
        registryBuilder.addRegistry(RegistryKeys.TRIM_MATERIAL, ModTrimMaterials::bootstrap);
        registryBuilder.addRegistry(RegistryKeys.TRIM_PATTERN, ModTrimPatterns::bootstrap);
        registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
        registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, ModPlaceFeatures::bootstrap);
    }
}
