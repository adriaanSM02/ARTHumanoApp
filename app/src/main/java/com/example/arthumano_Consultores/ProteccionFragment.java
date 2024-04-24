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

public class ProteccionFragment extends Fragment {

    private HombresFragment.OnFragmentInteractionListener mListener;
    RecyclerView recyclerMaletas;
    ArrayList<Producto> listaMaletas;

    public ProteccionFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View vistaMaletas = inflater.inflate(R.layout.fragment_proteccion, container, false);
        listaMaletas = new ArrayList<>();
        recyclerMaletas = vistaMaletas.findViewById(R.id.recyclerViewMaletas);
        recyclerMaletas.setLayoutManager(new LinearLayoutManager(getContext()));

        llenarlistaMaletas();

        AdapterProducto adapterMaletas = new AdapterProducto(listaMaletas);
        recyclerMaletas.setAdapter(adapterMaletas);

        return vistaMaletas;
    }

    private void llenarlistaMaletas() {
        listaMaletas.add(new Producto("Brigada de evacuación", "Protección civil",R.drawable.proteccion1,"7 módulos de contenido", "8 horas", "Fomentando a los integrantes de una brigada como encargados del cuidado del bienestar y seguridadl del personal de una empresa, con la responsabilidad de las acciones encaminadas durante una situación de emergencia. Se entregará una constancia DC-3 de la STPS por participante y un reconocimiento de registro ante la misma."));
        listaMaletas.add(new Producto("Brigada de primeros auxilios", "Protección civil",R.drawable.proteccion2,"7 módulos de contenido", "20 horas", "Fomentar habitos de respuesta que permitan la mitigación de risgos dentro del ambiente laboral, permitiendo que su trabajo trascienda la situación de emergencia, proporcionando auxilio y ayuda. Se realizará trabajo en maniquís de práctica y simuladores de heridas para práctica. Se entregará una constancia DC-3 de la STPS por participante y un reconocimiento de registro ante la misma."));
        listaMaletas.add(new Producto("Brigada de búsqueda y rescate", "Protección civil",R.drawable.proteccion3,"7 módulos de contenido", "8 horas", "Fomentar a la brigada la responsabilidad de velar por la seguridad del personal de la empresa, llevando a cabo los elementos de atención de una situación de emergencia de búsqueda. Se entregará una constancia DC-3 de la STPS por participante y un reconocimiento de registro ante la misma."));
        listaMaletas.add(new Producto("Brigada multifuncional de emergencia", "Protección civil",R.drawable.proteccion4,"9 módulos de contenido", "10 horas", "Capacitación de los integrantes de la brigada para que cuenten con los conocimientos teóricos para actuar de manera eficaz ante una emergencia presentada por incendio. Incluyendo el material de práctica como extintores y equipo de protección personal. Se entregará una constancia DC-3 de la STPS por participante y un reconocimiento de registro ante la misma."));
    }
}
