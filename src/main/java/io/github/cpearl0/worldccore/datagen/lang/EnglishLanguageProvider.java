package io.github.cpearl0.worldccore.datagen.lang;

import io.github.cpearl0.worldccore.WorldCCore;
import io.github.cpearl0.worldccore.registry.WCItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class EnglishLanguageProvider extends LanguageProvider {
    public EnglishLanguageProvider(PackOutput output) {
        super(output, WorldCCore.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + WorldCCore.MODID + ".main", "World C");

        addItem(WCItems.COMPRESSED_IRON_PLATE, "Compressed Iron Plate");
        addItem(WCItems.STEEL_PLATE, "Steel Plate");

        addItem(WCItems.PROCESSING_UNIT_GEN_1_PRESS, "Processing Unit Gen 1 Press");
        addItem(WCItems.PROCESSING_UNIT_GEN_2_PRESS, "Processing Unit Gen 2 Press");
        addItem(WCItems.PROCESSING_UNIT_GEN_3_PRESS, "Processing Unit Gen 3 Press");
        addItem(WCItems.PROCESSING_UNIT_GEN_4_PRESS, "Processing Unit Gen 4 Press");

        addItem(WCItems.PROCESSING_UNIT_GEN_1, "Processing Unit Gen 1");
        addItem(WCItems.PROCESSING_UNIT_GEN_2, "Processing Unit Gen 2");
        addItem(WCItems.PROCESSING_UNIT_GEN_3, "Processing Unit Gen 3");
        addItem(WCItems.PROCESSING_UNIT_GEN_4, "Processing Unit Gen 4");

        addItem(WCItems.CIRCUIT_BOARD_GEN_1, "Circuit Board Gen 1");
        addItem(WCItems.CIRCUIT_BOARD_GEN_2, "Circuit Board Gen 2");
        addItem(WCItems.CIRCUIT_BOARD_GEN_3, "Circuit Board Gen 3");
        addItem(WCItems.CIRCUIT_BOARD_GEN_4, "Circuit Board Gen 4");

        addItem(WCItems.PROCESSOR_GEN_1, "RISC Processor Gen 1");
        addItem(WCItems.PROCESSOR_GEN_2, "RISC Processor Gen 2");
        addItem(WCItems.PROCESSOR_GEN_3, "RISC Processor Gen 3");
        addItem(WCItems.PROCESSOR_GEN_4, "RISC Processor Gen 4");
    }
}
