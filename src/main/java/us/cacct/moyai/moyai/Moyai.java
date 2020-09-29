package us.cacct.moyai.moyai;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Moyai implements ModInitializer {

    public static final EntityType<MoyaiEntity> MOYAI1 = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier("moyai", "moyai1"),
            FabricEntityTypeBuilder.<MoyaiEntity>create(SpawnGroup.CREATURE, MoyaiEntity::new).dimensions(EntityDimensions.fixed(.75f, 0.75f)).build()
    );
    public static final EntityType<HEntity> H1 = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier("moyai", "h1"),
            FabricEntityTypeBuilder.<HEntity>create(SpawnGroup.CREATURE, HEntity::new).dimensions(EntityDimensions.fixed(7f, 12f)).build()
    );
    public static final Block EXAMPLE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(4.0f));

    @Override
    public void onInitialize() {
        FabricDefaultAttributeRegistry.register(MOYAI1, MoyaiEntity.createMobAttributes());
        FabricDefaultAttributeRegistry.register(H1, HEntity.createMobAttributes());
        Registry.register(Registry.BLOCK, new Identifier("moyai", "example_block"), EXAMPLE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("moyai", "example_block"), new BlockItem(EXAMPLE_BLOCK, new Item.Settings().group(ItemGroup.MISC)));





    }
}
