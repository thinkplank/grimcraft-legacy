package us.thinkplank.grimcraft.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockNetherCoalOre extends Block {
    public BlockNetherCoalOre () {
        super(Material.rock);
        setHardness(3F);
        setStepSound(Block.soundStoneFootstep);
        setUnlocalizedName("netherCoalOre");
        setCreativeTab(CreativeTabs.tabBlock);
        setHarvestLevel("pickaxe", 4);
    }

    public int idDropped(int par1, Random random, int zero) {
        return Item.coal.itemID;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon("grimcraft:nethercoalore");
    }
}
