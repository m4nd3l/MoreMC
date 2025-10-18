package com.m4nd3l.moremc.villager;

import com.google.common.collect.ImmutableSet;
import com.m4nd3l.moremc.MoreMC;
import com.m4nd3l.moremc.block.blocks.MiscBlocks;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

public class ModVillagers {

    public static final RegistryKey<PointOfInterestType> SUSHI_GETA_POI_KEY = registerPOIKey("sushi_geta_poi");
    public static final PointOfInterestType SUSHI_GETA_POI = registerPOI("sushi_geta_poi", MiscBlocks.SUSHI_GETA);
    public static final  VillagerProfession ASIAN_FARMER = registerProfession("asian_farmer", SUSHI_GETA_POI_KEY);


    private static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type) {
        return Registry.register(Registries.VILLAGER_PROFESSION, Identifier.of(MoreMC.MOD_ID, name),
                new VillagerProfession(name, entry -> entry.matchesKey(type),
                        entry -> entry.matchesKey(type),
                        ImmutableSet.of(), ImmutableSet.of(), SoundEvents.ENTITY_VILLAGER_WORK_BUTCHER));
    }

    public static PointOfInterestType registerPOI(String name, Block block) {
        return PointOfInterestHelper.register(Identifier.of(MoreMC.MOD_ID, name),
                1, 1, block);
    }

    public static RegistryKey<PointOfInterestType> registerPOIKey(String name) {
        return RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE, Identifier.of(MoreMC.MOD_ID, name));
    }

    public static void registerVillagers() {
        MoreMC.LOGGER.info(MoreMC.getThis() + ": Registering Mod Villagers...");
    }

}