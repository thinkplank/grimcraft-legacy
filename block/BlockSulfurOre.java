package us.thinkplank.grimcraft.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import us.thinkplank.grimcraft.Grimcraft;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockSulfurOre extends Block {
    public BlockSulfurOre () {
        super(Material.rock);
        setHardness(3F);
        setStepSound(Block.soundTypeStone);
        setUnlocalizedName("sulfurOre");
        setCreativeTab(CreativeTabs.tabBlock);
    }

    public int idDropped(int par1, Random random, int zero) {
        return Grimcraft.sulfur.itemID;
    }

    public int quantityDropped(Random random) {
        return random.nextInt(5) + 4;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon("grimcraft:sulfurore");
    }
}
