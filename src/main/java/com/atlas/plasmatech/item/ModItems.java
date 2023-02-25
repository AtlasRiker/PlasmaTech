package com.atlas.plasmatech.item;

import com.atlas.plasmatech.PlasmaTech;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PlasmaTech.MOD_ID);

    public static final RegistryObject<Item> TRITANIUM_INGOT = ITEMS.register("tritanium_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TRITANIUM_NUGGET = ITEMS.register("tritanium_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_TRITANIUM = ITEMS.register("raw_tritanium", () -> new Item(new Item.Properties()));
    public static final RegistryObject<ArmorItem> TRITANIUM_HELMET = ITEMS.register("tritanium_helmet", () -> new ArmorItem(ArmorMaterials.IRON, EquipmentSlot.byName("head"), new Item.Properties()));
    public static final RegistryObject<ArmorItem> TRITANIUM_LEGGIGNS = ITEMS.register("tritanium_leggings", () -> new ArmorItem(ArmorMaterials.IRON, EquipmentSlot.byName("legs"), new Item.Properties()));
    public static final RegistryObject<ArmorItem> TRITANIUM_CHESTPLATE = ITEMS.register("tritanium_chestplate", () -> new ArmorItem(ArmorMaterials.IRON, EquipmentSlot.byName("chest"), new Item.Properties()));
    public static final RegistryObject<ArmorItem> TRITANIUM_BOOTS = ITEMS.register("tritanium_boots", () -> new ArmorItem(ArmorMaterials.IRON, EquipmentSlot.byName("feet"), new Item.Properties()));


    //Dilithium
    public static final RegistryObject<Item> POOR_DILITHIUM = ITEMS.register("poor_dilithium", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PURE_DILITHIUM = ITEMS.register("pure_dilithium", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
