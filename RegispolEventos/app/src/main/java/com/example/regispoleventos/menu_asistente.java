package com.example.regispoleventos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menu_asistente extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_asistente);
    }

    public void listaEventos(View v){
        Intent red_sensores = new Intent(getBaseContext(), lista_eventos.class);
        startActivity(red_sensores);
    }

    public void salir(View v){
        Intent menu_principal = new Intent(getBaseContext(), menu_principal.class);
        startActivity(menu_principal);
    }
}