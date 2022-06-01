package lemon_juice.scalar_utils.world.feature;

import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModOrePlacement {

    public static List<PlacementModifier> orePlacement(PlacementModifier place0, PlacementModifier place1){
        return List.of(place0, InSquarePlacement.spread(), place1, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int i, PlacementModifier place0){
        return orePlacement(CountPlacement.of(i), place0);
    }

    public static List<PlacementModifier> rareOrePlacement(int i, PlacementModifier place0){
        return orePlacement(RarityFilter.onAverageOnceEvery(i), place0);
    }
}
