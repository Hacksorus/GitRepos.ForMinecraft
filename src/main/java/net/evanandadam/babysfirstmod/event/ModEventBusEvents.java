package net.evanandadam.babysfirstmod.event;

import net.evanandadam.babysfirstmod.entity.ModEntities;
import net.evanandadam.babysfirstmod.entity.custom.NautilusEntity;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event){
        event.put(ModEntities.NAUTILUS.get(), NautilusEntity.createAttributes().build());
    }
}
