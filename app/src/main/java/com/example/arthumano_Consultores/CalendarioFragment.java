package com.example.arthumano_Consultores;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class CalendarioFragment extends Fragment {

    private CalendarView calendarView;
    private Spinner spinnerOptions;
    private Button btnAgendarCita;
    private Calendar selectedCalendar;

    public CalendarioFragment() {
    }

    @SuppressLint("MissingInflatedId")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View vistaChild = inflater.inflate(R.layout.fragment_calendario, container, false);

        calendarView = vistaChild.findViewById(R.id.calendarView);
        spinnerOptions = vistaChild.findViewById(R.id.spinnerOptions);
        btnAgendarCita = vistaChild.findViewById(R.id.btnAgendarCita);

        // Configurar opciones para el Spinner
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getContext(),
                R.array.options_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerOptions.setAdapter(adapter);

        // Inicializar la fecha seleccionada con la fecha actual
        selectedCalendar = Calendar.getInstance();

        // Escuchar cambios de fecha en el CalendarView
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                selectedCalendar.set(year, month, dayOfMonth);
            }
        });

        btnAgendarCita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener la opción seleccionada del Spinner
                String selectedOption = spinnerOptions.getSelectedItem().toString();

                // Formatear la fecha seleccionada en formato dd/MM/yyyy
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
                String selectedDate = sdf.format(selectedCalendar.getTime());

                // Mostrar un Toast con la opción seleccionada y la fecha seleccionada
                String toastMessage = "Opción seleccionada: " + selectedOption + "\nFecha seleccionada: " + selectedDate;
                Toast.makeText(getContext(), toastMessage, Toast.LENGTH_SHORT).show();
            }
        });

        return vistaChild;
    }
}




