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

public class LiderazgoFragment extends Fragment {

    private HombresFragment.OnFragmentInteractionListener mListener;
    RecyclerView recyclerPrendas;
    ArrayList<Producto> listaPrendas;

    public LiderazgoFragment(){
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View vistaPrendas = inflater.inflate(R.layout.fragment_liderazgo, container, false);
        listaPrendas = new ArrayList<>();
        recyclerPrendas = vistaPrendas.findViewById(R.id.recyclerViewPrendas);
        recyclerPrendas.setLayoutManager(new LinearLayoutManager(getContext()));

        llenarlistaPrendas();

        AdapterProducto adapterPrendas = new AdapterProducto(listaPrendas);
        recyclerPrendas.setAdapter(adapterPrendas);

        return vistaPrendas;
    }

    private void llenarlistaPrendas() {
        listaPrendas.add(new Producto("Conocimiento personal y calidad de vida", "Relaciones humanas efectivas",R.drawable.liderazgo1,"4 módulos de contenido", "8 horas", "Ayudar a los participantes a aplicar lo aprendido para disfrutar los beneficios en todos los ámbitos de su vida. Mediante el reconocimiento de la importancia de la psicología positiva como ciencia para el estudio de la felicidad y el análisis del impacto que tienen los pensamientos y creencias para impulsar o limitar los logros"));
        listaPrendas.add(new Producto("Trabajo en equipo y esquemas de colaboración", "Gestión del desempeño de los colaboradores",R.drawable.liderazgo2,"2 módulos y 14 submódulos de contenido", "16 horas", "Identificación y experimentación de situaciones cotidianaspara los líderes y mienmbros de un equipo, junto con el desarrollo de competencias necesarias para trabajar colaborativamente de forma positiva y favoreciendo la integración al equipo, junto con los factores que intervienen dentro de la dinámica. Junto con estrategias que permitan dinámicas de trabajo dignas de confianza y cooperación."));
        listaPrendas.add(new Producto("Administración del tiempo", "Adaptación productiva al entorno y gestión del cambio",R.drawable.liderazgo3,"10 módulos y 5 submódulos de contenido", "8 horas", "Capacitación de herramientas que permitan una manera más eficiente y productiva de la administración del tiempo, para aplicación en vida personal y laboral. Fortalecer la posición del líder además de conocer la importancia de los modelos mentales en la administración del tiempo y las principales causas de pérdidas de tiempo."));
        listaPrendas.add(new Producto("Técnicas de negociación", "Adaptación productiva al entorno y gestión del cambio",R.drawable.liderazgo4,"8 módulos de contenido", "16 horas", "Reconocimiento de las negociaciones en el ámbito profesional para llevar negociaciones que representen beneficios a todos los involucrados. Permitiendo identificar el estilo de negociación propio para analizar los aspectos a tomar antes y durante el proceso de negociación, junto con la identificación de facilitadores y obstáculos en una negociación."));
    }
}
