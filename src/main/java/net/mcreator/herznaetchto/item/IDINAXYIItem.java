
package net.mcreator.herznaetchto.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class IDINAXYIItem extends RecordItem {
	public IDINAXYIItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.basalt_deltas.mood")), new Item.Properties().stacksTo(1).rarity(Rarity.COMMON), 100);
	}
}
