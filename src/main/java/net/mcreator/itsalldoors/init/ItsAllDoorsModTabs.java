
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.itsalldoors.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.itsalldoors.ItsAllDoorsMod;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

public class ItsAllDoorsModTabs {
	public static ResourceKey<CreativeModeTab> TAB_ALL_DOOR = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(ItsAllDoorsMod.MODID, "all_door"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_ALL_DOOR, FabricItemGroup.builder().title(Component.translatable("item_group." + ItsAllDoorsMod.MODID + ".all_door")).icon(() -> new ItemStack(Blocks.OAK_DOOR)).build());
	}
}
