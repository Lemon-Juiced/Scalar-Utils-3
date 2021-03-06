package lemon_juice.scalar_utils.item;

import lemon_juice.scalar_utils.ScalarUtils;
import lemon_juice.scalar_utils.block.ModBlocks;
import lemon_juice.scalar_utils.item.custom_items.*;
import lemon_juice.scalar_utils.item.custom_items.armors.*;
import lemon_juice.scalar_utils.item.custom_items.consumables.ChocolateMilkItem;
import lemon_juice.scalar_utils.item.custom_items.consumables.FreshMilkItem;
import lemon_juice.scalar_utils.item.custom_items.consumables.HotCocoaItem;
import lemon_juice.scalar_utils.item.custom_items.tools.CraftingToolItem;
import lemon_juice.scalar_utils.item.custom_items.tools.GlassCutterItem;
import lemon_juice.scalar_utils.item.custom_items.turtletrident.TurtleTridentItem;
import lemon_juice.scalar_utils.item.custom_items.wands.tier1.FireWandItem;
import lemon_juice.scalar_utils.item.custom_items.wands.tier1.HarmingWandItem;
import lemon_juice.scalar_utils.item.custom_items.wands.tier1.HealingWandItem;
import lemon_juice.scalar_utils.item.custom_items.wands.tier1.PoisonWandItem;
import lemon_juice.scalar_utils.item.custom_items.wands.tier2.LightningWandItem;
import lemon_juice.scalar_utils.item.custom_items.wands.tier2.MiningWandItem;
import lemon_juice.scalar_utils.item.custom_items.wands.tier2.WitherWandItem;
import lemon_juice.scalar_utils.item.custom_items.wands.tier3.StaffOfTheTunnelerItem;
import lemon_juice.scalar_utils.item.custom_materials.ModArmorMaterials;
import lemon_juice.scalar_utils.item.custom_materials.ModTiers;
import lemon_juice.scalar_utils.util.ModCreativeModeTabs;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ScalarUtils.MOD_ID);

    //Crops (Are Foods)
    public static final RegistryObject<Item> RICE = ITEMS.register("rice", () -> new Item(new Item.Properties().food(ModFoods.RICE).tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));
    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry", () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRY).tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));

    //Crops (Not Foods)
    public static final RegistryObject<Item> ENDER_SPORE = ITEMS.register("ender_spore", () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));
    public static final RegistryObject<Item> FLAX = ITEMS.register("flax", () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));

    //Custom Crafting Tools
    public static final RegistryObject<Item> MEAT_GRINDER = ITEMS.register("meat_grinder", () -> new CraftingToolItem(new Item.Properties().stacksTo(1).tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));
    public static final RegistryObject<Item> PAN = ITEMS.register("pan", () -> new CraftingToolItem(new Item.Properties().stacksTo(1).tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));
    public static final RegistryObject<Item> POT = ITEMS.register("pot", () -> new CraftingToolItem(new Item.Properties().stacksTo(1).tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));

    //Food
    /* Basic Foods */
    public static final RegistryObject<Item> BUTTER = ITEMS.register("butter", () -> new Item(new Item.Properties().food(ModFoods.BUTTER).tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));
    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese", () -> new Item(new Item.Properties().food(ModFoods.CHEESE).tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));

    /* Bread */
    public static final RegistryObject<Item> RICE_BREAD = ITEMS.register("rice_bread", () -> new Item(new Item.Properties().food(ModFoods.RICE_BREAD).tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));
    public static final RegistryObject<Item> TOAST = ITEMS.register("toast", () -> new Item(new Item.Properties().food(ModFoods.TOAST).tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));

    /* Cheesecakes */
    public static final RegistryObject<Item> CHEESECAKE = ITEMS.register("cheesecake", () -> new Item(new Item.Properties().food(ModFoods.CHEESECAKE).tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));
    public static final RegistryObject<Item> STRAWBERRY_CHEESECAKE = ITEMS.register("strawberry_cheesecake", () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRY_CHEESECAKE).tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));

    /* Chicken Nuggets */
    public static final RegistryObject<Item> CHICKEN_NUGGET = ITEMS.register("chicken_nugget", () -> new Item(new Item.Properties().food(ModFoods.CHICKEN_NUGGET).tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));
    public static final RegistryObject<Item> RAW_CHICKEN_NUGGET = ITEMS.register("raw_chicken_nugget", () -> new Item(new Item.Properties().food(ModFoods.RAW_CHICKEN_NUGGET).tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));

    /* Grilled Cheeses */
    public static final RegistryObject<Item> GRILLED_CHEESE = ITEMS.register("grilled_cheese", () -> new Item(new Item.Properties().food(ModFoods.GRILLED_CHEESE).tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));
    public static final RegistryObject<Item> GRILLED_MEAT_AND_CHEESE = ITEMS.register("grilled_meat_and_cheese", () -> new Item(new Item.Properties().food(ModFoods.GRILLED_MEAT_AND_CHEESE).tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));

    /* Ice Cream */
    public static final RegistryObject<Item> CHOCOLATE_ICE_CREAM = ITEMS.register("chocolate_ice_cream", () -> new Item(new Item.Properties().food(ModFoods.ICE_CREAM).tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));
    public static final RegistryObject<Item> VANILLA_ICE_CREAM = ITEMS.register("vanilla_ice_cream", () -> new Item(new Item.Properties().food(ModFoods.ICE_CREAM).tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));
    public static final RegistryObject<Item> STRAWBERRY_ICE_CREAM = ITEMS.register("strawberry_ice_cream", () -> new Item(new Item.Properties().food(ModFoods.ICE_CREAM).tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));
    public static final RegistryObject<Item> NEOPOLITAN_ICE_CREAM = ITEMS.register("neopolitan_ice_cream", () -> new Item(new Item.Properties().food(ModFoods.ICE_CREAM).tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));

    /* Meat */
    public static final RegistryObject<Item> COOKED_MEAT = ITEMS.register("cooked_meat", () -> new Item(new Item.Properties().food(ModFoods.COOKED_MEAT).tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));
    public static final RegistryObject<Item> RAW_MEAT = ITEMS.register("raw_meat", () -> new Item(new Item.Properties().food(ModFoods.RAW_MEAT).tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));

    /* Milks */
    public static final RegistryObject<Item> CHOCOLATE_MILK = ITEMS.register("chocolate_milk", () -> new ChocolateMilkItem(new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));
    public static final RegistryObject<Item> FRESH_MILK = ITEMS.register("fresh_milk", () -> new FreshMilkItem(new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));
    public static final RegistryObject<Item> HOT_COCOA = ITEMS.register("hot_cocoa", () -> new HotCocoaItem(new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));

    /* Yogurt */
    public static final RegistryObject<Item> YOGURT = ITEMS.register("yogurt", () -> new Item(new Item.Properties().food(ModFoods.YOGURT).tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));

    //Fuel
    public static final RegistryObject<Item> TINY_CHARCOAL = ITEMS.register("tiny_charcoal", () -> new TinyCoalItem(new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));
    public static final RegistryObject<Item> TINY_COAL = ITEMS.register("tiny_coal", () -> new TinyCoalItem(new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));

    //Gilded Diamond
    public static final RegistryObject<Item> GILDED_DIAMOND = ITEMS.register("gilded_diamond", () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));
    public static final RegistryObject<Item> GILDED_DIAMOND_HELMET = ITEMS.register("gilded_diamond_helmet", () -> new GildedArmorItem(ModArmorMaterials.GILDED_DIAMOND, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ATW_TAB)));
    public static final RegistryObject<Item> GILDED_DIAMOND_CHESTPLATE = ITEMS.register("gilded_diamond_chestplate", () -> new GildedArmorItem(ModArmorMaterials.GILDED_DIAMOND, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ATW_TAB)));
    public static final RegistryObject<Item> GILDED_DIAMOND_LEGGINGS = ITEMS.register("gilded_diamond_leggings", () -> new GildedArmorItem(ModArmorMaterials.GILDED_DIAMOND, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ATW_TAB)));
    public static final RegistryObject<Item> GILDED_DIAMOND_BOOTS = ITEMS.register("gilded_diamond_boots", () -> new GildedArmorItem(ModArmorMaterials.GILDED_DIAMOND, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ATW_TAB)));

    //Gilded Iron
    public static final RegistryObject<Item> GILDED_IRON_INGOT = ITEMS.register("gilded_iron_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));
    public static final RegistryObject<Item> GILDED_IRON_NUGGET = ITEMS.register("gilded_iron_nugget", () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));
    public static final RegistryObject<Item> GILDED_IRON_ROD = ITEMS.register("gilded_iron_rod", () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));
    public static final RegistryObject<Item> GILDED_IRON_HELMET = ITEMS.register("gilded_iron_helmet", () -> new GildedArmorItem(ModArmorMaterials.GILDED_IRON, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ATW_TAB)));
    public static final RegistryObject<Item> GILDED_IRON_CHESTPLATE = ITEMS.register("gilded_iron_chestplate", () -> new GildedArmorItem(ModArmorMaterials.GILDED_IRON, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ATW_TAB)));
    public static final RegistryObject<Item> GILDED_IRON_LEGGINGS = ITEMS.register("gilded_iron_leggings", () -> new GildedArmorItem(ModArmorMaterials.GILDED_IRON, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ATW_TAB)));
    public static final RegistryObject<Item> GILDED_IRON_BOOTS = ITEMS.register("gilded_iron_boots", () -> new GildedArmorItem(ModArmorMaterials.GILDED_IRON, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ATW_TAB)));

    //Gilded Netherite
    public static final RegistryObject<Item> GILDED_NETHERITE_INGOT = ITEMS.register("gilded_netherite_ingot", () -> new Item(new Item.Properties().fireResistant().tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));
    public static final RegistryObject<Item> GILDED_NETHERITE_HELMET = ITEMS.register("gilded_netherite_helmet", () -> new GildedArmorItem(ModArmorMaterials.GILDED_NETHERITE, EquipmentSlot.HEAD, new Item.Properties().fireResistant().tab(ModCreativeModeTabs.SC_UTILS_ATW_TAB)));
    public static final RegistryObject<Item> GILDED_NETHERITE_CHESTPLATE = ITEMS.register("gilded_netherite_chestplate", () -> new GildedArmorItem(ModArmorMaterials.GILDED_NETHERITE, EquipmentSlot.CHEST, new Item.Properties().fireResistant().tab(ModCreativeModeTabs.SC_UTILS_ATW_TAB)));
    public static final RegistryObject<Item> GILDED_NETHERITE_LEGGINGS = ITEMS.register("gilded_netherite_leggings", () -> new GildedArmorItem(ModArmorMaterials.GILDED_NETHERITE, EquipmentSlot.LEGS, new Item.Properties().fireResistant().tab(ModCreativeModeTabs.SC_UTILS_ATW_TAB)));
    public static final RegistryObject<Item> GILDED_NETHERITE_BOOTS = ITEMS.register("gilded_netherite_boots", () -> new GildedArmorItem(ModArmorMaterials.GILDED_NETHERITE, EquipmentSlot.FEET, new Item.Properties().fireResistant().tab(ModCreativeModeTabs.SC_UTILS_ATW_TAB)));

    //Items
    public static final RegistryObject<Item> CITRIC_COMPOUND = ITEMS.register("citric_compound", () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));
    public static final RegistryObject<Item> COPPER_CRYSTAL = ITEMS.register("copper_crystal", () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));
    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget", () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));
    public static final RegistryObject<Item> ENDER_PEARL_SHARD = ITEMS.register("ender_pearl_shard", () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));
    public static final RegistryObject<Item> FLEXIMESH = ITEMS.register("fleximesh", () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));
    public static final RegistryObject<Item> FLOUR = ITEMS.register("flour", () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));
    public static final RegistryObject<Item> GOLD_CRYSTAL = ITEMS.register("gold_crystal", () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));
    public static final RegistryObject<Item> IRON_CRYSTAL = ITEMS.register("iron_crystal", () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));
    public static final RegistryObject<Item> MANA_CRYSTAL = ITEMS.register("mana_crystal", () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));
    public static final RegistryObject<Item> MANA_ORB = ITEMS.register("mana_orb", () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));
    public static final RegistryObject<Item> GOLDEN_FEATHER = ITEMS.register("golden_feather", () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));
    public static final RegistryObject<Item> LEMON_QUARTZ = ITEMS.register("lemon_quartz", () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));
    public static final RegistryObject<Item> RICE_SLIMEBALL = ITEMS.register("rice_slimeball", () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));
    public static final RegistryObject<Item> SYNTHETIC_EMERALD = ITEMS.register("synthetic_emerald", () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));
    public static final RegistryObject<Item> TURTLE_INGOT = ITEMS.register("turtle_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));





    //Misc. Armor
    public static final RegistryObject<Item> BOOTS_OF_STRIDING = ITEMS.register("boots_of_striding", () -> new StridingArmorItem(ModArmorMaterials.MANA_CRYSTAL, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ATW_TAB)));
    public static final RegistryObject<Item> FEATHERFALL_BOOTS = ITEMS.register("featherfall_boots", () -> new FeatherFallArmorItem(ModArmorMaterials.GOLDEN_FEATHER, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ATW_TAB)));
    public static final RegistryObject<Item> SHULKER_SHELLMET = ITEMS.register("shulker_shellmet", () -> new ShulkerArmorItem(ModArmorMaterials.SHULKER, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ATW_TAB)));

    //Seeds
    public static final RegistryObject<Item> ENDER_SPORE_SEEDS = ITEMS.register("ender_spore_seeds", () -> new ItemNameBlockItem(ModBlocks.ENDER_SPORE_PLANT.get(), new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));
    public static final RegistryObject<Item> FLAX_SEEDS = ITEMS.register("flax_seeds", () -> new ItemNameBlockItem(ModBlocks.FLAX_PLANT.get(), new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));
    public static final RegistryObject<Item> RICE_SEEDS = ITEMS.register("rice_seeds", () -> new ItemNameBlockItem(ModBlocks.RICE_PLANT.get(), new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));
    public static final RegistryObject<Item> STRAWBERRY_SEEDS = ITEMS.register("strawberry_seeds", () -> new ItemNameBlockItem(ModBlocks.STRAWBERRY_PLANT.get(), new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));

    //Tools
    public static final RegistryObject<Item> GLASS_CUTTER = ITEMS.register("glass_cutter", () -> new GlassCutterItem(Tiers.IRON, 1, 1f, new Item.Properties().durability(1023).tab(ModCreativeModeTabs.SC_UTILS_ATW_TAB)));

    //Vanilla Greatswords
    public static final RegistryObject<Item> WOODEN_GREATSWORD = ITEMS.register("wooden_greatsword", () -> new SwordItem(ModTiers.GREAT_WOOD, 3, -2.4f, new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ATW_TAB)));
    public static final RegistryObject<Item> STONE_GREATSWORD = ITEMS.register("stone_greatsword", () -> new SwordItem(ModTiers.GREAT_STONE, 3, -2.4f, new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ATW_TAB)));
    public static final RegistryObject<Item> IRON_GREATSWORD = ITEMS.register("iron_greatsword", () -> new SwordItem(ModTiers.GREAT_IRON, 3, -2.4f, new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ATW_TAB)));
    public static final RegistryObject<Item> GOLDEN_GREATSWORD = ITEMS.register("golden_greatsword", () -> new SwordItem(ModTiers.GREAT_GOLD, 3, -2.4f, new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ATW_TAB)));
    public static final RegistryObject<Item> DIAMOND_GREATSWORD = ITEMS.register("diamond_greatsword", () -> new SwordItem(ModTiers.GREAT_DIAMOND, 3, -2.4f, new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ATW_TAB)));
    public static final RegistryObject<Item> NETHERITE_GREATSWORD = ITEMS.register("netherite_greatsword", () -> new SwordItem(ModTiers.GREAT_NETHERITE, 3, -2.4f, new Item.Properties().fireResistant().tab(ModCreativeModeTabs.SC_UTILS_ATW_TAB)));

    //Voidstone
    public static final RegistryObject<Item> VOIDSTONE = ITEMS.register("voidstone", () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));
    public static final RegistryObject<Item> VOIDSTONE_ROD = ITEMS.register("voidstone_rod", () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));

    /* Tools & Weapons */
    public static final RegistryObject<Item> VOIDSTONE_SWORD = ITEMS.register("voidstone_sword", () -> new SwordItem(ModTiers.VOIDSTONE, 3, -2.4f, new Item.Properties().fireResistant().tab(ModCreativeModeTabs.SC_UTILS_ATW_TAB)));
    public static final RegistryObject<Item> VOIDSTONE_PICKAXE= ITEMS.register("voidstone_pickaxe", () -> new PickaxeItem(ModTiers.VOIDSTONE, 1, -2.8f, new Item.Properties().fireResistant().tab(ModCreativeModeTabs.SC_UTILS_ATW_TAB)));
    public static final RegistryObject<Item> VOIDSTONE_AXE = ITEMS.register("voidstone_axe", () -> new AxeItem(ModTiers.VOIDSTONE, 5, -3f, new Item.Properties().fireResistant().tab(ModCreativeModeTabs.SC_UTILS_ATW_TAB)));
    public static final RegistryObject<Item> VOIDSTONE_SHOVEL = ITEMS.register("voidstone_shovel", () -> new ShovelItem(ModTiers.VOIDSTONE, 1, -3f, new Item.Properties().fireResistant().tab(ModCreativeModeTabs.SC_UTILS_ATW_TAB)));
    public static final RegistryObject<Item> VOIDSTONE_HOE = ITEMS.register("voidstone_hoe", () -> new HoeItem(ModTiers.VOIDSTONE, -5, 0f, new Item.Properties().fireResistant().tab(ModCreativeModeTabs.SC_UTILS_ATW_TAB)));
    public static final RegistryObject<Item> VOIDSTONE_GREATSWORD = ITEMS.register("voidstone_greatsword", () -> new SwordItem(ModTiers.GREAT_VOIDSTONE, 3, -2.4f, new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ATW_TAB)));

    /* Armor */
    public static final RegistryObject<Item> VOIDSTONE_HELMET = ITEMS.register("voidstone_helmet", () -> new VoidstoneArmorItem(ModArmorMaterials.VOIDSTONE, EquipmentSlot.HEAD, new Item.Properties().fireResistant().tab(ModCreativeModeTabs.SC_UTILS_ATW_TAB)));
    public static final RegistryObject<Item> VOIDSTONE_CHESTPLATE = ITEMS.register("voidstone_chestplate", () -> new VoidstoneArmorItem(ModArmorMaterials.VOIDSTONE, EquipmentSlot.CHEST, new Item.Properties().fireResistant().tab(ModCreativeModeTabs.SC_UTILS_ATW_TAB)));
    public static final RegistryObject<Item> VOIDSTONE_LEGGINGS = ITEMS.register("voidstone_leggings", () -> new VoidstoneArmorItem(ModArmorMaterials.VOIDSTONE, EquipmentSlot.LEGS, new Item.Properties().fireResistant().tab(ModCreativeModeTabs.SC_UTILS_ATW_TAB)));
    public static final RegistryObject<Item> VOIDSTONE_BOOTS = ITEMS.register("voidstone_boots", () -> new VoidstoneArmorItem(ModArmorMaterials.VOIDSTONE, EquipmentSlot.FEET, new Item.Properties().fireResistant().tab(ModCreativeModeTabs.SC_UTILS_ATW_TAB)));

    //Wands
    /* Base Wands */
    public static final RegistryObject<Item> ADVANCED_WAND = ITEMS.register("advanced_wand", () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));
    public static final RegistryObject<Item> BASIC_WAND = ITEMS.register("basic_wand", () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));

    /* Wand Caps */
    public static final RegistryObject<Item> GILDED_IRON_WAND_CAP = ITEMS.register("gilded_iron_wand_cap", () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));
    public static final RegistryObject<Item> GILDED_DIAMOND_WAND_CAP = ITEMS.register("gilded_diamond_wand_cap", () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));

    /* Wand Foci */
    public static final RegistryObject<Item> FIRE_FOCUS = ITEMS.register("fire_focus", () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));
    public static final RegistryObject<Item> HARMING_FOCUS = ITEMS.register("harming_focus", () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));
    public static final RegistryObject<Item> HEALING_FOCUS = ITEMS.register("healing_focus", () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));
    public static final RegistryObject<Item> LIGHTNING_FOCUS = ITEMS.register("lightning_focus", () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));
    public static final RegistryObject<Item> MINING_FOCUS = ITEMS.register("mining_focus", () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));
    public static final RegistryObject<Item> POISON_FOCUS = ITEMS.register("poison_focus", () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));
    public static final RegistryObject<Item> WITHER_FOCUS = ITEMS.register("wither_focus", () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.SC_UTILS_ITEMS_TAB)));

    /* Tier 1 Wands */
    public static final RegistryObject<Item> WAND_OF_FIRE = ITEMS.register("wand_of_fire", () -> new FireWandItem(new Item.Properties().stacksTo(1).durability(255).tab(ModCreativeModeTabs.SC_UTILS_ATW_TAB)));
    public static final RegistryObject<Item> WAND_OF_HARMING = ITEMS.register("wand_of_harming", () -> new HarmingWandItem(new Item.Properties().stacksTo(1).durability(255).tab(ModCreativeModeTabs.SC_UTILS_ATW_TAB)));
    public static final RegistryObject<Item> WAND_OF_HEALING = ITEMS.register("wand_of_healing", () -> new HealingWandItem(new Item.Properties().stacksTo(1).durability(255).tab(ModCreativeModeTabs.SC_UTILS_ATW_TAB)));
    public static final RegistryObject<Item> WAND_OF_POISON = ITEMS.register("wand_of_poison", () -> new PoisonWandItem(new Item.Properties().stacksTo(1).durability(255).tab(ModCreativeModeTabs.SC_UTILS_ATW_TAB)));

    /* Tier 2 Wands */
    public static final RegistryObject<Item> WAND_OF_LIGHTNING = ITEMS.register("wand_of_lightning", () -> new LightningWandItem(new Item.Properties().stacksTo(1).durability(255).tab(ModCreativeModeTabs.SC_UTILS_ATW_TAB)));
    public static final RegistryObject<Item> WAND_OF_MINING = ITEMS.register("wand_of_mining", () -> new MiningWandItem(Tiers.NETHERITE, new Item.Properties().stacksTo(1).durability(18431).tab(ModCreativeModeTabs.SC_UTILS_ATW_TAB), 1));
    public static final RegistryObject<Item> WAND_OF_WITHER = ITEMS.register("wand_of_wither", () -> new WitherWandItem(new Item.Properties().stacksTo(1).durability(255).tab(ModCreativeModeTabs.SC_UTILS_ATW_TAB)));

    /* Tier 3 Wands */
    public static final RegistryObject<Item> STAFF_OF_THE_TUNNELER = ITEMS.register("staff_of_the_tunneler", () -> new StaffOfTheTunnelerItem(ModTiers.VOIDSTONE, new Item.Properties().stacksTo(1).durability(51199).tab(ModCreativeModeTabs.SC_UTILS_ATW_TAB), 2));

    //Weapons
    public static final RegistryObject<Item> TURTLE_TRIDENT = ITEMS.register("turtle_trident", () -> new TurtleTridentItem(new Item.Properties().stacksTo(1).durability(63).tab(ModCreativeModeTabs.SC_UTILS_ATW_TAB)));

    /**
     * Registers Items to the Deferred Register of Items
     * @param eventBus The bus that contains the Item's information
     */
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
