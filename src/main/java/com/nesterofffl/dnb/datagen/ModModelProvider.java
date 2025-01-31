package com.nesterofffl.dnb.datagen;

import com.nesterofffl.dnb.block.ModBlocks;
import com.nesterofffl.dnb.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;
import net.minecraft.client.data.TexturedModel;

public class ModModelProvider extends FabricModelProvider
{

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator)
    {


        BlockStateModelGenerator.BlockTexturePool sandstone_bricks_pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.Sandstone_Bricks);


        BlockStateModelGenerator.BlockTexturePool sanded_stone_pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.Sanded_Stone);

        sanded_stone_pool.wall(ModBlocks.Sanded_Stone_Wall);
        sanded_stone_pool.slab(ModBlocks.Sanded_Stone_Slab);
        sanded_stone_pool.stairs(ModBlocks.Sanded_Stone_Stairs);
        BlockStateModelGenerator.BlockTexturePool sanded_cobblestone_pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.Sanded_Cobblestone);
        sanded_cobblestone_pool.wall(ModBlocks.Sanded_Cobblestone_Wall);
        sanded_cobblestone_pool.slab(ModBlocks.Sanded_Cobblestone_Slab);
        sanded_cobblestone_pool.stairs(ModBlocks.Sanded_Cobblestone_Stairs);



        BlockStateModelGenerator.BlockTexturePool coconut_planks_pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.Palm_Planks);
        blockStateModelGenerator.registerLog(ModBlocks.Palm_Log).log(ModBlocks.Palm_Log).wood(ModBlocks.Palm_Wood);
        blockStateModelGenerator.registerLog(ModBlocks.Stripped_Palm_Log).log(ModBlocks.Stripped_Palm_Log).wood(ModBlocks.Stripped_Palm_Wood);
        blockStateModelGenerator.registerDoor(ModBlocks.Palm_Door);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.Palm_Trapdoor);
        coconut_planks_pool.stairs(ModBlocks.Palm_Stairs)
                .fence(ModBlocks.Palm_Fence)
                .fenceGate(ModBlocks.Palm_Fence_Gate);


        blockStateModelGenerator.registerSingleton(ModBlocks.Palm_Leaves, TexturedModel.LEAVES);

        BlockStateModelGenerator.BlockTexturePool desert_planks_pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.Willow_Planks);
        blockStateModelGenerator.registerLog(ModBlocks.Willow_Log).log(ModBlocks.Willow_Log).wood(ModBlocks.Willow_Wood);
        blockStateModelGenerator.registerLog(ModBlocks.Stripped_Willow_Log).log(ModBlocks.Stripped_Willow_Log).wood(ModBlocks.Stripped_Willow_Wood);
        desert_planks_pool.stairs(ModBlocks.Willow_Stairs).fence(ModBlocks.Willow_Fence).fenceGate(ModBlocks.Willow_Fence_Gate);
        blockStateModelGenerator.registerDoor(ModBlocks.Willow_Door);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.Willow_Trapdoor);
        blockStateModelGenerator.registerSingleton(ModBlocks.Desert_Leaves, TexturedModel.LEAVES);

        blockStateModelGenerator.registerSingleton(ModBlocks.Oasis_Grass, TexturedModel.CUBE_TOP);

        sandstone_bricks_pool.stairs(ModBlocks.Sandstone_Brick_Stairs);
        sandstone_bricks_pool.slab(ModBlocks.Sandstone_Brick_Slab);
        sandstone_bricks_pool.wall(ModBlocks.Sandstone_Brick_Wall);


        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.Reinforced_Gravel);
        BlockStateModelGenerator.BlockTexturePool gravel_bricks_pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.Gravel_Bricks);
        gravel_bricks_pool.stairs(ModBlocks.Gravel_Brick_Stairs);
        gravel_bricks_pool.slab(ModBlocks.Gravel_Brick_Slab);
        gravel_bricks_pool.wall(ModBlocks.Gravel_Brick_Wall);


    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator)
    {
        itemModelGenerator.register(ModItems.Dried_Leather, Models.GENERATED);
        itemModelGenerator.register(ModItems.Art_Leather, Models.GENERATED);
    }
}
