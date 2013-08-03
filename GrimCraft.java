/*
 *GrimCraft.java 1.0.0 7-26-2013
 *
 *Licenced under whatever we decide
 */


package thinkplank.grimcraft;

import thinkplank.grimcraft.item.*;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.*;
@Mod(modid="GrimCraft", name="GrimCraft", version="1.0.0")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)

public class GrimCraft {

	@Instance("GrimCraft")
	public static GrimCraft instance;

	public final static Item grimWoodStick = new GrimWoodStick(9150);

	@SidedProxy(clientSide="tutorial.generic.client.ClientProxy", serverSide="tutorial.generic.CommonProxy")
        public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {

	}

	@EventHandler
	public void load(FMLInitializationEvent event) {
		
		LanguageRegistry.addName(grimWoodStick, "Grimwood Stick");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}
