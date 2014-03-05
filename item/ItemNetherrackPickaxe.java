package us.thinkplank.grimcraft.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemNetherrackPickaxe extends ItemPickaxe {
    public ItemNetherrackPickaxe() {
        super();
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabTools);
        setUnlocalizedName("netherrackPickaxe");
        setTextureName("grimcraft:netherrackpickaxe");
    }
}
