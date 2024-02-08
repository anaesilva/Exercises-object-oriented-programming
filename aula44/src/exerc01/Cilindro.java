package exerc01;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Cilindro extends Figura3D {
    private int altura;
    private double raio;

    @Override
    public double calcularArea() {

        double areaBase = Math.PI * (raio*raio);
        double areaLateral = 2 * Math.PI * raio * altura;
        double areaTotal = (2*areaBase) + areaLateral;

        return areaTotal;
    }

    @Override
    public double calcularVolume() {
        return Math.PI * (raio*raio) * altura;
    }
}
