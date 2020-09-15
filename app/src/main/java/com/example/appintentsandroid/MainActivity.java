package com.example.appintentsandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editNome, editMensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNome = findViewById(R.id.editNome);
        editMensagem = findViewById(R.id.editMensagem);
    }

    public void abrirNovaTela(View view) {
        String nome = editNome.getText().toString();
        int valor = 15;

        Intent novatela = new Intent(MainActivity.this,NovaActivity.class);
        novatela.putExtra("NOME",nome);
        novatela.putExtra("IDADE",valor);
        startActivity(novatela);
    }

    public void compartilharMensagem(View view) {
        String mensagem = editMensagem.getText().toString();

        Intent shareMessage = new Intent();
        shareMessage.setAction(Intent.ACTION_SEND);
        shareMessage.putExtra(Intent.EXTRA_TEXT,mensagem);
        shareMessage.setType("text/plain");

        if(shareMessage.resolveActivity(getPackageManager()) != null){
            startActivity(shareMessage);
        }
    }

    public void criarAlarme(View view) {
        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM);
        intent.putExtra(AlarmClock.EXTRA_MESSAGE,"Alarme de teste da Opet");
        intent.putExtra(AlarmClock.EXTRA_HOUR,11);
        intent.putExtra(AlarmClock.EXTRA_MINUTES,15);

        if(intent.resolveActivity(getPackageManager()) != null){
            startActivity(intent);
        }
    }
}