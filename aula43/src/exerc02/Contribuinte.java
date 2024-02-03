package exerc02;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class Contribuinte {
    private String nome;
    private double rendaBruta;

    public abstract double calcularImposto();
}
