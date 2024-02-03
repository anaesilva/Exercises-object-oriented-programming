package exerc01;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ContaEspecial extends ContaBancaria {

    private double limite;

    public boolean sacar(double valor) {
       double saldoMaisLimite = this.getSaldo() + limite;

       if ((saldoMaisLimite - valor) > 0) {
         this.setSaldo(this.getSaldo() - valor);
         return true;
       }
       return false;
    }
}
