package transacciones;

public class deposito implements transaccion {
    private double monto;

    public deposito(double monto) {
        this.monto = monto;
    }

    @Override
    public void ejecutar() {
        System.out.println("Deposito realizado por: $" + monto);
    }

    @Override
    public double getMonto() {
        return monto;
    }
}