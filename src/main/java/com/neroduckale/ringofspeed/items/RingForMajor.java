package com.neroduckale.ringofspeed.items;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RingForMajor extends Item {
    public RingForMajor(Properties p_i48487_1_) {
        super(p_i48487_1_.tab(ItemGroup.TAB_MISC));
    }
    public static final Logger LOGGER = LogManager.getLogger();
    @Override
    public void inventoryTick(ItemStack p_77663_1_, World p_77663_2_, Entity p_77663_3_, int p_77663_4_, boolean p_77663_5_) {
        super.inventoryTick(p_77663_1_, p_77663_2_, p_77663_3_, p_77663_4_, p_77663_5_);

        ((PlayerEntity) p_77663_3_).addEffect(new EffectInstance(Effects.MOVEMENT_SPEED, 5,2));
       LOGGER.info("YES SOEEE");
    }
}
