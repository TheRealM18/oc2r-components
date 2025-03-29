package com.therealm18studios.oc2rc;

import com.therealm18studios.oc2rc.common.item.ItemGroup;
import com.therealm18studios.oc2rc.common.item.Items;
import com.therealm18studios.oc2rc.manual.Manuals;
import li.cil.oc2.common.ConfigManager;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("oc2rc")
public final class OC2RC {

    public static String MOD_ID = "oc2rc";

    public OC2RC() {

        ConfigManager.initialize();

        Items.initialize();
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> Manuals::initialize);
        ItemGroup.TAB_REGISTER.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
