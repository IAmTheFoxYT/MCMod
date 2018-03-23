package ville.mod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import ville.mod.entity.EntityCrawler;
import ville.mod.init.BlockInit;
import ville.mod.init.ItemInit;
import ville.mod.proxy.CommonProxy;
import ville.mod.tabs.TheModTab;
import ville.mod.util.Reference;
import ville.mod.util.handlers.RegistryHandler;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main 
{
	@Instance
	public static Main instance;

	public static final CreativeTabs themodtab = new TheModTab("themodtab");
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {RegistryHandler.preInitRegistries();}
	@EventHandler
	public void init(FMLInitializationEvent event) {RegistryHandler.initRegistries(); GameRegistry.addSmelting(new ItemStack(ItemInit.BRAIN, 1), new ItemStack(ItemInit.COOKED_BRAIN, 1), 10);GameRegistry.addSmelting(new ItemStack(BlockInit.BLOCK_ORE_RED, 1), new ItemStack(ItemInit.DIAMOND_RED, 1), 10);GameRegistry.addSmelting(new ItemStack(BlockInit.ORE_URAN, 1), new ItemStack(ItemInit.URANIUM, 1), 10);}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {}
}
