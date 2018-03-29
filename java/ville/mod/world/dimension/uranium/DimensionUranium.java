package ville.mod.world.dimension.uranium;

import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.gen.IChunkGenerator;
import ville.mod.init.BiomeInit;
import ville.mod.init.DimensionInit;

public class DimensionUranium extends WorldProvider
{
	public DimensionUranium() 
	{
		this.biomeProvider = new BiomeProviderSingle(BiomeInit.URANIUM_DIMENSION);
	}
	
	@Override
	public DimensionType getDimensionType() 
	{
		return DimensionInit.URANIUM;
	}
	
	@Override
	public IChunkGenerator createChunkGenerator() 
	{
		return new ChunkGeneratorUranium(world, true, world.getSeed());
	}
	
	@Override
	public boolean canRespawnHere() 
	{
		return false;
	}
	
	@Override
	public boolean isSurfaceWorld() 
	{
		return false;
	}
}
