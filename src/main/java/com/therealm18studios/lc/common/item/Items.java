package com.therealm18studios.lc.common.item;

import com.therealm18studios.lc.LibreComponents;
import li.cil.oc2r.common.item.*;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public final class Items {
    private static final DeferredRegister<Item> ITEMS;
    public static final RegistryObject<MemoryItem> MEMORY_SMALL;
    public static final RegistryObject<MemoryItem> MEMORY_MEDIUM;
    public static final RegistryObject<MemoryItem> MEMORY_LARGE;
    public static final RegistryObject<MemoryItem> MEMORY_EXTRA_LARGE;
    public static final RegistryObject<HardDriveItem> HARD_DRIVE_SMALL;
    public static final RegistryObject<HardDriveItem> HARD_DRIVE_MEDIUM;
    public static final RegistryObject<HardDriveItem> HARD_DRIVE_LARGE;
    public static final RegistryObject<HardDriveItem> HARD_DRIVE_EXTRA_LARGE;
    public static final RegistryObject<CPUItem> CPU_TIER_1;
    public static final RegistryObject<CPUItem> CPU_TIER_2;
    public static final RegistryObject<CPUItem> CPU_TIER_3;
    public static final RegistryObject<CPUItem> CPU_TIER_4;
    public static final RegistryObject<FloppyItem> FLOPPY;
    public static final RegistryObject<FloppyItem> FLOPPY_MODERN;

    public Items() {
    }

    public static void initialize() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    private static RegistryObject<Item> register(String name) {
        return register(name, ModItem::new);
    }

    private static <T extends Item> RegistryObject<T> register(String name, Supplier<T> factory) {
        return ITEMS.register(name, factory);
    }

    static {
        ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, LibreComponents.MOD_ID);
        MEMORY_SMALL = register("memory_small", () -> {
            return new MemoryItem(33554432);
        });
        MEMORY_MEDIUM = register("memory_medium", () -> {
            return new MemoryItem(67108864);
        });
        MEMORY_LARGE = register("memory_large", () -> {
            return new MemoryItem(134217728);
        });
        MEMORY_EXTRA_LARGE = register("memory_extra_large", () -> {
            return new MemoryItem(268435456);
        });
        HARD_DRIVE_SMALL = register("hard_drive_small", () -> {
            return new HardDriveItem(33554432, DyeColor.PINK);
        });
        HARD_DRIVE_MEDIUM = register("hard_drive_medium", () -> {
            return new HardDriveItem(67108864, DyeColor.RED);
        });
        HARD_DRIVE_LARGE = register("hard_drive_large", () -> {
            return new HardDriveItem(134217728, DyeColor.BLUE);
        });
        HARD_DRIVE_EXTRA_LARGE = register("hard_drive_extra_large", () -> {
            return new HardDriveItem(268435456, DyeColor.BLACK);
        });
        CPU_TIER_1 = register("cpu_tier_1", () -> {
            return new CPUItem(250000000);
        });
        CPU_TIER_2 = register("cpu_tier_2", () -> {
            return new CPUItem(300000000);
        });
        CPU_TIER_3 = register("cpu_tier_3", () -> {
            return new CPUItem(350000000);
        });
        CPU_TIER_4 = register("cpu_tier_4", () -> {
            return new CPUItem(400000000);
        });
        FLOPPY = register("floppy", () -> {
            return new FloppyItem(2949120);
        });
        FLOPPY_MODERN = register("floppy_modern", () -> {
            return new FloppyItem(5898240);
        });
    }
}
