package io.github.cpearl0.worldccore.data.language;

import io.github.cpearl0.worldccore.WorldCCore;
import io.github.cpearl0.worldccore.registry.WorldCItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class EnglishLanguageProvider extends LanguageProvider {
    public EnglishLanguageProvider(PackOutput output) {
        super(output, WorldCCore.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        addItem(WorldCItems.IO_PORT, "I/O Port");
    }
}
