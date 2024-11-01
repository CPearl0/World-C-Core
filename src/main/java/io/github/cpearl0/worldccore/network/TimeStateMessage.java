package io.github.cpearl0.worldccore.network;

import io.github.cpearl0.worldccore.WorldCCore;
import io.netty.buffer.ByteBuf;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;

@MethodsReturnNonnullByDefault
public record TimeStateMessage(int timeState) implements CustomPacketPayload {
    public static final Type<TimeStateMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(WorldCCore.MODID, "time_state_msg"));

    public static final StreamCodec<ByteBuf, TimeStateMessage> STREAM_CODEC = StreamCodec.composite(
            ByteBufCodecs.VAR_INT,
            TimeStateMessage::timeState,
            TimeStateMessage::new
    );

    @Override
    public Type<? extends CustomPacketPayload> type() {
        return TYPE;
    }
}
