
package net.mcreator.tardismod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.tardismod.entity.TARDISEntity;
import net.mcreator.tardismod.client.model.Modelpolicebox;

public class TARDISRenderer extends MobRenderer<TARDISEntity, Modelpolicebox<TARDISEntity>> {
	public TARDISRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpolicebox(context.bakeLayer(Modelpolicebox.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TARDISEntity entity) {
		return new ResourceLocation("tardis_mod:textures/entities/tardis_texture.png");
	}
}
