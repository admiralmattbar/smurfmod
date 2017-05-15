package org.educraft.mymod.itemclasses;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.common.IPlantable;

public class ItemSeedKale extends ItemSeeds implements IPlantable {
	
	private Block crops;
	private Block soilBlockID;

	public ItemSeedKale(Block crops, Block soil) {
		super(crops, soil);
		this.crops = crops;
		this.soilBlockID = soil;
		this.setUnlocalizedName("kale_seeds");
		this.setRegistryName("item_kale_seeds");
		this.setCreativeTab(CreativeTabs.MATERIALS);
	}
	
	@Override
	public net.minecraft.block.state.IBlockState getPlant(net.minecraft.world.IBlockAccess word, BlockPos pos)
	{
		return this.crops.getDefaultState();
	}
}
