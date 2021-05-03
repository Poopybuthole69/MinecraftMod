
package net.mcreator.ancientvillages.item;

@AncientVillagesModElements.ModElement.Tag
public class RubyaxeItem extends AncientVillagesModElements.ModElement {

	@ObjectHolder("ancient_villages:rubyaxe")
	public static final Item block = null;

	public RubyaxeItem(AncientVillagesModElements instance) {
		super(instance, 18);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1700;
			}

			public float getEfficiency() {
				return 10f;
			}

			public float getAttackDamage() {
				return 7f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 20;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(RubyItem.block, (int) (1)));
			}
		}, 1, -2f, new Item.Properties().group(ItemGroup.TOOLS)) {

		}.setRegistryName("rubyaxe"));
	}

}
