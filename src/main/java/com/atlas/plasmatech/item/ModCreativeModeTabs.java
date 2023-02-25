package com.atlas.plasmatech.item;

import com.atlas.plasmatech.PlasmaTech;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = PlasmaTech.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs
{
    public static CreativeModeTab PLASMATECH_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event){
        PLASMATECH_TAB = event.registerCreativeModeTab(new ResourceLocation(PlasmaTech.MOD_ID, "plasmatech_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.TRITANIUM_INGOT.get()))
                        .title(Component.translatable("creativemodetab.plasmatech_tab")));
    }
}
