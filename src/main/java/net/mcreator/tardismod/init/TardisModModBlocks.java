
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tardismod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;

import net.mcreator.tardismod.block.TardisVoidBlock;
import net.mcreator.tardismod.TardisModMod;

public class TardisModModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(TardisModMod.MODID);
	public static final DeferredHolder<Block, Block> TARDIS_VOID = REGISTRY.register("tardis_void", TardisVoidBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
