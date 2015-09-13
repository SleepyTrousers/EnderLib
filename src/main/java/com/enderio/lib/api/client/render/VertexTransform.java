package com.enderio.lib.api.client.render;

import com.enderio.lib.common.vecmath.Vector3d;
import com.enderio.lib.common.vecmath.Vector3f;
import com.enderio.lib.common.vecmath.Vertex;

public interface VertexTransform {

  void apply(Vertex vertex);

  void apply(Vector3d vec);

  void applyToNormal(Vector3f vec);

}
