package com.nesterofffl.dnb.item;

import com.nesterofffl.dnb.DunesAndBeaches;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup Utilities_Group = Registry.register(Registries.ITEM_GROUP, Identifier.of(DunesAndBeaches.MOD_ID, "utilities_items"), FabricItemGroup.builder().
            icon(() -> new ItemStack(ModItems.Art_Leather)).
            displayName(Text.translatable("itemgroup.utilities.utilities_items")).
            entries(((displayContext, entries) ->
            {
                entries.add(ModItems.Art_Leather);

            }))
            .build());

    public static void registerItemGroups()
    {

    }
}
