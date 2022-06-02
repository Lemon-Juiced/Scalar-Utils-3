package lemon_juice.scalar_utils.item.custom.wands.tier1;

import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;

public class HealingWandItem extends Item {

    public HealingWandItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
       if(!pContext.getLevel().isClientSide){
           Player player = pContext.getPlayer();
           if(player.getHealth() < player.getMaxHealth()) {
               player.setHealth(player.getMaxHealth());
           }
       }

       return super.useOn(pContext);
    }
}
