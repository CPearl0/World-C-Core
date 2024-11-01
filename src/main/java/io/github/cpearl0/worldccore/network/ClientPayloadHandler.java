package io.github.cpearl0.worldccore.network;

import io.github.cpearl0.worldccore.world.WorldCSavedData;
import net.neoforged.neoforge.network.handling.IPayloadContext;

public class ClientPayloadHandler {
    public static int timeState = WorldCSavedData.DAY;
    public static void handleTimeStateMessage(final TimeStateMessage message, final IPayloadContext context) {
        context.enqueueWork(() -> {
            timeState = message.timeState();
        });
    }
}
