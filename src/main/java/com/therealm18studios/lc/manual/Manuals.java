package com.therealm18studios.lc.manual;

import com.therealm18studios.lc.LibreComponents;
import com.therealm18studios.lc.common.item.Items;
import li.cil.manual.api.ManualModel;
import li.cil.manual.api.Tab;
import li.cil.manual.api.prefab.tab.ItemStackTab;
import li.cil.manual.api.util.Constants;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;

@OnlyIn(Dist.CLIENT)
public final class Manuals {

    private static final DeferredRegister<Tab> TABS = DeferredRegister.create(Constants.TAB_REGISTRY, Constants.MOD_ID);

    ///////////////////////////////////////////////////////////////////

    public static void initialize() {
        TABS.register(FMLJavaModLoadingContext.get().getModEventBus());

        TABS.register("librecomponents", () -> new ItemStackTab(
            ManualModel.LANGUAGE_KEY + "/librecomponents/index.md",
            Component.translatable("manual." + LibreComponents.MOD_ID + ".items"),
            new ItemStack(Items.HARD_DRIVE_EXTRA_LARGE.get())));
    }
}
