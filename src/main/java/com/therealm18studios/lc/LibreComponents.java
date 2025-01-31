package com.therealm18studios.lc;

import com.therealm18studios.lc.common.item.Items;
import com.therealm18studios.lc.manual.Manuals;
import li.cil.oc2.common.ConfigManager;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("librecomponents")
public final class LibreComponents {

    public static String MOD_ID = "librecomponents";

    public LibreComponents() {

        ConfigManager.initialize();

        Items.initialize();
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> Manuals::initialize);
    }
}
