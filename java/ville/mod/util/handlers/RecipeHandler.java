package ville.mod.util.handlers;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import ville.mod.init.ItemInit;

public class RecipeHandler 
{
	public static void registerSmelting() 
	{
		GameRegistry.addSmelting(new ItemStack(ItemInit.BRAIN, 1), new ItemStack(ItemInit.COOKED_BRAIN, 1), 10);
	}
}
