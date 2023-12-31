package com.example.myapplicationwilly.Adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.myapplicationwilly.R;
import com.example.myapplicationwilly.clases.Noticia;
//import com.example.myapplicationwilly.clases.Noticia;

public class AdaptadorNoticias {

    class AdaptadorNoticias extends ArrayAdapter<Noticia> {
        public AdaptadorNoticias(Context context, Noticia[] datos) {
            super(context, R.layout.lyitemnoticia, datos);
        }
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            View item = inflater.inflate(R.layout.lyitemnoticia, null);

            TextView lblTitulo = (TextView)item.findViewById(R.id.LblTitulo);
            lblTitulo.setText(getItem(position).getTitulo());
            TextView lblSubtitulo = (TextView)item.findViewById(R.id.LblSubTitulo);
            lblSubtitulo.setText(getItem(position).getSubtitulo());
            return(item);
        }
    }
}
