package lemon_juice.scalar_utils.recipe;

import lemon_juice.scalar_utils.ScalarUtils;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, ScalarUtils.MOD_ID);

    public static final RegistryObject<RecipeSerializer<ManaCondenserRecipe>> MANA_CONDENSER_SERIALIZER = SERIALIZERS.register("mana_condensing", () -> ManaCondenserRecipe.Serializer.INSTANCE);

    public static void register (IEventBus eventBus){
        SERIALIZERS.register(eventBus);
    }
}
