package ar.com.avillucas.parcial1test.producto.data;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import ar.com.avillucas.parcial1test.producto.core.Producto;

public class ProductoSeed {

    public static List<Producto> traerLista() {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Producto 1", 10, 200.3f));
        productos.add(new Producto("Producto 2", 11, 190f));
        productos.add(new Producto("Producto 3", 3, 280f));
        productos.add(new Producto("Producto 4", 20, 800.50f));
        productos.add(new Producto("Producto 5", 10, 200.3f));
        productos.add(new Producto("Producto 6", 10, 200.3f));
        productos.add(new Producto("Producto 7", 10, 200.3f));
        productos.add(new Producto("Producto 8", 10, 200.3f));
        productos.add(new Producto("Producto 9", 33, 200.3f));
        productos.add(new Producto("Producto 10", 18, 200.3f));
        productos.add(new Producto("Producto 11", 15, 200.3f));
        return productos;
    }
}
