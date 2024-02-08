package exerc01;

import exerc02.DimensaoSuperficial;
import exerc02.DimensaoVolumetrica;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class Figura3D extends FiguraGeometrica implements DimensaoSuperficial, DimensaoVolumetrica {

}
