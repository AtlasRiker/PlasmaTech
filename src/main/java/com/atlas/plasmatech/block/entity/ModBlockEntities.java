package com.atlas.plasmatech.block.entity;

import com.atlas.plasmatech.PlasmaTech;
import com.atlas.plasmatech.block.ModBlocks;
import com.atlas.plasmatech.block.custom.ConcentratorBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, PlasmaTech.MOD_ID);

    public static final RegistryObject<BlockEntityType<ConcentratorBlockEntity>> CRYSTAL_CONCENTRATOR =
            BLOCK_ENTITIES.register("crystal_concentrator", () -> BlockEntityType.Builder.of(ConcentratorBlockEntity::new, ModBlocks.CRYSTAL_CONCENTRATOR.get()).build(null));

    public static void register(IEventBus eventBus){
        BLOCK_ENTITIES.register(eventBus);
    }
}
