package exerc01;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Calendar;

@Getter
@Setter
@ToString
public class ContaPoupanca extends ContaBancaria {

    private int diaRendimento;

    public boolean calcularNovoSaldo(double taxaRendimento) {

        Calendar hoje = Calendar.getInstance();

        if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
          this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
          return true;
        }

        return false;
    }
}
