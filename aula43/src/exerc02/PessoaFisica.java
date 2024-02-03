package exerc02;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PessoaFisica extends Contribuinte {

    private String cpf;

    @Override
    public double calcularImposto() {
        double renda = this.getRendaBruta();

        if (renda <= 1400){
            return 0;
        }

        else if (renda > 1400 && renda <= 2100){
            return (renda * 0.1) - 100;
        }

        else if (renda > 2100 && renda <= 2800){
            return (renda * 0.15) - 270;
        }

        else if (renda > 2800 && renda <= 3600){
            return (renda * 0.25) - 500;
        }

        // maior que 3600
        return (renda * 0.3) - 700;
    }
}
