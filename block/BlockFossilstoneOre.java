package us.thinkplank.grimcraft.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockFossilstoneOre extends Block {
    public BlockFossilstoneOre () {
        super(Material.rock);
        setHardness(3F);
        setStepSound(Block.soundTypeStone);
        setUnlocalizedName("fossilstoneOre");
        setCreativeTab(CreativeTabs.tabBlock);
        setHarvestLevel("pickaxe", 4);
    }

    public int idDropped(int par1, Random random, int zero) {
        return Item.bone.itemID;
    }

    public int quantityDropped(Random random) {
        return random.nextInt(2) + 4;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon("grimcraft:fossilstoneore");
    }
}
