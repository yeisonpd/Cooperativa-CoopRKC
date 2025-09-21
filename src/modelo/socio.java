package modelo;

import java.util.ArrayList;
import java.util.List;

public class Socio {
    //variables
    private String nombre;
    private String cedula;
    private List<Cuenta> cuentas;

    //constructor
    public Socio(String nombre, String cedula){
        this.nombre = nombre;
        this.cedula = cedula;
        this.cuentas = new ArrayList<>();
    }

    //getters
    public String getNombre(){
        return nombre;
    }

    public String getCedula(){
        return cedula;
    }

    public List<Cuenta> getCuentas(){
        return cuentas;
    }

    //setters

    public void agregarCuneta(Cuenta cuenta)throws Exception{
        boolean existe = cuentas.stream()//covertimos la lista de cuneta en un flujo de datos secuencial 
        .anyMatch(c -> c.getNumeroCuenta().equals(cuenta.getNumeroCuenta())); // recorremos y comprobamos si algun elemento cumple la condicion, para ello usamos una expresion lambda

        if(existe){
            throw new Exception("El numero de cuneta ya existe para este socio"); //verificamos el condicional y lanzamos manualmene una exepcion
        }

        cuentas.add(cuenta);
    }

}
