package ar.com.avillucas.parcial1test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import ar.com.avillucas.parcial1test.producto.core.Producto;
import ar.com.avillucas.parcial1test.producto.listar.ProductoListaModelo;
import ar.com.avillucas.parcial1test.producto.modificar.ProductoModificarControlador;
import ar.com.avillucas.parcial1test.producto.modificar.ProductoModificarVista;

public class ProductoModificarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto_modificar);
        Integer posicion = getIntent().getIntExtra("POSICION",0);
        ProductoListaModelo productoListaModelo = new ProductoListaModelo();
        Producto producto = productoListaModelo.traerUno(posicion);
        ProductoModificarVista  productoModificarVista = new ProductoModificarVista();
        ProductoModificarControlador  productoModificarControlador = new ProductoModificarControlador(producto,productoModificarVista, this);
        productoModificarVista.setControlador(productoModificarControlador);
    }
}