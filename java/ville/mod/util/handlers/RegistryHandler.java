package ville.mod.util.handlers;

import net.minecraft.block.Block;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.item.Item;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import ville.mod.Main;
import ville.mod.commands.CommandDimensionTeleport;
import ville.mod.entity.EntityCrawler;
import ville.mod.entity.item.EntityNukePrimed;
import ville.mod.init.BiomeInit;
import ville.mod.init.BlockInit;
import ville.mod.init.DimensionInit;
import ville.mod.init.EntityInit;
import ville.mod.init.ItemInit;
import ville.mod.util.Reference;
import ville.mod.util.interfaces.IHasModel;
import ville.mod.world.gen.WorldGenCustomOres;
import ville.mod.world.gen.WorldGenCustomOres2;
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
		GameRegistry.registerWorldGenerator(new WorldGenCustomOres(), 0);
		GameRegistry.registerWorldGenerator(new WorldGenCustomOres2(), 0);
		GameRegistry.registerWorldGenerator(new WorldGenCustomStructures(), 0);
		
		DimensionInit.registerDimensions();
		BiomeInit.registerBiomes();
	}
	
	public static void initRegistries() 
	{
		SoundsHandler.registerSounds();
		NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new GuiHandler());
	}
	
	public static void otherRegistries() 
	{
		
		EntityRegistry.registerModEntity(null, EntityCrawler.class, "crawler", 120, Reference.NAME, 40, 3, true);
		EntityRegistry.registerModEntity(null, EntityNukePrimed.class, "nukeprimed", 121, Reference.NAME, 80, 3, true);
	}
	
	public static void serverRegistries(FMLServerStartingEvent event) 
	{
		event.registerServerCommand(new CommandDimensionTeleport());
	}
}
