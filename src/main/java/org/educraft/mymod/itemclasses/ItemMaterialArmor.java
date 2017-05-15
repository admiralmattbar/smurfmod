package org.educraft.mymod.itemclasses;

import org.educraft.mymod.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.Entity;

public class ItemMaterialArmor extends ItemArmor {



	public ItemMaterialArmor(ArmorMaterial materialIn, int renderIndex, EntityEquipmentSlot equipmentSlot) {
		super(materialIn, renderIndex, equipmentSlot);
		setCreativeTab(CreativeTabs.COMBAT); //Places item in the COMBAT tab for Creative Tabs.
		

	}

}
