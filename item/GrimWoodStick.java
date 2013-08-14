package thinkplank.grimcraft.item;

import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.texture.IconRegister;
import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.asm.SideOnly;

public class GrimWoodStick extends Item {
        public GrimWoodStick(int id) {
                super(id);
        		setMaxStackSize(64);
        		setCreativeTab(CreativeTabs.tabMaterials);
        		setUnlocalizedName("grimwoodstick");
        }
        
        @Override
        @SideOnly(Side.CLIENT)
        public void registerIcons(IconRegister iconRegister) {
                 this.itemIcon = iconRegister.registerIcon("grimcraft:grimwoodstick");
        }
}
