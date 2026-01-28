package io.github.cpearl0.worldccore.registry;

import io.github.cpearl0.worldccore.WorldCCore;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class WCItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(WorldCCore.MODID);

    public static final DeferredItem<Item> SILICON_PLATE = ITEMS.registerSimpleItem("silicon_plate");
    public static final DeferredItem<Item> COMPRESSED_IRON_PLATE = ITEMS.registerSimpleItem("compressed_iron_plate");
    public static final DeferredItem<Item> STEEL_PLATE = ITEMS.registerSimpleItem("steel_plate");
    public static final DeferredItem<Item> BRONZE_PLATE = ITEMS.registerSimpleItem("bronze_plate");
    public static final DeferredItem<Item> OSMIUM_PLATE = ITEMS.registerSimpleItem("osmium_plate");

    public static final DeferredItem<Item> PROCESSING_UNIT_GEN_1_PRESS = ITEMS.registerSimpleItem("processing_unit_gen_1_press");
    public static final DeferredItem<Item> PROCESSING_UNIT_GEN_2_PRESS = ITEMS.registerSimpleItem("processing_unit_gen_2_press");
    public static final DeferredItem<Item> PROCESSING_UNIT_GEN_3_PRESS = ITEMS.registerSimpleItem("processing_unit_gen_3_press");
    public static final DeferredItem<Item> PROCESSING_UNIT_GEN_4_PRESS = ITEMS.registerSimpleItem("processing_unit_gen_4_press");

    public static final DeferredItem<Item> PROCESSING_UNIT_GEN_1 = ITEMS.registerSimpleItem("processing_unit_gen_1");
    public static final DeferredItem<Item> PROCESSING_UNIT_GEN_2 = ITEMS.registerSimpleItem("processing_unit_gen_2");
    public static final DeferredItem<Item> PROCESSING_UNIT_GEN_3 = ITEMS.registerSimpleItem("processing_unit_gen_3");
    public static final DeferredItem<Item> PROCESSING_UNIT_GEN_4 = ITEMS.registerSimpleItem("processing_unit_gen_4");

    public static final DeferredItem<Item> CIRCUIT_BOARD_GEN_1 = ITEMS.registerSimpleItem("circuit_board_gen_1");
    public static final DeferredItem<Item> CIRCUIT_BOARD_GEN_2 = ITEMS.registerSimpleItem("circuit_board_gen_2");
    public static final DeferredItem<Item> CIRCUIT_BOARD_GEN_3 = ITEMS.registerSimpleItem("circuit_board_gen_3");
    public static final DeferredItem<Item> CIRCUIT_BOARD_GEN_4 = ITEMS.registerSimpleItem("circuit_board_gen_4");

    public static final DeferredItem<Item> PROCESSOR_GEN_1 = ITEMS.registerSimpleItem("processor_gen_1");
    public static final DeferredItem<Item> PROCESSOR_GEN_2 = ITEMS.registerSimpleItem("processor_gen_2");
    public static final DeferredItem<Item> PROCESSOR_GEN_3 = ITEMS.registerSimpleItem("processor_gen_3");
    public static final DeferredItem<Item> PROCESSOR_GEN_4 = ITEMS.registerSimpleItem("processor_gen_4");

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
