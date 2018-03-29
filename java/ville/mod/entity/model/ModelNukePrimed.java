package ville.mod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelNukePrimed extends ModelBase
{
	public ModelRenderer nuke;
	
	public ModelNukePrimed() 
	{
		this.textureWidth = 16;
		this.textureHeight = 16;
		this.nuke = new ModelRenderer(this, 0, 0);
	}
	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) 
	{
		this.nuke.render(f5);
	}
}
