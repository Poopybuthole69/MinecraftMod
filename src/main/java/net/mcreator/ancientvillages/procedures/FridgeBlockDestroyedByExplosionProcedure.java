package net.mcreator.ancientvillages.procedures;

import net.minecraftforge.fml.server.ServerLifecycleHooks;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.Util;
import net.minecraft.server.MinecraftServer;

import net.mcreator.ancientvillages.AncientVillagesModElements;
import net.mcreator.ancientvillages.AncientVillagesMod;

import java.util.Map;

@AncientVillagesModElements.ModElement.Tag
public class FridgeBlockDestroyedByExplosionProcedure extends AncientVillagesModElements.ModElement {
	public FridgeBlockDestroyedByExplosionProcedure(AncientVillagesModElements instance) {
		super(instance, 8);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				AncientVillagesMod.LOGGER.warn("Failed to load dependency world for procedure FridgeBlockDestroyedByExplosion!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		if (!world.isRemote()) {
			MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
			if (mcserv != null)
				mcserv.getPlayerList().func_232641_a_(new StringTextComponent("A fridge has exploded!"), ChatType.SYSTEM, Util.DUMMY_UUID);
		}
	}
}
