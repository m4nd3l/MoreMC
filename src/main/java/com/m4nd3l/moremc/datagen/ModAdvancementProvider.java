package com.m4nd3l.moremc.datagen;

import com.m4nd3l.moremc.MoreMC;
import com.m4nd3l.moremc.item.items.ScuteItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.*;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class ModAdvancementProvider extends FabricAdvancementProvider {
    public ModAdvancementProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(output, registryLookup);
    }

    @Override
    public void generateAdvancement(RegistryWrapper.WrapperLookup registryLookup, Consumer<AdvancementEntry> consumer) {
        AdvancementEntry gotScute = Advancement.Builder.create()
                .display(
                        Items.TURTLE_SCUTE, // The display icon
                        Text.translatable("advancements.moremc.got_scute"), // The title
                        Text.translatable("advancements.moremc.got_scute.description"), // The description
                        Identifier.ofVanilla("textures/gui/advancements/backgrounds/adventure.png"),
                        // Background image for the tab in the advancements page, if this is a root advancement (has no parent)
                        AdvancementFrame.GOAL, // TASK, CHALLENGE, or GOAL
                        true, // Show the toast when completing it
                        true, // Announce it to chat
                        false // Hide it in the advancement tab until it's achieved
                )
                .rewards(new AdvancementRewards.Builder().setExperience(15))
                .criterion("got_scute", InventoryChangedCriterion.Conditions.items(Items.TURTLE_SCUTE))
                .build(consumer, MoreMC.MOD_ID + ":got_scute");

        AdvancementEntry gotHardenedScute = Advancement.Builder.create()
                .display(
                        ScuteItems.HARDENED_SCUTE,
                        Text.translatable("advancements.moremc.got_hardened_scute"),
                        Text.translatable("advancements.moremc.got_hardened_scute.description"),
                        Identifier.ofVanilla("textures/gui/advancements/backgrounds/adventure.png"),
                        AdvancementFrame.CHALLENGE,
                        true,
                        true,
                        false
                )
                .rewards(new AdvancementRewards.Builder().setExperience(25))
                .criterion("got_hardened_scute", InventoryChangedCriterion.Conditions.items(ScuteItems.HARDENED_SCUTE))
                .build(consumer, MoreMC.MOD_ID + ":got_hardened_scute");
    }


}
