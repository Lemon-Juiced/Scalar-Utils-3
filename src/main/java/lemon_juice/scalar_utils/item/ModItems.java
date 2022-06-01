package lemon_juice.scalar_utils.item;

import lemon_juice.scalar_utils.ScalarUtils;
import lemon_juice.scalar_utils.block.ModBlocks;
import lemon_juice.scalar_utils.item.custom.*;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ScalarUtils.MOD_ID);

    //Crops (Are Foods)
    public static final RegistryObject<Item> RICE = ITEMS.register("rice", () -> new Item(new Item.Properties().food(ModFoods.RICE).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry", () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRY).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));

    //Crops (Not Foods)
    public static final RegistryObject<Item> FLAX = ITEMS.register("flax", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));

    //Custom Crafting Tools
    public static final RegistryObject<Item> MEAT_GRINDER = ITEMS.register("meat_grinder", () -> new ToolItem(new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> PAN = ITEMS.register("pan", () -> new ToolItem(new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> POT = ITEMS.register("pot", () -> new ToolItem(new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));

    //Food
    public static final RegistryObject<Item> BUTTER = ITEMS.register("butter", () -> new Item(new Item.Properties().food(ModFoods.BUTTER).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese", () -> new Item(new Item.Properties().food(ModFoods.CHEESE).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> CHEESECAKE = ITEMS.register("cheesecake", () -> new Item(new Item.Properties().food(ModFoods.CHEESECAKE).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> CHICKEN_NUGGET = ITEMS.register("chicken_nugget", () -> new Item(new Item.Properties().food(ModFoods.CHICKEN_NUGGET).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> CHOCOLATE_MILK = ITEMS.register("chocolate_milk", () -> new Item(new Item.Properties().food(ModFoods.CHOCOLATE_MILK).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> COOKED_MEAT = ITEMS.register("cooked_meat", () -> new Item(new Item.Properties().food(ModFoods.COOKED_MEAT).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> GRILLED_CHEESE = ITEMS.register("grilled_cheese", () -> new Item(new Item.Properties().food(ModFoods.GRILLED_CHEESE).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> GRILLED_MEAT_AND_CHEESE = ITEMS.register("grilled_meat_and_cheese", () -> new Item(new Item.Properties().food(ModFoods.GRILLED_MEAT_AND_CHEESE).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> HOT_COCOA = ITEMS.register("hot_cocoa", () -> new Item(new Item.Properties().food(ModFoods.HOT_COCOA).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> RAW_CHICKEN_NUGGET = ITEMS.register("raw_chicken_nugget", () -> new Item(new Item.Properties().food(ModFoods.RAW_CHICKEN_NUGGET).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> RAW_MEAT = ITEMS.register("raw_meat", () -> new Item(new Item.Properties().food(ModFoods.RAW_MEAT).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> RICE_BREAD = ITEMS.register("rice_bread", () -> new Item(new Item.Properties().food(ModFoods.RICE_BREAD).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> STRAWBERRY_CHEESECAKE = ITEMS.register("strawberry_cheesecake", () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRY_CHEESECAKE).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> TOAST = ITEMS.register("toast", () -> new Item(new Item.Properties().food(ModFoods.TOAST).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> YOGURT = ITEMS.register("yogurt", () -> new Item(new Item.Properties().food(ModFoods.YOGURT).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));

    //Fuel
    public static final RegistryObject<Item> TINY_CHARCOAL = ITEMS.register("tiny_charcoal", () -> new TinyCoalItem(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> TINY_COAL = ITEMS.register("tiny_coal", () -> new TinyCoalItem(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));

    //Gilded Iron
    public static final RegistryObject<Item> GILDED_IRON_INGOT = ITEMS.register("gilded_iron_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> GILDED_IRON_NUGGET = ITEMS.register("gilded_iron_nugget", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> GILDED_IRON_HELMET = ITEMS.register("gilded_iron_helmet", () -> new GildedArmorItem(ModArmorMaterials.GILDED_IRON, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> GILDED_IRON_CHESTPLATE = ITEMS.register("gilded_iron_chestplate", () -> new GildedArmorItem(ModArmorMaterials.GILDED_IRON, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> GILDED_IRON_LEGGINGS = ITEMS.register("gilded_iron_leggings", () -> new GildedArmorItem(ModArmorMaterials.GILDED_IRON, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> GILDED_IRON_BOOTS = ITEMS.register("gilded_iron_boots", () -> new GildedArmorItem(ModArmorMaterials.GILDED_IRON, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));

    //Items
    public static final RegistryObject<Item> CITRIC_COMPOUND = ITEMS.register("citric_compound", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> CRANK = ITEMS.register("crank", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> FLEXIMESH = ITEMS.register("fleximesh", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> GILDED_IRON_CHASSIS = ITEMS.register("gilded_iron_chassis", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> GOLDEN_FEATHER = ITEMS.register("golden_feather", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> LEMON_QUARTZ = ITEMS.register("lemon_quartz", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> LEMON_QUARTZ_BLADE = ITEMS.register("lemon_quartz_blade", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> RICE_SLIMEBALL = ITEMS.register("rice_slimeball", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> SYNTHETIC_EMERALD = ITEMS.register("synthetic_emerald", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));

    //Misc. Armor
    public static final RegistryObject<Item> FEATHERFALL_BOOTS = ITEMS.register("featherfall_boots", () -> new FeatherFallArmorItem(ModArmorMaterials.GOLDEN_FEATHER, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> SHULKER_SHELLMET = ITEMS.register("shulker_shellmet", () -> new ShulkerArmorItem(ModArmorMaterials.SHULKER, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));

    //Pseudo-Foods
    public static final RegistryObject<Item> FLOUR = ITEMS.register("flour", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> FRESH_MILK = ITEMS.register("fresh_milk", () -> new FreshMilkItem(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));

    //Seeds
    public static final RegistryObject<Item> FLAX_SEEDS = ITEMS.register("flax_seeds", () -> new ItemNameBlockItem(ModBlocks.FLAX_PLANT.get(), new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> RICE_SEEDS = ITEMS.register("rice_seeds", () -> new ItemNameBlockItem(ModBlocks.RICE_PLANT.get(), new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> STRAWBERRY_SEEDS = ITEMS.register("strawberry_seeds", () -> new ItemNameBlockItem(ModBlocks.STRAWBERRY_PLANT.get(), new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));

    //Vanilla Greatswords
    public static final RegistryObject<Item> WOOD_GREATSWORD = ITEMS.register("wood_greatsword", () -> new SwordItem(ModTiers.GREAT_WOOD, 3, -2.4f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> STONE_GREATSWORD = ITEMS.register("stone_greatsword", () -> new SwordItem(ModTiers.GREAT_STONE, 3, -2.4f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> IRON_GREATSWORD = ITEMS.register("iron_greatsword", () -> new SwordItem(ModTiers.GREAT_IRON, 3, -2.4f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> GOLD_GREATSWORD = ITEMS.register("gold_greatsword", () -> new SwordItem(ModTiers.GREAT_GOLD, 3, -2.4f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> DIAMOND_GREATSWORD = ITEMS.register("diamond_greatsword", () -> new SwordItem(ModTiers.GREAT_DIAMOND, 3, -2.4f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> NETHERITE_GREATSWORD = ITEMS.register("netherite_greatsword", () -> new SwordItem(ModTiers.GREAT_NETHERITE, 3, -2.4f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));

    //Voidstone
    public static final RegistryObject<Item> VOIDSTONE = ITEMS.register("voidstone", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> VOIDSTONE_SWORD = ITEMS.register("voidstone_sword", () -> new SwordItem(ModTiers.VOIDSTONE, 3, -2.4f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> VOIDSTONE_PICKAXE= ITEMS.register("voidstone_pickaxe", () -> new PickaxeItem(ModTiers.VOIDSTONE, 1, -2.8f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> VOIDSTONE_AXE = ITEMS.register("voidstone_axe", () -> new AxeItem(ModTiers.VOIDSTONE, 5, -3f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> VOIDSTONE_SHOVEL = ITEMS.register("voidstone_shovel", () -> new ShovelItem(ModTiers.VOIDSTONE, 1, -3f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> VOIDSTONE_HOE = ITEMS.register("voidstone_hoe", () -> new HoeItem(ModTiers.VOIDSTONE, -5, 0f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> VOIDSTONE_HELMET = ITEMS.register("voidstone_helmet", () -> new ArmorItem(ModArmorMaterials.VOIDSTONE, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> VOIDSTONE_CHESTPLATE = ITEMS.register("voidstone_chestplate", () -> new ArmorItem(ModArmorMaterials.VOIDSTONE, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> VOIDSTONE_LEGGINGS = ITEMS.register("voidstone_leggings", () -> new ArmorItem(ModArmorMaterials.VOIDSTONE, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> VOIDSTONE_BOOTS = ITEMS.register("voidstone_boots", () -> new ArmorItem(ModArmorMaterials.VOIDSTONE, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> VOIDSTONE_GREATSWORD = ITEMS.register("voidstone_greatsword", () -> new SwordItem(ModTiers.GREAT_VOIDSTONE, 3, -2.4f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));

    /**
     * Registers Items to the Deferred Register of Items
     * @param eventBus The bus that contains the Item's information
     */
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
