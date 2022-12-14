package com.neroduckale.ringofspeed.init;

import com.neroduckale.ringofspeed.ExampleMod;
import com.neroduckale.ringofspeed.items.Ring;
import com.neroduckale.ringofspeed.items.RingForMajor;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MOD_ID);
    public static final RegistryObject<Item> ring = ITEMS.register("ring", () -> new Ring(new Item.Properties()));
    public static final RegistryObject<Item> ringformajor = ITEMS.register("ringformajor",
            () -> new RingForMajor(new Item.Properties()));

}
