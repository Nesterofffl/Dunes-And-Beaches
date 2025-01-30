package com.nesterofffl.dnb;

import com.nesterofffl.dnb.block.ModBlocks;
import com.nesterofffl.dnb.item.ModItemGroups;
import com.nesterofffl.dnb.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.client.render.RenderLayer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DunesAndBeaches implements ModInitializer {
	public static final String MOD_ID = "dunes-and-beaches";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize()
	{
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();

		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.Palm_Door, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.Palm_Trapdoor, RenderLayer.getCutout());

		StrippableBlockRegistry.register(ModBlocks.Palm_Log, ModBlocks.Stripped_Palm_Log);
		StrippableBlockRegistry.register(ModBlocks.Palm_Wood, ModBlocks.Stripped_Palm_Wood);
		StrippableBlockRegistry.register(ModBlocks.Desert_Log, ModBlocks.Stripped_Desert_Log);
		StrippableBlockRegistry.register(ModBlocks.Desert_Wood, ModBlocks.Stripped_Desert_Wood);
	}
}