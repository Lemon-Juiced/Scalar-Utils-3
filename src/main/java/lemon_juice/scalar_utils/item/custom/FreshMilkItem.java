package lemon_juice.scalar_utils.item.custom;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.MilkBucketItem;
import net.minecraft.world.level.Level;

public class FreshMilkItem extends MilkBucketItem {
    public FreshMilkItem(Properties pProperties) {
        super(pProperties);
    }

    /**
     * @return The ItemStack minus one rather than a bucket, which is returned by the MilkBucketItem
     */
    @Override
    public ItemStack finishUsingItem(ItemStack pStack, Level pLevel, LivingEntity pEntityLiving) {
        if (!pLevel.isClientSide) pEntityLiving.curePotionEffects(pStack); // FORGE - move up so stack.shrink does not turn stack into air
        if (pEntityLiving instanceof ServerPlayer) {
            ServerPlayer serverplayer = (ServerPlayer)pEntityLiving;
            CriteriaTriggers.CONSUME_ITEM.trigger(serverplayer, pStack);
            serverplayer.awardStat(Stats.ITEM_USED.get(this));
        }

        if (pEntityLiving instanceof Player && !((Player)pEntityLiving).getAbilities().instabuild) {
            pStack.shrink(1);
        }

        return pStack.isEmpty() ? new ItemStack(Items.AIR) : pStack;
    }
}
