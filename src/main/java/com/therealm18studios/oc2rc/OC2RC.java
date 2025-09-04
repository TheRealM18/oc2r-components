package com.therealm18studios.oc2rc;

import com.therealm18studios.oc2rc.common.item.Items;
import net.minecraftforge.fml.common.Mod;

@Mod("oc2rc")
public final class OC2RC {

    public static String MOD_ID = "oc2rc";

    public OC2RC() {
        Items.initialize();
    }
}
