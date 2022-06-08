package lemon_juice.scalar_utils.block.entity;

import lemon_juice.scalar_utils.ScalarUtils;
import lemon_juice.scalar_utils.block.ModBlocks;
import lemon_juice.scalar_utils.block.entity.custom.ManaCondenserBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, ScalarUtils.MOD_ID);

    public static final RegistryObject<BlockEntityType<ManaCondenserBlockEntity>> MANA_CONDENSER_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("mana_condenser_block_entity",
                    () -> BlockEntityType.Builder.of(ManaCondenserBlockEntity::new,
                                    ModBlocks.MANA_CONDENSER.get()).build(null));

    public static void register(IEventBus eventBus){
        BLOCK_ENTITIES.register(eventBus);
    }
}
