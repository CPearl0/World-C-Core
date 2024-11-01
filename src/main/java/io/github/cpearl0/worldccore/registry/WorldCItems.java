package io.github.cpearl0.worldccore.registry;

import io.github.cpearl0.worldccore.WorldCCore;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class WorldCItems {
    public static final DeferredRegister.Items ITEM = DeferredRegister.Items.createItems(WorldCCore.MODID);

    public static final DeferredItem<Item> IO_PORT = registerSimpleItem("io_port");

    private static DeferredItem<Item> registerSimpleItem(String name) {
        return ITEM.register(name, () -> new Item(new Item.Properties()));
    }

    public static void init(IEventBus bus) {
        ITEM.register(bus);
    }
}
