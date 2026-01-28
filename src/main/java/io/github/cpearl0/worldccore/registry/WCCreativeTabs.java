package io.github.cpearl0.worldccore.registry;

import io.github.cpearl0.worldccore.WorldCCore;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class WCCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(BuiltInRegistries.CREATIVE_MODE_TAB, WorldCCore.MODID);

    public static final Supplier<CreativeModeTab> MAIN_TAB = CREATIVE_MODE_TABS.register("main", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup." + WorldCCore.MODID + ".main"))
            .icon(() -> new ItemStack(WCItems.STEEL_PLATE.get()))
            .displayItems((params, output) -> {
                output.acceptAll(WCItems.ITEMS.getEntries().stream()
                        .map(DeferredHolder::get)
                        .map(ItemStack::new)
                        .toList());
            })
            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
