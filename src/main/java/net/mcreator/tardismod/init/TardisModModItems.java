
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tardismod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.tardismod.TardisModMod;

public class TardisModModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(TardisModMod.MODID);
	public static final DeferredHolder<Item, Item> TARDIS_SPAWN_EGG = REGISTRY.register("tardis_spawn_egg", () -> new DeferredSpawnEggItem(TardisModModEntities.TARDIS, -16750900, -16764058, new Item.Properties()));
	public static final DeferredHolder<Item, Item> TARDIS_VOID = block(TardisModModBlocks.TARDIS_VOID);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredHolder<Item, Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
