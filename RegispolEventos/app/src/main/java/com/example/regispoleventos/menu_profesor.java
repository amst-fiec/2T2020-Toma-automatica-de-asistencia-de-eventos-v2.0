package com.example.regispoleventos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menu_profesor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_profesor);
    }
    public void crearEvento(View v){
        Intent crear_evento = new Intent(getBaseContext(), crear_evento.class);
        startActivity(crear_evento);
    }

    public void salir(View v){
        Intent menu_principal = new Intent(getBaseContext(), menu_principal.class);
        startActivity(menu_principal);
    }
}