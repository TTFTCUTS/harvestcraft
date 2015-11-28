package com.pam.harvestcraft;

import cpw.mods.fml.relauncher.Side;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerOven extends Container
{
  private TileEntityOven tileOven;
  private int lastCookTime;
  private int lastBurnTime;
  private int lastItemBurnTime;
  private static final String __OBFID = "CL_00001748";
  
public ContainerOven(InventoryPlayer p_i1812_1_, TileEntityOven p_i1812_2_)
{
    this.tileOven = p_i1812_2_;
    this.addSlotToContainer(new Slot(p_i1812_2_, 0, 56, 17));
    this.addSlotToContainer(new Slot(p_i1812_2_, 1, 56, 53));
    this.addSlotToContainer(new SlotOven(p_i1812_1_.player, p_i1812_2_, 2, 116, 35));
    int i;

    for (i = 0; i < 3; ++i)
    {
        for (int j = 0; j < 9; ++j)
        {
            this.addSlotToContainer(new Slot(p_i1812_1_, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
        }
    }

    for (i = 0; i < 9; ++i)
    {
        this.addSlotToContainer(new Slot(p_i1812_1_, i, 8 + i * 18, 142));
    }
}

public void addCraftingToCrafters(ICrafting p_75132_1_)
{
    super.addCraftingToCrafters(p_75132_1_);
    p_75132_1_.sendProgressBarUpdate(this, 0, this.tileOven.ovenCookTime);
    p_75132_1_.sendProgressBarUpdate(this, 1, this.tileOven.ovenBurnTime);
    p_75132_1_.sendProgressBarUpdate(this, 2, this.tileOven.currentItemBurnTime);
}
  public void detectAndSendChanges()
  {
    super.detectAndSendChanges();
    
    for (int i = 0; i < this.crafters.size(); i++)
    {
      ICrafting icrafting = (ICrafting)this.crafters.get(i);
      
      if (this.lastCookTime != this.tileOven.ovenCookTime)
      {
        icrafting.sendProgressBarUpdate(this, 0, this.tileOven.ovenCookTime);
      }
      
      if (this.lastBurnTime != this.tileOven.ovenBurnTime)
      {
        icrafting.sendProgressBarUpdate(this, 1, this.tileOven.ovenBurnTime);
      }
      
      if (this.lastItemBurnTime != this.tileOven.currentItemBurnTime)
      {
        icrafting.sendProgressBarUpdate(this, 2, this.tileOven.currentItemBurnTime);
      }
    }
    
    this.lastCookTime = this.tileOven.ovenCookTime;
    this.lastBurnTime = this.tileOven.ovenBurnTime;
    this.lastItemBurnTime = this.tileOven.currentItemBurnTime;
  }
  
  @cpw.mods.fml.relauncher.SideOnly(Side.CLIENT)
  public void updateProgressBar(int p_75137_1_, int p_75137_2_)
  {
    if (p_75137_1_ == 0)
    {
      this.tileOven.ovenCookTime = p_75137_2_;
    }
    
    if (p_75137_1_ == 1)
    {
      this.tileOven.ovenBurnTime = p_75137_2_;
    }
    
    if (p_75137_1_ == 2)
    {
      this.tileOven.currentItemBurnTime = p_75137_2_;
    }
  }
  
  public boolean canInteractWith(EntityPlayer p_75145_1_)
  {
    return this.tileOven.isUseableByPlayer(p_75145_1_);
  }
  



  public ItemStack transferStackInSlot(EntityPlayer p_82846_1_, int p_82846_2_)
  {
    ItemStack itemstack = null;
    Slot slot = (Slot)this.inventorySlots.get(p_82846_2_);
    
    if ((slot != null) && (slot.getHasStack()))
    {
      ItemStack itemstack1 = slot.getStack();
      itemstack = itemstack1.copy();
      
      if (p_82846_2_ == 2)
      {
        if (!mergeItemStack(itemstack1, 3, 39, true))
        {
          return null;
        }
        
        slot.onSlotChange(itemstack1, itemstack);
      }
      else if ((p_82846_2_ != 1) && (p_82846_2_ != 0))
      {
        if (OvenRecipes.smelting().getSmeltingResult(itemstack1) != null)
        {
          if (!mergeItemStack(itemstack1, 0, 1, false))
          {
            return null;
          }
        }
        else if (TileEntityOven.isItemFuel(itemstack1))
        {
          if (!mergeItemStack(itemstack1, 1, 2, false))
          {
            return null;
          }
        }
        else if ((p_82846_2_ >= 3) && (p_82846_2_ < 30))
        {
          if (!mergeItemStack(itemstack1, 30, 39, false))
          {
            return null;
          }
        }
        else if ((p_82846_2_ >= 30) && (p_82846_2_ < 39) && (!mergeItemStack(itemstack1, 3, 30, false)))
        {
          return null;
        }
      }
      else if (!mergeItemStack(itemstack1, 3, 39, false))
      {
        return null;
      }
      
      if (itemstack1.stackSize == 0)
      {
        slot.putStack((ItemStack)null);
      }
      else
      {
        slot.onSlotChanged();
      }
      
      if (itemstack1.stackSize == itemstack.stackSize)
      {
        return null;
      }
      
      slot.onPickupFromSlot(p_82846_1_, itemstack1);
    }
    
    return itemstack;
  }
}