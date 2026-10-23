package com.dragn0007.advanced_horses.datagen.biglooter;

import com.dragn0007.advanced_horses.blocks.AHBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class AHBlockLoot extends BlockLootSubProvider {
    public AHBlockLoot() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    public void generate() {

    }

    @Override
    public Iterable<Block> getKnownBlocks() {
        return AHBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
