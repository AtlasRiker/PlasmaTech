package com.atlas.plasmatech.item;

import com.atlas.plasmatech.PlasmaTech;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = PlasmaTech.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs
{
    public static final CreativeModeTab PLASMATECH_TAB = new CreativeModeTab("plasmatech")
    {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TRITANIUM_INGOT.get());
        }
    };
}
