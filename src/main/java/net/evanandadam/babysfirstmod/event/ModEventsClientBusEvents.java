package net.evanandadam.babysfirstmod.event;

import net.evanandadam.babysfirstmod.BabysFirstMod;
import net.evanandadam.babysfirstmod.entity.client.ModModelLayers;
import net.evanandadam.babysfirstmod.entity.client.Nautilus;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BabysFirstMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventsClientBusEvents {
    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event){
        event.registerLayerDefinition(ModModelLayers.NAUTILUS_LAYER, Nautilus::createBodyLayer);
    }
}
