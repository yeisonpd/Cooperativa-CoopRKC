package modelo;

import java.util.ArrayList;
import java.util.List;

public class socio {
    //variables
    private String nombre;
    private String cedula;
    private List<cuenta> cuentas;

    //constructor
    public socio(String nombre, String cedula){
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

    public List<cuenta> getCuentas(){
        return cuentas;
    }

    //setters

}
