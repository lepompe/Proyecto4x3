package com.itsfcp.proyecto4x3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {
    Button btnFondo;
    Button btnTexto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        btnFondo = findViewById(R.id.btnFondo);
        btnTexto = findViewById(R.id.btnFondoText);
        cambios();
    }

    private void cambios(){
        btnFondo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fondo = new Intent(MenuActivity.this, CambiosActivity.class);
                startActivity(fondo);
            }
        });

        btnTexto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent texto = new Intent(MenuActivity.this, TextCambiosActivity.class);
                startActivity(texto);
            }
        });

    }
}
