package lemon_juice.scalar_utils;

import com.mojang.logging.LogUtils;
import lemon_juice.scalar_utils.block.ModBlocks;
import lemon_juice.scalar_utils.item.ModItems;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(ScalarUtils.MOD_ID)
public class ScalarUtils
{
    public static final String MOD_ID = "scalar_utils";
    private static final Logger LOGGER = LogUtils.getLogger();

    public ScalarUtils(){
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);

        eventBus.addListener(this::setup);
        eventBus.addListener(this::clientSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void clientSetup(final FMLClientSetupEvent event){
        //Crops
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.FLAX_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RICE_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.STRAWBERRY_PLANT.get(), RenderType.cutout());

        //Flowers
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_LOTUS.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_BLACK_LOTUS.get(), RenderType.cutout());

    }

    private void setup(final FMLCommonSetupEvent event){
        event.enqueueWork(() -> {((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.BLACK_LOTUS.getId(), ModBlocks.POTTED_BLACK_LOTUS);});
    }


}
