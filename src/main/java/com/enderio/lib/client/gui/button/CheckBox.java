package com.enderio.lib.client.gui.button;

import com.enderio.lib.api.client.gui.IGuiScreen;
import com.enderio.lib.client.render.EnderWidget;

public class CheckBox extends ToggleButton {

  public CheckBox(IGuiScreen gui, int id, int x, int y) {
    super(gui, id, x, y, EnderWidget.BUTTON, EnderWidget.BUTTON_CHECKED);
  }

}
