package com.enderio.lib.api.client.gui;

import com.enderio.lib.client.gui.widget.GuiScrollableList;

public interface ListSelectionListener<T> {

  void selectionChanged(GuiScrollableList<T> list, int selectedIndex);

}
