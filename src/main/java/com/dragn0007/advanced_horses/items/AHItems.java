package com.dragn0007.advanced_horses.items;

import com.dragn0007.advanced_horses.AdvancedHorses;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class AHItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AdvancedHorses.MODID);


    //Mod Item Tab Icon (UNOBTAINABLE)
    public static final RegistryObject<Item> ADVANCED_HORSES_LOGO = ITEMS.register("advanced_horses_logo",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}