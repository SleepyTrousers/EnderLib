package com.enderio.lib.client.render;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import com.enderio.lib.api.client.render.IWidgetIcon;
import com.enderio.lib.api.client.render.IWidgetMap;

@Getter
@RequiredArgsConstructor
@AllArgsConstructor
public class CustomWidgetIcon implements IWidgetIcon {

  private final int x, y, width, height;
  private final IWidgetMap map;

  private IWidgetIcon overlay;

}
