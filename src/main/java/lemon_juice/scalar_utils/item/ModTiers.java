package lemon_juice.scalar_utils.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    //Normal Tiers
    public static final ForgeTier VOIDSTONE = new ForgeTier(5, 4095, 1.6f, 5.0f, 16, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.VOIDSTONE.get()));

    //Greatsword Tiers
    public static final ForgeTier GREAT_WOOD = new ForgeTier(0, 590, 2.0F, 4.0F, 15, BlockTags.OAK_LOGS, () -> {return Ingredient.of(ItemTags.PLANKS);});
    public static final ForgeTier GREAT_STONE = new ForgeTier (1, 1310, 4.0F, 5.0F, 5, BlockTags.BASE_STONE_OVERWORLD, () -> {return Ingredient.of(ItemTags.STONE_TOOL_MATERIALS);});
    public static final ForgeTier GREAT_IRON = new ForgeTier(2, 2500, 6.0F, 6.0F, 14, BlockTags.NEEDS_STONE_TOOL, () -> {return Ingredient.of(Items.IRON_INGOT);});
    public static final ForgeTier GREAT_GOLD = new ForgeTier(0, 320, 12.0F, 4.0F, 22, BlockTags.NEEDS_IRON_TOOL, () -> {return Ingredient.of(Items.GOLD_INGOT);});
    public static final ForgeTier GREAT_DIAMOND = new ForgeTier(3, 15610, 8.0F, 7.0F, 10, BlockTags.NEEDS_IRON_TOOL, () -> {return Ingredient.of(Items.DIAMOND);});
    public static final ForgeTier GREAT_NETHERITE = new ForgeTier(4, 20310, 9.0F, 8.0F, 15, BlockTags.NEEDS_DIAMOND_TOOL, () -> {return Ingredient.of(Items.NETHERITE_INGOT);});
    public static final ForgeTier GREAT_VOIDSTONE = new ForgeTier(5, 40950, 1.6f, 9.0f, 16, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.VOIDSTONE.get()));

}
