
package net.mcreator.ancientvillages.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

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
public class HardenedLogFullBlock extends AncientVillagesModElements.ModElement {
	@ObjectHolder("ancient_villages:hardened_log_full")
	public static final Block block = null;
	public HardenedLogFullBlock(AncientVillagesModElements instance) {
		super(instance, 26);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.WOOD).sound(SoundType.STONE).hardnessAndResistance(2f, 15f).setLightLevel(s -> 0).harvestLevel(2)
					.harvestTool(ToolType.AXE).setRequiresTool().slipperiness(0.5f));
			setRegistryName("hardened_log_full");
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
