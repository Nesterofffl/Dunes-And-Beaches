package com.nesterofffl.dnb.block;

import com.nesterofffl.dnb.DunesAndBeaches;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
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

    public static final Block Sand_Carpet = registerBlock("sand_carpet", new SnowBlock(AbstractBlock.Settings.create().replaceable().ticksRandomly().strength(0.1F).requiresTool().sounds(BlockSoundGroup.SNOW).blockVision((state, world, pos) -> state.get(SnowBlock.LAYERS) >= 8).pistonBehavior(PistonBehavior.DESTROY)
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches.MOD_ID,"sand_carpet")))));

    //Пальмовое Дерево и производные
    public static final Block Palm_Log = registerBlock("palm_log", new PillarBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.BAMBOO_WOOD)
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches.MOD_ID,"palm_log")))));

    public static final Block Palm_Wood = registerBlock("palm_wood", new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches.MOD_ID,"palm_wood")))));

    public static final Block Stripped_Palm_Log = registerBlock("stripped_palm_log", new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches.MOD_ID,"stripped_palm_log")))));

    public static final Block Stripped_Palm_Wood = registerBlock("stripped_palm_wood", new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches.MOD_ID,"stripped_palm_wood")))));

    public static final Block Palm_Planks = registerBlock("palm_planks", new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches.MOD_ID,"palm_planks")))));

    public static final Block Palm_Stairs = registerBlock("palm_stairs", new StairsBlock(ModBlocks.Palm_Planks.getDefaultState(), AbstractBlock.Settings.copy(Blocks.OAK_STAIRS).
            registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches.MOD_ID, "palm_stairs")))));

    public static final Block Palm_Fence = registerBlock("palm_fence", new FenceBlock(AbstractBlock.Settings.copy(Blocks.OAK_FENCE)
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches.MOD_ID, "palm_fence")))));

    public static final Block Palm_Fence_Gate = registerBlock("palm_fence_gate", new FenceGateBlock(WoodType.JUNGLE, AbstractBlock.Settings.copy(Blocks.OAK_FENCE)
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches.MOD_ID, "palm_fence_gate")))));

    public static final Block Palm_Door = registerBlock("palm_door", new DoorBlock(BlockSetType.ACACIA, AbstractBlock.Settings.create().mapColor(Palm_Planks.getDefaultMapColor()).instrument(NoteBlockInstrument.BASS).strength(3.0F).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY)
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches.MOD_ID, "palm_door")))));

    public static final Block Palm_Trapdoor = registerBlock("palm_trapdoor", new TrapdoorBlock(BlockSetType.ACACIA, AbstractBlock.Settings.copy(Blocks.ACACIA_TRAPDOOR)
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches.MOD_ID, "palm_trapdoor")))));


    public static final Block Palm_Leaves = registerBlock("palm_leaves", new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches.MOD_ID,"palm_leaves")))));


    //Пустынное Дерево и производные
    public static final Block Willow_Log = registerBlock("willow_log", new PillarBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.BAMBOO_WOOD)
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches.MOD_ID,"willow_log")))));

    public static final Block Willow_Planks = registerBlock("willow_planks", new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches.MOD_ID,"willow_planks")))));

    public static final Block Willow_Stairs = registerBlock("willow_stairs", new StairsBlock(ModBlocks.Willow_Planks.getDefaultState(), AbstractBlock.Settings.copy(Blocks.OAK_STAIRS).
            registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches.MOD_ID, "willow_stairs")))));

    public static final Block Willow_Wood = registerBlock("willow_wood", new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches.MOD_ID,"willow_wood")))));

    public static final Block Stripped_Willow_Log = registerBlock("stripped_willow_log", new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches.MOD_ID,"stripped_willow_log")))));

    public static final Block Stripped_Willow_Wood = registerBlock("stripped_willow_wood", new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches.MOD_ID,"stripped_willow_wood")))));

    public static final Block Willow_Fence = registerBlock("willow_fence", new FenceBlock(AbstractBlock.Settings.copy(Blocks.OAK_FENCE)
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches.MOD_ID, "willow_fence")))));

    public static final Block Willow_Fence_Gate = registerBlock("willow_fence_gate", new FenceGateBlock(WoodType.JUNGLE, AbstractBlock.Settings.copy(Blocks.OAK_FENCE)
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches.MOD_ID, "willow_fence_gate")))));

    public static final Block Willow_Door = registerBlock("willow_door", new DoorBlock(BlockSetType.ACACIA, AbstractBlock.Settings.create().mapColor(Palm_Planks.getDefaultMapColor()).instrument(NoteBlockInstrument.BASS).strength(3.0F).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY)
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches.MOD_ID, "willow_door")))));

    public static final Block Willow_Trapdoor = registerBlock("willow_trapdoor", new TrapdoorBlock(BlockSetType.ACACIA, AbstractBlock.Settings.copy(Blocks.ACACIA_TRAPDOOR)
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches.MOD_ID, "willow_trapdoor")))));

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


    public static final Block Sanded_Stone_Stairs = registerBlock("sanded_stone_stairs",
            new StairsBlock(ModBlocks.Sanded_Stone.getDefaultState(), AbstractBlock.Settings.copy(Blocks.SANDSTONE_STAIRS).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches .MOD_ID,"sanded_stone_stairs")))));

    public static final Block Sanded_Stone_Slab = registerBlock("sanded_stone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.SANDSTONE_SLAB).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches.MOD_ID,"sanded_stone_slab")))));

    public static final Block Sanded_Stone_Wall = registerBlock("sanded_stone_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.SANDSTONE_WALL).
            registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches.MOD_ID, "sanded_stone_wall")))));

    public static final Block Sanded_Cobblestone_Stairs = registerBlock("sanded_cobblestone_stairs",
            new StairsBlock(ModBlocks.Sanded_Cobblestone.getDefaultState(), AbstractBlock.Settings.copy(Blocks.SANDSTONE_STAIRS).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches .MOD_ID,"sanded_cobblestone_stairs")))));

    public static final Block Sanded_Cobblestone_Slab = registerBlock("sanded_cobblestone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.SANDSTONE_SLAB).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches.MOD_ID,"sanded_cobblestone_slab")))));

    public static final Block Sanded_Cobblestone_Wall = registerBlock("sanded_cobblestone_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.SANDSTONE_WALL).
            registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches.MOD_ID, "sanded_cobblestone_wall")))));



    //Песчанный Кирпич и производные

    public static final Block Sandstone_Bricks = registerBlock("sandstone_bricks", new Block(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS).
            registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches.MOD_ID, "sandstone_bricks")))));

    public static final Block Sandstone_Brick_Stairs = registerBlock("sandstone_brick_stairs",
            new StairsBlock(ModBlocks.Sandstone_Bricks.getDefaultState(), AbstractBlock.Settings.copy(Blocks.SANDSTONE_STAIRS).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches .MOD_ID,"sandstone_brick_stairs")))));

    public static final Block Sandstone_Brick_Slab = registerBlock("sandstone_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.SANDSTONE_SLAB).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches.MOD_ID,"sandstone_brick_slab")))));

    public static final Block Sandstone_Brick_Wall = registerBlock("sandstone_brick_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.SANDSTONE_WALL).
            registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches.MOD_ID, "sandstone_brick_wall")))));

    //Гравиевый кирпич и производные

    public static final Block Reinforced_Gravel = registerBlock("reinforced_gravel", new Block(AbstractBlock.Settings.copy(Blocks.COBBLESTONE)
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches.MOD_ID, "reinforced_gravel")))));

    public static final Block Gravel_Bricks = registerBlock("gravel_bricks", new Block(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS).
            registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches.MOD_ID, "gravel_bricks")))));

    public static final Block Gravel_Brick_Stairs = registerBlock("gravel_brick_stairs",
            new StairsBlock(ModBlocks.Sandstone_Bricks.getDefaultState(), AbstractBlock.Settings.copy(Blocks.SANDSTONE_STAIRS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches .MOD_ID,"gravel_brick_stairs")))));

    public static final Block Gravel_Brick_Slab = registerBlock("gravel_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.SANDSTONE_SLAB).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches.MOD_ID,"gravel_brick_slab")))));

    public static final Block Gravel_Brick_Wall = registerBlock("gravel_brick_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.SANDSTONE_WALL).
            registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DunesAndBeaches.MOD_ID, "gravel_brick_wall")))));





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

            entries.add(ModBlocks.Palm_Log);
            entries.add(ModBlocks.Palm_Wood);
            entries.add(ModBlocks.Stripped_Palm_Log);
            entries.add(ModBlocks.Stripped_Palm_Wood);
            entries.add(ModBlocks.Palm_Planks);
            entries.add(ModBlocks.Palm_Stairs);
            entries.add(ModBlocks.Palm_Fence);
            entries.add(ModBlocks.Palm_Fence_Gate);
            entries.add(ModBlocks.Palm_Door);
            entries.add(ModBlocks.Palm_Trapdoor);

            entries.add(ModBlocks.Willow_Log);
            entries.add(ModBlocks.Willow_Wood);
            entries.add(ModBlocks.Stripped_Willow_Log);
            entries.add(ModBlocks.Stripped_Willow_Wood);
            entries.add(ModBlocks.Willow_Planks);
            entries.add(ModBlocks.Willow_Stairs);
            entries.add(ModBlocks.Willow_Fence);
            entries.add(ModBlocks.Willow_Fence_Gate);
            entries.add(ModBlocks.Willow_Door);
            entries.add(ModBlocks.Willow_Trapdoor);

            entries.add(ModBlocks.Sandstone_Bricks);
            entries.add(ModBlocks.Sandstone_Brick_Stairs);
            entries.add(ModBlocks.Sandstone_Brick_Slab);
            entries.add(ModBlocks.Sandstone_Brick_Wall);

            entries.add(ModBlocks.Reinforced_Gravel);
            entries.add(ModBlocks.Gravel_Bricks);
            entries.add(ModBlocks.Gravel_Brick_Stairs);
            entries.add(ModBlocks.Gravel_Brick_Slab);
            entries.add(ModBlocks.Gravel_Brick_Wall);

            entries.add(ModBlocks.Sanded_Stone);
            entries.add(ModBlocks.Sanded_Stone_Slab);
            entries.add(ModBlocks.Sanded_Stone_Stairs);
            entries.add(ModBlocks.Sanded_Stone_Wall);
            entries.add(ModBlocks.Sanded_Cobblestone);
            entries.add(ModBlocks.Sanded_Cobblestone_Slab);
            entries.add(ModBlocks.Sanded_Cobblestone_Stairs);
            entries.add(ModBlocks.Sanded_Cobblestone_Wall);

        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries ->
        {
            entries.add(ModBlocks.Sand_Carpet);
            entries.add(ModBlocks.Oasis_Grass);
            entries.add(ModBlocks.Palm_Leaves);
        });
    }


}
