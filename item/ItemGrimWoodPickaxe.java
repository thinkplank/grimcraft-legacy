package us.thinkplank.grimcraft.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemGrimWoodPickaxe extends ItemPickaxe {
    public ItemGrimWoodPickaxe(int id, EnumToolMaterial material) {
        super(id, material);
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabTools);
        setUnlocalizedName("grimWoodPickaxe");
        setTextureName("grimcraft:grimwoodpickaxe");
    }
}
