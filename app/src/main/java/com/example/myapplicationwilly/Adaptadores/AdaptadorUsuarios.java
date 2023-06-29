package com.example.myapplicationwilly.Adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.myapplicationwilly.R;
import com.example.myapplicationwilly.clases.Noticia;
//import com.example.myapplicationwilly.clases.Noticia;

public class AdaptadorUsuarios {

    class AdaptadorNoticias extends ArrayAdapter<Noticia> {
        public AdaptadorNoticias(Context context, Noticia[] datos) {
            super(context, R.layout.lyitemUsuario, datos);
        }
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            View item = inflater.inflate(R.layout.lyitemusuario, null);

            TextView lblNomres = (TextView)item.findViewById(R.id.lblNombre);
            lblNomres(getItem(position).getNombres());
            TextView lblEmail = (TextView)item.findViewById(R.id.lblEmail);
            lblEmail.setText(getItem(position).getEmail());
            TextView lblweb = (TextView)item.findViewById(R.id.lblweb);
            lblweb.setText(getItem(position).getWebsite());

            ImageView imageView = (ImageView)item.findViewById(R.id.imgUsr);
            Glide.with(this.getContext())
                    .load(getItem(position).getUrlavatar()).into(imageView);

            return(item);
        }
    }
}
