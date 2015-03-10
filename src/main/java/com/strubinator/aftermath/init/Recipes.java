package com.strubinator.aftermath.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

/**
 * Created by John on 3/1/2015.
 */
public class Recipes
{
    public static void init()
    {
        OreDictionary.registerOre("ingotLead", new ItemStack(ModItems.leadIngot));
        OreDictionary.registerOre("oreLead", new ItemStack(ModBlocks.leadOre));
        OreDictionary.registerOre("blockLead", new ItemStack(ModBlocks.leadBlock));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.leadBlock), "xxx", "xxx", "xxx", 'x', "ingotLead"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.leadIngot, 9), "blockLead"));

        GameRegistry.addSmelting(ModBlocks.leadOre, new ItemStack(ModItems.leadIngot), 0.5f);
        GameRegistry.addSmelting(ModItems.mushroom, new ItemStack(ModItems.cookedMushroom), 0.0f);
    }
}
