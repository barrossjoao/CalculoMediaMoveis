package com.example.calculomedia;

import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class resultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        Intent telaNumero = getIntent();

        Double n1 = telaNumero.getDoubleExtra("n1", 0);
        Double n2 = telaNumero.getDoubleExtra("n2", 0);

        Double media = (n1+n2)/2;

        TextView textResultado = (TextView) findViewById(R.id.textResultado);
        TextView textView = (TextView) findViewById(R.id.textView);

        textResultado.setText(Double.toString(media));

        if(media >= 7){
            textView.setText("Valor acima da Média");
            textView.setTextColor(Color.parseColor("#32CD32"));
        }
        else{
                textView.setText("Valor abaixo da Média");
                textView.setTextColor(Color.parseColor("#FF0000"));
            }
    }

    public void botaoVoltarOnClick (View v){
        Intent telaPrincipal = new Intent(this, MainActivity.class);
        startActivity(telaPrincipal);
    }
}
