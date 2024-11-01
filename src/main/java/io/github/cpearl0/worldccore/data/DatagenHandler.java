package io.github.cpearl0.worldccore.data;

import io.github.cpearl0.worldccore.WorldCCore;
import io.github.cpearl0.worldccore.data.language.ChineseLanguageProvider;
import io.github.cpearl0.worldccore.data.language.EnglishLanguageProvider;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(modid = WorldCCore.MODID, bus = EventBusSubscriber.Bus.MOD)
public class DatagenHandler {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        var generator = event.getGenerator();
        var output = generator.getPackOutput();

        generator.addProvider(event.includeClient(), new EnglishLanguageProvider(output));
        generator.addProvider(event.includeClient(), new ChineseLanguageProvider(output));
    }
}
