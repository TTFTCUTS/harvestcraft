package com.pam.harvestcraft;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class BlockPamFruitingLog extends BlockRotatedPillar {

	public IIcon[] icons;
	public Item fruit;
	
	public BlockPamFruitingLog(String name, String texture) {
		super(Material.wood);
		this.setCreativeTab(harvestcraft.tabHarvestCraft2);
		this.setHardness(2.0F);
		this.setStepSound(soundTypeWood);
		this.setTickRandomly(true);
		this.setBlockTextureName(texture);
		this.setBlockName(name);
	}
	
	@Override
	public int quantityDropped(Random p_149745_1_)
    {
        return 1;
    }

	@Override
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return Item.getItemFromBlock(this);
    }

	@Override
    public void breakBlock(World p_149749_1_, int p_149749_2_, int p_149749_3_, int p_149749_4_, Block p_149749_5_, int p_149749_6_)
    {
        byte b0 = 4;
        int i1 = b0 + 1;

        if (p_149749_1_.checkChunksExist(p_149749_2_ - i1, p_149749_3_ - i1, p_149749_4_ - i1, p_149749_2_ + i1, p_149749_3_ + i1, p_149749_4_ + i1))
        {
            for (int j1 = -b0; j1 <= b0; ++j1)
            {
                for (int k1 = -b0; k1 <= b0; ++k1)
                {
                    for (int l1 = -b0; l1 <= b0; ++l1)
                    {
                        Block block = p_149749_1_.getBlock(p_149749_2_ + j1, p_149749_3_ + k1, p_149749_4_ + l1);
                        if (block.isLeaves(p_149749_1_, p_149749_2_ + j1, p_149749_3_ + k1, p_149749_4_ + l1))
                        {
                            block.beginLeavesDecay(p_149749_1_, p_149749_2_ + j1, p_149749_3_ + k1, p_149749_4_ + l1);
                        }
                    }
                }
            }
        }
    }

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ)
	{	
		
		int meta = world.getBlockMetadata(x, y, z);
		int stage = (meta & 3);
		int angle = meta & 12;
		
		if (stage == 3 && this.fruit != null) {
			if (!world.isRemote) {
				world.setBlockMetadataWithNotify(x, y, z, angle + 1, 2);
				
				int ox = ForgeDirection.getOrientation(side).offsetX;
				int oz = ForgeDirection.getOrientation(side).offsetZ;
				
				float fruitx = x + 0.5f + ox * 0.75f;
				float fruitz = z + 0.5f + oz * 0.75f;
				float fruity = y + 0.5f;
				
				EntityItem fruitentity = new EntityItem(world, fruitx, fruity, fruitz, new ItemStack(this.fruit));
				world.spawnEntityInWorld(fruitentity);
			}
			
			return true;
		}
		
		return false;
	}
	
	@Override
	public void updateTick(World world, int x, int y, int z, Random rand)
	{
		super.updateTick(world, x, y, z, rand);
		
		int meta = world.getBlockMetadata(x, y, z);
		int stage = (meta & 3);
		int angle = meta & 12;
		
		if (stage == 0) { return; }
		
		if (stage < 3)
		{
			if (rand.nextInt(30) == 0)
			{
				world.setBlock(x, y, z, this, stage + angle + 1, 2);
			}
		}
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    protected IIcon getSideIcon(int meta)
    {
		int index = meta < 2 ? 1 : meta;
        return this.icons[index % this.icons.length];
    }

	@Override
    @SideOnly(Side.CLIENT)
    protected IIcon getTopIcon(int meta)
    {
        return this.icons[0];
    }

    @Override
    public boolean canSustainLeaves(IBlockAccess world, int x, int y, int z)
    {
        return true;
    }

    @Override
    public boolean isWood(IBlockAccess world, int x, int y, int z)
    {
        return true;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.icons = new IIcon[4];

        this.icons[0] = p_149651_1_.registerIcon("harvestcraft:" + this.getTextureName() + "_top");
        this.icons[1] = p_149651_1_.registerIcon("harvestcraft:" + this.getTextureName() + "_0");
        this.icons[2] = p_149651_1_.registerIcon("harvestcraft:" + this.getTextureName() + "_1");
        this.icons[3] = p_149651_1_.registerIcon("harvestcraft:" + this.getTextureName() + "_2");
    }
}
