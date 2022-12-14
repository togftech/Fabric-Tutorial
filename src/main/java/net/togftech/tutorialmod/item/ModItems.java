package net.togftech.tutorialmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.togftech.tutorialmod.TutorialMod;

public class ModItems {
    public static final Item RAW_LITHIUM = registerItem("raw_lithium",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item LITHIUM = registerItem("lithium",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        TutorialMod.LOGGER.debug("Registering Mod Items for " + TutorialMod.MOD_ID);
    }
}
