package ville.mod.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import ville.mod.Main;
import ville.mod.init.BlockInit;
import ville.mod.init.ItemInit;
import ville.mod.util.interfaces.IHasModel;

public class FlintBase extends Block implements IHasModel 
{
	public FlintBase(String name, Material material) 
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.themodtab);
		setHarvestLevel("pickaxe", 2);
		setSoundType(SoundType.STONE);
		setResistance(15);
		
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
		

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
		
	}

}
