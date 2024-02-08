package exerc01;

import exerc02.DimensaoSuperficial;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Triangulo extends Figura2D implements DimensaoSuperficial {
    private double base;
    private double altura;

    @Override
    public double calcularArea() {
        return ((base * altura) / 2);
    }
}
