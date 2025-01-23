package com.nesterofffl.dnb.block;

import com.nesterofffl.dnb.DunesAndBeaches;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    //Кокосовое Дерево и производные
    public static final Block Coconut_Log = registerBlock("coconut_log", new PillarBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.BAMBOO_WOOD)
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches.MOD_ID,"coconut_log")))));

    public static final Block Coconut_Planks = registerBlock("coconut_planks", new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches.MOD_ID,"coconut_planks")))));

    public static final Block Coconut_Stairs = registerBlock("coconut_stairs", new StairsBlock(ModBlocks.Coconut_Planks.getDefaultState(), AbstractBlock.Settings.copy(Blocks.OAK_STAIRS).
            registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches.MOD_ID, "coconut_stairs")))));

    public static final Block Coconut_Wood = registerBlock("coconut_wood", new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches.MOD_ID,"coconut_wood")))));

    public static final Block Stripped_Coconut_Log = registerBlock("stripped_coconut_log", new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches.MOD_ID,"stripped_coconut_log")))));

    public static final Block Stripped_Coconut_Wood = registerBlock("stripped_coconut_wood", new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches.MOD_ID,"stripped_coconut_wood")))));

    public static final Block Coconut_Leaves = registerBlock("coconut_leaves", new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches.MOD_ID,"coconut_leaves")))));


    //Пустынное Дерево и производные
    public static final Block Desert_Log = registerBlock("desert_log", new PillarBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.BAMBOO_WOOD)
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches.MOD_ID,"desert_log")))));

    public static final Block Desert_Planks = registerBlock("desert_planks", new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches.MOD_ID,"desert_planks")))));

    public static final Block Desert_Stairs = registerBlock("desert_stairs", new StairsBlock(ModBlocks.Desert_Planks.getDefaultState(), AbstractBlock.Settings.copy(Blocks.OAK_STAIRS).
            registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches.MOD_ID, "desert_stairs")))));

    public static final Block Desert_Wood = registerBlock("desert_wood", new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches.MOD_ID,"desert_wood")))));

    public static final Block Stripped_Desert_Log = registerBlock("stripped_desert_log", new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches.MOD_ID,"stripped_desert_log")))));

    public static final Block Stripped_Desert_Wood = registerBlock("stripped_desert_wood", new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches.MOD_ID,"stripped_desert_wood")))));

    public static final Block Desert_Leaves = registerBlock("desert_leaves", new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches.MOD_ID,"desert_leaves")))));

    //Земля оазис
    public static final Block Oasis_Grass = registerBlock("oasis_grass", new GrassBlock(AbstractBlock.Settings.copy(Blocks.GRASS_BLOCK)
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches.MOD_ID,"oasis_grass")))));


    //Песчанные Вариации Блоков

    public static final Block Sanded_Stone = registerBlock("sanded_stone", new Block(AbstractBlock.Settings.copy(Blocks.STONE).
            registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches.MOD_ID, "sanded_stone")))));

    public static final Block Sanded_Cobblestone = registerBlock("sanded_cobblestone", new Block(AbstractBlock.Settings.copy(Blocks.COBBLESTONE).
            registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches.MOD_ID,"sanded_cobblestone")))));

    //Песчанный Кирпич и производные

    public static final Block Sandstone_Bricks = registerBlock("sandstone_bricks", new Block(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS).
            registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches.MOD_ID, "sandstone_bricks")))));

    public static final Block Sandstone_Brick_Stairs = registerBlock("sandstone_brick_stairs",
            new StairsBlock(ModBlocks.Sandstone_Bricks.getDefaultState(), AbstractBlock.Settings.copy(Blocks.SANDSTONE_STAIRS).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches .MOD_ID,"sandstone_brick_stairs")))));

    public static final Block Sandstone_Brick_Slab = registerBlock("sandstone_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.SANDSTONE_SLAB).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches.MOD_ID,"sandstone_brick_slab")))));

    public static final Block Sandstone_Brick_Wall = registerBlock("sandstone_brick_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.SANDSTONE_WALL).
            registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches.MOD_ID, "sandstone_bricks")))));






    private static Block registerBlock(String name, Block block)
    {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(DunesAndBeaches.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block)
    {
        Registry.register(Registries.ITEM, Identifier.of(DunesAndBeaches.MOD_ID, name),
                new BlockItem(block, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(DunesAndBeaches.MOD_ID, name))).useBlockPrefixedTranslationKey()));
    }

    public static void registerModBlocks() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries ->
        {
            entries.add(ModBlocks.Coconut_Log);
            entries.add(ModBlocks.Coconut_Wood);
            entries.add(ModBlocks.Coconut_Planks);
            entries.add(ModBlocks.Coconut_Stairs);
            entries.add(ModBlocks.Stripped_Coconut_Log);
            entries.add(ModBlocks.Stripped_Coconut_Wood);
            entries.add(ModBlocks.Sandstone_Bricks);
            entries.add(ModBlocks.Sandstone_Brick_Stairs);
            entries.add(ModBlocks.Sandstone_Brick_Slab);
            entries.add(ModBlocks.Sandstone_Brick_Wall);
            entries.add(ModBlocks.Sanded_Stone);
            entries.add(ModBlocks.Sanded_Cobblestone);

        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries ->
        {
            entries.add(ModBlocks.Oasis_Grass);
            entries.add(ModBlocks.Coconut_Leaves);
        });
    }


}
