package net.derzockerhddb.loot_boxmod.item;

import net.derzockerhddb.loot_boxmod.Loot_boxMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Loot_boxMod.MOD_ID );

public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
        () -> new Item(new Item.Properties()));
public static final RegistryObject<Item> LOOT_BOX = ITEMS.register("loot_box",
        () -> new Item(new Item.Properties()));

         public static void register(IEventBus eventBus)  {
             ITEMS.register(eventBus);
         }
}
