package com.example.exa_3er_valpuesta_ap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity { //Inicia clase

    public EditText etPasswordYV;
    public Button btnEntrarYV;

    @Override
    protected void onCreate(Bundle savedInstanceState) { //Inicia metodo Oncreate
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Integracion de XML a JAVA
        etPasswordYV = findViewById(R.id.etPasswordYV);
        btnEntrarYV = findViewById(R.id.btnEntrarYV);

        btnEntrarYV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etPasswordYV.getText().toString().equals("uacm123")) { //Si es la correcta entra
                    Intent intent1 = new Intent(view.getContext(), ListaSalarios.class);
                    startActivityForResult(intent1,0);
                } else { //Condicion falsa
                    Toast.makeText(Login.this,"Contraseña incorrectos\nVerifica!!",Toast.LENGTH_LONG).show();
                }
            }
        });

    } //Termina metodo Oncreate
} //Termina clase