package com.example.exapracamst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText buscar;
    Button BuscarHeroes;
    private String token = "3472655306131570";
    private String url = "https://www.superheroapi.com/api.php/3472655306131570/search/";
    //private Map<String, TextView> temperaturasTVs;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buscar= (EditText)findViewById(R.id.busqueda);

    }

    //funcion que Permita encontrar buscar todos los héroes que coincidan con el criterio de búsqueda
    public void buscarHeroes(){
        String superHeroeB = buscar.getText().toString();
        String url_registros = "https://www.superheroapi.com/api.php/3472655306131570/search/" + superHeroeB;
        

    }






}