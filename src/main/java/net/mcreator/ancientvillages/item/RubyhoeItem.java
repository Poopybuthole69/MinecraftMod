
package net.mcreator.ancientvillages.item;

@AncientVillagesModElements.ModElement.Tag
public class RubyhoeItem extends AncientVillagesModElements.ModElement {

	@ObjectHolder("ancient_villages:rubyhoe")
	public static final Item block = null;

	public RubyhoeItem(AncientVillagesModElements instance) {
		super(instance, 20);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 1700;
			}

			public float getEfficiency() {
				return 10f;
			}

			public float getAttackDamage() {
				return -1f;
			}

			public int getHarvestLevel() {
				return 5;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 0, 0f, new Item.Properties().group(ItemGroup.TOOLS)) {

		}.setRegistryName("rubyhoe"));
	}

}
