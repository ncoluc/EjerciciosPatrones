package Patrones.Ejer4.operaciones;

import Patrones.Ejer4.Expresion;

public class Operacion implements Expresion {

    private Double numero1;
    private Double numero2;

    public Operacion(Double numero1, Double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    @Override
    public void calcularExpresion() {

    }

    @Override
    public void mostrarExpresion() {

    }

    @Override
    public void agregarExpresion() {

    }

    @Override
    public void removerExpresion() {

    }

    @Override
    public Double obtenerResultado() {
        return null;
    }
}
