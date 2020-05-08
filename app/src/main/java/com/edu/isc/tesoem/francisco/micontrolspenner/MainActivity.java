package com.edu.isc.tesoem.francisco.micontrolspenner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String[] strEstados;
    List<String> listEstados;
    ArrayAdapter<String> Adaptador;
    Spinner ContenedorEstados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ContenedorEstados = findViewById(R.id.spinnerEstados);


        strEstados = new String[] {"Baja california sur", "Bjacalifornia norte", "Aguascalientes", "Durango", "Chaiapas", "Oaxaca"};
        listEstados = new ArrayList<String>();
        Collections.addAll(listEstados,strEstados);
        Adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, listEstados);
        ContenedorEstados.setAdapter(Adaptador);

        ContenedorEstados.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String texto = ContenedorEstados.getSelectedItem().toString();
        Toast.makeText(this,"valor seleccionado" + texto,Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
