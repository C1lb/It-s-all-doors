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
	public static Item NETHERITETRAPDOOR;
	public static Item OAKLOGTRAPDOOR;
	public static Item BIRCHLOGTRAPDOOR;
	public static Item ACACIALOGTRAPDOOR;
	public static Item CHERRYLOGTRAPDOOR;
	public static Item DARKOAKLOGTRAPDOOR;
	public static Item JUNGLELOGTRAPDOOR;
	public static Item MANGROVELOGTRAPDOOR;
	public static Item SPRUCELOGTRAPDOOR;
	public static Item QUARTZBRICKSDOOR;
	public static Item PRISMARINEBRICKSDOOR;
	public static Item BRICKSDOOR;
	public static Item BRICKSTRAPDOOR;
	public static Item PRISMARINEBRICKSTRAPDOOR;
	public static Item QUARTZBRICKSTRAPDOOR;
	public static Item CHISELEDNETHERBRICKSTRAPDOOR;
	public static Item CHISELEDSTONEBRICKSTRAPDOOR;
	public static Item CRACKEDDEEPSLATEBRICKSTRAPDOOR;
	public static Item CRACKEDNETHERBRICKSTRAPDOOR;
	public static Item CRACKEDPOLISHEDBLACKSTONEBRICKSTRAPDOOR;
	public static Item CRACKEDSTONEBRICKSTRAPDOOR;
	public static Item DEEPSLATEBRICKSTRAPDOOR;
	public static Item MUDBRICKSTRAPDOOR;
	public static Item NETHERBRICKSTRAPDOOR;
	public static Item POLISHEDBLACKSTONEBRICKSTRAPDOOR;

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
		NETHERITETRAPDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "netheritetrapdoor"), new BlockItem(ItsAllDoorsModBlocks.NETHERITETRAPDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALLTRAPDOOR).register(content -> content.accept(NETHERITETRAPDOOR));
		OAKLOGTRAPDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "oaklogtrapdoor"), new BlockItem(ItsAllDoorsModBlocks.OAKLOGTRAPDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALLTRAPDOOR).register(content -> content.accept(OAKLOGTRAPDOOR));
		BIRCHLOGTRAPDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "birchlogtrapdoor"), new BlockItem(ItsAllDoorsModBlocks.BIRCHLOGTRAPDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALLTRAPDOOR).register(content -> content.accept(BIRCHLOGTRAPDOOR));
		ACACIALOGTRAPDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "acacialogtrapdoor"), new BlockItem(ItsAllDoorsModBlocks.ACACIALOGTRAPDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALLTRAPDOOR).register(content -> content.accept(ACACIALOGTRAPDOOR));
		CHERRYLOGTRAPDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "cherrylogtrapdoor"), new BlockItem(ItsAllDoorsModBlocks.CHERRYLOGTRAPDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALLTRAPDOOR).register(content -> content.accept(CHERRYLOGTRAPDOOR));
		DARKOAKLOGTRAPDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "darkoaklogtrapdoor"), new BlockItem(ItsAllDoorsModBlocks.DARKOAKLOGTRAPDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALLTRAPDOOR).register(content -> content.accept(DARKOAKLOGTRAPDOOR));
		JUNGLELOGTRAPDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "junglelogtrapdoor"), new BlockItem(ItsAllDoorsModBlocks.JUNGLELOGTRAPDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALLTRAPDOOR).register(content -> content.accept(JUNGLELOGTRAPDOOR));
		MANGROVELOGTRAPDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "mangrovelogtrapdoor"), new BlockItem(ItsAllDoorsModBlocks.MANGROVELOGTRAPDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALLTRAPDOOR).register(content -> content.accept(MANGROVELOGTRAPDOOR));
		SPRUCELOGTRAPDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "sprucelogtrapdoor"), new BlockItem(ItsAllDoorsModBlocks.SPRUCELOGTRAPDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALLTRAPDOOR).register(content -> content.accept(SPRUCELOGTRAPDOOR));
		QUARTZBRICKSDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "quartzbricksdoor"), new BlockItem(ItsAllDoorsModBlocks.QUARTZBRICKSDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALL_DOOR).register(content -> content.accept(QUARTZBRICKSDOOR));
		PRISMARINEBRICKSDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "prismarinebricksdoor"), new BlockItem(ItsAllDoorsModBlocks.PRISMARINEBRICKSDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALL_DOOR).register(content -> content.accept(PRISMARINEBRICKSDOOR));
		BRICKSDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "bricksdoor"), new BlockItem(ItsAllDoorsModBlocks.BRICKSDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALL_DOOR).register(content -> content.accept(BRICKSDOOR));
		BRICKSTRAPDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "brickstrapdoor"), new BlockItem(ItsAllDoorsModBlocks.BRICKSTRAPDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALLTRAPDOOR).register(content -> content.accept(BRICKSTRAPDOOR));
		PRISMARINEBRICKSTRAPDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "prismarinebrickstrapdoor"), new BlockItem(ItsAllDoorsModBlocks.PRISMARINEBRICKSTRAPDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALLTRAPDOOR).register(content -> content.accept(PRISMARINEBRICKSTRAPDOOR));
		QUARTZBRICKSTRAPDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "quartzbrickstrapdoor"), new BlockItem(ItsAllDoorsModBlocks.QUARTZBRICKSTRAPDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALLTRAPDOOR).register(content -> content.accept(QUARTZBRICKSTRAPDOOR));
		CHISELEDNETHERBRICKSTRAPDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "chiselednetherbrickstrapdoor"), new BlockItem(ItsAllDoorsModBlocks.CHISELEDNETHERBRICKSTRAPDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALLTRAPDOOR).register(content -> content.accept(CHISELEDNETHERBRICKSTRAPDOOR));
		CHISELEDSTONEBRICKSTRAPDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "chiseledstonebrickstrapdoor"), new BlockItem(ItsAllDoorsModBlocks.CHISELEDSTONEBRICKSTRAPDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALLTRAPDOOR).register(content -> content.accept(CHISELEDSTONEBRICKSTRAPDOOR));
		CRACKEDDEEPSLATEBRICKSTRAPDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "crackeddeepslatebrickstrapdoor"),
				new BlockItem(ItsAllDoorsModBlocks.CRACKEDDEEPSLATEBRICKSTRAPDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALLTRAPDOOR).register(content -> content.accept(CRACKEDDEEPSLATEBRICKSTRAPDOOR));
		CRACKEDNETHERBRICKSTRAPDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "crackednetherbrickstrapdoor"), new BlockItem(ItsAllDoorsModBlocks.CRACKEDNETHERBRICKSTRAPDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALLTRAPDOOR).register(content -> content.accept(CRACKEDNETHERBRICKSTRAPDOOR));
		CRACKEDPOLISHEDBLACKSTONEBRICKSTRAPDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "crackedpolishedblackstonebrickstrapdoor"),
				new BlockItem(ItsAllDoorsModBlocks.CRACKEDPOLISHEDBLACKSTONEBRICKSTRAPDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALLTRAPDOOR).register(content -> content.accept(CRACKEDPOLISHEDBLACKSTONEBRICKSTRAPDOOR));
		CRACKEDSTONEBRICKSTRAPDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "crackedstonebrickstrapdoor"), new BlockItem(ItsAllDoorsModBlocks.CRACKEDSTONEBRICKSTRAPDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALLTRAPDOOR).register(content -> content.accept(CRACKEDSTONEBRICKSTRAPDOOR));
		DEEPSLATEBRICKSTRAPDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "deepslatebrickstrapdoor"), new BlockItem(ItsAllDoorsModBlocks.DEEPSLATEBRICKSTRAPDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALLTRAPDOOR).register(content -> content.accept(DEEPSLATEBRICKSTRAPDOOR));
		MUDBRICKSTRAPDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "mudbrickstrapdoor"), new BlockItem(ItsAllDoorsModBlocks.MUDBRICKSTRAPDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALLTRAPDOOR).register(content -> content.accept(MUDBRICKSTRAPDOOR));
		NETHERBRICKSTRAPDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "netherbrickstrapdoor"), new BlockItem(ItsAllDoorsModBlocks.NETHERBRICKSTRAPDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALLTRAPDOOR).register(content -> content.accept(NETHERBRICKSTRAPDOOR));
		POLISHEDBLACKSTONEBRICKSTRAPDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ItsAllDoorsMod.MODID, "polishedblackstonebrickstrapdoor"),
				new BlockItem(ItsAllDoorsModBlocks.POLISHEDBLACKSTONEBRICKSTRAPDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ItsAllDoorsModTabs.TAB_ALLTRAPDOOR).register(content -> content.accept(POLISHEDBLACKSTONEBRICKSTRAPDOOR));
	}

	public static void clientLoad() {
	}
}
