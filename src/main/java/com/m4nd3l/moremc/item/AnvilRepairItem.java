package com.m4nd3l.moremc.item;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Objects;

public class AnvilRepairItem extends Item {
    public AnvilRepairItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos pos = context.getBlockPos();
        BlockState state = world.getBlockState(pos);

        Block replacement = null;
        int cost = 0;

        if (state.isOf(Blocks.CHIPPED_ANVIL)) {
            replacement = Blocks.ANVIL;
            cost = 1;
        } else if (state.isOf(Blocks.DAMAGED_ANVIL)) {
            replacement = Blocks.CHIPPED_ANVIL;
            cost = 2;
        }

        if (replacement != null) {
            if (!world.isClient) {
                BlockState newState = replacement.getDefaultState();
                if (state.contains(Properties.HORIZONTAL_FACING)) {
                    newState = newState.with(Properties.HORIZONTAL_FACING, state.get(Properties.HORIZONTAL_FACING));
                }

                world.setBlockState(pos, newState);
                world.playSound(null, pos,
                        BlockSoundGroup.ANVIL.getPlaceSound(),
                        net.minecraft.sound.SoundCategory.BLOCKS,
                        1.0f, 1.0f);
                damageItem(context, world, cost);
            }
            return ActionResult.SUCCESS;
        }

        return ActionResult.CONSUME;
    }

    private void damageItem(ItemUsageContext context, World world, int amount) {
        context.getStack().damage(amount, ((ServerWorld) world), ((ServerPlayerEntity) context.getPlayer()), item ->
                Objects.requireNonNull(context.getPlayer()).sendEquipmentBreakStatus(item, EquipmentSlot.MAINHAND));
    }
}
