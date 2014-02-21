package us.thinkplank.grimcraft.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockNetherRedstoneOre extends Block {
    public BlockNetherRedstoneOre () {
        super(Material.rock);
        setHardness(3F);
        setStepSound(Block.soundTypeStone);
        setUnlocalizedName("netherRedstoneOre");
        setCreativeTab(CreativeTabs.tabBlock);
    }

    public int idDropped(int par1, Random random, int zero) {
        return Item.redstone.itemID;
    }

    public int quantityDropped(Random random) {
        return random.nextInt(2) + 4;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon("grimcraft:netherredstoneore");
    }
}