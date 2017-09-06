package br.ufrn.eaj.tads.meuslivros;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout layout;
    private static final int OK = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = (ConstraintLayout) findViewById(R.id.layout);
    }

    public void cadastrar(View v) {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivityForResult(intent, OK);
    }

    public void listar(View v) {
        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK) {
            Snackbar snackbar = Snackbar.make((View) layout.getParent(), "Cadastrado com Sucesso", Snackbar.LENGTH_SHORT);
            snackbar.show();
        } else if (resultCode == RESULT_CANCELED) {
            Snackbar snackbar = Snackbar.make((View) layout.getParent(), "Cancelado", Snackbar.LENGTH_SHORT);
            snackbar.show();
        }
    }
}