package br.ufrn.eaj.tads.meuslivros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RatingBar;

public class Main2Activity extends AppCompatActivity {
    EditText titulo;
    EditText autor;
    EditText ano;
    RatingBar nota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        titulo=(EditText) findViewById(R.id.titulo);
        autor=(EditText) findViewById(R.id.autor);
        ano=(EditText) findViewById(R.id.ano);
        nota=(RatingBar) findViewById(R.id.nota);
    }

    public void salvar(View v){
        Intent i = new Intent();
        BancoHelper db = new BancoHelper(this);
        Livro livro = new Livro(titulo.getText().toString(),
                autor.getText().toString(),
                ano.getText().toString(),
                nota.getRating());
        db.save(livro);
        setResult(RESULT_OK, i);
        finish();
    }

    public void cancelar(View v){
        setResult(RESULT_CANCELED);
        finish();
    }
}