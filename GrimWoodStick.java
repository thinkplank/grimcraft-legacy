package thinkplank.grimcraft.item;

import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;

public class GrimWoodStick extends Item {

        public GenericItem(int id) {

                super(id);
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabMaterials);
		setUnlocalizedName("grimWoodStick");
        }

}
