package thinkplank.grimcraft.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemHoe;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemGrimWoodSword extends ItemHoe {
        public ItemGrimWoodSword(int id, EnumToolMaterial material) {
                super(id, material);
                setMaxStackSize(64);
                setCreativeTab(CreativeTabs.tabTools);
                setUnlocalizedName("grimWoodSword");
        }
        
        @Override
        @SideOnly(Side.CLIENT)
        public void registerIcons(IconRegister iconRegister) {
                 this.itemIcon = iconRegister.registerIcon("grimcraft:grimwoodsword");
        }
}
