
package net.mcreator.ancientvillages.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.ancientvillages.AncientVillagesModElements;

import java.util.List;

@AncientVillagesModElements.ModElement.Tag
public class DarkDiskItem extends AncientVillagesModElements.ModElement {
	@ObjectHolder("ancient_villages:dark_disk")
	public static final Item block = null;
	public DarkDiskItem(AncientVillagesModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, AncientVillagesModElements.sounds.get(new ResourceLocation("ancient_villages:dark_disk_music")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("dark_disk");
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("This one of a kind disc is found in the dark dimension"));
		}
	}
}
