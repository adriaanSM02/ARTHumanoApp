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

public class MujeresFragment extends Fragment {

    private HombresFragment.OnFragmentInteractionListener mListener;
    RecyclerView recyclerMujeres;
    ArrayList<Producto> listaMujeres;

    public MujeresFragment(){
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
         View vistaMujeres = inflater.inflate(R.layout.fragment_mujeres, container, false);
         listaMujeres = new ArrayList<>();
         recyclerMujeres = vistaMujeres.findViewById(R.id.recyclerViewWomen);
         recyclerMujeres.setLayoutManager(new LinearLayoutManager(getContext()));

         llenarlistaMujeres();

         AdapterProducto adapterMujer = new AdapterProducto(listaMujeres);
         recyclerMujeres.setAdapter(adapterMujer);

         return vistaMujeres;
    }

    private void llenarlistaMujeres() {
        listaMujeres.add(new Producto("¿Quiénes somos?",
                "VOCACIÓN Y CONOCIMIENTO",
                R.drawable.cursos,
                "Somos una consultora con presencia nacional e internacional, con experiencia en diversas organizaciones industrias y sectores, nuestra vocación es transformar organizaciones a través de  maximizar el potencial de su gente. ",
                "Nuestro éxito se genera gracias a una visión clara e integral de las necesidades de nuestros clientes,  a los atributos y valores a los que nos apegamos y distinguen, pero sobre todo, a la experiencia, vocación  y conocimiento que transmitimos a través de las personas que colaboran con AR T Humano Consultores S.C.",
                "Operamos brindando servicios de consultoría y de formación a medida, así como de catálogo el cuál esta agrupado en 6 soluciones que brindan en su conjunto más de 50 seminarios a su disposición."));

        listaMujeres.add((new Producto("\n Empresas que confían en nosotros:\n",
                "",
                R.drawable.empresas,
                "Entre otras empresas de talla mundial.",
                "Helvex, Martí, Kidzania, Grupo Eulen, Luxotica, Nestlé, Porrúa, Sunglass Hut, Sport City",
                ""
        )));
    }
}
