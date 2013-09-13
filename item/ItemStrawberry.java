package thinkplank.grimcraft.item;

import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.texture.IconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemStrawberry extends Item {
        public ItemStrawberry(int id) {
                super(id);
        	setMaxStackSize(64);
        	setCreativeTab(CreativeTabs.tabMaterials);
        	setUnlocalizedName("strawberry");
        }
        
        @Override
        @SideOnly(Side.CLIENT)
        public void registerIcons(IconRegister iconRegister) {
                 this.itemIcon = iconRegister.registerIcon("grimcraft:strawberry");
        }
}
