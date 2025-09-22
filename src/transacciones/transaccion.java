package transacciones;

public interface Transaccion {
    void ejecutar() throws Exception ; //Ejecutar la operación
    double getMonto(); //Devolver el monto de la transacción 
}