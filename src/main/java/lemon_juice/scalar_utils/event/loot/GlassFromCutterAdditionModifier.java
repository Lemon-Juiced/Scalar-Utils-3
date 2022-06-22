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

public class GlassFromCutterAdditionModifier extends LootModifier {
    private final Item addition;

    protected GlassFromCutterAdditionModifier(LootItemCondition[] conditions, Item addition) {
        super(conditions);
        this.addition = addition;
    }

    @NotNull
    @Override
    protected ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
        generatedLoot.add(new ItemStack(addition, 1));
        return generatedLoot;
    }

    public static class Serializer extends GlobalLootModifierSerializer<GlassFromCutterAdditionModifier> {

        @Override
        public GlassFromCutterAdditionModifier read(ResourceLocation location, JsonObject object, LootItemCondition[] conditions) {
            Item addition = ForgeRegistries.ITEMS.getValue(new ResourceLocation(GsonHelper.getAsString(object, "addition")));
            return new GlassFromCutterAdditionModifier(conditions, addition);
        }

        @Override
        public JsonObject write(GlassFromCutterAdditionModifier instance) {
            JsonObject json = makeConditions(instance.conditions);
            json.addProperty("addition", ForgeRegistries.ITEMS.getKey(instance.addition).toString());
            return json;
        }
    }
}
