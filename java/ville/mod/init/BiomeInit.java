package ville.mod.init;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import ville.mod.world.biomes.BiomeUranium;

public class BiomeInit 
{
	public static final Biome URANIUM_DIMENSION = new BiomeUranium();
	
	public static void registerBiomes() 
	{
		initBiome(URANIUM_DIMENSION,"Uranium", BiomeType.WARM, Type.DEAD, Type.SPOOKY, Type.WASTELAND);
	}
	
	private static Biome initBiome(Biome biome, String name, BiomeType biomeType, Type... types) 
	{
		biome.setRegistryName(name);
		ForgeRegistries.BIOMES.register(biome);
		System.out.println("Biome Registered");
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addBiome(biomeType, new BiomeEntry(biome, 10));
		BiomeManager.addSpawnBiome(biome);
		System.out.println("Biome Added");
		return biome;
	}
}
