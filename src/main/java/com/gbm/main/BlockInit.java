package com.gbm.main;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import codechicken.nei.api.API;
//my stuff
import com.gbm.blocks.machines.*;
import com.gbm.blocks.memes.*;
import com.gbm.lib.RefStrings;

public class BlockInit {
	//vars
		//memes
	public static Block blockSW;
	public static Block blockSP;
		//machines
	public static Block blockFluidConverter;
	public static Block blockPowerConverter;
	public static Block blockMachineTest;
	
	public static void preInit(FMLPreInitializationEvent event) {
		//memes
			//create
		blockSW = new BlockSW(Material.grass).setBlockName("BlockSW").setBlockTextureName(RefStrings.MODID + ":blocksw").setStepSound(Block.soundTypeGrass);
		blockSP = new BlockSP(Material.grass).setBlockName("BlockSP").setBlockTextureName(RefStrings.MODID + ":blocksp").setStepSound(Block.soundTypeGrass);
		//register
		GameRegistry.registerBlock(blockSW, blockSW.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockSP, blockSP.getUnlocalizedName().substring(5));
				
		//machines
			//create
		blockFluidConverter = new BlockFluidConverter(Material.rock).setBlockName("BlockFluidConverter").setStepSound(Block.soundTypeMetal);
		blockPowerConverter = new BlockPowerConverter(Material.rock).setBlockName("BlockPowerConverter").setStepSound(Block.soundTypeMetal);
		blockMachineTest = new BlockMachineTest(Material.rock).setBlockName("BlockMachineTest").setStepSound(Block.soundTypeMetal);
			//register
		GameRegistry.registerBlock(blockFluidConverter, blockFluidConverter.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockPowerConverter, blockPowerConverter.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockMachineTest, blockMachineTest.getUnlocalizedName().substring(5));
	}

	public static void init(FMLInitializationEvent event) {
		//recipes
			//memes
		GameRegistry.addRecipe(new ItemStack(blockSW), new Object[]{"PPP",
                 													"PPP",
                 													"PPP", 'P', Items.porkchop
		});
		GameRegistry.addRecipe(new ItemStack(blockSP), new Object[]{"BBB",
																	"BBB",
																	"BBB", 'B', Items.beef
		});
	}
	
	public static void postInit(FMLPostInitializationEvent event) {
		API.hideItem(new ItemStack(blockSW));
	    API.hideItem(new ItemStack(blockSP));
	}	
}
