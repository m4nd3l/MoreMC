package com.m4nd3l.moremc.mixin;

import com.m4nd3l.moremc.item.armor.ScuteArmor;
import net.minecraft.block.BlockState;
import net.minecraft.block.MagmaBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MagmaBlock.class)
public class MagmaBlockMixin {

    @Inject(method = "onSteppedOn", at = @At("HEAD"), cancellable = true)
    private void onSteppedOnMixin(World world, BlockPos pos, BlockState state, Entity entity, CallbackInfo ci) {
        if (entity.bypassesSteppingEffects()) return;

        if (entity instanceof LivingEntity livingEntity) {
            if (livingEntity.getEquippedStack(EquipmentSlot.FEET).isOf(ScuteArmor.SCUTE_BOOTS)
                    || livingEntity.getEquippedStack(EquipmentSlot.FEET).isOf(ScuteArmor.REINFORCED_SCUTE_BOOTS)
                    || livingEntity.getEquippedStack(EquipmentSlot.FEET).isOf(ScuteArmor.HARDENED_SCUTE_BOOTS)) {
                ci.cancel();
            }
        }
    }
}
