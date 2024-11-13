package net.evanandadam.babysfirstmod.entity;

import net.evanandadam.babysfirstmod.BabysFirstMod;
import net.evanandadam.babysfirstmod.entity.custom.NautilusEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, BabysFirstMod.MODID);

    public static final RegistryObject<EntityType<NautilusEntity>> NAUTILUS =
            ENTITY_TYPES.register("nautilus", () -> EntityType.Builder.of(NautilusEntity::new, MobCategory.CREATURE).sized(.5f, .5f)
                    .build("nautilus"));

    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}
