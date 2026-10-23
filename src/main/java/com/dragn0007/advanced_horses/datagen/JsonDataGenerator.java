package com.dragn0007.advanced_horses.datagen;

import com.dragn0007.advanced_horses.AdvancedHorses;
import com.dragn0007.advanced_horses.datagen.biglooter.AHLootTableProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = AdvancedHorses.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class JsonDataGenerator {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new AHRecipeMaker(packOutput));
        generator.addProvider(event.includeClient(), new AHBlockstateProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new AHItemModelProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeServer(), new AHWorldGenerator(packOutput, lookupProvider));
        generator.addProvider(event.includeServer(), AHLootTableProvider.create(packOutput));
    }
}
