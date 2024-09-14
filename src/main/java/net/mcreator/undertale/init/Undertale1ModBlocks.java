
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.undertale.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.undertale.block.CvetiBlock;
import net.mcreator.undertale.Undertale1Mod;

public class Undertale1ModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, Undertale1Mod.MODID);
	public static final RegistryObject<Block> CVETI = REGISTRY.register("cveti", () -> new CvetiBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
