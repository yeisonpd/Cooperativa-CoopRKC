package modelo;

public class CuentaAhorros extends Cuenta{
    private double interes; 

    public CuentaAhorros(String numeroCuneta, double saldoInicial, double interes){
        super(numeroCuneta, saldoInicial);
        this.interes = interes;
    }

    public void aplicarInteres(){
        saldo += saldo * interes;
    }

    @Override
    public String toString() {
        return "CuentaAhorros{" +
                "numeroCuenta='" + getNumeroCuenta() + '\'' +
                ", saldo=" + getSaldo() +
                ", interes=" + interes +
                '}';
    }
}
