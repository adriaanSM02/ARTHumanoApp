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

public class VentasFragment extends Fragment {

    private HombresFragment.OnFragmentInteractionListener mListener;
    RecyclerView recyclerVT;
    ArrayList<Producto> listaVT;

    public VentasFragment(){
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View vistaVT = inflater.inflate(R.layout.fragment_ventas, container, false);
        listaVT = new ArrayList<>();
        recyclerVT = vistaVT.findViewById(R.id.recyclerViewVT);
        recyclerVT.setLayoutManager(new LinearLayoutManager(getContext()));

        llenarlistaVT();

        AdapterProducto adapterVT = new AdapterProducto(listaVT);
        recyclerVT.setAdapter(adapterVT);

        return vistaVT;
    }

    private void llenarlistaVT() {
        listaVT.add(new Producto("Iniciación a la venta profesional", "Ventas",R.drawable.ventas1,"12 módulos de contenido", "16 horas", "Desarrollo de las habilidades necesarias para iniciar dentro de la venta profesional, así como las técnicas de compra venta de las personas, así como los elementos fundamentales de la comunicación. junto con los pasos y técnicas de presentación de un producto que permita el cierre de ventas exitoso."));
        listaVT.add(new Producto("De la venta de producto a la venta de soluciones", "Ventas",R.drawable.ventas2,"8 módulos de contenido", "16 horas", "Transformación de la relación con el cliente de manera que se genere un proceso de confianza que permita aportar soluciones en base a necesidades, así como reconocer las diferencias entre los distintos roles, y las herramientas eficaces para el uso de llamadas al mantener entrevistas exitosas dentro del ámbito de comunicación verbal y no verbal"));
        listaVT.add(new Producto("Presentación y argumentación de soluciones", "Ventas",R.drawable.ventas3,"8 módulos de contenido", "16 horas", "Acción eficaz para previnir, aclarar y superar las objeciones de los compradores en base a la identificación de razones y motivos del descontento del cliente junto con una selección de tratamiento adecuado ante las objeciones y resistencia presentada por los compradores."));
        //listaVT.add(new Producto("Centas para siempre (Red book of Sales)", "Ventas",R.drawable.ventas4,"", "", ""));
    }
}
