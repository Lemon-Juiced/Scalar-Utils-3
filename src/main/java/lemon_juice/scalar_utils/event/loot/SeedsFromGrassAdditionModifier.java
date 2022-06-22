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

public class SeedsFromGrassAdditionModifier extends LootModifier {
    private final Item addition;

    protected SeedsFromGrassAdditionModifier(LootItemCondition[] conditionsIn, Item addition) {
        super(conditionsIn);
        this.addition = addition;
    }

    @NotNull
    @Override
    protected ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
        if(context.getRandom().nextFloat() < 0.05f){ //5% chance
            generatedLoot.add(new ItemStack(addition, 1));
        }
        return generatedLoot;
    }

    public static class Serializer extends GlobalLootModifierSerializer<SeedsFromGrassAdditionModifier> {

        @Override
        public SeedsFromGrassAdditionModifier read(ResourceLocation location, JsonObject object, LootItemCondition[] ailootcondition) {
            Item addition = ForgeRegistries.ITEMS.getValue(new ResourceLocation(GsonHelper.getAsString(object, "addition")));
            return new SeedsFromGrassAdditionModifier(ailootcondition, addition);
        }

        @Override
        public JsonObject write(SeedsFromGrassAdditionModifier instance) {
            JsonObject json = makeConditions(instance.conditions);
            json.addProperty("addition", ForgeRegistries.ITEMS.getKey(instance.addition).toString());
            return json;
        }
    }
}
