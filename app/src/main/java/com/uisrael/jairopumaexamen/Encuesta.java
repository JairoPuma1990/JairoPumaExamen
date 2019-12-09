package com.uisrael.jairopumaexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Encuesta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);
    }
    public  void  abrirAc(View v){

        Intent abrir_v2 = new Intent(  Encuesta.this, Resumen.class);

        startActivity(abrir_v2);
        Toast.makeText(getApplicationContext(),"oke Guardado exito ",Toast.LENGTH_LONG).show();

    }

}
