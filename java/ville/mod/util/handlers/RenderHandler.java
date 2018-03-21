package ville.mod.util.handlers;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import ville.mod.entity.EntityCrawler;
import ville.mod.entity.render.RenderCrawler;

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
		
		
	}
}
