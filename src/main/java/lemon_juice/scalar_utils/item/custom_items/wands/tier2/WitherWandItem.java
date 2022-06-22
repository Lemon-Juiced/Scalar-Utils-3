package lemon_juice.scalar_utils.item.custom_items.wands.tier2;

import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class WitherWandItem extends Item {
    public WitherWandItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public UseAnim getUseAnimation(ItemStack pStack) {
        return UseAnim.SPEAR;
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.literal("tooltip.scalar_utils.wand_of_wither.tooltip"));
    }

    @Override
    public boolean onLeftClickEntity(ItemStack stack, Player player, Entity entity) {
        if(entity instanceof LivingEntity){
            LivingEntity livingEntity = (LivingEntity) entity;
            livingEntity.addEffect(new MobEffectInstance(MobEffects.WITHER, 200, 1));
        }

        if (player != null) {
            player.getItemInHand(player.getUsedItemHand()).hurtAndBreak(1, player, (p_41303_) -> {
                p_41303_.broadcastBreakEvent(player.getUsedItemHand());
            });
        }

        return super.onLeftClickEntity(stack, player, entity);
    }
}
