package ville.mod.util.handlers;

import net.minecraft.block.Block;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import ville.mod.Main;
import ville.mod.entity.EntityCrawler;
import ville.mod.init.BlockInit;
import ville.mod.init.EntityInit;
import ville.mod.init.ItemInit;
import ville.mod.util.Reference;
import ville.mod.util.interfaces.IHasModel;
import ville.mod.world.gen.WorldGenCustomOres;
import ville.mod.world.gen.WorldGenCustomStructures;

@EventBusSubscriber
public class RegistryHandler 
{
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) 
	{
		event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event) 
	{
		event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
		TileEntityHandler.registerTileEntities();
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) 
	{
		for(Item item : ItemInit.ITEMS) 
		{
			if(item instanceof IHasModel) 
			{
				((IHasModel)item).registerModels();
			}
		}
		
		for(Block block : BlockInit.BLOCKS) 
		{
			if(block instanceof IHasModel) 
			{
				((IHasModel)block).registerModels();
			}
		}
		
	}
	
	public static void preInitRegistries() 
	{
		EntityInit.registerEntities();
		RenderHandler.registerEntityRenders();
		GameRegistry.registerWorldGenerator(new WorldGenCustomStructures(), 0);
	}
	
	public static void initRegistries() 
	{
		SoundsHandler.registerSounds();
		NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new GuiHandler());
	}
	
	public static void otherRegistries() 
	{
		GameRegistry.registerWorldGenerator(new WorldGenCustomOres(), 0);
		GameRegistry.registerWorldGenerator(new WorldGenCustomStructures(), 0);
		EntityRegistry.registerModEntity(null, EntityCrawler.class, "crawler", 120, Reference.NAME, 40, 3, true);
		EntityRegistry.addSpawn("crawler", 300, 2, 6, EnumCreatureType.MONSTER, Biomes.PLAINS, Biomes.BIRCH_FOREST, Biomes.BIRCH_FOREST_HILLS, Biomes.DESERT, Biomes.DESERT_HILLS, Biomes.DESERT_HILLS, Biomes.EXTREME_HILLS_EDGE, Biomes.EXTREME_HILLS_WITH_TREES, Biomes.FOREST, Biomes.FOREST_HILLS, Biomes.MESA, Biomes.MESA_CLEAR_ROCK, Biomes.MESA_ROCK, Biomes.MUTATED_BIRCH_FOREST, Biomes.MUTATED_BIRCH_FOREST_HILLS, Biomes.MUTATED_DESERT, Biomes.MUTATED_EXTREME_HILLS, Biomes.MUTATED_EXTREME_HILLS_WITH_TREES, Biomes.MUTATED_FOREST, Biomes.MUTATED_MESA, Biomes.MUTATED_MESA_CLEAR_ROCK, Biomes.MUTATED_MESA_ROCK, Biomes.MUTATED_PLAINS, Biomes.MUTATED_ROOFED_FOREST, Biomes.ROOFED_FOREST, Biomes.STONE_BEACH);
		
	}
}
