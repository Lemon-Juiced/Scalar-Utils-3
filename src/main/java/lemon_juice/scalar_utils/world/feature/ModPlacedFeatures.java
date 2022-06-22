package lemon_juice.scalar_utils.world.feature;

import lemon_juice.scalar_utils.ScalarUtils;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModPlacedFeatures {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, ScalarUtils.MOD_ID);

    public static final RegistryObject<PlacedFeature> BLACK_LOTUS_PLACED = PLACED_FEATURES.register("black_lotus_placed",
            () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?, ?>>)
                    ModConfiguredFeatures.BLACK_LOTUS, List.of(RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));

    public static final RegistryObject<PlacedFeature> MANA_CRYSTAL_ORE_PLACED = PLACED_FEATURES.register("mana_crystal_ore_placed",
            () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?, ?>>)
                ModConfiguredFeatures.MANA_CRYSTAL, ModOrePlacement.commonOrePlacement(14, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));

    public static final RegistryObject<PlacedFeature> VOIDSTONE_ORE_PLACED = PLACED_FEATURES.register("voidstone_ore_placed",
            () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?, ?>>)
            ModConfiguredFeatures.VOIDSTONE_ORE, ModOrePlacement.commonOrePlacement(6, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(120)))));

    public static void register(IEventBus eventBus){
        PLACED_FEATURES.register(eventBus);
    }
}
