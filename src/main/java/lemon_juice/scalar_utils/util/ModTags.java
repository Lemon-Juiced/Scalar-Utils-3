package lemon_juice.scalar_utils.util;

import lemon_juice.scalar_utils.ScalarUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;

public class ModTags {
    public static class Blocks{
        private static final TagKey<Block> SCALAR_UTILS_SOLID_BLOCKS = tag("scalar_utils_solid_blocks");

        private static TagKey<Block> tag(String name){
            return BlockTags.create(new ResourceLocation(ScalarUtils.MOD_ID, name));
        }

        private static TagKey<Block> forgeTag(String name){
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Items{
        public static final TagKey<Item> EMERALDS = forgeTag("emeralds.json");
        public static final TagKey<Item> MILK = forgeTag("milk.json");
        public static final TagKey<Item> SLIMEBALLS = forgeTag("slimeballs.json");

        private static TagKey<Item> tag(String name){
            return ItemTags.create(new ResourceLocation(ScalarUtils.MOD_ID, name));
        }

        private static TagKey<Item> forgeTag(String name){
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}
