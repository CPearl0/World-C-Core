package io.github.cpearl0.worldccore.mixin.pneumaticcraft;

import io.github.cpearl0.worldccore.registry.WCItems;
import me.desht.pneumaticcraft.common.fluid.FluidPlastic;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(value = FluidPlastic.Source.class, remap = false)
public abstract class FluidPlasticMixin {
    @ModifyVariable(method = "tick", at = @At("STORE"), name = "item")
    public ItemEntity worldc$modifyPlasticPlate(ItemEntity value) {
        value.setItem(new ItemStack(WCItems.PLASTIC_PLATE.get()));
        return value;
    }
}
