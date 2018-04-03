package ville.mod.objects.items.food;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import ville.mod.Main;
import ville.mod.init.ItemInit;
import ville.mod.util.interfaces.IHasModel;

public class ItemPoisonousMushroom extends ItemFood implements IHasModel
{

	public ItemPoisonousMushroom(String name, int amount, boolean isWolfFood) 
	{
		super(amount, isWolfFood);
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
	
	protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer player) 
	{
		if (!world.isRemote) 
		{
			player.addPotionEffect(new PotionEffect(Potion.getPotionById(9), 600, 1));
			player.addPotionEffect(new PotionEffect(Potion.getPotionById(2), 600, 0));
			player.addPotionEffect(new PotionEffect(Potion.getPotionById(4), 600, 5));
			player.addPotionEffect(new PotionEffect(Potion.getPotionById(15), 600, 0));
			player.addPotionEffect(new PotionEffect(Potion.getPotionById(17), 600, 1));
			player.addPotionEffect(new PotionEffect(Potion.getPotionById(18), 600, 5));
			player.addPotionEffect(new PotionEffect(Potion.getPotionById(19), 600, 0));
		}
	}

}
