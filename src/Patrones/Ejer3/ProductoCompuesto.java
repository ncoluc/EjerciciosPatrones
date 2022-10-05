package Patrones.Ejer3;

import java.util.ArrayList;
import java.util.List;

public class ProductoCompuesto implements Producto {

    List<Producto> productos;

    public ProductoCompuesto() {
        this.productos = new ArrayList<>();
    }

    @Override
    public Double obtenerCosto() {
        Double costo = 0.0;
        for (Producto pro: productos) {
            costo += pro.obtenerCosto();
        }
        return costo;
        //return productos.stream().mapToDouble(x -> x.obtenerCosto()).sum();
    }

    public void agregarProducto(Producto producto){
        productos.add(producto);
    }
}
