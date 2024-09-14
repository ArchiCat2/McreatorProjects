
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.undertale.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.undertale.item.ToyKnifeItem;
import net.mcreator.undertale.Undertale1Mod;

public class Undertale1ModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, Undertale1Mod.MODID);
	public static final RegistryObject<Item> CVETI = block(Undertale1ModBlocks.CVETI);
	public static final RegistryObject<Item> TOY_KNIFE = REGISTRY.register("toy_knife", () -> new ToyKnifeItem());
	public static final RegistryObject<Item> FALLING_BLOCKS_OFF = block(Undertale1ModBlocks.FALLING_BLOCKS_OFF);
	public static final RegistryObject<Item> FALLING_BLOCKS_ON = block(Undertale1ModBlocks.FALLING_BLOCKS_ON);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
