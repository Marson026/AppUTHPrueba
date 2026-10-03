package com.example.apputhprueba.Views;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.apputhprueba.R;


public class ActivityPersonas extends AppCompatActivity {
    //Variables de la base de datos llamadas el activity personas
    EditText nombres, apellidos, fechaNac, direccion, telefono, correo;
    Button btnagregar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_personas);
        //Iniciamos los controles
        InitControls();

    }

    private void InitControls()
    {
        nombres = (EditText) findViewById(R.id.nombres);
        apellidos = (EditText) findViewById(R.id.apellidos);
        fechaNac = (EditText) findViewById(R.id.fechaNac);
        direccion = (EditText) findViewById(R.id.direccion);
        telefono = (EditText) findViewById(R.id.telefono);
        correo = (EditText) findViewById(R.id.correo);
        btnagregar = (Button) findViewById(R.id.btnagregar);
    }
}
