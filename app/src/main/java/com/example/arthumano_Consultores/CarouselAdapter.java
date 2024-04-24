package com.example.arthumano_Consultores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CarouselAdapter extends RecyclerView.Adapter<CarouselAdapter.ViewHolder> {

    private Context context;
    private int[] images = {R.drawable.principal1, R.drawable.principal2, R.drawable.principal3, R.drawable.principal4};

    public CarouselAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.carousel_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        int actualPosition = position % images.length; // Calcula la posición real dentro del rango de imágenes
        holder.imageView.setImageResource(images[actualPosition]);
    }

    @Override
    public int getItemCount() {
        return Integer.MAX_VALUE; // Devuelve un número grande para que el ViewPager2 se comporte como un carousel infinito
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}