package com.nesterofffl.dnb.util;

import com.nesterofffl.dnb.DunesAndBeaches;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags
{

    public static class Blocks
    {

        private  static TagKey<Block> createTag(String name)
        {
            return  TagKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches.MOD_ID, name));
        }
    }

    public static class Items
    {
        public static final TagKey<Item> TEST_TAG = createTag("test_tag");

        private  static TagKey<Item> createTag(String name)
        {
            return  TagKey.of(RegistryKeys.ITEM, Identifier.of(DunesAndBeaches.MOD_ID, name));
        }
    }

}
