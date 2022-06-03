package lemon_juice.scalar_utils.item.custom_items.armors;

import com.google.common.collect.ImmutableMap;
import lemon_juice.scalar_utils.item.custom_materials.ModArmorMaterials;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.Map;

public class FeatherFallArmorItem extends ArmorItem {
    private static final Map<ArmorMaterial, MobEffectInstance> MATERIAL_TO_EFFECT_MAP = (new ImmutableMap.Builder<ArmorMaterial, MobEffectInstance>())
            .put(ModArmorMaterials.GOLDEN_FEATHER, new MobEffectInstance(MobEffects.SLOW_FALLING, 200, 1))
            .build();

    public FeatherFallArmorItem(ArmorMaterial pMaterial, EquipmentSlot pSlot, Properties pProperties) {
        super(pMaterial, pSlot, pProperties);
    }

    /**
     * Every tick where this player is wearing armor check to see if it applies an effect
     * @param stack Not used
     * @param level The level (world) being played on
     * @param player The player
     */
    @Override
    public void onArmorTick(ItemStack stack, Level level, Player player) {
        if(!level.isClientSide()){
            if(hasBootsOn(player)){
                evaluateArmorEffects(player);
            }
        }
    }

    /**
     * Checks if a player should receive and effect and gives it to them
     * @param player The player to be evaluated
     */
    private void evaluateArmorEffects(Player player){
        for(Map.Entry<ArmorMaterial, MobEffectInstance> entry: MATERIAL_TO_EFFECT_MAP.entrySet()) {
            ArmorMaterial mapArmorMaterial = entry.getKey();
            MobEffectInstance mapStatusEffect = entry.getValue();

            if(hasCorrectBootsOn(mapArmorMaterial, player)){
                addStatusEffectForMaterial(player, mapArmorMaterial, mapStatusEffect);
            }
        }
    }

    /**
     * Adds the status effect for a given material to the player
     * @param player The player
     * @param mapArmorMaterial The armor material
     * @param mapStatusEffect The status effect
     */
    private void addStatusEffectForMaterial(Player player, ArmorMaterial mapArmorMaterial, MobEffectInstance mapStatusEffect){
        boolean hasPlayerEffect = player.hasEffect(mapStatusEffect.getEffect());

        if(hasCorrectBootsOn(mapArmorMaterial, player) && !hasPlayerEffect){
            player.addEffect(new MobEffectInstance(mapStatusEffect.getEffect(), mapStatusEffect.getDuration(), mapStatusEffect.getAmplifier()));
        }
    }

    /**
     * Checks if the Player has a boots on at all
     * @param player The Player
     * @return true if the player is wearing a boots, false otherwise
     */
    private boolean hasBootsOn(Player player){
        ItemStack boots = player.getInventory().getArmor(0);

        return !boots.isEmpty();
    }

    /**
     * Checks to see if the player has the correct boots on
     * @param material The armor material
     * @param player The player
     * @return true if the player is wearing the correct boots, false otherwise
     */
    private boolean hasCorrectBootsOn(ArmorMaterial material, Player player){
        ArmorItem boots = ((ArmorItem) player.getInventory().getArmor(0).getItem());

        return boots.getMaterial() == material;
    }

}
