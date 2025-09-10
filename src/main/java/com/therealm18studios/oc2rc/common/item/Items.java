package com.therealm18studios.oc2rc.common.item;

import com.therealm18studios.oc2rc.OC2RC;
import li.cil.oc2.common.Constants;
import li.cil.oc2.common.item.*;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;
import java.util.function.Supplier;

public final class Items {
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, OC2RC.MOD_ID);

    ///////////////////////////////////////////////////////////////////

    public static final RegistryObject<MemoryItem> MEMORY_SMALL = register("memory_small", () ->
        new MemoryItem(33554432));
    public static final RegistryObject<MemoryItem> MEMORY_MEDIUM = register("memory_medium", () ->
        new MemoryItem(67108864));
    public static final RegistryObject<MemoryItem> MEMORY_LARGE = register("memory_large", () ->
        new MemoryItem(134217728));
    public static final RegistryObject<MemoryItem> MEMORY_EXTRA_LARGE = register("memory_extra_large", () ->
        new MemoryItem(268435456));

    public static final RegistryObject<HardDriveItem> HARD_DRIVE_SMALL = register("hard_drive_small", () ->
        new HardDriveItem(33554432, DyeColor.LIGHT_GRAY));
    public static final RegistryObject<HardDriveItem> HARD_DRIVE_MEDIUM = register("hard_drive_medium", () ->
        new HardDriveItem(67108864, DyeColor.GREEN));
    public static final RegistryObject<HardDriveItem> HARD_DRIVE_LARGE = register("hard_drive_large", () ->
        new HardDriveItem(134217728, DyeColor.CYAN));
    public static final RegistryObject<HardDriveItem> HARD_DRIVE_EXTRA_LARGE = register("hard_drive_extra_large", () ->
        new HardDriveItem(268435456, DyeColor.YELLOW));

    public static final RegistryObject<CPUItem> CPU_TIER_1 = register("cpu_tier_1", () ->
        new CPUItem(300000000));
    public static final RegistryObject<CPUItem> CPU_TIER_2 = register("cpu_tier_2", () ->
        new CPUItem(400000000));
    public static final RegistryObject<CPUItem> CPU_TIER_3 = register("cpu_tier_3", () ->
        new CPUItem(500000000));
    public static final RegistryObject<CPUItem> CPU_TIER_4 = register("cpu_tier_4", () ->
        new CPUItem(600000000));

    public static final RegistryObject<FloppyItem> FLOPPY = register("floppy", () ->
        new FloppyItem(2949120));
    public static final RegistryObject<FloppyItem> FLOPPY_MODERN = register("floppy_modern", () ->
        new FloppyItem(5898240));

    public static final RegistryObject<FlashMemoryItem> FLASH_MEMORY_SMALL = register("flash_memory_small", () ->
        new FlashMemoryItem(16 * Constants.MEGABYTE));
    public static final RegistryObject<FlashMemoryItem> FLASH_MEMORY_MEDIUM = register("flash_memory_medium", () ->
        new FlashMemoryItem(20 * Constants.MEGABYTE));
    public static final RegistryObject<FlashMemoryItem> FLASH_MEMORY_LARGE = register("flash_memory_large", () ->
        new FlashMemoryItem(24 * Constants.MEGABYTE));
    public static final RegistryObject<FlashMemoryItem> FLASH_MEMORY_EXTRA_LARGE = register("flash_memory_extra_large", () ->
        new FlashMemoryItem(28 * Constants.MEGABYTE));

    ///////////////////////////////////////////////////////////////////

    public static void initialize() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    ///////////////////////////////////////////////////////////////////

    private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> factory) {
        return ITEMS.register(name, factory);
    }

    private static <TBlock extends Block, TItem extends Item> RegistryObject<TItem> register(final RegistryObject<TBlock> block, final Function<TBlock, TItem> factory) {
        return register(block.getId().getPath(), () -> factory.apply(block.get()));
    }
}
