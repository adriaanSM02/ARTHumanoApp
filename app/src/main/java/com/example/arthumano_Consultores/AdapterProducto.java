package com.example.arthumano_Consultores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterProducto extends RecyclerView.Adapter<AdapterProducto.ViewHolder> implements View.OnClickListener{

    LayoutInflater inflater;
    ArrayList<Producto> listProducts;

    //Listener
    private View.OnClickListener listener;

    public AdapterProducto(ArrayList<Producto> listProducts) {
        this.listProducts=listProducts;
    }


    //onCreateViewHolder
    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_productos, null, false);
        return new ViewHolder(view);
    }

    //onBindViewHolder
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        //holder.asignarProducto(listProducts.get(position));
        holder.imagen.setImageResource(listProducts.get(position).getImagenId());
        holder.nombre.setText(listProducts.get(position).getNombre());
        holder.precio.setText(listProducts.get(position).getPrecio());
        holder.categoria.setText(listProducts.get(position).getCategoria());
        holder.disp.setText(listProducts.get(position).getDisp());
        holder.descripcion.setText(listProducts.get(position).getDescripcion());
    }

    //getItemCount
    @Override
    public int getItemCount() {
        return listProducts.size();
    }

    //onClick
    @Override
    public void onClick(View view) {

    }


    //ViewHolder
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView nombre, precio, disp, descripcion, categoria;
        ImageView imagen;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nombre = itemView.findViewById(R.id.nombre_producto);
            precio = itemView.findViewById(R.id.precio_producto);
            imagen = itemView.findViewById(R.id.imagen_producto);
            disp = itemView.findViewById(R.id.disp_producto);
            descripcion = itemView.findViewById(R.id.desc_producto);
            categoria = itemView.findViewById(R.id.cat_producto);
        }
        
    }

}
