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


        BlockStateModelGenerator.BlockTexturePool sandstone_bricks_pool= blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.Sandstone_Bricks);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.Sanded_Stone);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.Sanded_Cobblestone);

        BlockStateModelGenerator.BlockTexturePool coconut_planks_pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.Coconut_Planks);
        blockStateModelGenerator.registerLog(ModBlocks.Coconut_Log).log(ModBlocks.Coconut_Log).wood(ModBlocks.Coconut_Wood);
        blockStateModelGenerator.registerLog(ModBlocks.Stripped_Coconut_Log).log(ModBlocks.Stripped_Coconut_Log).wood(ModBlocks.Stripped_Coconut_Wood);
        blockStateModelGenerator.registerDoor(ModBlocks.Coconut_Door);
        coconut_planks_pool.stairs(ModBlocks.Coconut_Stairs)
                .fence(ModBlocks.Coconut_Fence)
                .fenceGate(ModBlocks.Coconut_Fence_Gate);


        blockStateModelGenerator.registerSingleton(ModBlocks.Coconut_Leaves, TexturedModel.LEAVES);

        BlockStateModelGenerator.BlockTexturePool desert_planks_pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.Desert_Planks);
        blockStateModelGenerator.registerLog(ModBlocks.Desert_Log).log(ModBlocks.Desert_Log).wood(ModBlocks.Desert_Wood);
        blockStateModelGenerator.registerLog(ModBlocks.Stripped_Desert_Log).log(ModBlocks.Stripped_Desert_Log).wood(ModBlocks.Stripped_Desert_Wood);
        desert_planks_pool.stairs(ModBlocks.Desert_Stairs);
        blockStateModelGenerator.registerSingleton(ModBlocks.Desert_Leaves, TexturedModel.LEAVES);

        blockStateModelGenerator.registerSingleton(ModBlocks.Oasis_Grass, TexturedModel.CUBE_TOP);

        sandstone_bricks_pool.stairs(ModBlocks.Sandstone_Brick_Stairs);
        sandstone_bricks_pool.slab(ModBlocks.Sandstone_Brick_Slab);
        sandstone_bricks_pool.wall(ModBlocks.Sandstone_Brick_Wall);


    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator)
    {
        itemModelGenerator.register(ModItems.Dried_Leather, Models.GENERATED);
        itemModelGenerator.register(ModItems.Art_Leather, Models.GENERATED);
    }
}
