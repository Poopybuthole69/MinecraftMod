package net.mcreator.ancientvillages.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.container.Slot;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.ancientvillages.item.BeerItem;
import net.mcreator.ancientvillages.AncientVillagesModElements;
import net.mcreator.ancientvillages.AncientVillagesMod;

import java.util.function.Supplier;
import java.util.Map;

@AncientVillagesModElements.ModElement.Tag
public class FridgeUpdateTickProcedure extends AncientVillagesModElements.ModElement {
	public FridgeUpdateTickProcedure(AncientVillagesModElements instance) {
		super(instance, 27);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entityiterator") == null) {
			if (!dependencies.containsKey("entityiterator"))
				AncientVillagesMod.LOGGER.warn("Failed to load dependency entityiterator for procedure FridgeUpdateTick!");
			return;
		}
		Entity entityiterator = (Entity) dependencies.get("entityiterator");
		if (entityiterator instanceof PlayerEntity) {
			Container _current = ((PlayerEntity) entityiterator).openContainer;
			if (_current instanceof Supplier) {
				Object invobj = ((Supplier) _current).get();
				if (invobj instanceof Map) {
					ItemStack _setstack = new ItemStack(BeerItem.block, (int) (1));
					_setstack.setCount((int) 1);
					((Slot) ((Map) invobj).get((int) (5))).putStack(_setstack);
					_current.detectAndSendChanges();
				}
			}
		}
	}
}
