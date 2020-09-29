package us.cacct.moyai.moyai.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import us.cacct.moyai.moyai.HEntityRenderer;
import us.cacct.moyai.moyai.Moyai;
import us.cacct.moyai.moyai.MoyaiEntityRenderer;

@Environment(EnvType.CLIENT)
public class MoyaiClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.INSTANCE.register(Moyai.MOYAI1, (dispatcher, context) -> {
            return new MoyaiEntityRenderer(dispatcher);
        });
        EntityRendererRegistry.INSTANCE.register(Moyai.H1, (dispatcher, context) -> {
            return new HEntityRenderer(dispatcher);
        });

    }
}
