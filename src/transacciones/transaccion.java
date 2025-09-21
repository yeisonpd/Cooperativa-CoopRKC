package transacciones;

public interface Transaccion {
    void ejecutar() throws Exception;
    double getMonto();
}