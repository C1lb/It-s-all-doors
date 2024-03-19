/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.itsalldoors.init;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.itsalldoors.ItsAllDoorsMod;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class ItsAllDoorsModItems {
	public static Item BRICHLOGDOOR;
	public static Item OAKLOGDOOR;
	public static Item ACACIALOGDOOR;
	public static Item DARKOAKLOGDOOR;
	public static Item SPRUCELOGDOOR;
	public static Item JUNGLELOGDOOR;
	public static Item MANGROVELOGDOOR;
	public static Item CHERRYLOGDOOR;
	public static Item STONEDOOR;
	public static Item STONEBRICKSDOOR;
	public static Item CRACKEDSTONEBRICKSDOOR;
	public static Item MOSSYSTONEBRICKSDOOR;
	public static Item CHISELEDSTONEBRICKSDOOR;
	public static Item SMOOTHSTONEDOOR;
	public static Item SMOOTHSTONESLABSIDEDOOR;
	public static Item ENDSTONEDOOR;
	public static Item ENDSTONEBRICKSDOOR;
	public static Item CHISELEDPOLISHEDBLACKSTONEDOOR;
	public static Item COBBLESTONEDOOR;
	public static Item MOSSYCOBBLESTONEDOOR;
	public static Item COBBLEDDEEPSLATEDOOR;
	public static Item CRIMSONNYLIUMSIDEDOOR;
	public static Item WARPEDNYLIUMSIDEDOOR;
	public static Item NETHERRACKDOOR;
	public static Item NETHERGOLDDOOR;
	public static Item NETHERQUARTZDOOR;
	public static Item NETHERQUARTZANDGOLDDOOR;
	public static Item NETHERGOLDANDQUARTZDOOR;
	public static Item NETHERITEDOOR;
	public static Item CHISELEDNETHERBRICKSDOOR;
	public static Item NETHERBRICKSDOOR;
	public static Item CRACKEDNETHERBRICKSDOOR;
	public static Item REDNETHERBRICKSDOOR;
	public static Item PRECIOUSDOOR;
	public static Item MUDBRICKSDOOR;
	public static Item DEEPSLATEBRICKSDOOR;
	public static Item CRACKEDDEEPSLATEBRICKSDOOR;
	public static Item POLISHEDBLACKSTONEBRICKSDOOR;
	public static Item CRACKEDPOLISHEDBLACKSTONEBRICKSDOOR;

	public static void load() {
		BRICHLOGDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "brichlogdoor"), new BlockItem(ItsAllDoorsModBlocks.BRICHLOGDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALL_DOOR).register(content -> content.accept(BRICHLOGDOOR));
		OAKLOGDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "oaklogdoor"), new BlockItem(ItsAllDoorsModBlocks.OAKLOGDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALL_DOOR).register(content -> content.accept(OAKLOGDOOR));
		ACACIALOGDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "acacialogdoor"), new BlockItem(ItsAllDoorsModBlocks.ACACIALOGDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALL_DOOR).register(content -> content.accept(ACACIALOGDOOR));
		DARKOAKLOGDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "darkoaklogdoor"), new BlockItem(ItsAllDoorsModBlocks.DARKOAKLOGDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALL_DOOR).register(content -> content.accept(DARKOAKLOGDOOR));
		SPRUCELOGDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "sprucelogdoor"), new BlockItem(ItsAllDoorsModBlocks.SPRUCELOGDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALL_DOOR).register(content -> content.accept(SPRUCELOGDOOR));
		JUNGLELOGDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "junglelogdoor"), new BlockItem(ItsAllDoorsModBlocks.JUNGLELOGDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALL_DOOR).register(content -> content.accept(JUNGLELOGDOOR));
		MANGROVELOGDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "mangrovelogdoor"), new BlockItem(ItsAllDoorsModBlocks.MANGROVELOGDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALL_DOOR).register(content -> content.accept(MANGROVELOGDOOR));
		CHERRYLOGDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "cherrylogdoor"), new BlockItem(ItsAllDoorsModBlocks.CHERRYLOGDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALL_DOOR).register(content -> content.accept(CHERRYLOGDOOR));
		STONEDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "stonedoor"), new BlockItem(ItsAllDoorsModBlocks.STONEDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALL_DOOR).register(content -> content.accept(STONEDOOR));
		STONEBRICKSDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "stonebricksdoor"), new BlockItem(ItsAllDoorsModBlocks.STONEBRICKSDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALL_DOOR).register(content -> content.accept(STONEBRICKSDOOR));
		CRACKEDSTONEBRICKSDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "crackedstonebricksdoor"), new BlockItem(ItsAllDoorsModBlocks.CRACKEDSTONEBRICKSDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALL_DOOR).register(content -> content.accept(CRACKEDSTONEBRICKSDOOR));
		MOSSYSTONEBRICKSDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "mossystonebricksdoor"), new BlockItem(ItsAllDoorsModBlocks.MOSSYSTONEBRICKSDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALL_DOOR).register(content -> content.accept(MOSSYSTONEBRICKSDOOR));
		CHISELEDSTONEBRICKSDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "chiseledstonebricksdoor"), new BlockItem(ItsAllDoorsModBlocks.CHISELEDSTONEBRICKSDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALL_DOOR).register(content -> content.accept(CHISELEDSTONEBRICKSDOOR));
		SMOOTHSTONEDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "smoothstonedoor"), new BlockItem(ItsAllDoorsModBlocks.SMOOTHSTONEDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALL_DOOR).register(content -> content.accept(SMOOTHSTONEDOOR));
		SMOOTHSTONESLABSIDEDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "smoothstoneslabsidedoor"), new BlockItem(ItsAllDoorsModBlocks.SMOOTHSTONESLABSIDEDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALL_DOOR).register(content -> content.accept(SMOOTHSTONESLABSIDEDOOR));
		ENDSTONEDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "endstonedoor"), new BlockItem(ItsAllDoorsModBlocks.ENDSTONEDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALL_DOOR).register(content -> content.accept(ENDSTONEDOOR));
		ENDSTONEBRICKSDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "endstonebricksdoor"), new BlockItem(ItsAllDoorsModBlocks.ENDSTONEBRICKSDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALL_DOOR).register(content -> content.accept(ENDSTONEBRICKSDOOR));
		CHISELEDPOLISHEDBLACKSTONEDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "chiseledpolishedblackstonedoor"),
				new BlockItem(ItsAllDoorsModBlocks.CHISELEDPOLISHEDBLACKSTONEDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALL_DOOR).register(content -> content.accept(CHISELEDPOLISHEDBLACKSTONEDOOR));
		COBBLESTONEDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "cobblestonedoor"), new BlockItem(ItsAllDoorsModBlocks.COBBLESTONEDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALL_DOOR).register(content -> content.accept(COBBLESTONEDOOR));
		MOSSYCOBBLESTONEDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "mossycobblestonedoor"), new BlockItem(ItsAllDoorsModBlocks.MOSSYCOBBLESTONEDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALL_DOOR).register(content -> content.accept(MOSSYCOBBLESTONEDOOR));
		COBBLEDDEEPSLATEDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "cobbleddeepslatedoor"), new BlockItem(ItsAllDoorsModBlocks.COBBLEDDEEPSLATEDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALL_DOOR).register(content -> content.accept(COBBLEDDEEPSLATEDOOR));
		CRIMSONNYLIUMSIDEDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "crimsonnyliumsidedoor"), new BlockItem(ItsAllDoorsModBlocks.CRIMSONNYLIUMSIDEDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALL_DOOR).register(content -> content.accept(CRIMSONNYLIUMSIDEDOOR));
		WARPEDNYLIUMSIDEDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "warpednyliumsidedoor"), new BlockItem(ItsAllDoorsModBlocks.WARPEDNYLIUMSIDEDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALL_DOOR).register(content -> content.accept(WARPEDNYLIUMSIDEDOOR));
		NETHERRACKDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "netherrackdoor"), new BlockItem(ItsAllDoorsModBlocks.NETHERRACKDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALL_DOOR).register(content -> content.accept(NETHERRACKDOOR));
		NETHERGOLDDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "nethergolddoor"), new BlockItem(ItsAllDoorsModBlocks.NETHERGOLDDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALL_DOOR).register(content -> content.accept(NETHERGOLDDOOR));
		NETHERQUARTZDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "netherquartzdoor"), new BlockItem(ItsAllDoorsModBlocks.NETHERQUARTZDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALL_DOOR).register(content -> content.accept(NETHERQUARTZDOOR));
		NETHERQUARTZANDGOLDDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "netherquartzandgolddoor"), new BlockItem(ItsAllDoorsModBlocks.NETHERQUARTZANDGOLDDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALL_DOOR).register(content -> content.accept(NETHERQUARTZANDGOLDDOOR));
		NETHERGOLDANDQUARTZDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "nethergoldandquartzdoor"), new BlockItem(ItsAllDoorsModBlocks.NETHERGOLDANDQUARTZDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALL_DOOR).register(content -> content.accept(NETHERGOLDANDQUARTZDOOR));
		NETHERITEDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "netheritedoor"), new BlockItem(ItsAllDoorsModBlocks.NETHERITEDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALL_DOOR).register(content -> content.accept(NETHERITEDOOR));
		CHISELEDNETHERBRICKSDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "chiselednetherbricksdoor"), new BlockItem(ItsAllDoorsModBlocks.CHISELEDNETHERBRICKSDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALL_DOOR).register(content -> content.accept(CHISELEDNETHERBRICKSDOOR));
		NETHERBRICKSDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "netherbricksdoor"), new BlockItem(ItsAllDoorsModBlocks.NETHERBRICKSDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALL_DOOR).register(content -> content.accept(NETHERBRICKSDOOR));
		CRACKEDNETHERBRICKSDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "crackednetherbricksdoor"), new BlockItem(ItsAllDoorsModBlocks.CRACKEDNETHERBRICKSDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALL_DOOR).register(content -> content.accept(CRACKEDNETHERBRICKSDOOR));
		REDNETHERBRICKSDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "rednetherbricksdoor"), new BlockItem(ItsAllDoorsModBlocks.REDNETHERBRICKSDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALL_DOOR).register(content -> content.accept(REDNETHERBRICKSDOOR));
		PRECIOUSDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "preciousdoor"), new BlockItem(ItsAllDoorsModBlocks.PRECIOUSDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALL_DOOR).register(content -> content.accept(PRECIOUSDOOR));
		MUDBRICKSDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "mudbricksdoor"), new BlockItem(ItsAllDoorsModBlocks.MUDBRICKSDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALL_DOOR).register(content -> content.accept(MUDBRICKSDOOR));
		DEEPSLATEBRICKSDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "deepslatebricksdoor"), new BlockItem(ItsAllDoorsModBlocks.DEEPSLATEBRICKSDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALL_DOOR).register(content -> content.accept(DEEPSLATEBRICKSDOOR));
		CRACKEDDEEPSLATEBRICKSDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "crackeddeepslatebricksdoor"), new BlockItem(ItsAllDoorsModBlocks.CRACKEDDEEPSLATEBRICKSDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALL_DOOR).register(content -> content.accept(CRACKEDDEEPSLATEBRICKSDOOR));
		POLISHEDBLACKSTONEBRICKSDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "polishedblackstonebricksdoor"), new BlockItem(ItsAllDoorsModBlocks.POLISHEDBLACKSTONEBRICKSDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALL_DOOR).register(content -> content.accept(POLISHEDBLACKSTONEBRICKSDOOR));
		CRACKEDPOLISHEDBLACKSTONEBRICKSDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "crackedpolishedblackstonebricksdoor"),
				new BlockItem(ItsAllDoorsModBlocks.CRACKEDPOLISHEDBLACKSTONEBRICKSDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALL_DOOR).register(content -> content.accept(CRACKEDPOLISHEDBLACKSTONEBRICKSDOOR));
	}

	public static void clientLoad() {
	}
}
