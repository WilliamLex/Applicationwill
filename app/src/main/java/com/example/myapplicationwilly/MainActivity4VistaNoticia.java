package com.example.myapplicationwilly;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity4VistaNoticia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity4_vista_noticia);


        Bundle b = this.getIntet().getExtras();
    }
}