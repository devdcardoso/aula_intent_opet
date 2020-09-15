package com.example.appintentsandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NovaActivity extends AppCompatActivity {

    TextView textWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nova);

        textWelcome = findViewById(R.id.textWelcome);

        Intent novatela = getIntent();
        String nome = novatela.getStringExtra("NOME");
        int idade = novatela.getIntExtra("IDADE",0);

        String data = "Bem-vindo, " + nome + "\n" + "Idade: " + idade;

        textWelcome.setText(data);
    }
}