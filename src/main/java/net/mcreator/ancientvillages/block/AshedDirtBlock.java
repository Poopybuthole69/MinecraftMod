
package net.mcreator.ancientvillages.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.ancientvillages.AncientVillagesModElements;

import java.util.List;
import java.util.Collections;

@AncientVillagesModElements.ModElement.Tag
public class AshedDirtBlock extends AncientVillagesModElements.ModElement {
	@ObjectHolder("ancient_villages:ashed_dirt")
	public static final Block block = null;
	public AshedDirtBlock(AncientVillagesModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.EARTH).sound(SoundType.WET_GRASS).hardnessAndResistance(2f, 10f).setLightLevel(s -> 0)
					.speedFactor(1.3f).jumpFactor(0.9f));
			setRegistryName("ashed_dirt");
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
