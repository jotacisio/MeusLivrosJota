package br.ufrn.eaj.tads.meuslivros;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Aluno on 13/09/2017.
 */

public class ViewHolder {
    final TextView textViewTitulo;
    final TextView textViewAutor;
    final ImageView img;

    public ViewHolder (View v){
        textViewTitulo = (TextView) v.findViewById(R.id.titulo);
        textViewAutor= (TextView) v.findViewById(R.id.autor);
        img = (ImageView) v.findViewById(R.id.img);
    }
}
