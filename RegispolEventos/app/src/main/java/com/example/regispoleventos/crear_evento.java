package com.example.regispoleventos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class crear_evento extends AppCompatActivity {
    Button btnSalir, btnGuardar;
    EditText edtNombre, edtDescripcion, edtFecha, edtInicio, edtFin, edtRetraso, edtMinRetraso, edtSalida;
    ConnectivityManager connectivityManager;
    NetworkInfo networkInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_evento);
        btnGuardar = (Button) findViewById(R.id.btnGuardar);
        btnSalir = (Button) findViewById(R.id.btnSalir);
        edtNombre = (EditText) findViewById(R.id.edtNombre);
        edtDescripcion = (EditText) findViewById(R.id.edtDescripcion);
        edtFecha = (EditText) findViewById(R.id.edtFecha);
        edtInicio = (EditText) findViewById(R.id.edtInicio);
        edtFin = (EditText) findViewById(R.id.edtFin);
        edtRetraso = (EditText) findViewById(R.id.edtRetraso);
        edtMinRetraso = (EditText) findViewById(R.id.edtMinRetraso);
        edtSalida = (EditText) findViewById(R.id.edtSalida);
        connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        networkInfo = connectivityManager.getActiveNetworkInfo();

        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),menu_profesor.class));
            }
        });
    }

    public void guardar (View v){


        if ((edtNombre.getText().toString().isEmpty())||(edtFecha.getText().toString().isEmpty())||(edtInicio.getText().toString().isEmpty())||(edtRetraso.getText().toString().isEmpty())){
            Toast.makeText(this, "Por favor llene todos los campos obligatorios (*)",Toast.LENGTH_SHORT).show();
        }
        else if((Integer.parseInt(edtFin.getText().toString()))<(Integer.parseInt(edtInicio.getText().toString()))){
            Toast.makeText(this, "La hora final no puede ser menor a la de inicio", Toast.LENGTH_SHORT).show();
        }
        else if(networkInfo != null && networkInfo.isConnected()){
            
            Toast.makeText(this, "Formulario creado", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "No cuenta con conexion a INTERNET", Toast.LENGTH_SHORT).show();
        }



    }


}