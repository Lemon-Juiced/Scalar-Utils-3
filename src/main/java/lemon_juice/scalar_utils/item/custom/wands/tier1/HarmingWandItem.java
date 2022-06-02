package lemon_juice.scalar_utils.item.custom.wands.tier1;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
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
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;

public class HarmingWandItem extends Item {
    public HarmingWandItem(Properties pProperties) {
        super(pProperties);
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
