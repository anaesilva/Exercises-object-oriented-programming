package exerc02;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PessoaJuridica extends Contribuinte {

    private String cnpj;

    @Override
    public double calcularImposto() {
        return this.getRendaBruta() * 0.1;
        //return (this.getRendaBruta()/100) * 10;
    }
}
