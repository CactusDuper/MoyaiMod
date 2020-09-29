package us.cacct.moyai.moyai;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.mob.SilverfishEntity;
import net.minecraft.world.World;

public class MoyaiEntity extends SilverfishEntity {

    public MoyaiEntity(EntityType<? extends SilverfishEntity> entityType, World world) {
        super(entityType, world);
    }
}
