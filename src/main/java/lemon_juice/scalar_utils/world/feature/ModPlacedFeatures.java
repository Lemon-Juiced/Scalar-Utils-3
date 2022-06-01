package lemon_juice.scalar_utils.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;

public class ModPlacedFeatures {
    public static final Holder<PlacedFeature> BLACK_LOTUS_PLACED = PlacementUtils.register("black_lotus_placed", ModConfiguredFeatures.BLACK_LOTUS, RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> VOIDSTONE_ORE_PLACED = PlacementUtils.register("voidstone_ore_placed", ModConfiguredFeatures.VOIDSTONE_ORE, ModOrePlacement.commonOrePlacement(4, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(120))));
}
