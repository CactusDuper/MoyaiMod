package us.cacct.moyai.moyai;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.JumpingMount;
import net.minecraft.entity.Saddleable;
import net.minecraft.entity.passive.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class HEntity extends AnimalEntity implements JumpingMount, Saddleable {

    public HEntity(EntityType<? extends AnimalEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public void setJumpStrength(int strength) {

    }

    @Override
    public boolean canJump() {
        return false;
    }

    @Override
    public void startJumping(int height) {

    }

    @Override
    public void stopJumping() {

    }

    @Override
    public boolean canBeSaddled() {
        return true;
    }

    @Override
    public void saddle(@Nullable SoundCategory sound) {

    }

    @Override
    public boolean isSaddled() {
        return false;
    }

    @Override
    public @Nullable PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
        return null;
    }
}
