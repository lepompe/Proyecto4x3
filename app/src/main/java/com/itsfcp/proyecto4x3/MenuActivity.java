package com.itsfcp.proyecto4x3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {
    Button btnFondo;
    Button btnTexto;
    private TextView mostrarPorcentaje;
    private SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        btnFondo = findViewById(R.id.btnFondo);
        btnTexto = findViewById(R.id.btnFondoText);
        mostrarPorcentaje = (TextView)findViewById(R.id.txtCargar);
        seekBar = (SeekBar)findViewById(R.id.seekBarFondo);
        cambios();
        seekBar.setProgress(0);
        seekBar.setMax(100);

        seekBar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    //hace un llamado a la perilla cuando se arrastra
                    @Override
                    public void onProgressChanged(SeekBar seekBar,
                                                  int progress, boolean fromUser) {
                        mostrarPorcentaje.setText(String.valueOf(progress)+" %");
                    }
                    //hace un llamado  cuando se toca la perilla
                    public void onStartTrackingTouch(SeekBar seekBar) {
                    }
                    //hace un llamado  cuando se detiene la perilla
                    public void onStopTrackingTouch(SeekBar seekBar) {
                    }
                });

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
