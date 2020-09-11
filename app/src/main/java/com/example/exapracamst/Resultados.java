package com.example.exapracamst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.exapracamst.Objetos.Heroe;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

public class Resultados extends AppCompatActivity {
    private Map<String, Heroe> heroesMapa;
    private ArrayList<Heroe> heroesArray;
    private LinearLayout ln;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);
        Intent i = getIntent();
        heroesMapa = (Map<String, Heroe>) i.getSerializableExtra("heroes");
        heroesArray = (ArrayList<Heroe>) i.getSerializableExtra("heroeArray");
        ln = findViewById(R.id.lista_resultados);
        mostrarHeroes();

    }

    public void mostrarHeroes(){
        for (Heroe h: heroesArray
             ) {
            TextView tx = new TextView(getApplicationContext());
            tx.setText(h.getName().toString());
            ln.addView(tx);
        }
    }


}