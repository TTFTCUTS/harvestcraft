 package com.pam.harvestcraft;
 
 import cpw.mods.fml.relauncher.Side;
 import cpw.mods.fml.relauncher.SideOnly;
 import net.minecraft.block.BlockCake;
 import net.minecraft.entity.player.EntityPlayer;
 import net.minecraft.util.AxisAlignedBB;
 import net.minecraft.world.IBlockAccess;
 import net.minecraft.world.World;
 
 public class BlockPamCake
   extends BlockCake
 {
   private int bites;
   
   public BlockPamCake(int bites)
   {
	 super();
	 this.setStepSound(soundTypeCloth);
	 this.disableStats();
     this.bites = bites;
   }

   @Override
   public void setBlockBoundsBasedOnState(IBlockAccess world, int x, int y, int z)
   {
     int l = world.getBlockMetadata(x, y, z);
     float f = 0.0625F;
     float f1 = f + ((14.0f/16.0f) * (l / (float)bites));
     float f2 = 0.5F;
     setBlockBounds(f1, 0.0F, f, 1.0F - f, f2, 1.0F - f);
   }

   @Override
   public void setBlockBoundsForItemRender()
   {
     float f = 0.0625F;
     float f1 = 0.5F;
     setBlockBounds(f, 0.0F, f, 1.0F - f, f1, 1.0F - f);
   }

   @Override
   public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_)
   {
     int l = p_149668_1_.getBlockMetadata(p_149668_2_, p_149668_3_, p_149668_4_);
     float f = 0.0625F;
     float f1 = f + ((14.0f/16.0f) * (l / (float)bites));
     float f2 = 0.5F;
     return AxisAlignedBB.getBoundingBox(p_149668_2_ + f1, p_149668_3_, p_149668_4_ + f, p_149668_2_ + 1 - f, p_149668_3_ + f2 - f, p_149668_4_ + 1 - f);
   }

   @Override
   @SideOnly(Side.CLIENT)
   public AxisAlignedBB getSelectedBoundingBoxFromPool(World p_149633_1_, int p_149633_2_, int p_149633_3_, int p_149633_4_)
   {
     int l = p_149633_1_.getBlockMetadata(p_149633_2_, p_149633_3_, p_149633_4_);
     float f = 0.0625F;
     float f1 = f + ((14.0f/16.0f) * (l / (float)bites));
     float f2 = 0.5F;
     return AxisAlignedBB.getBoundingBox(p_149633_2_ + f1, p_149633_3_, p_149633_4_ + f, p_149633_2_ + 1 - f, p_149633_3_ + f2, p_149633_4_ + 1 - f);
   }

   @Override
   public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ)
   {
     consume(world, x, y, z, player);
     return true;
   }

   @Override
   public void onBlockClicked(World world, int x, int y, int z, EntityPlayer player)
   {
     consume(world, x, y, z, player);
   }
   
   private void consume(World world, int x, int y, int z, EntityPlayer player)
   {
     //if (player.canEat(false))
     //{
       player.getFoodStats().addStats(2, 0.1F);
       int l = world.getBlockMetadata(x, y, z) + 1;
       
       if (l >= this.bites)
       {
         world.setBlockToAir(x, y, z);
       }
       else
       {
         world.setBlockMetadataWithNotify(x, y, z, l, 2);
       }
     //}
   }
 }
