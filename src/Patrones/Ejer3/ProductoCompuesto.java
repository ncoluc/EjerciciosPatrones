package Patrones.Ejer3;

import java.util.List;

public class ProductoCompuesto implements Producto {

    List<Producto> productos;

    @Override
    public Double obtenerCosto() {
        Double costo = 0.0;
        for (Producto pro: productos) {
            costo += pro.obtenerCosto();
        }
        return costo;
        //return productos.stream().mapToDouble(x -> x.obtenerCosto()).sum();
    }
}
