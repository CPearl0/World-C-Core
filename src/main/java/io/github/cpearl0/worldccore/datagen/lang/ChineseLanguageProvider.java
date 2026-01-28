package io.github.cpearl0.worldccore.datagen.lang;

import io.github.cpearl0.worldccore.WorldCCore;
import io.github.cpearl0.worldccore.registry.WCItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ChineseLanguageProvider extends LanguageProvider {
    public ChineseLanguageProvider(PackOutput output) {
        super(output, WorldCCore.MODID, "zh_cn");
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + WorldCCore.MODID + ".main", "C世界");

        addItem(WCItems.COMPRESSED_IRON_PLATE, "压缩铁板");
        addItem(WCItems.STEEL_PLATE, "钢板");

        addItem(WCItems.PROCESSING_UNIT_GEN_1_PRESS, "第一代处理单元压印模板");
        addItem(WCItems.PROCESSING_UNIT_GEN_2_PRESS, "第二代处理单元压印模板");
        addItem(WCItems.PROCESSING_UNIT_GEN_3_PRESS, "第三代处理单元压印模板");
        addItem(WCItems.PROCESSING_UNIT_GEN_4_PRESS, "第四代处理单元压印模板");

        addItem(WCItems.PROCESSING_UNIT_GEN_1, "第一代处理单元");
        addItem(WCItems.PROCESSING_UNIT_GEN_2, "第二代处理单元");
        addItem(WCItems.PROCESSING_UNIT_GEN_3, "第三代处理单元");
        addItem(WCItems.PROCESSING_UNIT_GEN_4, "第四代处理单元");

        addItem(WCItems.CIRCUIT_BOARD_GEN_1, "第一代电路板");
        addItem(WCItems.CIRCUIT_BOARD_GEN_2, "第二代电路板");
        addItem(WCItems.CIRCUIT_BOARD_GEN_3, "第三代电路板");
        addItem(WCItems.CIRCUIT_BOARD_GEN_4, "第四代电路板");

        addItem(WCItems.PROCESSOR_GEN_1, "第一代 RISC 处理器");
        addItem(WCItems.PROCESSOR_GEN_2, "第二代 RISC 处理器");
        addItem(WCItems.PROCESSOR_GEN_3, "第三代 RISC 处理器");
        addItem(WCItems.PROCESSOR_GEN_4, "第四代 RISC 处理器");
    }
}
