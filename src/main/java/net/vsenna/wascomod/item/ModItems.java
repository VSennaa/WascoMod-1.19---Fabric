package net.vsenna.wascomod.item;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.item.Item;
import net.vsenna.wascomod.WascoMod;

public class ModItems {

    public static final Item MALTA_CROSS = new Item(new FabricItemSettings());
    public static final Item WASCO_SHIELD = new Item(new FabricItemSettings());
    public static void registerModItems(){
        WascoMod.LOGGER.debug("Registering mod Items for " + WascoMod.MOD_ID);
        Registry.register(Registries.ITEM, new Identifier(WascoMod.MOD_ID, "malta_cross"), MALTA_CROSS);
        Registry.register(Registries.ITEM, new Identifier(WascoMod.MOD_ID, "wasco_shield"), WASCO_SHIELD);
    }
}
