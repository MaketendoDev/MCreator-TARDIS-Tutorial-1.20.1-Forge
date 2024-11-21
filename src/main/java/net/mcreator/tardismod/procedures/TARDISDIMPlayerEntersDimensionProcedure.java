package net.mcreator.tardismod.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.tardismod.network.TardisModModVariables;

public class TARDISDIMPlayerEntersDimensionProcedure {
	public static void execute(LevelAccessor world) {
		if (TardisModModVariables.MapVariables.get(world).TARDISLoaded == false) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("tardis_mod", "cherry_interior"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(-4, 1, -4), new BlockPos(-4, 1, -4), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
			TardisModModVariables.MapVariables.get(world).TARDISLoaded = true;
			TardisModModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
