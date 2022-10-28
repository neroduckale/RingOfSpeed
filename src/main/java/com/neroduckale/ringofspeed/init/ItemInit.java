package com.neroduckale.ringofspeed.init;

import com.neroduckale.ringofspeed.ExampleMod;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MOD_ID);
    public static final RegistryObject<Item> ring = ITEMS.register("ring", () -> new Item(new Item.Properties()));
}
