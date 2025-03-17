package net.lordduckett.weaponarmormod.item;

import net.lordduckett.weaponarmormod.WeaponArmorMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(WeaponArmorMod.MOD_ID);

    public static final DeferredItem<Item> AQUARIUM = ITEMS.register("aquarium",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_AQUARIUM = ITEMS.register("raw_aquarium",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MOD_WORKBENCH_TOOL = ITEMS.register("mod_workbench_tool",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
