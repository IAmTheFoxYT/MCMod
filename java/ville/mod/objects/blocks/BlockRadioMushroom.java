package ville.mod.objects.blocks;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockMushroom;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import ville.mod.Main;
import ville.mod.init.BlockInit;
import ville.mod.init.ItemInit;
import ville.mod.util.interfaces.IHasModel;

public class BlockRadioMushroom extends BlockMushroom implements IHasModel, net.minecraftforge.common.IShearable
{
	protected static final AxisAlignedBB MUSHROOM_AABB = new AxisAlignedBB(0.30000001192092896D, 0.0D, 0.30000001192092896D, 0.699999988079071D, 0.4000000059604645D, 0.699999988079071D);

	public BlockRadioMushroom(String name, Material material) 
	{
		super();
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.themodtab);
		setSoundType(SoundType.PLANT);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	 public Item getItemDropped(IBlockState state, Random rand, int fortune)
	    {
	        return ville.mod.init.ItemInit.POISONOUS_MUSHROOM;
	    }

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
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
	        return MUSHROOM_AABB;
	    }
	 
	 @Nullable
	    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos)
	    {
	        return NULL_AABB;
	    }



	@Override
	public boolean isShearable(ItemStack item, IBlockAccess world, BlockPos pos) 
	{
		return true;
	}

	@Override
	public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) 
	{
		return java.util.Arrays.asList(new ItemStack(BlockInit.RADIO_MUSHROOM));
	}
	
	 public boolean canBlockStay(World worldIn, BlockPos pos, IBlockState state)
	    {
	        if (pos.getY() >= 0 && pos.getY() < 256)
	        {
	            IBlockState iblockstate = worldIn.getBlockState(pos.down());

	            if (iblockstate.getBlock() == Blocks.MYCELIUM)
	            {
	                return true;
	            }
	            else if (iblockstate.getBlock() == BlockInit.RADIOACTIVE_STONE)
	            {
	                return true;
	            }
	            else
	            {
	                return worldIn.getLight(pos) < 13 && iblockstate.getBlock().canSustainPlant(iblockstate, worldIn, pos.down(), net.minecraft.util.EnumFacing.UP, this);
	            }
	        }
	        else
	        {
	            return false;
	        }
	    }
	
}
