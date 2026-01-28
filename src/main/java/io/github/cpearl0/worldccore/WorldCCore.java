package io.github.cpearl0.worldccore;

import io.github.cpearl0.worldccore.registry.WCCreativeTabs;
import io.github.cpearl0.worldccore.registry.WCItems;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;

@Mod(WorldCCore.MODID)
public class WorldCCore {
    public static final String MODID = "worldccore";

    public static final Logger LOGGER = LogUtils.getLogger();

    public WorldCCore(IEventBus modEventBus, ModContainer modContainer) {
        WCItems.register(modEventBus);
        WCCreativeTabs.register(modEventBus);
    }
}
