package us.cacct.moyai.moyai;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class HEntityRenderer extends MobEntityRenderer<HEntity, HEntityModel> {

    public HEntityRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new HEntityModel(), 0.5f);
    }
    @Override
    public Identifier getTexture(HEntity entity) {
        return new Identifier("moyai", "textures/entity/moyai/blockymoyai.png");
    }

}
