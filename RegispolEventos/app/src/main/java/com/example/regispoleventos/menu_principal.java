package com.example.regispoleventos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menu_principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
    }

    public void menuProfesor(View v){
        Intent red_sensores = new Intent(getBaseContext(), menu_profesor.class);
        startActivity(red_sensores);
    }

    public void menuAsistente(View v){
        Intent red_sensores = new Intent(getBaseContext(), menu_asistente.class);
        startActivity(red_sensores);
    }
}