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

public class BlockInit {
	//vars
		//memes
	public static Block blockSW;
	public static Block blockSP;
		//machines
	public static Block blockFluidExchanger;
	public static Block blockPowerExchanger;
	
	public static void preInit(FMLPreInitializationEvent event) {		//joke items and blocks
		//memes
			//create
		blockSW = new BlockSW(Material.grass).setBlockName("BlockSW").setBlockTextureName("gbm:blocksw").setStepSound(Block.soundTypeGrass);
		blockSP = new BlockSP(Material.grass).setBlockName("BlockSP").setBlockTextureName("gbm:blocksp").setStepSound(Block.soundTypeGrass);
			//register
		GameRegistry.registerBlock(blockSW, blockSW.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockSP, blockSP.getUnlocalizedName().substring(5));
				
		//machines
			//create
		blockFluidExchanger = new BlockFluidExchanger(Material.rock).setBlockName("BlockFluidExchanger").setStepSound(Block.soundTypeMetal);
		blockPowerExchanger = new BlockPowerExchanger(Material.rock).setBlockName("BlockPowerExchanger").setStepSound(Block.soundTypeMetal);
			//register
		GameRegistry.registerBlock(blockFluidExchanger, blockFluidExchanger.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockPowerExchanger, blockPowerExchanger.getUnlocalizedName().substring(5));
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