package com.therealm18studios.lc.common.item;

import com.therealm18studios.lc.LibreComponents;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public final class ItemGroup {
    public static final CreativeModeTab COMMON = new CreativeModeTab(LibreComponents.MOD_ID + ".common")
        {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.HARD_DRIVE_EXTRA_LARGE.get());
        }
    };

//    public ItemGroup getInstance(ItemGroup){
//        ItemGroup.TAB_REGISTER.getDisplayName().contains(
//        Items.MEMORY_SMALL.get(), Items.MEMORY_MEDIUM.get(), Items.MEMORY_LARGE.get(), Items.MEMORY_EXTRA_LARGE.get(),
//        Items.HARD_DRIVE_SMALL.get(), Items.HARD_DRIVE_MEDIUM.get(), Items.HARD_DRIVE_LARGE.get(), Items.HARD_DRIVE_EXTRA_LARGE.get(),
//        Items.FLOPPY.get(), Items.FLOPPY_MODERN.get())
//            output.accept(Items.CPU_TIER_1.get());
//            output.accept(Items.CPU_TIER_2.get());
//            output.accept(Items.CPU_TIER_3.get());
//            output.accept(Items.CPU_TIER_4.get()););
//    }
}
