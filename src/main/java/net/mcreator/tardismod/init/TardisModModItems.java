
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tardismod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.tardismod.TardisModMod;

public class TardisModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TardisModMod.MODID);
	public static final RegistryObject<Item> TARDIS_SPAWN_EGG = REGISTRY.register("tardis_spawn_egg", () -> new ForgeSpawnEggItem(TardisModModEntities.TARDIS, -16750900, -16764058, new Item.Properties()));
	public static final RegistryObject<Item> TARDIS_VOID = block(TardisModModBlocks.TARDIS_VOID);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
