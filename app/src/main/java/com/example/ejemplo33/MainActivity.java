package com.example.ejemplo33;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView miRecicler;
    private RecyclerView.Adapter miAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Buscamos el control para cargar los datos
        miRecicler = (RecyclerView) findViewById(R.id.RV1);

        // Añadimos que el tamaño del RecyclerView no se cambiará.
// que tiene hijos (items) que tienen anchura y altura fijas. Permite // que el RecyclerView optimice mejor

        miRecicler.setHasFixedSize(true);

        miRecicler.setLayoutManager(new LinearLayoutManager(this));
        //Especificamos el adaptador con la lista a visualizar
        miAdapter = new Adaptador(DatosClientes());
        miRecicler.setAdapter(miAdapter);

    }
    public List<Clientes> DatosClientes() {

        List<Clientes> Lista = new ArrayList<>();
        Lista.add(new Clientes("Rey"));
        Lista.add(new Clientes("Gil"));
        Lista.add(new Clientes("Alonso"));
        Lista.add(new Clientes("Tovar"));
        Lista.add(new Clientes("Cerezo"));
        Lista.add(new Clientes("Arroyo"));
        Lista.add(new Clientes("Sala"));
        Lista.add(new Clientes("Martín"));
        Lista.add(new Clientes("Jimeno"));
        Lista.add(new Clientes("Muñoz"));
        Lista.add(new Clientes("Negro"));
        Lista.add(new Clientes("Fernández"));
        return Lista;
    }

}
