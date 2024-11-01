package io.github.cpearl0.worldccore.mixin;

import io.github.cpearl0.worldccore.WorldCCore;
import io.github.cpearl0.worldccore.world.WorldCSavedData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.saveddata.SavedData;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ServerLevel.class)
public abstract class ServerLevelMixin {
    @Shadow
    public abstract void setDayTime(long pTime);

    @Inject(method = "tickTime()V", at = @At(value = "HEAD"), cancellable = true)
    public void tickTime(CallbackInfo ci) {
        WorldCCore.LOGGER.info("Mixin");
        var self = (ServerLevel) (Object) this;
        if (self.dimension() != Level.OVERWORLD)
            return;

        var data = self.getDataStorage().computeIfAbsent(new SavedData.Factory<>(WorldCSavedData::new, WorldCSavedData::load), "time_state");
        if (data.timeState == WorldCSavedData.NORMAL)
            return;

        setDayTime(6000);
        ci.cancel();
    }
}
