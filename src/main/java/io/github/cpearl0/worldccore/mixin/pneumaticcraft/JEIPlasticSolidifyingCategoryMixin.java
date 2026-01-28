package io.github.cpearl0.worldccore.mixin.pneumaticcraft;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Either;
import io.github.cpearl0.worldccore.registry.WCItems;
import me.desht.pneumaticcraft.common.registry.ModFluids;
import me.desht.pneumaticcraft.common.registry.ModItems;
import me.desht.pneumaticcraft.common.thirdparty.jei.JEIPlasticSolidifyingCategory;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.fluids.crafting.FluidIngredient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;

@Mixin(value = JEIPlasticSolidifyingCategory.class, remap = false)
public abstract class JEIPlasticSolidifyingCategoryMixin {
    @Inject(method = "getAllRecipes", at = @At("RETURN"), cancellable = true)
    private static void worldc$modifyPlasticSolidifyingCategory(CallbackInfoReturnable<List<JEIPlasticSolidifyingCategory.PlasticSolidifyingRecipe>> cir) {
        cir.setReturnValue(ImmutableList.of(
                new JEIPlasticSolidifyingCategory.PlasticSolidifyingRecipe(
                        Either.right(FluidIngredient.of(ModFluids.PLASTIC.get())),
                        new ItemStack(WCItems.PLASTIC_PLATE.get())
                ),
                new JEIPlasticSolidifyingCategory.PlasticSolidifyingRecipe(
                        Either.left(Ingredient.of(new ItemStack(ModItems.PLASTIC_BUCKET.get()))),
                        new ItemStack(WCItems.PLASTIC_PLATE.get())
                )
        ));
    }
}
