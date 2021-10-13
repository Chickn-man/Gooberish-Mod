package com.gbm.main;

import codechicken.nei.api.API;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;

//my stuff
import com.gbm.main.*;
import com.gbm.lib.RefStrings;

@Mod(modid = RefStrings.MODID, name = RefStrings.NAME, version = RefStrings.VERSION)
public class MainRegistry {
	@SidedProxy(clientSide = "com.gbm.main.ClientProxy", serverSide = "com.gbm.main.ServerProxy") 
	public static ServerProxy proxy;
	
	@EventHandler
	public void PreLoad(FMLPreInitializationEvent event) {
		ItemInit.preInit(event);
		BlockInit.preInit(event);
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event) {
		ItemInit.init(event);
		BlockInit.init(event);
	}
	
	@EventHandler
	public void PostLoad(FMLPostInitializationEvent event) {
		ItemInit.postInit(event);
		BlockInit.postInit(event);
	}
}