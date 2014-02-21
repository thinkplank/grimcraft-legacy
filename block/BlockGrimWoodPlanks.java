package us.thinkplank.grimcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockGrimWoodPlanks extends Block {
    public BlockGrimWoodPlanks () {
        super(Material.wood);
        setHardness(3F);
        setStepSound(Block.soundTypeWood);
        setUnlocalizedName("grimWoodPlanks");
        setCreativeTab(CreativeTabs.tabBlock);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon("grimcraft:grimwoodplanks");
    }
}

