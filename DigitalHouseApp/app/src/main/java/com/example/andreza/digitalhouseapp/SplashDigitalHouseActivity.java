package com.example.andreza.digitalhouseapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class SplashDigitalHouseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_digital_house);

//        aqui esta sendo definido o tempo de execucao do splash. 3000 milisegundos = 3 minutos
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                IrParaLogin();
            }
        }, 3000);
    }

    private void IrParaLogin() {
        Intent intent = new Intent( this, LoginActivity.class);
        startActivity(intent);
    }
}
