package thinkplank.grimcraft.block;

import java.util.Random;
import thinkplank.grimcraft.Grimcraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.texture.IconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockGrimWoodPlanks extends Block {
        public BlockGrimWoodPlanks (int id, Material material) {
                super(id, material);
                setHardness(3F);
                setStepSound(Block.soundStoneFootstep);
                setUnlocalizedName("grimWoodPlanks");
                setCreativeTab(CreativeTabs.tabBlock);
        }
        
        public int idDropped(int par1, Random random, int zero) {
                return Grimcraft.grimWoodPlanks.blockID;
        }
        
        @Override
        @SideOnly(Side.CLIENT)
        public void registerIcons(IconRegister iconRegister) {
                 this.blockIcon = iconRegister.registerIcon("grimcraft:grimwoodplanks");
        }
}

