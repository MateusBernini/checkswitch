package com.calculadora.checkeswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = (Button) findViewById(R.id.button);
        final Switch sw1 = (Switch) findViewById(R.id.sw1);
        final Switch sw2 = (Switch) findViewById(R.id.sw2);
        final Switch sw3 = (Switch) findViewById(R.id.sw3);
        final Switch sw4 = (Switch) findViewById(R.id.sw4);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                CheckBox cb1 = (CheckBox) findViewById(R.id.cb1);
                CheckBox cb2 = (CheckBox) findViewById(R.id.cb2);
                CheckBox cb3 = (CheckBox) findViewById(R.id.cb3);
                Switch sw1 = (Switch) findViewById(R.id.sw1);
                Switch sw2 = (Switch) findViewById(R.id.sw2);
                Switch sw3 = (Switch) findViewById(R.id.sw3);
                Switch sw4 = (Switch) findViewById(R.id.sw4);
                TextView nome = (TextView) findViewById(R.id.nome);

                Toast.makeText(getApplicationContext(),  "Seu nome: " + nome.getText() + "\nItem 1 selecionado:" + cb1.isChecked() +
                        "\nItem 2 selecionado:" + cb2.isChecked() + "\nItem 3 selecionado:" +
                        cb3.isChecked() + "\nAcionar1: " + sw1.isChecked() + "\nAcionar2: " + sw2.isChecked() + "\nAcionar3 " + sw3.isChecked() +"\nAcionar 4: " + sw4.isChecked() , Toast.LENGTH_LONG).show();

            }
        });


        sw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sw1.isChecked() == true) {
                    Toast.makeText(getApplicationContext(), sw1.getTextOn(), Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), sw1.getTextOff(), Toast.LENGTH_SHORT).show();

                }

            }
        });


        sw2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sw2.isChecked() == true) {
                    Toast.makeText(getApplicationContext(), sw2.getTextOn(), Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), sw2.getTextOff(), Toast.LENGTH_SHORT).show();

                }

            }
        });

        sw3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sw3.isChecked() == true) {
                    Toast.makeText(getApplicationContext(), sw3.getTextOn(), Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), sw3.getTextOff(), Toast.LENGTH_SHORT).show();

                }

            }
        });

        sw4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sw4.isChecked() == true) {
                    Toast.makeText(getApplicationContext(), sw4.getTextOn(), Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), sw4.getTextOff(), Toast.LENGTH_SHORT).show();

                }

            }
        });


    }

}


