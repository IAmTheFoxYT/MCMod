package ville.mod.objects.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import ville.mod.Main;
import ville.mod.init.ItemInit;
import ville.mod.util.interfaces.IHasModel;

public class ToolPickaxe extends ItemPickaxe implements IHasModel
{

	public ToolPickaxe(String name, ToolMaterial material) 
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.themodtab);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
	

}
