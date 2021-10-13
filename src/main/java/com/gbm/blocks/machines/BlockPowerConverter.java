package com.gbm.blocks.machines;

import com.gbm.lib.RefStrings;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockPowerConverter extends Block {
	public IIcon Side0;
	public IIcon Side1;
	public IIcon Side2;
	public IIcon Side3;
	public IIcon Side4;
	public IIcon Side5;
	
	public BlockPowerConverter(Material material){
		super(material);
		// TODO Auto-generated constructor stub
	}
	public void registerBlockIcons(IIconRegister icon) {
		Side0 = icon.registerIcon(RefStrings.MODID + ":blockpowerconverterrf");
		Side1 = icon.registerIcon(RefStrings.MODID + ":blockpowerconverterrf");
		Side2 = icon.registerIcon(RefStrings.MODID + ":blockpowerconverterrf");
		Side3 = icon.registerIcon(RefStrings.MODID + ":blockpowerconverterhe");
		Side4 = icon.registerIcon(RefStrings.MODID + ":blockpowerconverterhe");
		Side5 = icon.registerIcon(RefStrings.MODID + ":blockpowerconverterhe");

	}
	
	public IIcon getIcon(int side, int meta) {
		if (side == 0) {
			return Side0;
		} else if (side == 1) {
			return Side1;
		} else if (side == 2) {
			return Side2;
		} else if (side == 3) {
			return Side3;
		} else if (side == 4) {
			return Side4;
		} else if (side == 5) {
			return Side5;
		} 
		return null;
	}
	
}
