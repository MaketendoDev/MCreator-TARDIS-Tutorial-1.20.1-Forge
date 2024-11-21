
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tardismod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.tardismod.block.TardisVoidBlock;
import net.mcreator.tardismod.TardisModMod;

public class TardisModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TardisModMod.MODID);
	public static final RegistryObject<Block> TARDIS_VOID = REGISTRY.register("tardis_void", () -> new TardisVoidBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
