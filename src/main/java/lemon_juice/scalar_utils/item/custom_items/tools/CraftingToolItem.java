package lemon_juice.scalar_utils.item.custom_items.tools;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class CraftingToolItem extends Item {
    public CraftingToolItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        return itemStack.copy();
    }

    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return true;
    }
}
