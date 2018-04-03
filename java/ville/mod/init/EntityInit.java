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
import ville.mod.entity.item.EntityNukePrimed;
import ville.mod.util.Reference;

public class EntityInit 
{
	private static Biome [] getBiomes (final BiomeDictionary.Type type) 
	{
	    return BiomeDictionary.getBiomes (type).toArray (new Biome [0]);
	}
	
	public static void registerEntities() 
	{
		registerEntity("crawler", EntityCrawler.class, Reference.ENTITY_CRAWLER, 50, 12430982, 12443270);
		registerEntity("nukeprimed", EntityNukePrimed.class, Reference.ENTITY_NUKE_PRIMED, 50);
		
		 //.DEAD.FOREST.DRY.DENSE.CONIFEROUS.HILLS.HOT.MESA.MOUNTAIN.NETHER.SAVANNA.SPOOKY.SPARSE.WASTELAND
		}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2) 
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
		EntityRegistry.addSpawn(EntityCrawler.class, 1000, 1, 5, EnumCreatureType.MONSTER, getBiomes(BiomeDictionary.Type.PLAINS));
		EntityRegistry.addSpawn(EntityCrawler.class, 1000, 1, 5, EnumCreatureType.MONSTER, getBiomes(BiomeDictionary.Type.DEAD));
		EntityRegistry.addSpawn(EntityCrawler.class, 800, 1, 5, EnumCreatureType.MONSTER, getBiomes(BiomeDictionary.Type.FOREST));
		EntityRegistry.addSpawn(EntityCrawler.class, 1000, 1, 5, EnumCreatureType.MONSTER, getBiomes(BiomeDictionary.Type.DRY));
		EntityRegistry.addSpawn(EntityCrawler.class, 1000, 1, 5, EnumCreatureType.MONSTER, getBiomes(BiomeDictionary.Type.DENSE));
		EntityRegistry.addSpawn(EntityCrawler.class, 1000, 1, 5, EnumCreatureType.MONSTER, getBiomes(BiomeDictionary.Type.CONIFEROUS));
		EntityRegistry.addSpawn(EntityCrawler.class, 1000, 1, 5, EnumCreatureType.MONSTER, getBiomes(BiomeDictionary.Type.HILLS));
		EntityRegistry.addSpawn(EntityCrawler.class, 1000, 1, 5, EnumCreatureType.MONSTER, getBiomes(BiomeDictionary.Type.HOT));
		EntityRegistry.addSpawn(EntityCrawler.class, 1000, 1, 5, EnumCreatureType.MONSTER, getBiomes(BiomeDictionary.Type.MESA));
		EntityRegistry.addSpawn(EntityCrawler.class, 1000, 1, 5, EnumCreatureType.MONSTER, getBiomes(BiomeDictionary.Type.MOUNTAIN));
		EntityRegistry.addSpawn(EntityCrawler.class, 1000, 1, 5, EnumCreatureType.MONSTER, getBiomes(BiomeDictionary.Type.SAVANNA));
		EntityRegistry.addSpawn(EntityCrawler.class, 1000, 1, 5, EnumCreatureType.MONSTER, getBiomes(BiomeDictionary.Type.SPOOKY));
		EntityRegistry.addSpawn(EntityCrawler.class, 1000, 1, 5, EnumCreatureType.MONSTER, getBiomes(BiomeDictionary.Type.SPARSE));
		EntityRegistry.addSpawn(EntityCrawler.class, 1000, 1, 5, EnumCreatureType.MONSTER, getBiomes(BiomeDictionary.Type.WASTELAND));
		
	}
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range) {
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":" + name), entity, name, id, Main.instance, range, 1, true); 
	}
}
