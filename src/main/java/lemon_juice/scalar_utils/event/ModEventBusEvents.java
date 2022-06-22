package lemon_juice.scalar_utils.event;

import lemon_juice.scalar_utils.ScalarUtils;
import lemon_juice.scalar_utils.event.loot.EnderSporeSeedsFromGrassAdditionModifier;
import lemon_juice.scalar_utils.event.loot.GlassFromCutterAdditionModifier;
import lemon_juice.scalar_utils.event.loot.SeedsFromGrassAdditionModifier;
import lemon_juice.scalar_utils.recipe.ManaCondenserRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = ScalarUtils.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final RegisterEvent event) {
        event.register(ForgeRegistries.Keys.LOOT_MODIFIER_SERIALIZERS, helper -> {
            //Glass Cutter Util
            helper.register(new ResourceLocation(ScalarUtils.MOD_ID, "glass_from_glass"), new GlassFromCutterAdditionModifier.Serializer());

            //Seeds From Grass
            helper.register(new ResourceLocation(ScalarUtils.MOD_ID, "ender_spore_seeds_from_grass"), new EnderSporeSeedsFromGrassAdditionModifier.Serializer());
            helper.register(new ResourceLocation(ScalarUtils.MOD_ID, "flax_seeds_from_grass"), new SeedsFromGrassAdditionModifier.Serializer());
            helper.register(new ResourceLocation(ScalarUtils.MOD_ID, "rice_seeds_from_grass"), new SeedsFromGrassAdditionModifier.Serializer());
            helper.register(new ResourceLocation(ScalarUtils.MOD_ID, "strawberry_seeds_from_grass"), new SeedsFromGrassAdditionModifier.Serializer());
        });

        event.register(ForgeRegistries.Keys.RECIPE_TYPES, helper -> {
            helper.register(new ResourceLocation(ScalarUtils.MOD_ID, ManaCondenserRecipe.Type.ID), ManaCondenserRecipe.Type.INSTANCE);
        });

    }

}
