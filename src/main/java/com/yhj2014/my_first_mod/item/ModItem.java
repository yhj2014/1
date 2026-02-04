package com.yhj2014.my_first_mod.item;

import com.yhj2014.my_first_mod.MyFirstMod;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItem {
    public static final DeferredRegister.Items ITEMS =
        DeferredRegister.createItems(MyFirstMod.MODID);

    public static final DeferredItem<Item> ICE_ETHER =
            ITEMS.register("ice_ether", () -> new Item(new Item.Properties()));
}
