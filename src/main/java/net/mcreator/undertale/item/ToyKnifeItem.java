
package net.mcreator.undertale.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ToyKnifeItem extends Item {
	public ToyKnifeItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
