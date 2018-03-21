package ville.mod.init;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeForest;
import net.minecraft.world.biome.BiomePlains;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import ville.mod.Main;
import ville.mod.entity.EntityCrawler;
import ville.mod.util.Reference;

public class EntityInit 
{
	public static void registerEntities() 
	{
		registerEntity("crawler", EntityCrawler.class, Reference.ENTITY_CRAWLER, 50, 12430982, 12443270);
		 
		}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2) 
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
		
	}
}
