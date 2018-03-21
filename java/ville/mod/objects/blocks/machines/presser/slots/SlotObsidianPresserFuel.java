package ville.mod.objects.blocks.machines.presser.slots;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import ville.mod.objects.blocks.machines.presser.TileEntityObsidianPresser;

public class SlotObsidianPresserFuel extends Slot
{
	public SlotObsidianPresserFuel(IInventory inventory, int index, int x, int y) 
	{
		super(inventory, index, x, y);
	}
	
	@Override
	public boolean isItemValid(ItemStack stack) 
	{
		return TileEntityObsidianPresser.isItemFuel(stack);
	}
	
	@Override
	public int getItemStackLimit(ItemStack stack) 
	{
		return super.getItemStackLimit(stack);
	}
}
