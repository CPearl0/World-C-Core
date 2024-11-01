package io.github.cpearl0.worldccore;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.config.ModConfigEvent;
import net.neoforged.neoforge.common.ModConfigSpec;

@EventBusSubscriber(modid = WorldCCore.MODID, bus = EventBusSubscriber.Bus.MOD)
public class Config {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    //private static final ModConfigSpec.BooleanValue LOG_DIRT_BLOCK = BUILDER
    //        .comment("Whether to log the dirt block on common setup")
    //        .define("logDirtBlock", true);

    static final ModConfigSpec SPEC = BUILDER.build();

    @SubscribeEvent
    static void onLoad(final ModConfigEvent event) {

    }
}
