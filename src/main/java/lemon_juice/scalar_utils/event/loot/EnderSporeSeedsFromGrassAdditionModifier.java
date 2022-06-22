package lemon_juice.scalar_utils.event.loot;

import com.google.gson.JsonObject;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class EnderSporeSeedsFromGrassAdditionModifier extends LootModifier {
    private final Item addition;

    protected EnderSporeSeedsFromGrassAdditionModifier(LootItemCondition[] conditionsIn, Item addition) {
        super(conditionsIn);
        this.addition = addition;
    }

    @NotNull
    @Override
    protected ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
        if(context.getRandom().nextFloat() <= 0.001f){ //0.01% chance
            generatedLoot.add(new ItemStack(addition, 1));
        }
        return generatedLoot;
    }

    public static class Serializer extends GlobalLootModifierSerializer<EnderSporeSeedsFromGrassAdditionModifier> {

        @Override
        public EnderSporeSeedsFromGrassAdditionModifier read(ResourceLocation location, JsonObject object, LootItemCondition[] ailootcondition) {
            Item addition = ForgeRegistries.ITEMS.getValue(new ResourceLocation(GsonHelper.getAsString(object, "addition")));
            return new EnderSporeSeedsFromGrassAdditionModifier(ailootcondition, addition);
        }

        @Override
        public JsonObject write(EnderSporeSeedsFromGrassAdditionModifier instance) {
            JsonObject json = makeConditions(instance.conditions);
            json.addProperty("addition", ForgeRegistries.ITEMS.getKey(instance.addition).toString());
            return json;
        }
    }
}
