package Patrones.Ejer3;

public class ProductoBasico implements Producto {

    private Double precioDeCompra;

    public ProductoBasico(Double precioDeCompra) {
        this.precioDeCompra = precioDeCompra;
    }

    @Override
    public Double obtenerCosto() {
        return this.precioDeCompra;
    }

}
