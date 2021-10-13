package com.gbm.blocks.machines;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

//my stuff
import com.gbm.tileentity.machines.TileEntityMachineTest;
import com.gbm.lib.RefStrings;

//bobs stuff
import com.hbm.interfaces.IConsumer;

public class BlockMachineTest extends Block {

	private IIcon iconBottom;
	private IIcon iconTop;
	private IIcon iconSide;

	public BlockMachineTest(Material material) {
		super(material);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		this.iconBottom = iconRegister.registerIcon(RefStrings.MODID + ":machinetestbottom");
		this.iconTop = iconRegister.registerIcon(RefStrings.MODID + ":machinetesttop");
		this.iconSide = iconRegister.registerIcon(RefStrings.MODID + ":machinetestside");
		this.blockIcon = iconRegister.registerIcon(RefStrings.MODID + ":machinetestfront");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int metadata) {
		if(side == 0)
			return iconBottom;
		if(side == 1)
			return iconTop;
		if(side == 2 || side == 3)
			return blockIcon;
		if(side == 4 || side == 5)
			return iconSide;
		
		return null;
	}
	
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TileEntityMachineTest();
	}
	
}
