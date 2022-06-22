package lemon_juice.scalar_utils.item.custom_items.wands.tier3;

import lemon_juice.scalar_utils.item.ModItems;
import lemon_juice.scalar_utils.item.custom_items.wands.tier2.MiningWandItem;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class StaffOfTheTunnelerItem extends MiningWandItem {

    public StaffOfTheTunnelerItem(Tier tier, Properties builder, int radius) {
        super(tier, builder, radius);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.literal("tooltip.scalar_utils.staff_of_the_tunneler.tooltip"));
    }

    @Override
    public float getDestroySpeed(ItemStack stack, BlockState state) {
        return Math.max(Math.max(ModItems.VOIDSTONE_AXE.get().getDestroySpeed(stack, state), ModItems.VOIDSTONE_HOE.get().getDestroySpeed(stack, state)),
                Math.max(ModItems.VOIDSTONE_PICKAXE.get().getDestroySpeed(stack, state), ModItems.VOIDSTONE_SHOVEL.get().getDestroySpeed(stack, state)));
    }
}
