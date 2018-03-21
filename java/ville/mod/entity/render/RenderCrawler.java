package ville.mod.entity.render;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import ville.mod.entity.EntityCrawler;
import ville.mod.entity.model.ModelCrawler;
import ville.mod.util.Reference;

public class RenderCrawler extends RenderLiving<EntityCrawler> 
{

	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/crawler.png");
	
	public RenderCrawler(RenderManager manager) 
	{
		super(manager, new ModelCrawler(), 0.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityCrawler entity) 
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityCrawler entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) 
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	

}
