package com.nesterofffl.dnb.datagen;

import com.nesterofffl.dnb.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider
{

    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup)
    {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.Sandstone_Bricks).
                 add(ModBlocks.Sanded_Stone).
                 add(ModBlocks.Sanded_Cobblestone).
                 add(ModBlocks.Sandstone_Brick_Wall) ;

        getOrCreateTagBuilder(BlockTags.STAIRS)
                .add(ModBlocks.Sandstone_Brick_Stairs);

        getOrCreateTagBuilder(BlockTags.SLABS)
                .add(ModBlocks.Sandstone_Brick_Slab);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.Sandstone_Brick_Wall).add(ModBlocks.Sanded_Stone_Wall).add(ModBlocks.Sanded_Cobblestone_Wall);

        getOrCreateTagBuilder(BlockTags.FENCES).add(ModBlocks.Palm_Fence).add(ModBlocks.Willow_Fence);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(ModBlocks.Palm_Fence_Gate).add(ModBlocks.Willow_Fence_Gate);
        getOrCreateTagBuilder(BlockTags.DOORS).add(ModBlocks.Palm_Door).add(ModBlocks.Willow_Door);
        getOrCreateTagBuilder(BlockTags.TRAPDOORS).add(ModBlocks.Palm_Trapdoor).add(ModBlocks.Willow_Trapdoor);
    }
}

