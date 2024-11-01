package io.github.cpearl0.worldccore.event;

import io.github.cpearl0.worldccore.WorldCCore;
import io.github.cpearl0.worldccore.network.ClientPayloadHandler;
import io.github.cpearl0.worldccore.network.TimeStateMessage;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;

@EventBusSubscriber(modid = WorldCCore.MODID, bus = EventBusSubscriber.Bus.MOD)
public class EventHandler {
    @SubscribeEvent
    public static void onRegisterPayloadHandlers(RegisterPayloadHandlersEvent event) {
        var registrar = event.registrar("1");
        registrar.playToClient(
                TimeStateMessage.TYPE,
                TimeStateMessage.STREAM_CODEC,
                ClientPayloadHandler::handleTimeStateMessage
        );
    }
}
