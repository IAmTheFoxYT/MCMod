package ville.mod.util.handlers;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import ville.mod.util.Reference;

public class SoundsHandler 
{
	public static SoundEvent ENTITY_CRAWLER_AMBIENT, ENTITY_CRAWLER_HURT, ENTITY_CRAWLER_DEATH;
	
	public static void registerSounds() 
	{
		ENTITY_CRAWLER_AMBIENT = registerSound("entity.crawler.ambient");
		ENTITY_CRAWLER_HURT = registerSound("entity.crawler.hurt");
		ENTITY_CRAWLER_DEATH = registerSound("entity.crawler.death");
	}
	
	private static SoundEvent registerSound(String name) 
	{
		ResourceLocation location = new ResourceLocation(Reference.MODID, name);
		SoundEvent event = new SoundEvent(location);
		event.setRegistryName(name);
		ForgeRegistries.SOUND_EVENTS.register(event);
		return event;
	}
}
