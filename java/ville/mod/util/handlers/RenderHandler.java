package ville.mod.util.handlers;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import ville.mod.entity.EntityCrawler;
import ville.mod.entity.item.EntityNukePrimed;
import ville.mod.entity.render.RenderCrawler;
import ville.mod.entity.render.RenderNukePrimed;

public class RenderHandler 
{
	public static void registerEntityRenders() 
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityCrawler.class, new IRenderFactory<EntityCrawler>()
		{
			@Override
			public Render<? super EntityCrawler> createRenderFor(RenderManager manager) 
			{
				return new RenderCrawler(manager);
			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityNukePrimed.class, new IRenderFactory<EntityNukePrimed>() 
		{
			@Override
			public Render<? super EntityNukePrimed> createRenderFor(RenderManager manager) 
			{
				return new RenderNukePrimed(manager);
			}
		});
		
	}
}
