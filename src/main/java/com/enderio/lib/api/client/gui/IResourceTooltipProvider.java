package com.enderio.lib.api.client.gui;

import net.minecraft.item.ItemStack;

public interface IResourceTooltipProvider {

  String getUnlocalizedNameForTooltip(ItemStack itemStack);

}
