package com.uisrael.jairopumaexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class registro extends AppCompatActivity {
    EditText recibir,nombre;
    Bundle datos;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        recibir = findViewById(R.id.usuario);
        datos = getIntent().getExtras();
        String datoRecibido = datos.getString("DATOSENVIADOS");
        recibir.setText(datoRecibido);
        nombre = findViewById(R.id.inputnombre);

    }
    public  void  abrirAc(View v){

        Intent abrir_v2 = new Intent(  registro.this, Encuesta.class);
        abrir_v2.putExtra("DATOSENVIADOS", recibir.getText().toString());
        abrir_v2.putExtra("DATOSENVIADOS1", nombre.getText().toString());
        startActivity(abrir_v2);
        Toast.makeText(getApplicationContext(),"oke Guardado exito ",Toast.LENGTH_LONG).show();

    }

}
