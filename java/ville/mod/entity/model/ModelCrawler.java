package ville.mod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

/**
 * ModelZombie - Either Mojang or a mod author
 * Created using Tabula 6.0.0
 */
public class ModelCrawler extends ModelBase {
    public ModelRenderer zombierightarm;
    public ModelRenderer zombierightleg;
    public ModelRenderer zombiehead;
    public ModelRenderer zombiebody;
    public ModelRenderer zombieleftarm;
    public ModelRenderer zombieleftleg;

    public ModelCrawler() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.zombiehead = new ModelRenderer(this, 0, 0);
        this.zombiehead.setRotationPoint(0.0F, 15.0F, 0.0F);
        this.zombiehead.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.zombiebody = new ModelRenderer(this, 16, 16);
        this.zombiebody.setRotationPoint(0.0F, 15.0F, 0.0F);
        this.zombiebody.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
        this.setRotateAngle(zombiebody, 1.0016444577195458F, 0.0F, 0.0F);
        this.zombierightleg = new ModelRenderer(this, 0, 16);
        this.zombierightleg.setRotationPoint(-1.8F, 21.0F, 9.9F);
        this.zombierightleg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(zombierightleg, 1.5707963267948966F, 0.0F, 0.0F);
        this.zombieleftleg = new ModelRenderer(this, 0, 16);
        this.zombieleftleg.mirror = true;
        this.zombieleftleg.setRotationPoint(2.0F, 21.4F, 9.0F);
        this.zombieleftleg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(zombieleftleg, 1.5707963267948966F, 0.0F, 0.0F);
        this.zombierightarm = new ModelRenderer(this, 40, 16);
        this.zombierightarm.setRotationPoint(-5.0F, 17.0F, 0.0F);
        this.zombierightarm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(zombierightarm, -1.8668041679331349F, -0.10000736613927509F, 0.10000736613927509F);
        this.zombieleftarm = new ModelRenderer(this, 40, 16);
        this.zombieleftarm.mirror = true;
        this.zombieleftarm.setRotationPoint(5.0F, 17.0F, 0.0F);
        this.zombieleftarm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(zombieleftarm, -0.9599310885968813F, 0.10000736613927509F, -0.10000736613927509F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.zombiehead.render(f5);
        this.zombiebody.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.zombierightleg.offsetX, this.zombierightleg.offsetY, this.zombierightleg.offsetZ);
        GlStateManager.translate(this.zombierightleg.rotationPointX * f5, this.zombierightleg.rotationPointY * f5, this.zombierightleg.rotationPointZ * f5);
        GlStateManager.scale(1.0D, 1.0D, 1.3D);
        GlStateManager.translate(-this.zombierightleg.offsetX, -this.zombierightleg.offsetY, -this.zombierightleg.offsetZ);
        GlStateManager.translate(-this.zombierightleg.rotationPointX * f5, -this.zombierightleg.rotationPointY * f5, -this.zombierightleg.rotationPointZ * f5);
        this.zombierightleg.render(f5);
        GlStateManager.popMatrix();
        this.zombieleftleg.render(f5);
        this.zombierightarm.render(f5);
        this.zombieleftarm.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    
    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) 
    {
    	this.zombieleftarm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	
    	this.zombiehead.rotateAngleY = netHeadYaw * 0.017453292F;
    	this.zombiehead.rotateAngleX = headPitch * 0.017453292F;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
