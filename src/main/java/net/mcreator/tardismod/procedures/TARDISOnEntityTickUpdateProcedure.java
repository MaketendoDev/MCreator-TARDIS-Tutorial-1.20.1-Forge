package net.mcreator.tardismod.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.tardismod.network.TardisModModVariables;

public class TARDISOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		TardisModModVariables.MapVariables.get(world).TARDIS_X = x;
		TardisModModVariables.MapVariables.get(world).syncData(world);
		TardisModModVariables.MapVariables.get(world).TARDIS_Y = y;
		TardisModModVariables.MapVariables.get(world).syncData(world);
		TardisModModVariables.MapVariables.get(world).TARDIS_Z = z;
		TardisModModVariables.MapVariables.get(world).syncData(world);
	}
}
