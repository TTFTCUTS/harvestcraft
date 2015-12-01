/*     */ package com.pam.harvestcraft;
/*     */ 
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.block.material.Material;
/*     */ import net.minecraft.client.renderer.texture.IIconRegister;
/*     */ import net.minecraft.creativetab.CreativeTabs;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.util.AxisAlignedBB;
/*     */ import net.minecraft.util.IIcon;
/*     */ import net.minecraft.util.MathHelper;
/*     */ import net.minecraft.world.IBlockAccess;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class BlockPamFruit
/*     */   extends Block
/*     */ {
/*     */   public IIcon[] icons;
/*     */   private String fruit;
/*     */   Item treeDrop;
/*     */   
/*     */   public BlockPamFruit(String fruit)
/*     */   {
/*  33 */     super(Material.circuits);
/*  34 */     setTickRandomly(true);
/*  35 */     this.setCreativeTab(harvestcraft.tabHarvestCraft2);
/*  36 */     setStepSound(Block.soundTypeGrass);
/*  37 */     this.fruit = fruit;
/*     */   }
/*     */   
/*     */   public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_)
/*     */   {
/*  57 */     return null;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void registerBlockIcons(IIconRegister par1IconRegister)
/*     */   {
/*  65 */     this.icons = new IIcon[3];
/*     */     
/*  67 */     for (int i = 0; i < this.icons.length; i++)
/*     */     {
/*  69 */       this.icons[i] = par1IconRegister.registerIcon("harvestcraft:" + this.fruit + "_" + i);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public boolean onBlockActivated(World world, int par2, int par3, int par4, EntityPlayer player, int par6, float par7, float par8, float par9)
/*     */   {
/*  77 */     if (BlockRegistry.rightclickmatureshowfruitHearts == true)
/*     */     {
/*  79 */       int meta = world.getBlockMetadata(par2, par3, par4);
/*     */       
/*  81 */       if (meta == 2)
/*     */       {
/*  83 */         float f = par2 + 0.5F;
/*  84 */         float f1 = par3 + 0.0F + 0.375F;
/*  85 */         float f2 = par4 + 0.5F;
/*  86 */         float f3 = 0.52F;
/*  87 */         float f4 = 0.3F;
/*  88 */         world.spawnParticle("heart", f - f3, f1, f2 + f4, 0.0D, 0.0D, 0.0D);
/*     */       }
/*     */     }
/*  91 */     if (BlockRegistry.rightclickharvestFruit == true)
/*     */     {
/*  93 */       int meta = world.getBlockMetadata(par2, par3, par4);
/*     */       
/*  95 */       if (meta == 2)
/*     */       {
/*  97 */         if (meta == 2)
/*     */         {
/*  99 */           dropBlockAsItem(world, par2, par3, par4, meta, 0);
/* 100 */           world.setBlock(par2, par3, par4, this, 0, 2);
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 105 */     return false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   @SideOnly(Side.CLIENT)
/*     */   public IIcon getIcon(int par1, int par2)
/*     */   {
/* 116 */     return this.icons[(par2 % this.icons.length)];
/*     */   }
/*     */   
/*     */   public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
/*     */   {
/* 121 */     super.updateTick(par1World, par2, par3, par4, par5Random);
/*     */     
/* 123 */     int var6 = par1World.getBlockMetadata(par2, par3, par4);
/*     */     
/* 125 */     if (var6 < 2)
/*     */     {
/* 127 */       if (par5Random.nextInt(30) == 0)
/*     */       {
/* 129 */         var6++;
/* 130 */         par1World.setBlock(par2, par3, par4, this, var6, 2);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void fertilize(World par1World, int par2, int par3, int par4)
/*     */   {
/* 140 */     int l = par1World.getBlockMetadata(par2, par3, par4) + MathHelper.getRandomIntegerInRange(par1World.rand, 2, 5);
/*     */     
/* 142 */     if (l > 2)
/*     */     {
/* 144 */       l = 2;
/*     */     }
/*     */     
/* 147 */     par1World.setBlockMetadataWithNotify(par2, par3, par4, l, 2);
/*     */   }
/*     */   
/*     */ 
/*     */   public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
/*     */   {
/* 153 */     if (this == BlockRegistry.pamApple)
/*     */     {
/* 155 */       return Items.apple;
/*     */     }
/* 157 */     if (this == BlockRegistry.pamAlmond)
/*     */     {
/* 159 */       return ItemRegistry.almondItem;
/*     */     }
/* 161 */     if (this == BlockRegistry.pamApricot)
/*     */     {
/* 163 */       return ItemRegistry.apricotItem;
/*     */     }
/* 165 */     if (this == BlockRegistry.pamAvocado)
/*     */     {
/* 167 */       return ItemRegistry.avocadoItem;
/*     */     }
/* 169 */     if (this == BlockRegistry.pamBanana)
/*     */     {
/* 171 */       return ItemRegistry.bananaItem;
/*     */     }
/* 173 */     if (this == BlockRegistry.pamCashew)
/*     */     {
/* 175 */       return ItemRegistry.cashewItem;
/*     */     }
/* 177 */     if (this == BlockRegistry.pamCherry)
/*     */     {
/* 179 */       return ItemRegistry.cherryItem;
/*     */     }
/* 181 */     if (this == BlockRegistry.pamChestnut)
/*     */     {
/* 183 */       return ItemRegistry.chestnutItem;
/*     */     }
/* 189 */     if (this == BlockRegistry.pamCoconut)
/*     */     {
/* 191 */       return ItemRegistry.coconutItem;
/*     */     }
/* 193 */     if (this == BlockRegistry.pamDate)
/*     */     {
/* 195 */       return ItemRegistry.dateItem;
/*     */     }
/* 197 */     if (this == BlockRegistry.pamDragonfruit)
/*     */     {
/* 199 */       return ItemRegistry.dragonfruitItem;
/*     */     }
/* 201 */     if (this == BlockRegistry.pamDurian)
/*     */     {
/* 203 */       return ItemRegistry.durianItem;
/*     */     }
/* 205 */     if (this == BlockRegistry.pamFig)
/*     */     {
/* 207 */       return ItemRegistry.figItem;
/*     */     }
/* 209 */     if (this == BlockRegistry.pamGrapefruit)
/*     */     {
/* 211 */       return ItemRegistry.grapefruitItem;
/*     */     }
/* 213 */     if (this == BlockRegistry.pamLemon)
/*     */     {
/* 215 */       return ItemRegistry.lemonItem;
/*     */     }
/* 217 */     if (this == BlockRegistry.pamLime)
/*     */     {
/* 219 */       return ItemRegistry.limeItem;
/*     */     }
/* 225 */     if (this == BlockRegistry.pamMango)
/*     */     {
/* 227 */       return ItemRegistry.mangoItem;
/*     */     }
/* 229 */     if (this == BlockRegistry.pamNutmeg)
/*     */     {
/* 231 */       return ItemRegistry.nutmegItem;
/*     */     }
/* 233 */     if (this == BlockRegistry.pamOlive)
/*     */     {
/* 235 */       return ItemRegistry.oliveItem;
/*     */     }
/* 237 */     if (this == BlockRegistry.pamOrange)
/*     */     {
/* 239 */       return ItemRegistry.orangeItem;
/*     */     }
/* 241 */     if (this == BlockRegistry.pamPapaya)
/*     */     {
/* 243 */       return ItemRegistry.papayaItem;
/*     */     }
/* 249 */     if (this == BlockRegistry.pamPeach)
/*     */     {
/* 251 */       return ItemRegistry.peachItem;
/*     */     }
/* 253 */     if (this == BlockRegistry.pamPear)
/*     */     {
/* 255 */       return ItemRegistry.pearItem;
/*     */     }
/* 257 */     if (this == BlockRegistry.pamPecan)
/*     */     {
/* 259 */       return ItemRegistry.pecanItem;
/*     */     }
/* 261 */     if (this == BlockRegistry.pamPeppercorn)
/*     */     {
/* 263 */       return ItemRegistry.peppercornItem;
/*     */     }
/* 265 */     if (this == BlockRegistry.pamPersimmon)
/*     */     {
/* 267 */       return ItemRegistry.persimmonItem;
/*     */     }
/* 269 */     if (this == BlockRegistry.pamPistachio)
/*     */     {
/* 271 */       return ItemRegistry.pistachioItem;
/*     */     }
/* 273 */     if (this == BlockRegistry.pamPlum)
/*     */     {
/* 275 */       return ItemRegistry.plumItem;
/*     */     }
/* 277 */     if (this == BlockRegistry.pamPomegranate)
/*     */     {
/* 279 */       return ItemRegistry.pomegranateItem;
/*     */     }
/* 281 */     if (this == BlockRegistry.pamStarfruit)
/*     */     {
/* 283 */       return ItemRegistry.starfruitItem;
/*     */     }
/* 285 */     if (this == BlockRegistry.pamVanillabean)
/*     */     {
/* 287 */       return ItemRegistry.vanillabeanItem;
/*     */     }
/* 289 */     if (this == BlockRegistry.pamWalnut)
/*     */     {
/* 291 */       return ItemRegistry.walnutItem;
/*     */     }
				if (this == BlockRegistry.pamGooseberry)
/*     */     {
/* 291 */       return ItemRegistry.gooseberryItem;
/*     */     }
/* 293 */     return Items.wheat;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public int quantityDropped(Random random)
/*     */   {
/* 300 */     return 1;
/*     */   }
/*     */   
/*     */ 
/*     */   public boolean canPlaceBlockAt(World world, int i, int j, int k)
/*     */   {
/* 306 */     Block l = world.getBlock(i, j + 1, k);
/*     */     
/*     */ 
/* 309 */     return l == Blocks.leaves;
/*     */   }
/*     */   
/*     */   public void onNeighborBlockChange(World p_149695_1_, int p_149695_2_, int p_149695_3_, int p_149695_4_, Block p_149695_5_)
/*     */   {
/* 314 */     if (!canBlockStay(p_149695_1_, p_149695_2_, p_149695_3_, p_149695_4_))
/*     */     {
/* 316 */       p_149695_1_.func_147480_a(p_149695_2_, p_149695_3_, p_149695_4_, false);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean canBlockStay(World world, int i, int j, int k)
/*     */   {
/* 334 */     return canPlaceBlockAt(world, i, j, k);
/*     */   }
/*     */   
/*     */ 

/*     */   public boolean isOpaqueCube()
/*     */   {
/* 369 */     return false;
/*     */   }
/*     */   
/*     */   public boolean renderAsNormalBlock()
/*     */   {
/* 386 */     return false;
/*     */   }
/*     */   
/*     */   public int getRenderType()
/*     */   {
/* 404 */     return 1;
/*     */   }
/*     */   
/*     */   public float getBlockHardness(World par1World, int par2, int par3, int par4)
/*     */   {
/* 409 */     int meta = par1World.getBlockMetadata(par2, par3, par4);
/* 410 */     if (meta == 2) return 0.0F;
/* 411 */     return 5.0F;
/*     */   }
/*     */   
/*     */ 
/*     */   public void onBlockDestroyedByPlayer(World world, int par2, int par3, int par4, int par5)
/*     */   {
/* 417 */     if (par5 == 2)
/*     */     {
/* 419 */       world.setBlock(par2, par3, par4, this, 0, 2);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void getSubBlocks(Item par1, CreativeTabs par2CreativeTabs, List par3List)
/*     */   {
/* 428 */     for (int i = 0; i < 1; i++)
/*     */     {
/* 430 */       par3List.add(new ItemStack(par1, 1, i));
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Modding\Desktop\Pam's HarvestCraft 1.7.10k.deobf.jar!\com\pam\harvestcraft\BlockPamFruit.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */