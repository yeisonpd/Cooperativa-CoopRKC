package transacciones;

public class retiro implements transaccion{
    private double monto;

    public retiro(double monto) {
        this.monto = monto;
    }

    @Override
    public void ejecutar() {
        System.out.println("Retiro realizado por: $" + monto);
    }

    @Override
    public double getMonto() {
        return monto;
    }
}
