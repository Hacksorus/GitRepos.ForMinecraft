package net.evanandadam.babysfirstmod.entity.custom;

import net.evanandadam.babysfirstmod.event.ModEventBusEvents;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.RandomSwimmingGoal;
import net.minecraft.world.entity.animal.WaterAnimal;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import org.apache.commons.lang3.ObjectUtils;

import javax.annotation.Nullable;

public class NautilusEntity extends WaterAnimal {
    public NautilusEntity(EntityType<? extends WaterAnimal> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new RandomSwimmingGoal(this, 1.5D, 1));
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 4D)
                .add(Attributes.ARMOR, 1f)
                .add(Attributes.ARMOR_TOUGHNESS, 0.2f)
                .add(Attributes.FOLLOW_RANGE, 10D)
                .add(Attributes.KNOCKBACK_RESISTANCE, 1f)
                .add(Attributes.MOVEMENT_SPEED, 1.5D);
    }
}
