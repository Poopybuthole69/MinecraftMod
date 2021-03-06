
package net.mcreator.ancientvillages.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.ancientvillages.AncientVillagesModElements;

@AncientVillagesModElements.ModElement.Tag
public class RubypickaxeItem extends AncientVillagesModElements.ModElement {
	@ObjectHolder("ancient_villages:rubypickaxe")
	public static final Item block = null;
	public RubypickaxeItem(AncientVillagesModElements instance) {
		super(instance, 17);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1700;
			}

			public float getEfficiency() {
				return 10f;
			}

			public float getAttackDamage() {
				return 3f;
			}

			public int getHarvestLevel() {
				return 5;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(RubyItem.block, (int) (1)));
			}
		}, 1, -2.5f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("rubypickaxe"));
	}
}
