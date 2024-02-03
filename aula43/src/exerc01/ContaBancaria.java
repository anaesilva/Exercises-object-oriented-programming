package exerc01;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ContaBancaria {
    private String nomeCliente;
    private String numConta;
    private double saldo;

    public void depositar(double valor) {
       saldo +=valor;
    }

    public boolean sacar(double valor) {
        if ((saldo - valor) >= 0) {
            saldo -= valor;
            return true;
        }
        return false;
    }
}
