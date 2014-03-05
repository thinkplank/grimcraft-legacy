/*
 * Grimcraft.java 1.0.0 2-21-14
 * Made with love by Lapiman and Fox
 * Licensed under whatever we decide
 * To-do: Figure out how to use the "assets lang system"
 * Will tools be removed?
 * Update the Item constructors
 * Figure out the tool material stuff
 */


package us.thinkplank.grimcraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
//import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
//import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import us.thinkplank.grimcraft.block.*;
import us.thinkplank.grimcraft.item.*;
import us.thinkplank.grimcraft.client.ClientProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid="grimcraft", name="grimcraft", version="1.0.0")
public class Grimcraft {
    @Instance("Grimcraft")
    public static Grimcraft instance;

//    static EnumToolMaterial grimWoodMaterial = EnumHelper.addToolMaterial("GRIMWOOD", 4, 59, 2.0F, 0.0F, 15);
//    static EnumToolMaterial netherrackMaterial = EnumHelper.addToolMaterial("NETHERRACK", 5, 131, 4.0F, 1.0F, 5);

    public final static Block grimWoodPlanks = new BlockGrimWoodPlanks();
    public final static Block fossilstoneOre = new BlockFossilstoneOre();
    public final static Block netherCoalOre = new BlockNetherCoalOre();
    public final static Block netherGoldOre = new BlockNetherGoldOre();
    public final static Block netherRedstoneOre = new BlockNetherRedstoneOre();
    public final static Block sulfurOre = new BlockSulfurOre();
    public final static Block blockSulfur = new BlockSulfur();

    public final static Item grimWoodStick = new ItemGrimWoodStick();

//    public final static Item grimWoodShovel = new ItemGrimWoodShovel(9407, grimWoodMaterial);
//    public final static Item grimWoodPickaxe = new ItemGrimWoodPickaxe(9408, grimWoodMaterial);
//    public final static Item grimWoodAxe = new ItemGrimWoodAxe(9409, grimWoodMaterial);
//    public final static Item grimWoodHoe = new ItemGrimWoodHoe(9410, grimWoodMaterial);
//    public final static Item grimWoodSword = new ItemGrimWoodSword(9412, grimWoodMaterial);
//
//    public final static Item netherrackPickaxe = new ItemNetherrackPickaxe(9413, netherrackMaterial);

    public final static Item witherBone = new ItemWitherBone();
    public final static Item witherBonemeal = new ItemWitherBonemeal();
    public final static Item sulfur = new ItemSulfur();
    public final static Item barley = new ItemBarley();
    public final static Item barleySeeds = new ItemBarleySeeds();
    public final static Item strawberry = new ItemStrawberry();
    public final static Item chiliPepper = new ItemChiliPepper();
    public final static Item phoenixEgg = new ItemPhoenixEgg();

    @SidedProxy(clientSide="us.thinkplank.grimcraft.client.ClientProxy", serverSide="us.thinkplank.grimcraft.CommonProxy")
        public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @EventHandler
    public void load(FMLInitializationEvent event) {

        MinecraftForge.setBlockHarvestLevel(grimWoodPlanks, "axe", 4);
        GameRegistry.registerBlock(grimWoodPlanks, "grimwoodPlanks");

        MinecraftForge.setBlockHarvestLevel(fossilstoneOre, "pickaxe", 4);
        GameRegistry.registerBlock(fossilstoneOre, "fossilstoneOre");

        MinecraftForge.setBlockHarvestLevel(netherCoalOre, "pickaxe", 4);
        GameRegistry.registerBlock(netherCoalOre, "netherCoalOre");

        MinecraftForge.setBlockHarvestLevel(netherGoldOre, "pickaxe", 4);
        GameRegistry.registerBlock(netherGoldOre, "netherGoldOre");

        MinecraftForge.setBlockHarvestLevel(netherRedstoneOre, "pickaxe", 4);
        GameRegistry.registerBlock(netherRedstoneOre, "netherRedstoneOre");

        MinecraftForge.setBlockHarvestLevel(sulfurOre, "pickaxe", 4);
        GameRegistry.registerBlock(sulfurOre, "sulfurOre");

//        GameRegistry.registerItem(grimWoodStick, "grimWoodStick");

//        MinecraftForge.setToolClass(grimWoodShovel, "shovel", 4);
//        GameRegistry.registerItem(grimWoodShovel, "grimWoodShovel");
//
//        MinecraftForge.setToolClass(grimWoodPickaxe, "pickaxe", 4);
//        GameRegistry.registerItem(grimWoodPickaxe, "grimWoodPickaxe");
//
//        MinecraftForge.setToolClass(grimWoodAxe, "axe", 4);
//        GameRegistry.registerItem(grimWoodAxe, "grimWoodAxe");
//
//        GameRegistry.registerItem(grimWoodHoe, "grimWoodHoe");
//        GameRegistry.registerItem(grimWoodSword, "grimWoodSword");
//        
//        LanguageRegistry.addName(netherrackPickaxe, "Netherrack Pickaxe");
//        MinecraftForge.setToolClass(netherrackPickaxe, "pickaxe", 5);
//        GameRegistry.registerItem(netherrackPickaxe, "netherrackPickaxe");

        GameRegistry.registerItem(witherBone, "witherBone");
        GameRegistry.registerItem(witherBonemeal, "witherBoneMeal");
        GameRegistry.registerItem(sulfur, "sulfur");
        GameRegistry.registerItem(barley, "barley");
        GameRegistry.registerItem(barleySeeds, "barleySeeds");
        GameRegistry.registerItem(strawberry, "strawberry");
        GameRegistry.registerItem(chiliPepper, "chiliPepper");
        GameRegistry.registerItem(phoenixEgg, "phoenixEgg");

        GameRegistry.addRecipe(new ItemStack(grimWoodStick), "x", "x", 'x', new ItemStack(grimWoodPlanks));
        GameRegistry.addRecipe(new ItemStack(witherBonemeal, 3), "x", 'x', new ItemStack(witherBone));
//        GameRegistry.addRecipe(new ItemStack(grimWoodShovel), "x", "y", "y", 'x', new ItemStack(grimWoodPlanks), 'y', new ItemStack(grimWoodStick));
//        GameRegistry.addRecipe(new ItemStack(grimWoodPickaxe), "xxx", " y ", " y ", 'x', new ItemStack(grimWoodPlanks), 'y', new ItemStack(grimWoodStick));
//        GameRegistry.addRecipe(new ItemStack(grimWoodAxe), "xx", "xy", " y", 'x', new ItemStack(grimWoodPlanks), 'y', new ItemStack(grimWoodStick));
//        GameRegistry.addRecipe(new ItemStack(grimWoodHoe), "xx", " y", " y", 'x', new ItemStack(grimWoodPlanks), 'y', new ItemStack(grimWoodStick));
//        GameRegistry.addRecipe(new ItemStack(grimWoodSword), "x", "x", "y", 'x', new ItemStack(grimWoodPlanks), 'y', new ItemStack(grimWoodStick));

        GameRegistry.addSmelting(netherCoalOre, new ItemStack(Item.coal), 0.2f);
        GameRegistry.addSmelting(netherGoldOre, new ItemStack(Item.ingotGold), 1.2f);
        GameRegistry.addSmelting(netherRedstoneOre, new ItemStack(Item.redstone), 0.9f);
        GameRegistry.addSmelting(sulfurOre, new ItemStack(sulfur), 0.2f);
        GameRegistry.addSmelting(fossilstoneOre, new ItemStack(Item.dyePowder, 1, 15), 0.2f);

        GameRegistry.registerFuelHandler(new GrimcraftFuelHandler());
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
