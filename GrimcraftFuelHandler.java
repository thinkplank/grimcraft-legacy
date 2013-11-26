package us.thinkplank.grimcraft;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class GrimcraftFuelHandler implements IFuelHandler {
	@Override
	public int getBurnTime(ItemStack fuel) {
		int fuelType = fuel.itemID;
		if (fuelType == Grimcraft.sulfur.itemID) {
			return 2400;
		} else if (fuelType == Grimcraft.chiliPepper.itemID) {
			return 100;
		} else {
			return 0;
		}
	}
}
