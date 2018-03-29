package ville.mod.init;

import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;
import ville.mod.world.dimension.uranium.DimensionUranium;

public class DimensionInit 
{
	public static final DimensionType URANIUM = DimensionType.register("Uranium", "_uranium", 2, DimensionUranium.class, false);
	
	public static void registerDimensions() 
	{
		DimensionManager.registerDimension(2, URANIUM);
	}
}
