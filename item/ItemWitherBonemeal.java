package thinkplank.grimcraft.item;

import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.texture.IconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemWitherBonemeal extends Item {
        public ItemWitherBonemeal(int id) {
                super(id);
        	setMaxStackSize(64);
        	setCreativeTab(CreativeTabs.tabMaterials);
        	setUnlocalizedName("witherbonemeal");
        }
        
        @Override
        @SideOnly(Side.CLIENT)
        public void registerIcons(IconRegister iconRegister) {
                 this.itemIcon = iconRegister.registerIcon("grimcraft:witherbonemeal");
        }
}
