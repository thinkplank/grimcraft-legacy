/*
 *GrimCraft.java 1.0.0 8-22-2013
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
@Mod(modid="grimcraft", name="grimcraft", version="1.0.0")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)

public class GrimCraft {

	@Instance("GrimCraft")
	public static GrimCraft instance;
	
	public final static Block sulfurOre = new BlockSulfurOre(9161, Material.rock);

	public final static Item grimWoodStick = new ItemGrimWoodStick(9150);
	
	//Tools go here
	
	public final static Item witherBone = new ItemWitherBone(9427);
	public final static Item witherBonemeal = new ItemWitherBonemeal(9428);
	public final static Item sulfur = new ItemSulfur(9429);
	public final static Item barley = new ItemBarley(9421);
	public final static Item barleySeeds = new ItemBarleySeeds(9432);
	public final static Item strawberry = new ItemBarleySeeds(9433);
	public final static Item chiliPepper = new ItemChiliPepper(9434);
	public final static Item phoenixEgg = new ItemPhoenixEgg(9435);

	@SidedProxy(clientSide="thinkplank.grimcraft.client.ClientProxy", serverSide="thinkplank.grimcraft.CommonProxy")
        public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {

	}

	@EventHandler
	public void load(FMLInitializationEvent event) {
		
		LanguageRegistry.addName(grimWoodStick, "Grimwood Stick");
		LanguageRegistry.addName(witherBone, "Wither Bone");
		LanguageRegistry.addName(witherBonemeal, "WIther Bonemeal");
		LanguageRegistry.addName(sulfur, "Sulfur");
		LanguageRegistry.addName(barley, "Barley");
		LanguageRegistry.addName(barleySeeds, "Barley Seeds");
		LanguageRegistry.addName(strawberry, "Strawberry");
		LanguageRegistry.addName(chiliPepper, "Chili Pepper");
		LangaugeRegistry.addName(phoenixEgg, "Phoenix Egg");
		
		LanguageRegistry.addName(sulfurOre, "Sulfur Ore");
		MinecraftForge.setBlockHarvestLevel(sulfurOre, "pickaxe", 0);
		GameRegistry.registerBlock(sulfurOre, "sulfurore");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}
