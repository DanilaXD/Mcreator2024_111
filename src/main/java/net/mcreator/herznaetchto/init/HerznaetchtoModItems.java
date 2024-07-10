
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.herznaetchto.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.herznaetchto.item.IDINAXYIItem;
import net.mcreator.herznaetchto.HerznaetchtoMod;

public class HerznaetchtoModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, HerznaetchtoMod.MODID);
	public static final RegistryObject<Item> IDINAXYI = REGISTRY.register("idinaxyi", () -> new IDINAXYIItem());
	// Start of user code block custom items
	// End of user code block custom items
}
