/*
 * This class is where you create and register new blocks. It also comes with a method by which any item you register here gets
 * attached to a texture that can give your item a unique look. Go through the methods below and and copy block variables in the style
 * given and you will be able to create many different types of blocks.
 */

package org.educraft.mymod.init;

import org.educraft.mymod.blockclasses.BlockCropKale;
import org.educraft.mymod.blockclasses.BlockJar;
import org.educraft.mymod.blockclasses.BlockName;
import org.educraft.mymod.blockclasses.ModBlockOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemBlock;

public class ModBlocks {

	//Block variables go here
	public static Block block_name;	
	public static Block jar;
	public static Block material_ore;
	public static Block crop_kale;
	

	public static void init() {
		//Initialize items with class
		block_name = new BlockName();
		jar = new BlockJar();
		material_ore = new ModBlockOre("material_ore", "BlockMaterialOre", Material.ROCK, ModBlocks.material_ore, 1, 1);
		crop_kale = new BlockCropKale();
	}

	public static void register() {
		//Register items with forge
		registerBlock(block_name);
		registerBlock(jar);
		registerBlock(material_ore);
		registerBlock(crop_kale);
	}

	private static void registerBlock(Block block) {
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}

	public static void registerRenders() {
		//List of items calling the registerRender method
		registerRender(block_name);
		registerRender(jar);
		registerRender(material_ore);
		registerRender(crop_kale);
	}

	private static void registerRender(Block block) {
		//Method used to register item with texture
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}