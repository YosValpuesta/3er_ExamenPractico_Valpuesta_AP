package com.example.exa_3er_valpuesta_ap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ListaSalarios extends AppCompatActivity { //Inicia clase

    public TextView tvListaSalariosYV;
    public ListView lvSalariosYV;

    //Arreglo para lista de puestos
    public String puestos [] = {"Ingeniero de software", "Gerente de cuentas", "Analista de Negocios", "Ingeniero de red", "SEncargado base de datos", "Gerente de producto"};

    //Arreglo para imprimir salarios
    public String salario [] = {"$9,800", "$6,000", "$9,000", "$9,400", "$10,500", "$12,400"};

    @Override
    protected void onCreate(Bundle savedInstanceState) { //Inicia metodo Oncreate
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_salarios);

        //Integrar elementos de XML a JAVA
        tvListaSalariosYV = findViewById(R.id.tvListaSalariosYV);
        lvSalariosYV = (ListView)findViewById(R.id.lvSalariosYV);

        //Definicion de un adapter para lista de puestos
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, puestos);

        //Integra informacion de puestos
        lvSalariosYV.setAdapter(adapter);

        //Programar evento clic para seleccionar un puesto y se imprima salario
        lvSalariosYV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                tvListaSalariosYV.setText("Salario mensual: "+salario[position]);
            }
        });

    } //Termina metodo Oncreate
} //Termina clase