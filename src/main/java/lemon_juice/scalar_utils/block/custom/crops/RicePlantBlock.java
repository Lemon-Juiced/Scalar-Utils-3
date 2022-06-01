package lemon_juice.scalar_utils.block.custom.crops;

import lemon_juice.scalar_utils.item.ModItems;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class RicePlantBlock extends CropBlock {
    public static final IntegerProperty AGE = BlockStateProperties.AGE_2;

    public RicePlantBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    public int getMaxAge() {
        return 2;
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.RICE_SEEDS.get();
    }
}
