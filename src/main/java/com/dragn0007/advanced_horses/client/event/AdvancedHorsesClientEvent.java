package com.dragn0007.advanced_horses.client.event;

import com.dragn0007.advanced_horses.AdvancedHorses;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(modid = AdvancedHorses.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AdvancedHorsesClientEvent {

    @SubscribeEvent
    public static void entityRenderersEvent(EntityRenderersEvent.RegisterRenderers event) {
    }
}