package ar.com.avillucas.parcial1test.producto.modificar;

import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;

import ar.com.avillucas.parcial1test.producto.core.Producto;

import ar.com.avillucas.parcial1test.R;

public class ProductoModificarVista {

    Producto producto;
    Activity activity;
    EditText txtNombre;
    EditText txtCantidad;
    EditText txtPrecio;
    Button btnSave;

    ProductoModificarControlador controlador;

    public ProductoModificarVista() {
    }

    public ProductoModificarVista(Producto producto, Activity activity) {
        this.producto = producto;
        this.activity = activity;
    }

    public ProductoModificarControlador getControlador() {
        return controlador;
    }

    public void setControlador(ProductoModificarControlador controlador) {
        this.controlador = controlador;
        this.cargarElementos();
    }

    public void cargarElementos() {
        this.txtNombre = activity.findViewById(R.id.txtNombre);
        this.txtCantidad = activity.findViewById(R.id.txtCantidad);
        this.txtPrecio = activity.findViewById(R.id.txtPrecio);
        this.btnSave = activity.findViewById(R.id.bnSave);
        btnSave.setOnClickListener(controlador);
    }

    public void cargarModelo() {
        producto.setNombre(txtNombre.getText().toString());
        producto.setCantidad(Integer.parseInt(txtCantidad.getText().toString()));
        producto.setPrecio(Float.parseFloat(txtPrecio.getText().toString()));
    }

    public void mostrarModelo() {
        txtNombre.setText(producto.getNombre());
        //TODO el aplicar el locale desde la clase quizá
        txtCantidad.setText(producto.getCantidad().toString());
        txtPrecio.setText(producto.getPrecio().toString());
    }
}
