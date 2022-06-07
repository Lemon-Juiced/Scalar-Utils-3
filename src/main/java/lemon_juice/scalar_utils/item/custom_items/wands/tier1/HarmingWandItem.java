package lemon_juice.scalar_utils.item.custom_items.wands.tier1;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.horse.SkeletonHorse;
import net.minecraft.world.entity.animal.horse.ZombieHorse;
import net.minecraft.world.entity.boss.wither.WitherBoss;
import net.minecraft.world.entity.monster.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class HarmingWandItem extends Item {
    public HarmingWandItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public UseAnim getUseAnimation(ItemStack pStack) {
        return UseAnim.SPEAR;
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(new TranslatableComponent("tooltip.scalar_utils.wand_of_harming.tooltip"));
    }

    @Override
    public boolean onLeftClickEntity(ItemStack stack, Player player, Entity entity) {
        if(entity instanceof LivingEntity){
            LivingEntity livingEntity = (LivingEntity) entity;
            if(isUndead(livingEntity)){
                livingEntity.addEffect(new MobEffectInstance(MobEffects.HEAL, 1, 1));
            } else {
                livingEntity.addEffect(new MobEffectInstance(MobEffects.HARM, 1, 1));
            }
        }

        if (player != null) {
            player.getItemInHand(player.getUsedItemHand()).hurtAndBreak(1, player, (p_41303_) -> {
                p_41303_.broadcastBreakEvent(player.getUsedItemHand());
            });
        }

        return super.onLeftClickEntity(stack, player, entity);
    }

    /**
     * @param entity A LivingEntity
     * @return true if entity is undead, false otherwise
     */
    public boolean isUndead(LivingEntity entity){
        if(entity instanceof Drowned || entity instanceof Husk || entity instanceof Phantom ||
                entity instanceof Skeleton || entity instanceof SkeletonHorse || entity instanceof Stray ||
                entity instanceof WitherBoss || entity instanceof WitherSkeleton || entity instanceof Zoglin ||
                entity instanceof Zombie || entity instanceof ZombieHorse || entity instanceof  ZombieVillager ||
                entity instanceof ZombifiedPiglin){
            return true;
        }

        return false;
    }
}
