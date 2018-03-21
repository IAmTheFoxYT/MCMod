package ville.mod.util.handlers;

import net.minecraft.util.IStringSerializable;

public class EnumHandler 
{
	public static enum EnumType implements IStringSerializable 
	{
		RED_DIAMOND(0, "red_diamond"),
		YELLOW_DIAMOND(1, "yellow_diamod");
		
		private static final EnumType[] META_LOOKUP = new EnumType[values().length];
		private final int meta;
		private final String name, unlocializedName;
		
		private EnumType(int meta, String name) 
		{
			this(meta, name, name);
		}
		
		private EnumType(int meta, String name, String unlocializedName) 
		{
			this.meta = meta;
			this.name = name;
			this.unlocializedName = unlocializedName;
		}
		
		@Override
		public String getName() 
		{
			return this.name();
		}
		
		public int getMeta() 
		{
			return this.meta;
		}
		
		@Override
		public String toString() 
		{
			return this.name;
		}
		
		public static EnumType byMetadata(int meta) 
		{
			return META_LOOKUP[meta];
		}
		
		static 
		{
			for(EnumType enumtype : values()) 
			{
				META_LOOKUP[enumtype.getMeta()] = enumtype;
			}
		}
	}

}
