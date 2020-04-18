package com.vartax.vtgcomp;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModMain implements ModInitializer {

	public static final Block COMPUTER_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).build());
	
	@Override
	public void onInitialize() {
		Registry.register(Registry.BLOCK, new Identifier("vtg", "computer"), COMPUTER_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("vtg", "computer"), new BlockItem(COMPUTER_BLOCK, new Item.Settings().group(ItemGroup.MISC)));
	}

}
