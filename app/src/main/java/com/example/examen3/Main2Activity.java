package com.example.examen3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
EditText Et1,Et2,Et3,Et4;
RadioButton Rb1,Rb2,Rb3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button Bt1 =(Button)findViewById(R.id.Bt1);
        Button Bt2 =(Button)findViewById(R.id.Bt2);
        Et1=(EditText)findViewById(R.id.Et1) ;
        Et2=(EditText)findViewById(R.id.Et2) ;
        Et3=(EditText)findViewById(R.id.Et3) ;
        Et4=(EditText)findViewById(R.id.Et4) ;
        Rb1=(RadioButton)findViewById(R.id.Rb1);
        Rb2=(RadioButton)findViewById(R.id.Rb1);
        Rb3=(RadioButton)findViewById(R.id.Rb1);

        Bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = Et1.getText().toString();
                String apellido = Et2.getText().toString();
                String contraseña = Et3.getText().toString();
                String usuario = Et4.getText().toString();
                if ("".equals(nombre) || "".equals(apellido) || "".equals(contraseña) || "".equals(usuario)) {
                    Toast.makeText(Main2Activity.this, "ningun campo debe quedar vacio", Toast.LENGTH_SHORT).show();
                } else {
                    if ((Rb1.isChecked() == true) && (Rb2.isChecked() == false) && (Rb3.isChecked() == false)) {

                    } else {
                        if ((Rb1.isChecked() == false) && (Rb2.isChecked() == true) && (Rb3.isChecked() == false)) {
                        } else {
                            if ((Rb1.isChecked() == false) && (Rb2.isChecked() == false) && (Rb3.isChecked() == true)) {

                            } else {
                                if ((Rb1.isChecked() == false) && (Rb2.isChecked() == false) && (Rb3.isChecked() == false)) {
                                    Toast.makeText(Main2Activity.this, "Elige la carrera", Toast.LENGTH_LONG).show();
                                } else {
                                    if ((Rb1.isChecked() == true) && (Rb2.isChecked() == true) && (Rb3.isChecked() == true)) {
                                        Toast.makeText(Main2Activity.this, "Seleccionaste dos campos Ing. Informatica e Ing. Administracion en Gestion Empresarial solo puedes uno, selecciona de nuevo", Toast.LENGTH_SHORT).show();
                                    } else {
                                        if ((Rb1.isChecked() == true) && (Rb2.isChecked() == false) && (Rb3.isChecked() == true)) {
                                            Toast.makeText(Main2Activity.this, "Seleccionaste dos campos Ing. Informatica e Ing. Civil solo puedes uno, selecciona de nuevo", Toast.LENGTH_SHORT).show();
                                        } else {
                                            if ((Rb1.isChecked() == false) && (Rb2.isChecked() == true) && (Rb3.isChecked() == true)) {
                                                Toast.makeText(Main2Activity.this, "Seleccionaste dos campos ng. Administracion en Gestion Empresarial e Ing. Civil solo puedes uno, selecciona de nuevo", Toast.LENGTH_SHORT).show();
                                            }
                                            Intent intent = new Intent(v.getContext(), MainActivity.class);
                                            startActivityForResult(intent, 0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        });
        Bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2= new Intent(v.getContext(),MainActivity.class);
                startActivityForResult(intent2,0);
            }
        });
    }
}
