package net.vsenna.wascomod.item;
import com.github.crimsondawn45.fabricshieldlib.lib.object.FabricShieldItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.item.Item;
import net.vsenna.wascomod.WascoMod;

public class ModItems {
    public static void ItemGroupAdd(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(WASCO_SHIELD);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(MALTA_CROSS);
        });
    }
    public static final Item MALTA_CROSS = new Item(new FabricItemSettings());
    public static final Item WASCO_SHIELD = new FabricShieldItem(new FabricItemSettings().maxDamage(2500), 5, 13, MALTA_CROSS); // FabricShieldItem(settings.maxDamage(durability), cooldownTicks, enchantability, repairItems)

    public static void registerModItems(){
        WascoMod.LOGGER.debug("Registering mod Items for " + WascoMod.MOD_ID);
        Registry.register(Registries.ITEM, new Identifier(WascoMod.MOD_ID, "malta_cross"), MALTA_CROSS);
        Registry.register(Registries.ITEM, new Identifier(WascoMod.MOD_ID, "wasco_shield"), WASCO_SHIELD);
        ItemGroupAdd();

    }
}
