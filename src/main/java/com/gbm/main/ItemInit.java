package com.gbm.main;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import codechicken.nei.api.API;

//my stuff
import com.gbm.items.memes.*;
import com.gbm.lib.RefStrings;
import com.gbm.main.BlockInit;
public class ItemInit {
	//vars
		//memes
	public static Item itemP;
	
	public static void preInit(FMLPreInitializationEvent event) {
		//memes
			//create
		itemP = new ItemP().setUnlocalizedName("ItemP").setTextureName(RefStrings.MODID + ":itemp");
		GameRegistry.registerItem(itemP, itemP.getUnlocalizedName().substring(5));
	}
	
	public static void init(FMLInitializationEvent event) {
		//recipes
			//memes
		GameRegistry.addRecipe(new ItemStack(itemP), new Object[]{" P ",
                												  " W ",
                												  "WWW", 'P', BlockInit.blockSP, 'W', BlockInit.blockSW
		});
	}
	
	public static void postInit(FMLPostInitializationEvent event) {
		API.hideItem(new ItemStack(itemP));
	}
}