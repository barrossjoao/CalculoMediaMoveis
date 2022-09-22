package com.example.calculomedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void botaoCalcularOnClick (View v){

        EditText n1, n2;

        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);

        String n1_str = n1.getText().toString();
        String n2_str = n2.getText().toString();

        Intent telaResultado = new Intent(this, resultado.class);
        telaResultado.putExtra("n1", Double.parseDouble(n1_str));
        telaResultado.putExtra("n2", Double.parseDouble(n2_str));

        startActivity(telaResultado);
    }
}