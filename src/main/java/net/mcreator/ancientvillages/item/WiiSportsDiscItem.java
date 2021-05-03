
package net.mcreator.ancientvillages.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

import net.mcreator.ancientvillages.AncientVillagesModElements;

@AncientVillagesModElements.ModElement.Tag
public class WiiSportsDiscItem extends AncientVillagesModElements.ModElement {
	@ObjectHolder("ancient_villages:wii_sports_disc")
	public static final Item block = null;
	public WiiSportsDiscItem(AncientVillagesModElements instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, AncientVillagesModElements.sounds.get(new ResourceLocation("ancient_villages:wiisports")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("wii_sports_disc");
		}
	}
}
