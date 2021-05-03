
package net.mcreator.ancientvillages.block;

import net.minecraft.block.material.Material;

@AncientVillagesModElements.ModElement.Tag
public class BlockofrubyBlock extends AncientVillagesModElements.ModElement {

	@ObjectHolder("ancient_villages:blockofruby")
	public static final Block block = null;

	public BlockofrubyBlock(AncientVillagesModElements instance) {
		super(instance, 15);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(

					Block.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(1f, 30f).setLightLevel(s -> 0));

			setRegistryName("blockofruby");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}

	}

}
