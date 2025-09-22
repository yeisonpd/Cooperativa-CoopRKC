package app;

import modelo.*;
import transacciones.*;

public class main {
    public static void main(String[] args) {
        try {
            Cooperativa coop = new Cooperativa();

            // Crear socios
            Socio s1 = new Socio("Juan Pérez", "123");
            Socio s2 = new Socio("Ana Gómez", "456");

            // Agregar cuentas
            s1.agregarCuenta(new CuentaAhorros("A001", 100000, 0.02));
            s1.agregarCuenta(new CuentaAhorros("A002", 600000, 0.03));
            s2.agregarCuenta(new CuentaAhorros("B001", 300000, 0.025));

            coop.registrarSocio(s1);
            coop.registrarSocio(s2);

            // Transacciones
            Transaccion dep1 = new Deposito(s1.getCuentas().get(0), 50000);
            dep1.ejecutar();

            Transaccion ret1 = new Retiro(s2.getCuentas().get(0), 100000);
            ret1.ejecutar();

            // Aplicar interés
            s1.getCuentas().forEach(c -> {
                if (c instanceof CuentaAhorros) {
                    ((CuentaAhorros) c).aplicarInteres();
                }
            });

            // Programación funcional
            System.out.println("=== Socios registrados ===");
            coop.getSocios().stream()
                    .map(Socio::getNombre)
                    .forEach(System.out::println);

            System.out.println("\n=== Cuentas con saldo mayor a 500000 ===");
            coop.getSocios().stream()
                    .flatMap(s -> s.getCuentas().stream())
                    .filter(c -> c.getSaldo() > 500000)
                    .forEach(System.out::println);

            System.out.println("\n=== Total de dinero en la cooperativa ===");
            double total = coop.getSocios().stream()
                    .flatMap(s -> s.getCuentas().stream())
                    .map(Cuenta::getSaldo)
                    .reduce(0.0, Double::sum);
            System.out.println(total);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
