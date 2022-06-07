package lemon_juice.scalar_utils.item.custom_items.wands.tier2;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class LightningWandItem extends Item {
    public LightningWandItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public boolean onLeftClickEntity(ItemStack stack, Player player, Entity entity) {
        if (entity instanceof LivingEntity) {
            LightningBolt lightningBolt = new LightningBolt(EntityType.LIGHTNING_BOLT, player.level);
            lightningBolt.setPos(entity.getX(), entity.getY(), entity.getZ());
            player.level.addFreshEntity(lightningBolt);
        }

        if (player != null) {
            player.getItemInHand(player.getUsedItemHand()).hurtAndBreak(1, player, (p_41303_) -> {
                p_41303_.broadcastBreakEvent(player.getUsedItemHand());
            });
        }

        return super.onLeftClickEntity(stack, player, entity);
    }
}
