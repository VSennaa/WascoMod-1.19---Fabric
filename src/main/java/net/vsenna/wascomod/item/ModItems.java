package net.vsenna.wascomod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.vsenna.wascomod.WascoMod;

public class ModItems {
    public static final Item MALTA_CROSS = registerItem("cross_malta", new Item(new FabricItemSettings().maxCount(1)));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(WascoMod.MOD_ID, name),item);
    }

    public static void registerModItems(){
        WascoMod.LOGGER.debug("Registering mod Items for " + WascoMod.MOD_ID);
    }
}
