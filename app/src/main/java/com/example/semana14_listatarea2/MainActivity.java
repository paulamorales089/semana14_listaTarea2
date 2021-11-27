package com.example.semana14_listatarea2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    FirebaseDatabase db;

    EditText userName;
    Button ingresarBoton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = FirebaseDatabase.getInstance();

        userName = findViewById(R.id.userName_editText);
        ingresarBoton = findViewById(R.id.ingresar_button);

    }
    public void registrar ()
    {
        DatabaseReference ref = db.getReference("usuarios/");
        DatabaseReference usuarioNuevo = ref.push();

        usuario nuevoUsuario = new usuario(userName.getText().toString(), usuarioNuevo.getKey());
        usuarioNuevo.setValue(nuevoUsuario);

    }


}