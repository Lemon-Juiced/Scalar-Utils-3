package lemon_juice.scalar_utils.block;

import lemon_juice.scalar_utils.ScalarUtils;
import lemon_juice.scalar_utils.block.custom.crops.FlaxPlantBlock;
import lemon_juice.scalar_utils.block.custom.crops.RicePlantBlock;
import lemon_juice.scalar_utils.block.custom.crops.StrawberryPlantBlock;
import lemon_juice.scalar_utils.item.ModCreativeModeTab;
import lemon_juice.scalar_utils.item.ModItems;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.lwjgl.system.CallbackI;

import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ScalarUtils.MOD_ID);

    //Chassis
    public static final RegistryObject<Block> GILDED_IRON_CHASSIS = registerBlock("gilded_iron_chassis", () -> new GlassBlock(BlockBehaviour.Properties.of(Material.HEAVY_METAL).strength(1f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.SCALAR_UTILS_TAB);

    //Compact Blocks
    public static final RegistryObject<Block> COOKED_MEAT_BLOCK = registerBlock("cooked_meat_block", () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL).strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> GILDED_IRON_BLOCK = registerBlock("gilded_iron_block", () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL).strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> RAW_MEAT_BLOCK = registerBlock("raw_meat_block", () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL).strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.SCALAR_UTILS_TAB);

    //Crops
    public static final RegistryObject<Block> FLAX_PLANT = registerBlockWithoutBlockItem("flax_plant", () -> new FlaxPlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> RICE_PLANT = registerBlockWithoutBlockItem("rice_plant", () -> new RicePlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> STRAWBERRY_PLANT = registerBlockWithoutBlockItem("strawberry_plant", () -> new StrawberryPlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));

    //End Ores
    public static final RegistryObject<Block> VOIDSTONE_BLOCK = registerBlock("voidstone_block", () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL).strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> VOIDSTONE_ORE = registerBlock("voidstone_ore", () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL).strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.SCALAR_UTILS_TAB);

    //Flowers
    public static final RegistryObject<Block> BLACK_LOTUS = registerBlock("black_lotus", () -> new FlowerBlock(MobEffects.GLOWING, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION).noOcclusion()), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> POTTED_BLACK_LOTUS = registerBlockWithoutBlockItem("potted_black_lotus", () -> new FlowerPotBlock(null, ModBlocks.BLACK_LOTUS, BlockBehaviour.Properties.copy(Blocks.DANDELION).noOcclusion()));

    //Overworld Ores
    public static final RegistryObject<Block> DEEPSLATE_MANA_CRYSTAL_ORE = registerBlock("deepslate_mana_crystal_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> MANA_CRYSTAL_BLOCK = registerBlock("mana_crystal_block", () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> MANA_CRYSTAL_ORE = registerBlock("mana_crystal_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.SCALAR_UTILS_TAB);

    //Solid Blocks
    public static final RegistryObject<Block> BLACK_SOLID_BLOCK = registerBlock("black_solid_block", () -> new Block(BlockBehaviour.Properties.of(Material.DECORATION).strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> BLUE_SOLID_BLOCK = registerBlock("blue_solid_block", () -> new Block(BlockBehaviour.Properties.of(Material.DECORATION).strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> BROWN_SOLID_BLOCK = registerBlock("brown_solid_block", () -> new Block(BlockBehaviour.Properties.of(Material.DECORATION).strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> CYAN_SOLID_BLOCK = registerBlock("cyan_solid_block", () -> new Block(BlockBehaviour.Properties.of(Material.DECORATION).strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> GRAY_SOLID_BLOCK = registerBlock("gray_solid_block", () -> new Block(BlockBehaviour.Properties.of(Material.DECORATION).strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> GREEN_SOLID_BLOCK = registerBlock("green_solid_block", () -> new Block(BlockBehaviour.Properties.of(Material.DECORATION).strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> LIGHT_BLUE_SOLID_BLOCK = registerBlock("light_blue_solid_block", () -> new Block(BlockBehaviour.Properties.of(Material.DECORATION).strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> LIGHT_GRAY_SOLID_BLOCK = registerBlock("light_gray_solid_block", () -> new Block(BlockBehaviour.Properties.of(Material.DECORATION).strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> LIME_SOLID_BLOCK = registerBlock("lime_solid_block", () -> new Block(BlockBehaviour.Properties.of(Material.DECORATION).strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> MAGENTA_SOLID_BLOCK = registerBlock("magenta_solid_block", () -> new Block(BlockBehaviour.Properties.of(Material.DECORATION).strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> ORANGE_SOLID_BLOCK = registerBlock("orange_solid_block", () -> new Block(BlockBehaviour.Properties.of(Material.DECORATION).strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> PINK_SOLID_BLOCK = registerBlock("pink_solid_block", () -> new Block(BlockBehaviour.Properties.of(Material.DECORATION).strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> PURPLE_SOLID_BLOCK = registerBlock("purple_solid_block", () -> new Block(BlockBehaviour.Properties.of(Material.DECORATION).strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> RED_SOLID_BLOCK = registerBlock("red_solid_block", () -> new Block(BlockBehaviour.Properties.of(Material.DECORATION).strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> WHITE_SOLID_BLOCK = registerBlock("white_solid_block", () -> new Block(BlockBehaviour.Properties.of(Material.DECORATION).strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> YELLOW_SOLID_BLOCK = registerBlock("yellow_solid_block", () -> new Block(BlockBehaviour.Properties.of(Material.DECORATION).strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.SCALAR_UTILS_TAB);

    /* Inverted Solid Blocks */
    public static final RegistryObject<Block> ILLUMINANT_BLACK_SOLID_BLOCK = registerBlock("illuminant_black_solid_block", () -> new Block(BlockBehaviour.Properties.of(Material.DECORATION).strength(1f).requiresCorrectToolForDrops().lightLevel((p_50872_) -> 15)), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> ILLUMINANT_BLUE_SOLID_BLOCK = registerBlock("illuminant_blue_solid_block", () -> new Block(BlockBehaviour.Properties.of(Material.DECORATION).strength(1f).requiresCorrectToolForDrops().lightLevel((p_50872_) -> 15)), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> ILLUMINANT_BROWN_SOLID_BLOCK = registerBlock("illuminant_brown_solid_block", () -> new Block(BlockBehaviour.Properties.of(Material.DECORATION).strength(1f).requiresCorrectToolForDrops().lightLevel((p_50872_) -> 15)), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> ILLUMINANT_CYAN_SOLID_BLOCK = registerBlock("illuminant_cyan_solid_block", () -> new Block(BlockBehaviour.Properties.of(Material.DECORATION).strength(1f).requiresCorrectToolForDrops().lightLevel((p_50872_) -> 15)), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> ILLUMINANT_GRAY_SOLID_BLOCK = registerBlock("illuminant_gray_solid_block", () -> new Block(BlockBehaviour.Properties.of(Material.DECORATION).strength(1f).requiresCorrectToolForDrops().lightLevel((p_50872_) -> 15)), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> ILLUMINANT_GREEN_SOLID_BLOCK = registerBlock("illuminant_green_solid_block", () -> new Block(BlockBehaviour.Properties.of(Material.DECORATION).strength(1f).requiresCorrectToolForDrops().lightLevel((p_50872_) -> 15)), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> ILLUMINANT_LIGHT_BLUE_SOLID_BLOCK = registerBlock("illuminant_light_blue_solid_block", () -> new Block(BlockBehaviour.Properties.of(Material.DECORATION).strength(1f).requiresCorrectToolForDrops().lightLevel((p_50872_) -> 15)), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> ILLUMINANT_LIGHT_GRAY_SOLID_BLOCK = registerBlock("illuminant_light_gray_solid_block", () -> new Block(BlockBehaviour.Properties.of(Material.DECORATION).strength(1f).requiresCorrectToolForDrops().lightLevel((p_50872_) -> 15)), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> ILLUMINANT_LIME_SOLID_BLOCK = registerBlock("illuminant_lime_solid_block", () -> new Block(BlockBehaviour.Properties.of(Material.DECORATION).strength(1f).requiresCorrectToolForDrops().lightLevel((p_50872_) -> 15)), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> ILLUMINANT_MAGENTA_SOLID_BLOCK = registerBlock("illuminant_magenta_solid_block", () -> new Block(BlockBehaviour.Properties.of(Material.DECORATION).strength(1f).requiresCorrectToolForDrops().lightLevel((p_50872_) -> 15)), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> ILLUMINANT_ORANGE_SOLID_BLOCK = registerBlock("illuminant_orange_solid_block", () -> new Block(BlockBehaviour.Properties.of(Material.DECORATION).strength(1f).requiresCorrectToolForDrops().lightLevel((p_50872_) -> 15)), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> ILLUMINANT_PINK_SOLID_BLOCK = registerBlock("illuminant_pink_solid_block", () -> new Block(BlockBehaviour.Properties.of(Material.DECORATION).strength(1f).requiresCorrectToolForDrops().lightLevel((p_50872_) -> 15)), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> ILLUMINANT_PURPLE_SOLID_BLOCK = registerBlock("illuminant_purple_solid_block", () -> new Block(BlockBehaviour.Properties.of(Material.DECORATION).strength(1f).requiresCorrectToolForDrops().lightLevel((p_50872_) -> 15)), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> ILLUMINANT_RED_SOLID_BLOCK = registerBlock("illuminant_red_solid_block", () -> new Block(BlockBehaviour.Properties.of(Material.DECORATION).strength(1f).requiresCorrectToolForDrops().lightLevel((p_50872_) -> 15)), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> ILLUMINANT_WHITE_SOLID_BLOCK = registerBlock("illuminant_white_solid_block", () -> new Block(BlockBehaviour.Properties.of(Material.DECORATION).strength(1f).requiresCorrectToolForDrops().lightLevel((p_50872_) -> 15)), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> ILLUMINANT_YELLOW_SOLID_BLOCK = registerBlock("illuminant_yellow_solid_block", () -> new Block(BlockBehaviour.Properties.of(Material.DECORATION).strength(1f).requiresCorrectToolForDrops().lightLevel((p_50872_) -> 15)), ModCreativeModeTab.SCALAR_UTILS_TAB);

    /**
     * Registers the Block as a Block
     *
     * @param name The Block's name
     * @param block The Block's properties
     * @param tab The Block's Creative Mode Tab
     * @return An extension of Block with an associated Item
     */
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    /**
     * Registers a block without an associated Item
     * @param name  The Block's name
     * @param block The Block's properties
     * @return An extension of Block
     */
    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    /**
     * Registers the Item associated with a Block
     *
     * @param name The Block's name
     * @param block The Block's RegistryObject
     * @param tab The Block's Creative Mode Tab
     * @return The Item of the Block
     */
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    /**
     * Registers Blocks to the Deferred Register of Blocks
     * @param eventBus The bus that contains the Block's information
     */
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

}
