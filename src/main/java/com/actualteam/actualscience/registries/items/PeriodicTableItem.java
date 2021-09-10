package com.actualteam.actualscience.registries.items;

import com.actualteam.actualscience.ActualScience;
import net.minecraft.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class PeriodicTableItem {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ActualScience.MODID);

    public static void register() {

        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

    }
}
