package ville.mod.util.handlers;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.world.storage.loot.LootTableManager;
import ville.mod.util.Reference;

public class LootTableHandler 
{
	public static final ResourceLocation CRAWLER = LootTableList.register(new ResourceLocation(Reference.MODID, "crawler"));
}
