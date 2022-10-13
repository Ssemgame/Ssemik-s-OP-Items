
package ssemik.ssemiks.op.items.item;

import ssemik.ssemiks.op.items.SsemiksOpItemsModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@SsemiksOpItemsModElements.ModElement.Tag
public class OPAxeItem extends SsemiksOpItemsModElements.ModElement {
	@ObjectHolder("ssemiks_op_items:op_axe")
	public static final Item block = null;

	public OPAxeItem(SsemiksOpItemsModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.COMBAT).maxDamage(5000).isImmuneToFire().rarity(Rarity.COMMON));
			setRegistryName("op_axe");
		}

		@Override
		public int getItemEnchantability() {
			return 110000;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 110000F;
		}

		@Override
		public boolean canHarvestBlock(BlockState state) {
			return true;
		}
	}
}
