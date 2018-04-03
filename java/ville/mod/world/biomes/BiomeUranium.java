package ville.mod.world.biomes;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.BiomeProperties;

public class BiomeUranium extends Biome 
{

	public BiomeUranium() 
	{
		super(new BiomeProperties("Uranium").setBaseHeight(0.8F).setHeightVariation(0.8F).setTemperature(0.6F).setRainDisabled().setWaterColor(6659328));
	}

}
