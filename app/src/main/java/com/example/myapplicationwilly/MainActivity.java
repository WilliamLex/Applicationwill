package com.example.myapplicationwilly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.myapplicationwilly.clases.Noticia;

import Interface.iListaAlumnos;

public class MainActivity extends AppCompatActivity  implements AdapterView.OnItemClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] datos = new
                String[]{"CASA Morante","WILLIAM","cONTREAS","jhon","denis"};

            ArrayAdapter<String> adaptador =
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_spinner_item, datos);

                ListView lstOpciones = (ListView)findViewById(R.id.lstOpciones);
                lstOpciones.setAdapter(adaptador);
                lstOpciones.setOnItemClickListener(new iListaAlumnos(this.getApplicationContext()));


    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this, "seleccionando al alumn" + adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).SHOW();

        View header = getLayoutInflater().inflate(R.layout.lyheader, null);
                lstOpciones.addHeaderView(header);

                lstopciones.serAdapter(adaptadornoticias);
                lstOpciones.setOnitemClickListener(
                        new iListaAlumnos(this.getApplicationContext())):




    }

    public void onItemClick(AdapterView<?> a, View v, int position, long id) {
        Intent intent = new Intent(ViewNews.this, verNoticia.class);
        Bundle b = new Bundle();
        Noticia noticia=(Noticia)adapterView.getItemAtPosition(i);
        b.putString("Titulo",noticia.getTitulo());
        b.putString("subtitulo",noticia.getsubtitulo());
        intent.putExtras(b);
        startActivity(intent);
    }

}