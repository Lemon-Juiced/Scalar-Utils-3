package lemon_juice.scalar_utils.world.feature;

import lemon_juice.scalar_utils.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;

import java.util.List;

public class ModConfiguredFeatures {
    //Black Lotus
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> BLACK_LOTUS = FeatureUtils.register("flower_black_lotus", Feature.FLOWER, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.BLACK_LOTUS.get())))));

    //Util For Generating in Endstone
    public static final RuleTest END_STONE = new BlockMatchTest(Blocks.END_STONE);

    //Flux Ore
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_FLUX_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.FLUX_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_FLUX_ORE.get().defaultBlockState())
    );

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> FLUX_ORE = FeatureUtils.register("flux_ore", Feature.ORE, new OreConfiguration(OVERWORLD_FLUX_ORES, 2));

    //Voidstone Ore
    public static final List<OreConfiguration.TargetBlockState> END_VOIDSTONE_ORES = List.of(
            OreConfiguration.target(END_STONE, ModBlocks.VOIDSTONE_ORE.get().defaultBlockState())
    );
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> VOIDSTONE_ORE = FeatureUtils.register("voidstone_ore", Feature.ORE, new OreConfiguration(END_VOIDSTONE_ORES, 3));

}
