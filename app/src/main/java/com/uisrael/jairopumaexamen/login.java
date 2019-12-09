package com.uisrael.jairopumaexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    EditText user,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        user = findViewById(R.id.inputsuario);
        pass = findViewById(R.id.inputpassword);
    }
    public void ingreso (View v){
        String name;
        String contra;
        name = user.getText().toString();
        contra = pass.getText().toString();


        if (name.equals("jpuma")&&contra.equals("123")){
            Intent abrir_v2 = new Intent(  login.this, registro.class);
            abrir_v2.putExtra("DATOSENVIADOS", user.getText().toString());
            startActivity(abrir_v2);
            Toast.makeText(getApplicationContext(),"oke ingreso "+name+"",Toast.LENGTH_LONG).show();


        }else{
            Toast.makeText(getApplicationContext(),"USUARIO INVALIDO ",Toast.LENGTH_LONG).show();
        }

    }
}
