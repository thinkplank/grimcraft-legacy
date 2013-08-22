package thinkplank.grimcraft.item;

import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.texture.IconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBarleySeeds extends Item {
        public ItemBarleySeeds(int id) {
                super(id);
        		setMaxStackSize(64);
        		setCreativeTab(CreativeTabs.tabMaterials);
        		setUnlocalizedName("barleyseeds");
        }
        
        @Override
        @SideOnly(Side.CLIENT)
        public void registerIcons(IconRegister iconRegister) {
                 this.itemIcon = iconRegister.registerIcon("GrimCraft:barley");
        }
}