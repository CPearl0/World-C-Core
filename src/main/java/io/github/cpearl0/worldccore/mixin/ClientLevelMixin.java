package io.github.cpearl0.worldccore.mixin;

import io.github.cpearl0.worldccore.network.ClientPayloadHandler;
import io.github.cpearl0.worldccore.world.WorldCSavedData;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ClientLevel.class)
public abstract class ClientLevelMixin {
    @Shadow
    public abstract void setDayTime(long pTime);

    @Inject(method = "tickTime()V", at = @At(value = "HEAD"), cancellable = true)
    public void tickTime(CallbackInfo ci) {
        var self = (ClientLevel) (Object) this;
        if (!self.dimension().equals(Level.OVERWORLD))
            return;

        var timeState = ClientPayloadHandler.timeState;
        if (timeState == WorldCSavedData.NORMAL)
            return;

        setDayTime(6000);
        ci.cancel();
    }
}
