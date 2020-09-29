// Made with Blockbench 3.6.6
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports

	package us.cacct.moyai.moyai;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class MoyaiEntityModel extends EntityModel<MoyaiEntity> {
private final ModelPart bb_main;
	public MoyaiEntityModel() {
		textureWidth = 16;
		textureHeight = 16;
		bb_main = new ModelPart(this);
		bb_main.setPivot(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 0).addCuboid(3.0F, -1.0F, -1.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addCuboid(-3.0F, -5.0F, -3.0F, 6.0F, 5.0F, 7.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addCuboid(-4.0F, -2.0F, -2.0F, 1.0F, 2.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addCuboid(-4.0F, -3.0F, -1.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addCuboid(3.0F, -5.0F, -2.0F, 1.0F, 2.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addCuboid(-3.0F, -6.0F, -2.0F, 6.0F, 1.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addCuboid(-3.0F, -8.0F, -3.0F, 5.0F, 3.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addCuboid(-3.0F, -8.0F, 3.0F, 5.0F, 3.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addCuboid(-2.0F, -7.0F, -4.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addCuboid(-2.0F, -7.0F, 4.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addCuboid(-3.0F, -8.0F, -2.0F, 5.0F, 2.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addCuboid(2.0F, -8.0F, -1.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addCuboid(3.0F, -8.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addCuboid(-4.0F, -9.0F, -2.0F, 1.0F, 2.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addCuboid(-3.0F, -9.0F, -2.0F, 6.0F, 1.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addCuboid(-3.0F, -14.0F, -3.0F, 4.0F, 6.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addCuboid(-3.0F, -14.0F, 3.0F, 4.0F, 6.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addCuboid(3.0F, -9.0F, -1.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addCuboid(-4.0F, -14.0F, -2.0F, 5.0F, 5.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addCuboid(1.0F, -10.0F, -1.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addCuboid(1.0F, -13.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addCuboid(1.0F, -14.0F, -2.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addCuboid(-3.0F, -15.0F, -2.0F, 4.0F, 1.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addCuboid(-2.0F, -15.0F, -3.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addCuboid(1.0F, -15.0F, -1.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addCuboid(-2.0F, -15.0F, 3.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addCuboid(-2.0F, -16.0F, -2.0F, 3.0F, 1.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addCuboid(2.0F, -11.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addCuboid(-2.0F, -16.0F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addCuboid(-1.0F, -16.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addCuboid(-4.0F, -15.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
	}
@Override
public void setAngles(MoyaiEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
}
@Override
public void render(MatrixStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
	bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
}
public void setRotationAngle(ModelPart bone, float x, float y, float z) {
		bone.pitch = x;
		bone.yaw = y;
		bone.roll = z;
}

	}