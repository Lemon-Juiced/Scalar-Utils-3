package lemon_juice.scalar_utils.item;

import lemon_juice.scalar_utils.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {
    public static CreativeModeTab SC_UTILS_ITEMS_TAB = new CreativeModeTab("sc_utils_items_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.VOIDSTONE.get());
        }
    };

    public static CreativeModeTab SC_UTILS_ATW_TAB = new CreativeModeTab("sc_utils_atw_tab") {
        @Override
        public ItemStack makeIcon() {return new ItemStack(ModItems.VOIDSTONE_GREATSWORD.get());}
    };

    public static CreativeModeTab SC_UTILS_BLOCKS_TAB = new CreativeModeTab("sc_utils_blocks_tab") {
        @Override
        public ItemStack makeIcon() {return new ItemStack(ModBlocks.VOIDSTONE_BLOCK.get());}
    };
}
