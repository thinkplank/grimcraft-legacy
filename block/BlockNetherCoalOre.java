package us.thinkplank.grimcraft.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockNetherCoalOre extends Block {
    public BlockNetherCoalOre (int id, Material material) {
        super(id, material);
        setHardness(3F);
        setStepSound(Block.soundStoneFootstep);
        setUnlocalizedName("netherCoalOre");
        setCreativeTab(CreativeTabs.tabBlock);
    }

    public int idDropped(int par1, Random random, int zero) {
        return Item.coal.itemID;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon("grimcraft:nethercoalore");
    }
}
