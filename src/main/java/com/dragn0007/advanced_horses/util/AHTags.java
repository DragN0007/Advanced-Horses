package com.dragn0007.advanced_horses.util;

import com.dragn0007.advanced_horses.AdvancedHorses;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class AHTags {

    public static class Items {
        public static final TagKey<Item> EXAMPLE = forgeTag("example");

        public static TagKey<Item> forgeTag (String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
        public static TagKey<Item> tag (String name) {
            return ItemTags.create(new ResourceLocation(AdvancedHorses.MODID, name));
        }
    }

    public static class Entity_Types {
        public static final TagKey<EntityType<?>> EXAMPLE = forgeTag("example");

        public static TagKey<EntityType<?>> forgeTag(String name) {
            return TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("forge", name));
        }
    }

    public static class Blocks {
        public static final TagKey<Block> EXAMPLE = tag("example");

        public static TagKey<Block> forgeTag (String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
        public static TagKey<Block> tag (String name) {
            return BlockTags.create(new ResourceLocation(AdvancedHorses.MODID, name));
        }
    }

}
