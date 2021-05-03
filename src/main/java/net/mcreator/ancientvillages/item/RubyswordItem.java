
package net.mcreator.ancientvillages.item;

@AncientVillagesModElements.ModElement.Tag
public class RubyswordItem extends AncientVillagesModElements.ModElement {

	@ObjectHolder("ancient_villages:rubysword")
	public static final Item block = null;

	public RubyswordItem(AncientVillagesModElements instance) {
		super(instance, 16);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 1700;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 8f;
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
		}, 3, 1f, new Item.Properties().group(ItemGroup.TOOLS)) {

		}.setRegistryName("rubysword"));
	}

}
