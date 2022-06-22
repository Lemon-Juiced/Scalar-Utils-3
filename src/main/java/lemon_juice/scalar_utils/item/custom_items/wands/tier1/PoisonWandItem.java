package lemon_juice.scalar_utils.item.custom_items.wands.tier1;

import net.minecraft.network.chat.Component;
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

public class PoisonWandItem extends Item {
    public PoisonWandItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public UseAnim getUseAnimation(ItemStack pStack) {
        return UseAnim.SPEAR;
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.literal("tooltip.scalar_utils.wand_of_poison.tooltip"));
    }

    @Override
    public boolean onLeftClickEntity(ItemStack stack, Player player, Entity entity) {
        if(entity instanceof LivingEntity){
            LivingEntity livingEntity = (LivingEntity) entity;
            if(isUndead(livingEntity)){
                livingEntity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 100, 1));
            } else if(isSpider(livingEntity)){
                //Do nothing, spiders are immune, but don't apply
            } else {
                livingEntity.addEffect(new MobEffectInstance(MobEffects.POISON, 100, 1));
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
     * @return true if entity is a spider or cave spider, false otherwise
     */
    public boolean isSpider(LivingEntity entity){
        if(entity instanceof Spider || entity instanceof CaveSpider){
            return true;
        }
        return false;
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
