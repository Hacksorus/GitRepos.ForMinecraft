package net.evanandadam.babysfirstmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.evanandadam.babysfirstmod.BabysFirstMod;
import net.evanandadam.babysfirstmod.entity.custom.NautilusEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class NautilusRenderer extends MobRenderer<NautilusEntity, Nautilus<NautilusEntity>> {
    public NautilusRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new Nautilus<>(pContext.bakeLayer(ModModelLayers.NAUTILUS_LAYER)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(NautilusEntity nautilusEntity) {
        return new ResourceLocation(BabysFirstMod.MODID, "textures/entity/nautilusTexture.png");
    }

    @Override
    public void render(NautilusEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {
        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}
