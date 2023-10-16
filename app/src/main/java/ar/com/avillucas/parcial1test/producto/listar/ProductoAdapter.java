package ar.com.avillucas.parcial1test.producto.listar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.HashSet;
import java.util.List;

import ar.com.avillucas.parcial1test.R;
import ar.com.avillucas.parcial1test.producto.core.Producto;

public class ProductoAdapter extends RecyclerView.Adapter<ProductoViewHolder> {

    private final RecyclerViewInterface recyclerViewInterface;
    private List<Producto> productos;

    public ProductoAdapter(List<Producto> productos, RecyclerViewInterface recyclerViewInterface) {
        this.productos = productos;
        this.recyclerViewInterface = recyclerViewInterface;
    }

    @NonNull
    @Override
    public ProductoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.producto, parent, true);
        return new ProductoViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductoViewHolder holder, int position) {
        Producto producto = this.productos.get(position);
        TextView nombre = holder.itemView.findViewById(R.id.lblProductoNombre);
        TextView cantidad = holder.itemView.findViewById(R.id.lblProductoCantidad);
        TextView precio = holder.itemView.findViewById(R.id.lblProductoPrecio);
        nombre.setText(producto.getNombre());
        //    cantidad.setText(String.format(.getString(R.string.amount),producto.getCantidad())); TODO analzar metodo mas prolijo
        cantidad.setText(String.format("Amount: %d", producto.getCantidad()));
        precio.setText(String.format("Price: %f", producto.getPrecio().toString()));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (recyclerViewInterface != null) {
                    int pos = holder.getAbsoluteAdapterPosition();
                    if (pos != RecyclerView.NO_POSITION) {
                        recyclerViewInterface.onItemClick(pos);
                    }
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return this.productos.size();
    }
}
