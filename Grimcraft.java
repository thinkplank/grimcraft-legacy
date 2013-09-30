/*
 * Grimcraft.java 1.0.0 9-26-2013
 * Made with love by Lapiman and Fox
 * Licensed under whatever we decide
 */


package thinkplank.grimcraft;

import thinkplank.grimcraft.block.*;
import thinkplank.grimcraft.item.*;
import net.minecraft.item.*;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid="grimcraft", name="grimcraft", version="1.0.0")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)

public class Grimcraft {
	@Instance("Grimcraft")
	public static Grimcraft instance;
	
	public final static Block grimWoodPlanks = new BlockGrimWoodPlanks(916, Material.wood);
	public final static Block sulfurOre = new BlockSulfurOre(926, Material.rock);

	public final static Item grimWoodStick = new ItemGrimWoodStick(9406);
	
	/*Tools go here*/
	
	public final static Item witherBone = new ItemWitherBone(9427);
	public final static Item witherBonemeal = new ItemWitherBonemeal(9428);
	public final static Item sulfur = new ItemSulfur(9429);
	public final static Item barley = new ItemBarley(9421);
	public final static Item barleySeeds = new ItemBarleySeeds(9432);
	public final static Item strawberry = new ItemStrawberry(9433);
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
		LanguageRegistry.addName(witherBonemeal, "Wither Bonemeal");
		LanguageRegistry.addName(sulfur, "Sulfur");
		LanguageRegistry.addName(barley, "Barley");
		LanguageRegistry.addName(barleySeeds, "Barley Seeds");
		LanguageRegistry.addName(strawberry, "Strawberry");
		LanguageRegistry.addName(chiliPepper, "Chili Pepper");
		LanguageRegistry.addName(phoenixEgg, "Phoenix Egg");
		
		LanguageRegistry.addName(sulfurOre, "Sulfur Ore");
		MinecraftForge.setBlockHarvestLevel(sulfurOre, "pickaxe", 0);
		GameRegistry.registerBlock(sulfurOre, "sulfurOre");
		
		LanguageRegistry.addName(grimWoodPlanks, "Grimwood Planks");
		MinecraftForge.setBlockHarvestLevel(grimWoodPlanks, "axe", 0);
		GameRegistry.registerBlock(grimWoodPlanks, "grimwoodPlanks");
		
		GameRegistry.addRecipe(new ItemStack(grimWoodStick), "x", "x", 'x', new ItemStack(grimWoodPlanks));
		GameRegistry.addRecipe(new ItemStack(witherBonemeal, 3), "x", 'x', new ItemStack(witherBone));
		
		GameRegistry.addSmelting(sulfurOre.blockID, new ItemStack(sulfur), 0.2f);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}
