package io.github.tt432.unlockrs.mixin;

import net.minecraft.resources.ResourceLocation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/**
 * @author TT432
 */
@Mixin(ResourceLocation.class)
public class MixinResourceLocation {
    @Inject(method = "assertValidNamespace", at = @At("HEAD"), cancellable = true)
    private static void unlockrs$assertValidNamespace(String pNamespace, String pPath, CallbackInfoReturnable<String> cir) {
        cir.setReturnValue(pNamespace);
    }

    @Inject(method = "assertValidPath", at = @At("HEAD"), cancellable = true)
    private static void unlockrs$assertValidPath(String pNamespace, String pPath, CallbackInfoReturnable<String> cir) {
        cir.setReturnValue(pNamespace);
    }
}
