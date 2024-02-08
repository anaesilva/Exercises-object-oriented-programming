package exerc01;

import exerc02.DimensaoSuperficial;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Quadrado extends Figura2D {
    private int lado;

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
