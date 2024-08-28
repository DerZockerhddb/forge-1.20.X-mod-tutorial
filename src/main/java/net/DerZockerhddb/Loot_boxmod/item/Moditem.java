package net.DerZockerhddb.Loot_boxmod.item;

import net.DerZockerhddb.Loot_boxmod.Loot_boxMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Moditem {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Loot_boxMod.MOD_ID);

public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
        () -> new Item(new Item.Properties()));


         public static void register(IEventBus eventBus)  {
             ITEMS.register(eventBus);
         }
}
