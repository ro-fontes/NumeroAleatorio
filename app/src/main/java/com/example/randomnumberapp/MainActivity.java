package com.example.randomnumberapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void rodar(View view){

        TextView TextoGerado = findViewById(R.id.numerogerado);

        int NumeroGerado = new Random().nextInt(11);

        TextoGerado.setText("Numero: " + NumeroGerado);
    }

}