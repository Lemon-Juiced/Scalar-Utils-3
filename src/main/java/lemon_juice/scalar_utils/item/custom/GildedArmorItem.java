package lemon_juice.scalar_utils.item.custom;

import lemon_juice.scalar_utils.item.ModArmorMaterials;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;


public class GildedArmorItem extends ArmorItem {

    public GildedArmorItem(ArmorMaterial pMaterial, EquipmentSlot pSlot, Properties pProperties) {
        super(pMaterial, pSlot, pProperties);
    }

    @Override
    public boolean makesPiglinsNeutral(ItemStack stack, LivingEntity wearer) {
        return stack.getItem() instanceof ArmorItem && ((ArmorItem) stack.getItem()).getMaterial() == ModArmorMaterials.GILDED_IRON;
    }
}
