package ar.com.avillucas.parcial1test.producto.modificar;

import android.app.Activity;
import android.util.Log;
import android.view.View;

import ar.com.avillucas.parcial1test.producto.core.Producto;

public class ProductoModificarControlador implements View.OnClickListener {

    private Producto producto;
    private ProductoModificarVista vista;
    private Activity actividad;

    public ProductoModificarControlador(Producto producto, ProductoModificarVista vista, Activity actividad) {
        this.producto = producto;
        this.vista = vista;
        this.actividad = actividad;
    }

    public boolean validarDatos() {
        //validar que esten cargados los datos
        if (this.producto.getNombre() == null || this.producto.getNombre().isEmpty()) {
            return false;
        }
        if (this.producto.getCantidad() == null) {
            return false;
        }
        if (this.producto.getPrecio() == null) {
            return false;
        }
        return true;
    }

    @Override
    public void onClick(View v) {
        this.vista.cargarModelo();
        if (this.validarDatos()) {
            Log.d("Modelo", this.producto.toString());
        } else {
            Log.d("Error", "error al guardar el modelo");
            //actividad.mostrarMensajeError(R.string.invalidMessage)
        }
    }
}
