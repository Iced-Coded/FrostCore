
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.frostcore.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.frostcore.item.IceingotItem;
import net.mcreator.frostcore.FrostcoreMod;

public class FrostcoreModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FrostcoreMod.MODID);
	public static final RegistryObject<Item> ICEINGOT = REGISTRY.register("iceingot", () -> new IceingotItem());
}
