package com.cdp.segundaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtnombre, txtapellido, txtcorreo, txtedad;
    Button btnmostrar, btnsecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnombre = (EditText) findViewById(R.id.txtnombre);
        txtapellido = (EditText) findViewById(R.id.txtapellido);
        txtedad = (EditText) findViewById(R.id.txtedad);
        txtcorreo = (EditText) findViewById(R.id.txtcorreo);
        btnmostrar = (Button) findViewById(R.id.btnmostrar);
        btnsecond = (Button) findViewById(R.id.btnsecond);

        btnmostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Nombre y Apellido: " + txtnombre.getText().toString() +" "+ txtapellido.getText().toString(), Toast.LENGTH_LONG).show();
           }
        });

        btnsecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                intent.putExtra("nombre", txtnombre.getText().toString());
                intent.putExtra("apellidos", txtapellido.getText().toString());
                intent.putExtra("edad", txtedad.getText().toString());
                intent.putExtra("correo", txtcorreo.getText().toString());
                startActivity(intent);
             }
        });
    }
}