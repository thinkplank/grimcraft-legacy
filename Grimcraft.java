/*
 * Grimcraft.java 1.0.0 11-19-2013
 * Made with love by Lapiman and Fox
 * Licensed under whatever we decide
 * To-do: Rename beetroot
 */


package thinkplank.grimcraft;

import thinkplank.grimcraft.block.*;
import thinkplank.grimcraft.item.*;
import net.minecraft.item.*;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.EnumHelper;
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
	
	static EnumToolMaterial grimWoodMaterial = EnumHelper.addToolMaterial("GRIMWOOD", 4, 59, 2.0F, 0.0F, 15);
	
	public final static Block grimWoodPlanks = new BlockGrimWoodPlanks(916, Material.wood);
	public final static Block fossilstoneOre = new BlockFossilstoneOre(922, Material.rock);
	public final static Block netherCoalOre = new BlockNetherCoalOre(923, Material.rock);
	public final static Block netherGoldOre = new BlockNetherGoldOre(924, Material.rock);
	public final static Block netherRedstoneOre = new BlockNetherRedstoneOre(925, Material.rock);
	public final static Block sulfurOre = new BlockSulfurOre(926, Material.rock);
	public final static Block blockSulfur = new BlockSulfur(927, Material.rock);
	
	public final static Item grimWoodStick = new ItemGrimWoodStick(9406);
	

	public final static Item grimWoodShovel = new ItemGrimWoodShovel(9407, grimWoodMaterial);
	public final static Item grimWoodPickaxe = new ItemGrimWoodPickaxe(9408, grimWoodMaterial);
	public final static Item grimWoodAxe = new ItemGrimWoodAxe(9409, grimWoodMaterial);
	public final static Item grimWoodHoe = new ItemGrimWoodHoe(9410, grimWoodMaterial);
	public final static Item grimWoodSword = new ItemGrimWoodSword(9412, grimWoodMaterial);
	
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
		
		LanguageRegistry.addName(grimWoodPlanks, "Grimwood Planks");
		MinecraftForge.setBlockHarvestLevel(grimWoodPlanks, "axe", 4);
		GameRegistry.registerBlock(grimWoodPlanks, "grimwoodPlanks");
		
		LanguageRegistry.addName(fossilstoneOre, "Fossilstone Ore");
		MinecraftForge.setBlockHarvestLevel(fossilstoneOre, "pickaxe", 4);
		GameRegistry.registerBlock(fossilstoneOre, "fossilstoneOre");
		
		LanguageRegistry.addName(netherCoalOre, "Nether Coal Ore");
		MinecraftForge.setBlockHarvestLevel(netherCoalOre, "pickaxe", 4);
		GameRegistry.registerBlock(netherCoalOre, "netherCoalOre");
		
		LanguageRegistry.addName(netherGoldOre, "Nether Gold Ore");
		MinecraftForge.setBlockHarvestLevel(netherGoldOre, "pickaxe", 4);
		GameRegistry.registerBlock(netherGoldOre, "netherGoldOre");
		
		LanguageRegistry.addName(netherRedstoneOre, "Nether Redstone Ore");
		MinecraftForge.setBlockHarvestLevel(netherRedstoneOre, "pickaxe", 4);
		GameRegistry.registerBlock(netherRedstoneOre, "netherRedstoneOre");
		
		LanguageRegistry.addName(sulfurOre, "Sulfur Ore");
		MinecraftForge.setBlockHarvestLevel(sulfurOre, "pickaxe", 4);
		GameRegistry.registerBlock(sulfurOre, "sulfurOre");
		
		LanguageRegistry.addName(grimWoodStick, "Grimwood Stick");
		GameRegistry.registerItem(grimWoodStick, "grimWoodStick");
		
		LanguageRegistry.addName(grimWoodShovel, "Grimwood Shovel");
		MinecraftForge.setToolClass(grimWoodShovel, "shovel", 4);
		GameRegistry.registerItem(grimWoodShovel, "grimWoodShovel");
		
		LanguageRegistry.addName(grimWoodPickaxe, "Grimwood Pickaxe");
		MinecraftForge.setToolClass(grimWoodPickaxe, "pickaxe", 4);
		GameRegistry.registerItem(grimWoodPickaxe, "grimWoodPickaxe");
		
		LanguageRegistry.addName(grimWoodAxe, "Grimwood Axe");
		MinecraftForge.setToolClass(grimWoodAxe, "axe", 4);
		GameRegistry.registerItem(grimWoodAxe, "grimWoodAxe");
		
		LanguageRegistry.addName(grimWoodHoe, "Grimwood Hoe");
		GameRegistry.registerItem(grimWoodHoe, "grimWoodHoe");
		
		LanguageRegistry.addName(grimWoodSword, "Grimwood Sword");
		GameRegistry.registerItem(grimWoodSword, "grimWoodSword");
		
		LanguageRegistry.addName(witherBone, "Wither Bone");
		GameRegistry.registerItem(witherBone, "witherBone");
		
		LanguageRegistry.addName(witherBonemeal, "Wither Bonemeal");
		GameRegistry.registerItem(witherBonemeal, "witherBoneMeal");
		
		LanguageRegistry.addName(sulfur, "Sulfur");
		GameRegistry.registerItem(sulfur, "sulfur");
		
		LanguageRegistry.addName(barley, "Barley");
		GameRegistry.registerItem(barley, "barley");
		
		LanguageRegistry.addName(barleySeeds, "Barley Seeds");
		GameRegistry.registerItem(barleySeeds, "barleySeeds");
		
		LanguageRegistry.addName(strawberry, "Strawberry");
		GameRegistry.registerItem(strawberry, "strawberry");
		
		LanguageRegistry.addName(chiliPepper, "Chili Pepper");
		GameRegistry.registerItem(chiliPepper, "chiliPepper");
		
		LanguageRegistry.addName(phoenixEgg, "Phoenix Egg");
		GameRegistry.registerItem(phoenixEgg, "phoenixEgg");
		
		GameRegistry.addRecipe(new ItemStack(grimWoodStick), "x", "x", 'x', new ItemStack(grimWoodPlanks));
		GameRegistry.addRecipe(new ItemStack(witherBonemeal, 3), "x", 'x', new ItemStack(witherBone));
		GameRegistry.addRecipe(new ItemStack(grimWoodShovel), "x", "y", "y", 'x', new ItemStack(grimWoodPlanks), 'y', new ItemStack(grimWoodStick));
		GameRegistry.addRecipe(new ItemStack(grimWoodPickaxe), "xxx", " y ", " y ", 'x', new ItemStack(grimWoodPlanks), 'y', new ItemStack(grimWoodStick));
		GameRegistry.addRecipe(new ItemStack(grimWoodAxe), "xx", "xy", " y", 'x', new ItemStack(grimWoodPlanks), 'y', new ItemStack(grimWoodStick));
		GameRegistry.addRecipe(new ItemStack(grimWoodHoe), "xx", " y", " y", 'x', new ItemStack(grimWoodPlanks), 'y', new ItemStack(grimWoodStick));
		GameRegistry.addRecipe(new ItemStack(grimWoodSword), "x", "x", "y", 'x', new ItemStack(grimWoodPlanks), 'y', new ItemStack(grimWoodStick));
		
		GameRegistry.addSmelting(netherCoalOre.blockID, new ItemStack(Item.coal), 0.2f);
		GameRegistry.addSmelting(netherGoldOre.blockID, new ItemStack(Item.ingotGold), 1.2f);
		GameRegistry.addSmelting(netherRedstoneOre.blockID, new ItemStack(Item.redstone), 0.9f);
		GameRegistry.addSmelting(sulfurOre.blockID, new ItemStack(sulfur), 0.2f);
		GameRegistry.addSmelting(fossilstoneOre.blockID, new ItemStack(Item.dyePowder, 1, 15), 0.2f);
		
		GameRegistry.registerFuelHandler(new GrimcraftFuelHandler());
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}
