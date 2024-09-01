package net.derzockerhddb.loot_boxmod.item;

import net.derzockerhddb.loot_boxmod.Loot_boxMod;
import net.derzockerhddb.loot_boxmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Loot_boxMod.MOD_ID);

public static final RegistryObject<CreativeModeTab> LOOTBOX_TAB = CREATIVE_MODE_TABS.register("loot_tab",
        () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
                .title(Component.translatable("creativetab.lootbox_tab"))
                .displayItems(((itemDisplayParameters, output) -> {
                    output.accept(ModItems.SAPPHIRE.get());
                    output.accept(ModItems.LOOT_BOX.get());
                    output.accept(ModBlocks.VENDINGMACHINE_BLOCK.get());
                }))
                .build());


    public static void  register(IEventBus eventBus) {
         CREATIVE_MODE_TABS.register(eventBus);
    }
}
