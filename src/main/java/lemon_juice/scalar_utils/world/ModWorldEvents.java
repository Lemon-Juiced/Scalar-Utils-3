package lemon_juice.scalar_utils.world;

import lemon_juice.scalar_utils.ScalarUtils;
import lemon_juice.scalar_utils.world.gen.ModFlowerGeneration;
import lemon_juice.scalar_utils.world.gen.ModOreGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ScalarUtils.MOD_ID)
public class ModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event){
        ModOreGeneration.generateOres(event);
        ModFlowerGeneration.generateFlowers(event);
    }
}
