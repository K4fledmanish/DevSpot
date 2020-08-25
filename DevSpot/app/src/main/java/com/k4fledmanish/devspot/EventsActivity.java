package com.k4fledmanish.devspot;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class EventsActivity extends AppCompatActivity {


    List<Event> lstEvent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);



        lstEvent = new ArrayList<>();
        lstEvent.add(new Event("Event 1","category","This is Event 1. En este inserto encontrará:\n" +
                "1. ¿Qué es Loprem® y para qué se utiliza?\n" +
                "2. Antes de tomar Loprem®\n" +
                "3. ¿Cómo tomar Loprem®?\n" +
                "4. Posibles efectos secundarios\n" +
                "5. ¿Cómo guardar Loprem®?\n" +
                "6. Información adicional",R.drawable.themartian));


        lstEvent.add(new Event("Event 2","category","En este inserto encontrará:\n" +
                "1. ¿Qué es Loprem® y para qué se utiliza?\n" +
                "2. Antes de tomar Loprem®\n" +
                "3. ¿Cómo tomar Loprem®?\n" +
                "4. Posibles efectos secundarios\n" +
                "5. ¿Cómo guardar Loprem®?\n" +
                "6. Información adicional",R.drawable.thevigitarian));


        lstEvent.add(new Event("Event 3","category","En este inserto encontrará:\n" +
                "1. ¿Qué es Loprem® y para qué se utiliza?\n" +
                "2. Antes de tomar Loprem®\n" +
                "3. ¿Cómo tomar Loprem®?\n" +
                "4. Posibles efectos secundarios\n" +
                "5. ¿Cómo guardar Loprem®?\n" +
                "6. Información adicional",R.drawable.thewildrobot));


        lstEvent.add(new Event("Event 4","category","En este inserto encontrará:\n" +
                "1. ¿Qué es Loprem® y para qué se utiliza?\n" +
                "2. Antes de tomar Loprem®\n" +
                "3. ¿Cómo tomar Loprem®?\n" +
                "4. Posibles efectos secundarios\n" +
                "5. ¿Cómo guardar Loprem®?\n" +
                "6. Información adicional",R.drawable.hediedwith));


        lstEvent.add(new Event("Event 5","category","En este inserto encontrará:\n" +
                "1. ¿Qué es Loprem® y para qué se utiliza?\n" +
                "2. Antes de tomar Loprem®\n" +
                "3. ¿Cómo tomar Loprem®?\n" +
                "4. Posibles efectos secundarios\n" +
                "5. ¿Cómo guardar Loprem®?\n" +
                "6. Información adicional",R.drawable.themartian));



        lstEvent.add(new Event("Event 6","category","En este inserto encontrará:\n" +
                "1. ¿Qué es Loprem® y para qué se utiliza?\n" +
                "2. Antes de tomar Loprem®\n" +
                "3. ¿Cómo tomar Loprem®?\n" +
                "4. Posibles efectos secundarios\n" +
                "5. ¿Cómo guardar Loprem®?\n" +
                "6. Información adicional",R.drawable.themartian));

        lstEvent.add(new Event("Event 7","category","En este inserto encontrará:\n" +
                "1. ¿Qué es Loprem® y para qué se utiliza?\n" +
                "2. Antes de tomar Loprem®\n" +
                "3. ¿Cómo tomar Loprem®?\n" +
                "4. Posibles efectos secundarios\n" +
                "5. ¿Cómo guardar Loprem®?\n" +
                "6. Información adicional",R.drawable.themartian));



        lstEvent.add(new Event("Event 8","category","En este inserto encontrará:\n" +
                "1. ¿Qué es Loprem® y para qué se utiliza?\n" +
                "2. Antes de tomar Loprem®\n" +
                "3. ¿Cómo tomar Loprem®?\n" +
                "4. Posibles efectos secundarios\n" +
                "5. ¿Cómo guardar Loprem®?\n" +
                "6. Información adicional",R.drawable.themartian));

        lstEvent.add(new Event("Event 9","category","En este inserto encontrará:\n" +
                "1. ¿Qué es Loprem® y para qué se utiliza?\n" +
                "2. Antes de tomar Loprem®\n" +
                "3. ¿Cómo tomar Loprem®?\n" +
                "4. Posibles efectos secundarios\n" +
                "5. ¿Cómo guardar Loprem®?\n" +
                "6. Información adicional",R.drawable.themartian));



        lstEvent.add(new Event("Event 10","category","En este inserto encontrará:\n" +
                "1. ¿Qué es Loprem® y para qué se utiliza?\n" +
                "2. Antes de tomar Loprem®\n" +
                "3. ¿Cómo tomar Loprem®?\n" +
                "4. Posibles efectos secundarios\n" +
                "5. ¿Cómo guardar Loprem®?\n" +
                "6. Información adicional",R.drawable.themartian));



        lstEvent.add(new Event("Event 11","category","En este inserto encontrará:\n" +
                "1. ¿Qué es Loprem® y para qué se utiliza?\n" +
                "2. Antes de tomar Loprem®\n" +
                "3. ¿Cómo tomar Loprem®?\n" +
                "4. Posibles efectos secundarios\n" +
                "5. ¿Cómo guardar Loprem®?\n" +
                "6. Información adicional",R.drawable.themartian));

        lstEvent.add(new Event("Event 12","category","En este inserto encontrará:\n" +
                "1. ¿Qué es Loprem® y para qué se utiliza?\n" +
                "2. Antes de tomar Loprem®\n" +
                "3. ¿Cómo tomar Loprem®?\n" +
                "4. Posibles efectos secundarios\n" +
                "5. ¿Cómo guardar Loprem®?\n" +
                "6. Información adicional",R.drawable.themartian));


        lstEvent.add(new Event("Event 13","category","En este inserto encontrará:\n" +
                "1. ¿Qué es Loprem® y para qué se utiliza?\n" +
                "2. Antes de tomar Loprem®\n" +
                "3. ¿Cómo tomar Loprem®?\n" +
                "4. Posibles efectos secundarios\n" +
                "5. ¿Cómo guardar Loprem®?\n" +
                "6. Información adicional",R.drawable.themartian));


        lstEvent.add(new Event("Event 14","category","En este inserto encontrará:\n" +
                "1. ¿Qué es Loprem® y para qué se utiliza?\n" +
                "2. Antes de tomar Loprem®\n" +
                "3. ¿Cómo tomar Loprem®?\n" +
                "4. Posibles efectos secundarios\n" +
                "5. ¿Cómo guardar Loprem®?\n" +
                "6. Información adicional",R.drawable.themartian));


        RecyclerView myrvv = (RecyclerView) findViewById(R.id.recyclerview_event_id);
        RecyclerViewAdapterForEvents myAdapter = new RecyclerViewAdapterForEvents(this,lstEvent);
        myrvv.setLayoutManager(new GridLayoutManager(this,3));

        myrvv.setAdapter(myAdapter);

    }
}
