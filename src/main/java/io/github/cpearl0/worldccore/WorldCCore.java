package io.github.cpearl0.worldccore;

import io.github.cpearl0.worldccore.registry.WorldCItems;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;

@Mod(WorldCCore.MODID)
public class WorldCCore {
    public static final String MODID = "worldccore";
    public static final Logger LOGGER = LogUtils.getLogger();

    public WorldCCore(IEventBus modEventBus, ModContainer modContainer) {
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);

        WorldCItems.init(modEventBus);
    }
}
