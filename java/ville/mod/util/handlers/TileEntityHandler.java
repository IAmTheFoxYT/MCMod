package ville.mod.util.handlers;

import net.minecraftforge.fml.common.registry.GameRegistry;
import ville.mod.objects.blocks.machines.presser.TileEntityObsidianPresser;

public class TileEntityHandler 
{
	public static void registerTileEntities() 
	{
		GameRegistry.registerTileEntity(TileEntityObsidianPresser.class, "obsidian_presser");
	}
}
