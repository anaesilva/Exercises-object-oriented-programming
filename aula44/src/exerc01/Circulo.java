package exerc01;

import exerc02.DimensaoSuperficial;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Circulo extends Figura2D {
    private double raio;

    @Override
    public double calcularArea() {
        return (raio * raio) * Math.PI;
    }
}
