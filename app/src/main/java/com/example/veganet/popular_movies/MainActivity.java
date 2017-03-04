package com.example.veganet.popular_movies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ListView;

import com.example.veganet.adapters.CarAdapter;
import com.example.veganet.models.Carro;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    /*
    private String[] data = new String[]{
        "Item1", "Item2", "Item3"
    };
    */

    private ArrayList<Carro> carros = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carros.add(new Carro(R.drawable.carros1,"Titulo 1", "Descripcion1"));
        carros.add(new Carro(R.drawable.carros2,"Titulo 2", "Descripcion2"));
        carros.add(new Carro(R.drawable.carros3,"Titulo 3", "Descripcion3"));
        carros.add(new Carro(R.drawable.carros4,"Titulo 4", "Descripcion4"));
        carros.add(new Carro(R.drawable.carros5,"Titulo 5", "Descripcion5"));

        carros.add(new Carro(R.drawable.carros1,"Titulo 1", "Descripcion1"));
        carros.add(new Carro(R.drawable.carros2,"Titulo 2", "Descripcion2"));
        carros.add(new Carro(R.drawable.carros3,"Titulo 3", "Descripcion3"));
        carros.add(new Carro(R.drawable.carros4,"Titulo 4", "Descripcion4"));

        carros.add(new Carro(R.drawable.carros1,"Titulo 1", "Descripcion1"));
        carros.add(new Carro(R.drawable.carros2,"Titulo 2", "Descripcion2"));
        carros.add(new Carro(R.drawable.carros3,"Titulo 3", "Descripcion3"));
        carros.add(new Carro(R.drawable.carros4,"Titulo 4", "Descripcion4"));

        carros.add(new Carro(R.drawable.carros1,"Titulo 1", "Descripcion1"));
        carros.add(new Carro(R.drawable.carros2,"Titulo 2", "Descripcion2"));
        carros.add(new Carro(R.drawable.carros3,"Titulo 3", "Descripcion3"));
        carros.add(new Carro(R.drawable.carros4,"Titulo 4", "Descripcion4"));

        carros.add(new Carro(R.drawable.carros1,"Titulo 1", "Descripcion1"));
        carros.add(new Carro(R.drawable.carros2,"Titulo 2", "Descripcion2"));
        carros.add(new Carro(R.drawable.carros3,"Titulo 3", "Descripcion3"));
        carros.add(new Carro(R.drawable.carros4,"Titulo 4", "Descripcion4"));

        CarAdapter adapter = new CarAdapter(this, carros);
        RecyclerView lista = (RecyclerView) findViewById(R.id.listaDatos);
        lista.setLayoutManager(new GridLayoutManager(this, 2));
        lista.setHasFixedSize(true);
        lista.setAdapter(adapter);

        /*

        ArrayAdapter<String> adapter= new Array Adapter<String>(this,
             android.R.layout.simple_list_item_1, data);

               ListView lista = (ListView)findViewById(R.id.LstOpciones);
               lstOpciones.setAdapter(adaptador);

         */

        Log.d("MainActivity", "Estoy en OnCreate();");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity", "Estoy en OnStart();");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity", "Estoy en OnStop();");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity", "Estoy en OnDestroy();");
        finish();
    }
}