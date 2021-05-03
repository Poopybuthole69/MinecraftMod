package net.mcreator.ancientvillages.procedures;

@AncientVillagesModElements.ModElement.Tag
public class BeerFoodEatenProcedure extends AncientVillagesModElements.ModElement {

	public BeerFoodEatenProcedure(AncientVillagesModElements instance) {
		super(instance, 11);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				AncientVillagesMod.LOGGER.warn("Failed to load dependency entity for procedure BeerFoodEaten!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 200, (int) 1, (false), (false)));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.REGENERATION, (int) 80, (int) 1, (false), (false)));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 60, (int) 1, (false), (false)));

	}

}
