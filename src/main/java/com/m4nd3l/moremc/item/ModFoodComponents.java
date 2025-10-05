package com.m4nd3l.moremc.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent RICE = new FoodComponent.Builder()
            .nutrition(1)
            .saturationModifier(0.25F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 600, 0), 0.25F)
            .build();

    public static final FoodComponent BOWL_OF_RICE = new FoodComponent.Builder()
            .nutrition(1)
            .saturationModifier(0.25F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 600, 0), 0.25F)
            .build();

    public static final FoodComponent COOKED_RICE = new FoodComponent.Builder()
            .nutrition(3)
            .saturationModifier(0.4f)
            .build();
}
