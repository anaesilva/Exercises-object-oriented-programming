package entity;

public class ContaCorrente {

    public String numero;
    public String agencia;
    public boolean especial;
    public double limiteEspecial;
    public double saldo;

    public boolean realizarSaque(double quantiaASacar){

        //tem saldo na conta
        if (saldo >= quantiaASacar){
            saldo -= quantiaASacar;
            return true;
        } else { //não tem saldo na conta
            if (especial) {
                //verificar se o limite especial tem saldo
                double limite = limiteEspecial + saldo;
                if (limite >= quantiaASacar){
                    saldo -= quantiaASacar;
                    return true;
                } else {
                    return false;
                }
            } else {
                return false; //não é especial e não tem saldo suficiente
            }
        }
    }

    public void depositar(double valorDepositado){
        saldo += valorDepositado;
    }

    public void consultarSaldo(){
        System.out.println("Saldo atual da conta = " + saldo);
    }

    public boolean verificarUsoChequeEspecial(){
        return saldo < 0;
    }
}
