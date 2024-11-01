package io.github.cpearl0.worldccore.mixin;

import io.github.cpearl0.worldccore.world.WorldCSavedData;
import io.github.cpearl0.worldccore.network.TimeStateMessage;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.players.PlayerList;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.saveddata.SavedData;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftServer.class)
public abstract class MinecraftServerMixin {
    @Shadow
    private PlayerList playerList;

    @Inject(method = "synchronizeTime(Lnet/minecraft/server/level/ServerLevel;)V", at = @At(value = "TAIL"))
    private void synchronizeTime(ServerLevel pLevel, CallbackInfo ci) {
        if (pLevel.dimension() != Level.OVERWORLD)
            return;

        var data = pLevel.getDataStorage().computeIfAbsent(new SavedData.Factory<>(WorldCSavedData::new, WorldCSavedData::load), "time_state");
        for (ServerPlayer serverplayer : playerList.getPlayers()) {
            if (serverplayer.level().dimension() == Level.OVERWORLD) {
                serverplayer.connection.send(new TimeStateMessage(data.timeState));
            }
        }
    }
}
