package lemon_juice.scalar_utils.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static CreativeModeTab SCALAR_UTILS_TAB = new CreativeModeTab("scalar_utils_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.VOIDSTONE.get());
        }
    };
}
