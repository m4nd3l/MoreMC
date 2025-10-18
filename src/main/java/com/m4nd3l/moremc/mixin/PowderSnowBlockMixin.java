package com.m4nd3l.moremc.mixin;

import com.m4nd3l.moremc.item.armor.ScuteArmor;
import net.minecraft.block.PowderSnowBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Items;
import net.minecraft.registry.tag.EntityTypeTags;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin(PowderSnowBlock.class)
public class PowderSnowBlockMixin{

    @Inject(method = "canWalkOnPowderSnow", at = @At(value = "RETURN"), locals = LocalCapture.CAPTURE_FAILSOFT, cancellable = true)
    private static void canWalkOnPowderSnowMixin(Entity entity, CallbackInfoReturnable<Boolean> cir) {
        if (entity.getType().isIn(EntityTypeTags.POWDER_SNOW_WALKABLE_MOBS)) {
            cir.setReturnValue(true);
        } else if (entity instanceof LivingEntity livingEntity) {
            if(livingEntity.getEquippedStack(EquipmentSlot.FEET).isOf(Items.LEATHER_BOOTS) ||
               livingEntity.getEquippedStack(EquipmentSlot.FEET).isOf(ScuteArmor.SCUTE_BOOTS) ||
               livingEntity.getEquippedStack(EquipmentSlot.FEET).isOf(ScuteArmor.REINFORCED_SCUTE_BOOTS) ||
               livingEntity.getEquippedStack(EquipmentSlot.FEET).isOf(ScuteArmor.HARDENED_SCUTE_BOOTS)) {
                cir.setReturnValue(true);
            }
        }
    }
}
