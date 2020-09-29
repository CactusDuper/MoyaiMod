package us.cacct.moyai.moyai;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class MoyaiEntityRenderer extends MobEntityRenderer<MoyaiEntity, MoyaiEntityModel> {

    public MoyaiEntityRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new MoyaiEntityModel(), 0.5f);
    }
    @Override
    public Identifier getTexture(MoyaiEntity entity) {
        return new Identifier("moyai", "textures/entity/moyai/blockymoyai.png");
    }

}