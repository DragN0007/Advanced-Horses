package com.dragn0007.advanced_horses.items;

import com.dragn0007.advanced_horses.AdvancedHorses;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class AHItemGroupModifier {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AdvancedHorses.MODID);

    public static final RegistryObject<CreativeModeTab> MOD_GROUP = CREATIVE_MODE_TABS.register("advanced_horses",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(AHItems.ADVANCED_HORSES_LOGO.get())).title(Component.translatable("itemGroup.advanced_horses"))
                    .displayItems((displayParameters, output) -> {

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}


