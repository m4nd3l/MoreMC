package com.m4nd3l.moremc.block.blocks.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;


public class SushiGetaBlock extends Block{

    private static final VoxelShape SHAPE = VoxelShapes.union(
            Block.createCuboidShape(0, 0, 0, 16, 13, 16),
            Block.createCuboidShape(3, 13, 3, 5, 15, 5),
            Block.createCuboidShape(3, 13, 11, 5, 15, 13),
            Block.createCuboidShape(11, 13, 11, 13, 15, 13),
            Block.createCuboidShape(11, 13, 3, 13, 15, 5),
            Block.createCuboidShape(2, 15, 2, 14, 16, 14)
    );

    public SushiGetaBlock(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

}
