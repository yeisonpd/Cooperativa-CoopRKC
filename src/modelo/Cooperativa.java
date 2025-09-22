package modelo;

import java.util.ArrayList;
import java.util.List;

public class Cooperativa {
    private List<Socio> socios;

    public Cooperativa() {
        this.socios = new ArrayList<>();
    }

    public void registrarSocio(Socio socio) {
        socios.add(socio);
    }

    public List<Socio> getSocios() {
        return socios;
    }
}
