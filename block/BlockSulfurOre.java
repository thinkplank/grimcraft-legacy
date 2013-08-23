package thinkplank.grimcraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockSulfurOre extends Block {
        public BlockSulfurOre (int id, Material material) {
                super(id, material);
                setHardness(3F);
                setStepSound(Block.soundStoneFootstep);
                setUnlocalizedName("sulfurore");
                setCreativeTab(CreativeTabs.tabBlock);
        }
        
        public int idDropped(int par1, Random random, int zero) {
                return Grimcraft.sulfur.itemID;
        }
        
        @Override
        @SideOnly(Side.CLIENT)
        public void registerIcons(IconRegister iconRegister) {
                 this.itemIcon = iconRegister.registerIcon("GrimCraft:sulfurore");
        }
}
