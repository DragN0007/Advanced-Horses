package com.dragn0007.advanced_horses;

import com.dragn0007.advanced_horses.blocks.AHBlocks;
import com.dragn0007.advanced_horses.entities.AHEntityTypes;
import com.dragn0007.advanced_horses.items.AHItemGroupModifier;
import com.dragn0007.advanced_horses.items.AHItems;
import com.dragn0007.advanced_horses.util.AdvancedHorsesClientConfig;
import com.dragn0007.advanced_horses.util.AdvancedHorsesCommonConfig;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import software.bernie.geckolib.GeckoLib;


@Mod(AdvancedHorses.MODID)
public class AdvancedHorses
{
    public static final String MODID = "advanced_horses";

    public AdvancedHorses()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        AHBlocks.register(eventBus);
        AHItems.register(eventBus);
        AHItemGroupModifier.register(eventBus);
        AHBlocks.TILE_ENTITIES.register(eventBus);
        AHEntityTypes.ENTITY_TYPES.register(eventBus);

        GeckoLib.initialize();
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, AdvancedHorsesClientConfig.SPEC, MODID + "-client.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, AdvancedHorsesCommonConfig.SPEC, MODID + "-common.toml");

        MinecraftForge.EVENT_BUS.register(this);
    }
}