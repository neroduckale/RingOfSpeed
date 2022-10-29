package com.neroduckale.ringofspeed.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class RingForMajor extends Item {
    public RingForMajor(Item.Properties properties) {
        super(properties.tab(ItemGroup.TAB_MISC).rarity(Rarity.EPIC));


    }
    public static void gainspeed(LivingEntity playerIn) {
        playerIn.addEffect(new EffectInstance(Effects.MOVEMENT_SPEED, 20, 2));
    }




    @Override
    public void inventoryTick(ItemStack p_77663_1_, World p_77663_2_, Entity p_77663_3_, int p_77663_4_, boolean p_77663_5_) {
        super.inventoryTick(p_77663_1_, p_77663_2_, p_77663_3_, p_77663_4_, p_77663_5_);
        gainspeed((LivingEntity) p_77663_3_);
    }
}
