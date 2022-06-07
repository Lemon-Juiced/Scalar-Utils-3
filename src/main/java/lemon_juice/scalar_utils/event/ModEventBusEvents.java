package lemon_juice.scalar_utils.event;

import lemon_juice.scalar_utils.ScalarUtils;
import lemon_juice.scalar_utils.event.loot.EnderSporeSeedsFromGrassAdditionModifier;
import lemon_juice.scalar_utils.event.loot.GlassFromCutterAdditionModifier;
import lemon_juice.scalar_utils.event.loot.SeedsFromGrassAdditionModifier;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.lwjgl.system.CallbackI;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = ScalarUtils.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>> event) {
        event.getRegistry().registerAll(
                //Glass Cutter Util
                new GlassFromCutterAdditionModifier.Serializer().setRegistryName(new ResourceLocation(ScalarUtils.MOD_ID, "glass_from_glass")),

                //Seeds
                new EnderSporeSeedsFromGrassAdditionModifier.Serializer().setRegistryName(new ResourceLocation(ScalarUtils.MOD_ID, "ender_spore_seeds_from_grass")),
                new SeedsFromGrassAdditionModifier.Serializer().setRegistryName(new ResourceLocation(ScalarUtils.MOD_ID, "flax_seeds_from_grass")),
                new SeedsFromGrassAdditionModifier.Serializer().setRegistryName(new ResourceLocation(ScalarUtils.MOD_ID, "rice_seeds_from_grass")),
                new SeedsFromGrassAdditionModifier.Serializer().setRegistryName(new ResourceLocation(ScalarUtils.MOD_ID, "strawberry_seeds_from_grass"))
        );
    }
}
