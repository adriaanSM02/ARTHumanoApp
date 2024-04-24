package com.example.arthumano_Consultores;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HombresFragment extends Fragment {

    private OnFragmentInteractionListener mListener;
    RecyclerView recyclerMen;
    ArrayList<Producto> listaHombre;

    public HombresFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View vistaMen = inflater.inflate(R.layout.fragment_hombres, container, false);
        listaHombre = new ArrayList<>();
        recyclerMen = vistaMen.findViewById(R.id.recyclerViewMen);
        recyclerMen.setLayoutManager(new LinearLayoutManager(getContext()));

        llenarlistaMen();

        AdapterProducto adapterMen = new AdapterProducto(listaHombre);
        recyclerMen.setAdapter(adapterMen);

        return vistaMen;
    }

    private void llenarlistaMen() {
        listaHombre.add(new Producto("Jersery Auténtico Alternativo", "$2,499.00",R.drawable.men1,"27 artículos", "Jersey", "Playera de poliéster y spandex"));
        listaHombre.add(new Producto("Chamarra Protocolo Alternativa", "$1,699.00",R.drawable.men2,"AGOTADO", "Chamarra", "Chamarra deportiva de spandex"));
        listaHombre.add(new Producto("Short de Entrenamiento", "$1,299.00",R.drawable.men3,"24 artículos", "Pantalones", "Shorts deportivos de spandex"));
        listaHombre.add(new Producto("Sudadera de Entretenamiento Rojo", "$1,299.00",R.drawable.men4,"30 artículos", "Sudadera", "Sudadera deportiva de spandex"));
        listaHombre.add(new Producto("Pants de Entrenamiento", "$1,199.00",R.drawable.men5,"12 artículos", "Pantalones", "Pantalones de spandex ajustados a la figura"));
        listaHombre.add(new Producto("Polo Vino", "$980.00",R.drawable.men6,"52 artículos", "Jersey", "Playera de algodón ajustada"));

    }


    public interface OnFragmentInteractionListener {
    }

}
