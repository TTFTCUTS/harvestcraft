package com.pam.harvestcraft;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import powercrystals.minefactoryreloaded.api.FertilizerType;
import powercrystals.minefactoryreloaded.api.IFactoryFertilizable;

public class FertilizableMFRCrop implements IFactoryFertilizable
{
    private Block _blockId;

    public FertilizableMFRCrop(Block blockId)
    {
        _blockId = blockId;
    }

    @Override
    public Block getPlant ()
    {
        return _blockId;
    }

    @Override
    public boolean canFertilize (World world, int x, int y, int z, FertilizerType fertilizerType)
    {
        return fertilizerType == FertilizerType.GrowPlant && world.getBlockMetadata(x, y, z) < 7;
    }

    @Override
    public boolean fertilize (World world, Random rand, int x, int y, int z, FertilizerType fertilizerType)
    {
        int meta = world.getBlockMetadata(x, y, z);
        if (meta < 7)
        {
        	world.setBlockMetadataWithNotify(x, y, z, 7, 2);
            return true;
        }
        return false;
    }
}