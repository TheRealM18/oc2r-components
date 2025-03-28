package com.therealm18studios.oc2rc.common.item;

import com.therealm18studios.oc2rc.OC2RC;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public final class ItemGroup {
    public static final DeferredRegister<CreativeModeTab> TAB_REGISTER = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, OC2RC.MOD_ID);

    @SuppressWarnings("unused")
    public static final RegistryObject<CreativeModeTab> COMMON_TAB = TAB_REGISTER.register("common", () -> CreativeModeTab.builder()
        // Set name of tab to display
        .title(Component.translatable("item_group." + OC2RC.MOD_ID + ".common"))
        // Set icon of creative tab
        .icon(() -> new ItemStack(Items.HARD_DRIVE_EXTRA_LARGE.get()))
        // Add default items to tab
        .displayItems((params, output) -> {
            // Items
            output.accept(Items.MEMORY_SMALL.get());
            output.accept(Items.MEMORY_MEDIUM.get());
            output.accept(Items.MEMORY_LARGE.get());
            output.accept(Items.MEMORY_EXTRA_LARGE.get());
            output.accept(Items.HARD_DRIVE_SMALL.get());
            output.accept(Items.HARD_DRIVE_MEDIUM.get());
            output.accept(Items.HARD_DRIVE_LARGE.get());
            output.accept(Items.HARD_DRIVE_EXTRA_LARGE.get());
            output.accept(Items.CPU_TIER_1.get());
            output.accept(Items.CPU_TIER_2.get());
            output.accept(Items.CPU_TIER_3.get());
            output.accept(Items.CPU_TIER_4.get());
            output.accept(Items.FLOPPY.get());
            output.accept(Items.FLOPPY_MODERN.get());
        })
        .build()
    );
}
