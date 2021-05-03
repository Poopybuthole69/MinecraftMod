package net.mcreator.ancientvillages.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.ancientvillages.AncientVillagesModElements;
import net.mcreator.ancientvillages.AncientVillagesMod;

import java.util.Map;

@AncientVillagesModElements.ModElement.Tag
public class DarkWaterMobplayerCollidesBlockProcedure extends AncientVillagesModElements.ModElement {
	public DarkWaterMobplayerCollidesBlockProcedure(AncientVillagesModElements instance) {
		super(instance, 4);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				AncientVillagesMod.LOGGER.warn("Failed to load dependency entity for procedure DarkWaterMobplayerCollidesBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.BLINDNESS, (int) 60, (int) 1, (false), (false)));
	}
}
