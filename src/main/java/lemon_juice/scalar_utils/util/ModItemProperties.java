package lemon_juice.scalar_utils.util;

import lemon_juice.scalar_utils.item.ModItems;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class ModItemProperties {
    public static void addCustomItemProperties(){
        makeTrident(ModItems.TURTLE_TRIDENT.get());
    }

    public static void makeTrident(Item item){
        ItemProperties.register(item, new ResourceLocation("throwing"), (p_174585_, p_174586_, p_174587_, p_174588_) -> {
            return p_174587_ != null && p_174587_.isUsingItem() && p_174587_.getUseItem() == p_174585_ ? 1.0F : 0.0F;
        });
    }

}
