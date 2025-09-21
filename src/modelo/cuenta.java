package modelo;

public abstract class Cuenta {
    // Variables
    private String numeroCuenta;
    protected double saldo;

    public Cuenta(String numeroCuenta, double saldoInicial){
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    public String getNumeroCuenta(){
        return numeroCuenta;
    }

    public double getSaldo(){
        return saldo;
    }

    public void depositar(double monto){
        saldo += monto;
    }

    public void retirar(double monto) throws Exception{
        if(monto > saldo){
            throw new Exception("saldo insuficiente.");
        }
        
        saldo -= monto;
    }

    @Override
    public String toString(){
        return "cuenta{"+
        "nume de cuenta= '"+ numeroCuenta+ '\''+
        ", saldo= " + saldo +
        '}';
    }
}
