package com.neroduckale.ringofspeed;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.potion.*;
import net.minecraft.world.World;

public class ringofthespeedzxc extends Item {
    public ringofthespeedzxc(Properties properties) {

        super(properties);
    }
    public static void gainspeed(LivingEntity playerIn) {
        playerIn.addEffect(new EffectInstance(Effects.MOVEMENT_SPEED, 999));
    }
    @Override
    public void inventoryTick(ItemStack p_77663_1_, World p_77663_2_, Entity p_77663_3_, int p_77663_4_, boolean p_77663_5_) {

    }
}
