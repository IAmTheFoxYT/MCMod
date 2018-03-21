package ville.mod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import ville.mod.objects.armour.ArmourBase;
import ville.mod.objects.items.ItemBase;
import ville.mod.objects.items.food.ItemCustomFood;
import ville.mod.objects.items.food.ItemCustomFoodCooked;
import ville.mod.objects.items.food.ItemFoodStrawBerries;
import ville.mod.objects.items.food.ItemStrawBerrySeed;
import ville.mod.objects.tools.ToolAxe;
import ville.mod.objects.tools.ToolHoe;
import ville.mod.objects.tools.ToolPickaxe;
import ville.mod.objects.tools.ToolShovel;
import ville.mod.objects.tools.ToolSword;
import ville.mod.util.Reference;

public class ItemInit 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Material
	public static final ToolMaterial TOOL_OBSIDIAN = EnumHelper.addToolMaterial("tool_obsidian", 4, 1750, 15.0F, 4.0F, 17);
	public static final ArmorMaterial ARMOUR_OBSIDIAN = EnumHelper.addArmorMaterial("armour_obsidian", Reference.MODID + ":obsidian", 35, new int[] {5, 8, 9, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	public static final ToolMaterial TOOL_RED = EnumHelper.addToolMaterial("tool_red", 5, 2250, 18.0F, 5.0F, 18);
	public static final ArmorMaterial ARMOUR_RED = EnumHelper.addArmorMaterial("armour_red", Reference.MODID + ":red", 40, new int[] {5, 10, 11, 6}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);
	
	//Items
	public static final Item FRAGMENT_OBSIDIAN = new ItemBase("fragment_obsidian");
	public static final Item DIAMOND_RED = new ItemBase("diamond_red");
	public static final Item MOLD_IRON = new ItemBase("mold_iron");
	public static final Item LIQUID_OBSIDIAN = new ItemBase("liquid_obsidian");
	
	
	//Tools
	public static final Item AXE_OBSIDIAN = new ToolAxe("axe_obsidian", TOOL_OBSIDIAN);
	public static final Item HOE_OBSIDIAN = new ToolHoe("hoe_obsidian", TOOL_OBSIDIAN);
	public static final Item PICKAXE_OBSIDIAN = new ToolPickaxe("pickaxe_obsidian", TOOL_OBSIDIAN);
	public static final Item SHOVEL_OBSIDIAN = new ToolShovel("shovel_obsidian", TOOL_OBSIDIAN);
	public static final Item SWORD_OBSIDIAN = new ToolSword("sword_obsidian", TOOL_OBSIDIAN);
	public static final Item AXE_RED = new ToolAxe("axe_red", TOOL_RED);
	public static final Item HOE_RED = new ToolHoe("hoe_red", TOOL_RED);
	public static final Item PICKAXE_RED = new ToolPickaxe("pickaxe_red", TOOL_RED);
	public static final Item SHOVEL_RED = new ToolShovel("shovel_red", TOOL_RED);
	public static final Item SWORD_RED = new ToolSword("sword_red", TOOL_RED);
	
	//Armour
	public static final Item HELMET_OBSIDIAN = new ArmourBase("helmet_obsidian", ARMOUR_OBSIDIAN, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_OBSIDIAN = new ArmourBase("chestplate_obsidian", ARMOUR_OBSIDIAN, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_OBSIDIAN = new ArmourBase("leggings_obsidian", ARMOUR_OBSIDIAN, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_OBSIDIAN = new ArmourBase("boots_obsidian", ARMOUR_OBSIDIAN, 1, EntityEquipmentSlot.FEET);
	public static final Item HELMET_RED = new ArmourBase("helmet_red", ARMOUR_RED, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_RED = new ArmourBase("chestplate_red", ARMOUR_RED, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_RED = new ArmourBase("leggings_red", ARMOUR_RED, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_RED = new ArmourBase("boots_red", ARMOUR_RED, 1, EntityEquipmentSlot.FEET);
	
	//Food
	public static final Item BRAIN = new ItemCustomFood("brain", 4, true);
	public static final Item COOKED_BRAIN = new ItemCustomFoodCooked("cooked_brain", 9, true);
	public static final Item STRAWBERRIES = new ItemFoodStrawBerries("strawberries", 8, false);
	public static final Item STRAWBERRY_SEEDS = new ItemStrawBerrySeed("strawberry_seeds", 1, false);

}
