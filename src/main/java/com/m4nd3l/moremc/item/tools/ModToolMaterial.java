package com.m4nd3l.moremc.item.tools;

import com.google.common.base.Suppliers;
import com.m4nd3l.moremc.item.items.ScuteItems;
import com.m4nd3l.moremc.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.TagKey;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {
   SCUTE(ModTags.Blocks.INCORRECT_FOR_SCUTE_TOOL, 2320,
           9.5F, 4.2F, 17, () -> Ingredient.ofItems(ScuteItems.SCUTE_INGOT)),
   REINFORCED_SCUTE(ModTags.Blocks.INCORRECT_FOR_REINFORCED_SCUTE_TOOL, 2749,
           10F, 4.5F, 19, () -> Ingredient.ofItems(ScuteItems.REINFORCED_SCUTE_INGOT)),
   HARDENED_SCUTE(ModTags.Blocks.INCORRECT_FOR_HARDENED_SCUTE_TOOL, 3215,
           12F, 5F, 22, () -> Ingredient.ofItems(ScuteItems.HARDENED_SCUTE_INGOT));

    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterial(
            final TagKey<Block> inverseTag,
            final int itemDurability,
            final float miningSpeed,
            final float attackDamage,
            final int enchantability,
            final Supplier<Ingredient> repairIngredient
    ) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }
}
