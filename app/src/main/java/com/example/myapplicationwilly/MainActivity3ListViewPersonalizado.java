package com.example.myapplicationwilly;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.myapplicationwilly.Adaptadores.AdaptadorNoticias;
import com.example.myapplicationwilly.clases.Noticia;

public class MainActivity3ListViewPersonalizado extends AppCompatActivity {

    public Noticia[] noticias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity3_list_view_personalizado);

        noticias = new Noticia[]{
                        new Noticia("Noticia 1", "SubNoticia Contenido Contenido Contenido Contenido 1"),
                        new Noticia("Noticia 2", "SubNoticia Contenido Contenido Contenido Contenido 2"),
                        new Noticia("Noticia 3", "SubNoticia Contenido Contenido Contenido Contenido 3"),
                        new Noticia("Noticia 4", "SubNoticia Contenido Contenido Contenido Contenido 4"),
                        new Noticia("Noticia 4", "SubNoticia Contenido Contenido Contenido Contenido 5"),
                        new Noticia("Noticia 4", "SubNoticia Contenido Contenido Contenido Contenido 6")
        };
        //adaptador
        AdaptadorNoticias adaptadornoticias = new AdaptadorNoticias(this, noticias);

        //visto
        ListView lstOpciones = (ListView)findViewById(R.id.lstLista2);
        lstOpciones.setAdapter(adaptadornoticias);
    }
}