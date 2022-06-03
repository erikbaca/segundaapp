package com.cdp.segundaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    EditText txtresultado, txtapellido2, txtedad2, txtcorreo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtresultado = (EditText) findViewById(R.id.txtresultado);
        txtapellido2 = (EditText) findViewById(R.id.txtapellido2);
        txtedad2 = (EditText) findViewById(R.id.txtedad2);
        txtcorreo2 = (EditText) findViewById((R.id.txtcorreo2));


        txtresultado.setText(getIntent().getExtras().getString("nombre"));
        txtapellido2.setText(getIntent().getExtras().getString("apellidos"));
        txtedad2.setText(getIntent().getExtras().getString("edad"));
        txtcorreo2.setText(getIntent().getExtras().getString("correo"));

    }
}