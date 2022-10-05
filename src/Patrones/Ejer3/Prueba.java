package Patrones.Ejer3;

public class Prueba {


    public static void main(String[] args) {


        VarillaDeAcero v = new VarillaDeAcero(555.0);
        VarillaDeAcero v2 = new VarillaDeAcero(555.0);
        VarillaDeAcero v3 = new VarillaDeAcero(555.0);
        ProductoCompuesto p1 = new ProductoCompuesto();
        ProductoCompuesto p2 = new ProductoCompuesto();
        p1.agregarProducto(v);
        p1.agregarProducto(v2);
        p1.agregarProducto(p2);

        Fabrica f = new Fabrica();
        f.agregarProducto(p1);
        f.agregarProducto(p2);
        f.agregarProducto(v);

        f.listaPreciosProductos();

    }

}
