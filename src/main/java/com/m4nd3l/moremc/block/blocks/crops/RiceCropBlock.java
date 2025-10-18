package com.m4nd3l.moremc.block.blocks.crops;

import com.m4nd3l.moremc.item.items.MiscItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemConvertible;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldView;

public class RiceCropBlock extends WaterCropBlock {

    public static final int MAX_AGE = 4;
    public static final IntProperty AGE = IntProperty.of("age", 0, MAX_AGE);
    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;

    public RiceCropBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState()
                .with(AGE, 0));

        this.setDefaultState(this.stateManager.getDefaultState()
                .with(this.getAgeProperty(), 0)
                .with(WATERLOGGED, true));

    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return MiscItems.RICE_SEEDS;
    }

    @Override
    protected IntProperty getAgeProperty() {
        return AGE;
    }

    @Override
    public int getMaxAge() {
        return MAX_AGE;
    }

    @Override
    protected boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockState below = world.getBlockState(pos.down());
        BlockState above = world.getBlockState(pos.up());

        boolean goodGround =
                below.isOf(net.minecraft.block.Blocks.CLAY) ||
                        below.isOf(net.minecraft.block.Blocks.SAND) ||
                        below.isOf(net.minecraft.block.Blocks.MUD) ||
                        below.isOf(net.minecraft.block.Blocks.GRAVEL);

        boolean airAbove = above.isAir();

        return goodGround && airAbove;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE, WATERLOGGED);
    }
}
