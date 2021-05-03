
package net.mcreator.ancientvillages.item;

@AncientVillagesModElements.ModElement.Tag
public class RubyshovelItem extends AncientVillagesModElements.ModElement {

	@ObjectHolder("ancient_villages:rubyshovel")
	public static final Item block = null;

	public RubyshovelItem(AncientVillagesModElements instance) {
		super(instance, 19);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 1700;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(RubyItem.block, (int) (1)));
			}
		}, 1, 2f, new Item.Properties().group(ItemGroup.TOOLS)) {

		}.setRegistryName("rubyshovel"));
	}

}
