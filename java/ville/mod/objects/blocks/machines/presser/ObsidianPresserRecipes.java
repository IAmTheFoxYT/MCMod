package ville.mod.objects.blocks.machines.presser;



import java.util.Map;
import java.util.Map.Entry;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import ville.mod.init.BlockInit;
import ville.mod.init.ItemInit;

public class ObsidianPresserRecipes 
{	
	private static final ObsidianPresserRecipes INSTANCE = new ObsidianPresserRecipes();
	private final Table<ItemStack, ItemStack, ItemStack> smeltingList = HashBasedTable.<ItemStack, ItemStack, ItemStack>create();
	private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();
	
	public static ObsidianPresserRecipes getInstance()
	{
		return INSTANCE;
	}
	
	private ObsidianPresserRecipes() 
	{
		addSinteringRecipe(new ItemStack(Blocks.OBSIDIAN), new ItemStack(Items.IRON_INGOT), new ItemStack(ItemInit.LIQUID_OBSIDIAN, 9), 5.0F);
		addSinteringRecipe(new ItemStack(ItemInit.LIQUID_OBSIDIAN), new ItemStack(ItemInit.MOLD_IRON), new ItemStack(ItemInit.FRAGMENT_OBSIDIAN), 5.0F);
	}

	
	public void addSinteringRecipe(ItemStack input1, ItemStack input2, ItemStack result, float experience) 
	{
		if(getSinteringResult(input1, input2) != ItemStack.EMPTY) return;
		this.smeltingList.put(input1, input2, result);
		this.experienceList.put(result, Float.valueOf(experience));
	}
	
	public ItemStack getSinteringResult(ItemStack input1, ItemStack input2) 
	{
		for(Entry<ItemStack, Map<ItemStack, ItemStack>> entry : this.smeltingList.columnMap().entrySet()) 
		{
			if(this.compareItemStacks(input1, (ItemStack)entry.getKey())) 
			{
				for(Entry<ItemStack, ItemStack> ent : entry.getValue().entrySet()) 
				{
					if(this.compareItemStacks(input2, (ItemStack)ent.getKey())) 
					{
						return (ItemStack)ent.getValue();
					}
				}
			}
		}
		return ItemStack.EMPTY;
	}
	
	private boolean compareItemStacks(ItemStack stack1, ItemStack stack2)
	{
		return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
	}
	
	public Table<ItemStack, ItemStack, ItemStack> getDualSmeltingList() 
	{
		return this.smeltingList;
	}
	
	public float getSinteringExperience(ItemStack stack)
	{
		for (Entry<ItemStack, Float> entry : this.experienceList.entrySet()) 
		{
			if(this.compareItemStacks(stack, (ItemStack)entry.getKey())) 
			{
				return ((Float)entry.getValue()).floatValue();
			}
		}
		return 0.0F;
	}
} 

