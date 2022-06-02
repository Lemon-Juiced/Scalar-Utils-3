package lemon_juice.scalar_utils.item;

import lemon_juice.scalar_utils.ScalarUtils;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import java.util.function.Supplier;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;

public enum ModArmorMaterials implements ArmorMaterial {
    GOLDEN_FEATHER("golden_feather", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> {return Ingredient.of(ModItems.GOLDEN_FEATHER.get());}),
    GILDED_DIAMOND("gilded_diamond", 33, new int[]{3, 6, 8, 3}, 25, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> {return Ingredient.of(ModItems.GILDED_DIAMOND.get());}),
    GILDED_NETHERITE("gilded_netherite", 37, new int[]{3, 6, 8, 3}, 25, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> {return Ingredient.of(ModItems.GILDED_NETHERITE_INGOT.get());}),
    GILDED_IRON("gilded_iron", 15, new int[]{2, 5, 6, 2}, 25, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {return Ingredient.of(ModItems.GILDED_IRON_INGOT.get());}),
    MANA_CRYSTAL("mana_crystal", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> {return Ingredient.of(ModItems.MANA_CRYSTAL.get());}),
    SHULKER("shulker", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> {return Ingredient.of(Items.SHULKER_SHELL);}),
    VOIDSTONE("voidstone", 40, new int[]{3, 6, 8, 3}, 20, SoundEvents.ARMOR_EQUIP_GENERIC, 4.0F, 0.1F, () -> {return Ingredient.of(ModItems.VOIDSTONE.get());});


    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    private ModArmorMaterials(String p_40474_, int p_40475_, int[] p_40476_, int p_40477_, SoundEvent p_40478_, float p_40479_, float p_40480_, Supplier<Ingredient> p_40481_) {
        this.name = p_40474_;
        this.durabilityMultiplier = p_40475_;
        this.slotProtections = p_40476_;
        this.enchantmentValue = p_40477_;
        this.sound = p_40478_;
        this.toughness = p_40479_;
        this.knockbackResistance = p_40480_;
        this.repairIngredient = new LazyLoadedValue<>(p_40481_);
    }

    public int getDurabilityForSlot(EquipmentSlot pSlot) {
        return HEALTH_PER_SLOT[pSlot.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlot pSlot) {
        return this.slotProtections[pSlot.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public String getName() {
        return ScalarUtils.MOD_ID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}