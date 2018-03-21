package ville.mod.objects.blocks;

import java.util.Random;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import ville.mod.Main;
import ville.mod.init.BlockInit;
import ville.mod.init.ItemInit;
import ville.mod.util.interfaces.IHasModel;

public class BlockBush extends net.minecraft.block.BlockBush implements IHasModel 
{
	
	protected static final AxisAlignedBB BUSH_AABB = new AxisAlignedBB(0.125D, 0.0D, 0.125D, 0.875D, 1.0D, 0.875D);
	
	public BlockBush(String name, Material material) 
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.themodtab);
		setSoundType(SoundType.PLANT);
		setResistance(0);
		
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
		

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
		
	}
	
	 public Item getItemDropped(IBlockState state, Random rand, int fortune)
	    {
	        return ville.mod.init.ItemInit.STRAWBERRY_SEEDS;
	    }
	 
	 public boolean isReplaceable(IBlockAccess worldIn, BlockPos pos)
	    {
	        return true;
	    }
	 
	 public int quantityDroppedWithBonus(int fortune, Random random)
	    {
	        return 1 + random.nextInt(fortune * 2 + 1);
	    }
	 
	 @Override
	public boolean isOpaqueCube(IBlockState state) 
	 {
		return false;
	}
	 @Override
	public boolean isFullCube(IBlockState state) 
	 {
		return false;
	}
	 
	 public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
	    {
	        return BUSH_AABB;
	    }
	 
	 @Nullable
	    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos)
	    {
	        return NULL_AABB;
	    }
	 

}
