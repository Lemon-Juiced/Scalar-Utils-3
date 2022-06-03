package lemon_juice.scalar_utils.event;

import lemon_juice.scalar_utils.ScalarUtils;
import lemon_juice.scalar_utils.event.loot.FlaxSeedsFromGrassAdditionModifier;
import lemon_juice.scalar_utils.event.loot.RiceSeedsFromGrassAdditionModifier;
import lemon_juice.scalar_utils.event.loot.StrawberrySeedsFromGrassAdditionModifier;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = ScalarUtils.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>> event) {
        event.getRegistry().registerAll(
                //Seeds
                new FlaxSeedsFromGrassAdditionModifier.Serializer().setRegistryName(new ResourceLocation(ScalarUtils.MOD_ID, "flax_seeds_from_grass")),
                new RiceSeedsFromGrassAdditionModifier.Serializer().setRegistryName(new ResourceLocation(ScalarUtils.MOD_ID, "rice_seeds_from_grass")),
                new StrawberrySeedsFromGrassAdditionModifier.Serializer().setRegistryName(new ResourceLocation(ScalarUtils.MOD_ID, "strawberry_seeds_from_grass"))
        );
    }
}
