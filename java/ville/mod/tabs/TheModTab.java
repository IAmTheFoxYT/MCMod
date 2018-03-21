package ville.mod.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import ville.mod.init.ItemInit;

public class TheModTab extends CreativeTabs
{

	public TheModTab(String label) 
	{
		super("themodtab");
		this.setBackgroundImageName("themod.png"); 
		}
		public ItemStack getTabIconItem() 
		{
			return new ItemStack(ItemInit.DIAMOND_RED);
			
		
	}

}
