package net.mcreator.ancientvillages.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;

import net.mcreator.ancientvillages.block.GrapePlantBlock;
import net.mcreator.ancientvillages.AncientVillagesModElements;
import net.mcreator.ancientvillages.AncientVillagesMod;

import java.util.Map;

@AncientVillagesModElements.ModElement.Tag
public class GrapePlantEmptyClientDisplayRandomTickProcedure extends AncientVillagesModElements.ModElement {
	public GrapePlantEmptyClientDisplayRandomTickProcedure(AncientVillagesModElements instance) {
		super(instance, 13);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				AncientVillagesMod.LOGGER.warn("Failed to load dependency x for procedure GrapePlantEmptyClientDisplayRandomTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				AncientVillagesMod.LOGGER.warn("Failed to load dependency y for procedure GrapePlantEmptyClientDisplayRandomTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				AncientVillagesMod.LOGGER.warn("Failed to load dependency z for procedure GrapePlantEmptyClientDisplayRandomTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				AncientVillagesMod.LOGGER.warn("Failed to load dependency world for procedure GrapePlantEmptyClientDisplayRandomTick!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		world.setBlockState(new BlockPos((int) (Math.floor(x)), (int) (Math.floor(y)), (int) (Math.floor(z))),
				GrapePlantBlock.block.getDefaultState(), 3);
	}
}
