package com.therealm18studios.lc.data;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public final class DataGenerators {
    @SubscribeEvent
    public static void gatherData(final GatherDataEvent event) {
        final DataGenerator generator = event.getGenerator();
        final ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

//        generator.addProvider(
//            event.includeServer(),
//            (DataProvider.Factory<LootTableProvider>) output -> new LootTableProvider(
//                output,
//                Set.of(),
//                Collections.singletonList(
//                    new LootTableProvider.SubProviderEntry(
//                        ModLootTableProvider.ModBlockLootTables::new,
//                        LootContextParamSets.BLOCK
//                    )
//                )
//            )
//        );
        generator.addProvider(event.includeServer(), (DataProvider.Factory<ModRecipesProvider>) ModRecipesProvider::new);
        generator.addProvider(event.includeClient(), new ModItemModelProvider(generator.getPackOutput(), existingFileHelper));
    }
}
