package com.m4nd3l.moremc.block.blocks.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class SkyWoodLampBlock extends Block {

    public static final BooleanProperty CLICKED = BooleanProperty.of("clicked");

    public SkyWoodLampBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if(!world.isClient) {
            world.setBlockState(pos, state.cycle(CLICKED));
            world.playSound(null, pos,
                    BlockSoundGroup.COPPER_BULB.getPlaceSound(),
                    net.minecraft.sound.SoundCategory.BLOCKS,
                    1.0f, 1.0f);
        }

        return ActionResult.SUCCESS;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(CLICKED);
    }
}
