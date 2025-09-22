package transacciones;

public interface transaccion {
    void ejecutar() ; //Ejecutar la operación
    double getMonto(); //Devolver el monto de la transacción 
}