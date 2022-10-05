package Patrones.Ejer3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fabrica {

    private List<Producto> productosEnVenta;

    public Fabrica() {
        List<Producto> productos = new ArrayList<>();
        this.productosEnVenta = productos;
    }

    public Fabrica(List<Producto> productosEnVenta) {
        this.productosEnVenta = productosEnVenta;
    }

    public void agregarProducto(Producto producto){
        this.productosEnVenta.add(producto);
    }

    public void listaPreciosProductos(){
        for (Producto producto: productosEnVenta) {
            System.out.println("-" + producto.getClass().getSimpleName()+ " : $"+producto.obtenerCosto());
        }
    }


}
