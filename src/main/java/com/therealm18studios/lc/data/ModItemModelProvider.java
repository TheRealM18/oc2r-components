package com.therealm18studios.lc.data;

import com.therealm18studios.lc.LibreComponents;
import li.cil.oc2.common.entity.Entities;
import com.therealm18studios.lc.common.item.Items;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public final class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(final DataGenerator generator, final ExistingFileHelper existingFileHelper) {
        super(generator, LibreComponents.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simple(Items.MEMORY_SMALL);
        simple(Items.MEMORY_MEDIUM);
        simple(Items.MEMORY_LARGE);
        simple(Items.MEMORY_EXTRA_LARGE);
//        simple(Items.CPU_TIER_1);
//        simple(Items.CPU_TIER_2);
//        simple(Items.CPU_TIER_3);
//        simple(Items.CPU_TIER_4);
        simple(Items.HARD_DRIVE_SMALL, "item/hard_drive_base")
            .texture("layer1", "item/hard_drive_tint");
        simple(Items.HARD_DRIVE_MEDIUM, "item/hard_drive_base")
            .texture("layer1", "item/hard_drive_tint");
        simple(Items.HARD_DRIVE_LARGE, "item/hard_drive_base")
            .texture("layer1", "item/hard_drive_tint");
        simple(Items.HARD_DRIVE_EXTRA_LARGE, "item/hard_drive_base")
            .texture("layer1", "item/hard_drive_tint");
        simple(Items.FLOPPY, "item/floppy_base")
            .texture("layer1", "item/floppy_tint");
        simple(Items.FLOPPY_MODERN, "item/floppy_base")
            .texture("layer1", "item/floppy_tint");

        withExistingParent(Entities.ROBOT.getId().getPath(), "template_shulker_box");
    }

    private <T extends Item> void simple(final RegistryObject<T> item) {
        simple(item, "item/" + item.getId().getPath());
    }

    private <T extends Item> ItemModelBuilder simple(final RegistryObject<T> item, final String texturePath) {
        return singleTexture(item.getId().getPath(),
            new ResourceLocation("item/generated"),
            "layer0",
            new ResourceLocation(LibreComponents.MOD_ID, texturePath));
    }
}
