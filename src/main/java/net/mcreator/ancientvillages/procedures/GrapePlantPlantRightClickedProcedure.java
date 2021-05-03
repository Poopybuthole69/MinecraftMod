package net.mcreator.ancientvillages.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;

import net.mcreator.ancientvillages.item.GrapeItem;
import net.mcreator.ancientvillages.block.GrapePlantEmptyBlock;
import net.mcreator.ancientvillages.AncientVillagesModElements;
import net.mcreator.ancientvillages.AncientVillagesMod;

import java.util.Map;

@AncientVillagesModElements.ModElement.Tag
public class GrapePlantPlantRightClickedProcedure extends AncientVillagesModElements.ModElement {
	public GrapePlantPlantRightClickedProcedure(AncientVillagesModElements instance) {
		super(instance, 13);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				AncientVillagesMod.LOGGER.warn("Failed to load dependency x for procedure GrapePlantPlantRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				AncientVillagesMod.LOGGER.warn("Failed to load dependency y for procedure GrapePlantPlantRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				AncientVillagesMod.LOGGER.warn("Failed to load dependency z for procedure GrapePlantPlantRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				AncientVillagesMod.LOGGER.warn("Failed to load dependency world for procedure GrapePlantPlantRightClicked!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (world instanceof World && !world.isRemote()) {
			ItemEntity entityToSpawn = new ItemEntity((World) world, (Math.floor(x)), (Math.floor(y)), (Math.floor(z)),
					new ItemStack(GrapeItem.block, (int) (1)));
			entityToSpawn.setPickupDelay((int) 10);
			world.addEntity(entityToSpawn);
		}
		if (world instanceof World && !world.isRemote()) {
			ItemEntity entityToSpawn = new ItemEntity((World) world, (Math.floor(x)), (Math.floor(y)), (Math.floor(z)),
					new ItemStack(GrapeItem.block, (int) (1)));
			entityToSpawn.setPickupDelay((int) 10);
			world.addEntity(entityToSpawn);
		}
		world.setBlockState(new BlockPos((int) (Math.floor(x)), (int) (Math.floor(y)), (int) (Math.floor(z))),
				GrapePlantEmptyBlock.block.getDefaultState(), 3);
	}
}
