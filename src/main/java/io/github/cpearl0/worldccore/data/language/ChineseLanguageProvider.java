package io.github.cpearl0.worldccore.data.language;

import io.github.cpearl0.worldccore.WorldCCore;
import io.github.cpearl0.worldccore.registry.WorldCItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ChineseLanguageProvider extends LanguageProvider {
    public ChineseLanguageProvider(PackOutput output) {
        super(output, WorldCCore.MODID, "zh_cn");
    }

    @Override
    protected void addTranslations() {
        addItem(WorldCItems.IO_PORT, "输入输出端口");
    }
}
