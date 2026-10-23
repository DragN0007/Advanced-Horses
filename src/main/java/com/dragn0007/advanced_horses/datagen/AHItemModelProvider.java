package com.dragn0007.advanced_horses.datagen;

import com.dragn0007.advanced_horses.AdvancedHorses;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class AHItemModelProvider extends ItemModelProvider {
    public AHItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, AdvancedHorses.MODID, existingFileHelper);
    }

    @Override
    public void registerModels() {

    }

    public ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(AdvancedHorses.MODID,"item/" + item.getId().getPath()));
    }
    private ItemModelBuilder simpleSpriteBlock(RegistryObject<Block> block) {
        return withExistingParent(block.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(AdvancedHorses.MODID,"block/" + block.getId().getPath()));
    }
}