package com.m4nd3l.moremc.trim;


import com.m4nd3l.moremc.MoreMC;
import com.m4nd3l.moremc.item.items.ScuteItems;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.trim.ArmorTrimMaterial;
import net.minecraft.registry.*;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.Map;

public class ModTrimMaterials {

    public static final RegistryKey<ArmorTrimMaterial> SCUTE = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(MoreMC.MOD_ID, "scute"));

    public static final RegistryKey<ArmorTrimMaterial> REINFORCED_SCUTE = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(MoreMC.MOD_ID, "reinforced_scute"));

    public static final RegistryKey<ArmorTrimMaterial> HARDENED_SCUTE = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(MoreMC.MOD_ID, "hardened_scute"));

    public static void bootstrap(Registerable<ArmorTrimMaterial> registerable) {
        register(registerable, SCUTE, Registries.ITEM.getEntry(Items.TURTLE_SCUTE), Style.EMPTY.withColor(TextColor
                .parse("#4af51b").getOrThrow()), 0.7F);

        register(registerable, REINFORCED_SCUTE, Registries.ITEM.getEntry(ScuteItems.REINFORCED_SCUTE), Style.EMPTY.withColor(TextColor
                .parse("#175e03").getOrThrow()), 0.7F);

        register(registerable, HARDENED_SCUTE, Registries.ITEM.getEntry(ScuteItems.HARDENED_SCUTE), Style.EMPTY.withColor(TextColor
                .parse("#0f3b02").getOrThrow()), 0.7F);
    }

    private static void register(Registerable<ArmorTrimMaterial> registerable, RegistryKey<ArmorTrimMaterial> armorTrimKey,
                                 RegistryEntry<Item> item, Style style, float itemModelIndex) {
        ArmorTrimMaterial trimmaterial = new ArmorTrimMaterial(armorTrimKey.getValue().getPath(), item, itemModelIndex, Map.of(),
                Text.translatable(Util.createTranslationKey("trim_material", armorTrimKey.getValue())).fillStyle(style));

        registerable.register(armorTrimKey, trimmaterial);
    }

}
