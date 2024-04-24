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

public class CalidezFragment extends Fragment {

    private HombresFragment.OnFragmentInteractionListener mListener;
    RecyclerView recyclerEntr;
    ArrayList<Producto> listaEntr;

    public CalidezFragment(){
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
         View vistaEntr = inflater.inflate(R.layout.fragment_calidez, container, false);
         listaEntr = new ArrayList<>();
         recyclerEntr = vistaEntr.findViewById(R.id.recyclerViewEntr);
         recyclerEntr.setLayoutManager(new LinearLayoutManager(getContext()));

         llenarlistaEntr();

         AdapterProducto adapterEntr = new AdapterProducto(listaEntr);
         recyclerEntr.setAdapter(adapterEntr);

         return vistaEntr;
    }

    private void llenarlistaEntr() {
        listaEntr.add(new Producto("Generar cambios y establecer metas", "Calidad personal de los colaboradores",R.drawable.calidez1,"2 módulos y 11 submódulos de contenido", "8 horas", "Se proporciona estrategias que propicien cambios positivos y permantentes, revisando las basas para el establecimiento de fortalezas personales dentro del bienestar personal y el éxito. Permitiendo identificar los factores que intervienen dentro del proceso y reconociendo la importancia de las metas en la satisfacción de las personas y realizando un plan de acción para lgorar una meta concreta."));
        listaEntr.add(new Producto("Modelo de gestión del servicio", "Gestión de calidad en el servicio",R.drawable.calidez2,"7 módulos de contenido", "8 horas", "Descripción de bases y aplciaciones de distintos modelos actuales de servicio; que permitan tener los conceptos claves de la calidad y los aspectos involucrados en el mismo, enlistando las necesidades básicas de los clientes, y la elaboración de un plan de acción orientado a la mejora personal de la calidad; asimismo discriminar las características de un sistema orientado a la calidad del servicio al cliente."));
        listaEntr.add(new Producto("Calidad y calidez en el servicio", "Servicio y calidez",R.drawable.calidez3,"4 módulos de contenido", "8 horas", "Reconocimiento de conceptos, técnicas y métodos que permitan la satisfacción del usuario, utilizando un modelo para cerrar brechas dentro del servicio al cliente. Para reconocer el concepto de ROC para aplicarlo en las actividades cotidianas del servicio al cliente, junto con la identificación de las características de servicio que se presenta al usuario."));
        listaEntr.add(new Producto("Auditor interno", "Mejora continua del servicio",R.drawable.calidez4,"12 módulos de contenido", "16 horas", "Proporcionar habilidaddes necesarias de planeación para realizar y reportar auditorias internas de forma adecuada dentro de una organización, para comprender los requisitos de la norma ISO 9001:2008 y aplicar las directrices de la norma ISO 19011:2002, preparando y presentando informes eficaces, para comprender las funciones y responsabilidades de cada auditor dentro de los conceptos de gestión de calidad y sus directrices."));
    }
}
