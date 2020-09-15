package com.example.appintentsandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class TextActivity extends AppCompatActivity {

    EditText editMensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);

        editMensagem = findViewById(R.id.editTextoCompartilhado);

        Intent intent = getIntent();

        String mensagem = intent.getStringExtra(Intent.EXTRA_TEXT);

        editMensagem.setText(mensagem);
    }
}