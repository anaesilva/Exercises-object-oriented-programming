package exerc01;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Piramide extends Figura3D {
    private double altura;
    private double arestaBase;
    private double apotema;
    private int numPoliBase;

    private Figura2D base;

    @Override
    public double calcularArea() {
        if (base != null){
            return (numPoliBase * ((arestaBase*apotema)/2)) + base.calcularArea();
        }
        return 0;
    }

    @Override
    public double calcularVolume() {
        if (base != null){
            return (base.calcularArea() * altura)/3;
        }
        return 0;
    }
}
