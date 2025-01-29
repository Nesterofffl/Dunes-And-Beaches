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

        addDrop(ModBlocks.Coconut_Log);
        addDrop(ModBlocks.Coconut_Wood);
        addDrop(ModBlocks.Stripped_Coconut_Log);
        addDrop(ModBlocks.Stripped_Coconut_Wood);
        addDrop(ModBlocks.Coconut_Planks);
        addDrop(ModBlocks.Coconut_Stairs);
        addDrop(ModBlocks.Coconut_Fence);
        addDrop(ModBlocks.Coconut_Fence_Gate);
        addDrop(ModBlocks.Coconut_Door, doorDrops(ModBlocks.Coconut_Door));

        addDrop(ModBlocks.Desert_Log);
        addDrop(ModBlocks.Desert_Planks);
        addDrop(ModBlocks.Desert_Stairs);

        addDrop(ModBlocks.Sandstone_Bricks);
        addDrop(ModBlocks.Sandstone_Brick_Stairs);
        addDrop(ModBlocks.Sandstone_Brick_Wall);
        addDrop(ModBlocks.Sandstone_Brick_Slab, slabDrops(ModBlocks.Sandstone_Brick_Slab));


    }
}
