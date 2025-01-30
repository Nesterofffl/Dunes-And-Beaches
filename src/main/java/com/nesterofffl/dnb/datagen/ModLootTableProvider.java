package com.nesterofffl.dnb.datagen;

import com.nesterofffl.dnb.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {

    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate()
    {

        addDrop(ModBlocks.Sanded_Cobblestone);
        addDrop(ModBlocks.Sanded_Stone);

        addDrop(ModBlocks.Palm_Log);
        addDrop(ModBlocks.Palm_Wood);
        addDrop(ModBlocks.Stripped_Palm_Log);
        addDrop(ModBlocks.Stripped_Palm_Wood);
        addDrop(ModBlocks.Palm_Planks);
        addDrop(ModBlocks.Palm_Stairs);
        addDrop(ModBlocks.Palm_Fence);
        addDrop(ModBlocks.Palm_Fence_Gate);
        addDrop(ModBlocks.Palm_Door, doorDrops(ModBlocks.Palm_Door));

        addDrop(ModBlocks.Desert_Log);
        addDrop(ModBlocks.Desert_Planks);
        addDrop(ModBlocks.Desert_Stairs);

        addDrop(ModBlocks.Sandstone_Bricks);
        addDrop(ModBlocks.Sandstone_Brick_Stairs);
        addDrop(ModBlocks.Sandstone_Brick_Wall);
        addDrop(ModBlocks.Sandstone_Brick_Slab, slabDrops(ModBlocks.Sandstone_Brick_Slab));


    }
}
