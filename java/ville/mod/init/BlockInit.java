package ville.mod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import ville.mod.objects.blocks.BlockBase;
import ville.mod.objects.blocks.BlockBush;
import ville.mod.objects.blocks.BlockNuke;
import ville.mod.objects.blocks.BlockStrawberryPlant;
import ville.mod.objects.blocks.FlintBase;
import ville.mod.objects.blocks.OreUran;
import ville.mod.objects.blocks.RedBlockBase;
import ville.mod.objects.blocks.machines.presser.BlockObsidianPresser;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();

	public static final Block BLOCK_FLINT = new FlintBase("block_flint", Material.ANVIL).setHardness(3F);
	public static final Block BLOCK_ORE_RED = new BlockBase("block_ore_red", Material.ROCK).setHardness(4F);
	public static final Block BLOCK_RED = new RedBlockBase("block_red", Material.IRON).setHardness(5F);
	
	public static final Block OBSIDIAN_PRESSER = new BlockObsidianPresser("obsidian_presser").setHardness(3.5F);
	
	public static final Block STRAWBERRY_PLANT = new BlockStrawberryPlant("strawberry_plant");
	public static final Block BUSH = new BlockBush("bush", Material.VINE);
	
	public static final Block ORE_URAN = new OreUran("ore_uran", Material.ROCK).setHardness(10F);
	public static final Block NUKE = new BlockNuke("nuke", Material.TNT);
	
	
}
