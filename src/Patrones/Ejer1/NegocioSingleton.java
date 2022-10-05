package Patrones.Ejer1;

import java.util.List;

public class NegocioSingleton {

    private static NegocioSingleton instance;
    private List<Producto> productos;

    private NegocioSingleton(List<Producto> productos) {
        this.productos = productos;
    }

    public static NegocioSingleton getInstance(List<Producto> productos) {
        if (instance == null)
            instance = new NegocioSingleton(productos);
        return instance;
    }

    public void altaProducto(Producto producto) {
        productos.add(producto);
    }

    public void bajaProducto(Producto producto) {
        productos.remove(producto);
    }

    public void bajaProductoPorIndice(int indice) {
        productos.remove(indice);
    }

    public void modificacionProducto(String codigoProducto, Double nuevoPrecio, int nuevoStock) {
        Producto producto = productos.stream().
                filter(x -> x.getCodigo().equals(codigoProducto)).
                findFirst().
                orElseThrow();

        producto.setPrecio(nuevoPrecio);
        producto.setStock(nuevoStock);
    }
}
