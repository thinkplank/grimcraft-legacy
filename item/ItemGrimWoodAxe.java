package us.thinkplank.grimcraft.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemGrimWoodAxe extends ItemAxe {
    public ItemGrimWoodAxe(int id, EnumToolMaterial material) {
        super(id, material);
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabTools);
        setUnlocalizedName("grimWoodAxe");
        setTextureName("grimcraft:grimwoodaxe");
    }
}
