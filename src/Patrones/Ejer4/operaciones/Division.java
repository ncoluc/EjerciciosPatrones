package Patrones.Ejer4.operaciones;

public class Division extends Operacion {

    public Division(Double dividendo, Double divisor) {
        super(dividendo, divisor);
        if (divisor == 0.0)
            throw new RuntimeException("No se puede dividir por 0");
    }
}
