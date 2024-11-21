package net.mcreator.tardismod.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.10.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelpolicebox<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("tardis_mod", "modelpolicebox"), "main");
	public final ModelPart bb_main;

	public Modelpolicebox(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0).addBox(-16.0F, -3.0F, -16.0F, 31.0F, 3.0F, 31.0F, new CubeDeformation(0.0F)).texOffs(0, 153).addBox(10.0F, -52.0F, -15.0F, 4.0F, 49.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(78, 151)
						.addBox(-15.0F, -52.0F, -15.0F, 4.0F, 49.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(62, 134).addBox(10.0F, -52.0F, 10.0F, 4.0F, 49.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(46, 134)
						.addBox(-15.0F, -52.0F, 10.0F, 4.0F, 49.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(147, 39).addBox(0.0F, -45.0F, -13.0F, 10.0F, 42.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(46, 90)
						.addBox(-11.0F, -45.0F, -13.0F, 11.0F, 42.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(81, 39).addBox(-14.0F, -50.0F, -17.0F, 27.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(81, 50)
						.addBox(-14.0F, -50.0F, 11.0F, 27.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(98, 124).addBox(11.0F, -50.0F, -14.0F, 5.0F, 5.0F, 27.0F, new CubeDeformation(0.0F)).texOffs(97, 7)
						.addBox(-17.0F, -50.0F, -14.0F, 5.0F, 5.0F, 27.0F, new CubeDeformation(0.0F)).texOffs(0, 34).addBox(-14.0F, -53.0F, -14.0F, 27.0F, 3.0F, 27.0F, new CubeDeformation(0.0F)).texOffs(135, 88)
						.addBox(-11.0F, -45.0F, 10.0F, 21.0F, 42.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 90).addBox(10.0F, -45.0F, -11.0F, 2.0F, 42.0F, 21.0F, new CubeDeformation(0.0F)).texOffs(79, 88)
						.addBox(-13.0F, -45.0F, -11.0F, 2.0F, 42.0F, 21.0F, new CubeDeformation(0.0F)).texOffs(0, 64).addBox(-13.0F, -54.0F, -13.0F, 25.0F, 1.0F, 25.0F, new CubeDeformation(0.0F)).texOffs(75, 64)
						.addBox(-12.0F, -55.0F, -12.0F, 23.0F, 1.0F, 23.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.0F, -61.0F, -2.0F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 9).addBox(-3.0F, -2.0F, 0.0F, 6.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -58.0F, -0.5F, 0.0F, 2.3562F, 0.0F));
		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(12, 0).addBox(-3.0F, -2.0F, 0.0F, 6.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -58.0F, -0.5F, 0.0F, 0.7854F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
