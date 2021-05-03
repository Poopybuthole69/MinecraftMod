
package net.mcreator.ancientvillages.item;

@AncientVillagesModElements.ModElement.Tag
public class RubyItem extends AncientVillagesModElements.ModElement {

	@ObjectHolder("ancient_villages:ruby")
	public static final Item block = null;

	public RubyItem(AncientVillagesModElements instance) {
		super(instance, 14);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(64).rarity(Rarity.RARE));
			setRegistryName("ruby");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

	}

}
