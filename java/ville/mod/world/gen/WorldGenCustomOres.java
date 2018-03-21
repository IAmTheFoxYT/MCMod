package ville.mod.world.gen;

import java.util.Random;

import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import ville.mod.init.BlockInit;

public class WorldGenCustomOres implements IWorldGenerator 
{
	private WorldGenerator block_ore_red;
	
	public WorldGenCustomOres() 
	{
		block_ore_red = new WorldGenMinable(BlockInit.BLOCK_ORE_RED.getDefaultState(), 8, BlockMatcher.forBlock(Blocks.STONE));
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.getDimension()) 
		{
		case 0:
			
			runGenerator(block_ore_red, world, random, chunkX, chunkZ, 1, 0, 15);
		}
	}
	
	private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight) 
	{
		if(minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("Da ore is doin some criminal shit Yo!");
		
		int heightDiff = maxHeight - minHeight + 1;
		for(int i = 0; i < chance; i++); 
		{
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunkZ * 16 + rand.nextInt(16);
			
			gen.generate(world, rand, new BlockPos(x,y,z));
		}
	}
}
