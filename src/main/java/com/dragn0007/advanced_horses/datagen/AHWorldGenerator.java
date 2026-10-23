package com.dragn0007.advanced_horses.datagen;

import com.dragn0007.advanced_horses.AdvancedHorses;
import com.dragn0007.advanced_horses.spawn.BiomeHitter;
import com.dragn0007.advanced_horses.spawn.AHConfigFeatures;
import com.dragn0007.advanced_horses.spawn.AHPlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class AHWorldGenerator extends DatapackBuiltinEntriesProvider {

    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, AHConfigFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, AHPlacedFeatures::bootstrap)
            .add(ForgeRegistries.Keys.BIOME_MODIFIERS, BiomeHitter::bootstrap);

    public AHWorldGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(AdvancedHorses.MODID));
    }
}
