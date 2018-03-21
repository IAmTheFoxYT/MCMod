package ville.mod.util.handlers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import ville.mod.objects.blocks.machines.presser.ContainerObsidianPresser;
import ville.mod.objects.blocks.machines.presser.GuiObsidianPresser;
import ville.mod.objects.blocks.machines.presser.TileEntityObsidianPresser;
import ville.mod.util.Reference;

public class GuiHandler implements IGuiHandler
{

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_OBSIDIAN_PRESSER) return new ContainerObsidianPresser(player.inventory, (TileEntityObsidianPresser)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_OBSIDIAN_PRESSER) return new GuiObsidianPresser(player.inventory, (TileEntityObsidianPresser)world.getTileEntity(new BlockPos(x,y,z)));

		return null;
	}
	
}
