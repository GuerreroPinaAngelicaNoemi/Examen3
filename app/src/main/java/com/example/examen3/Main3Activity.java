package com.example.examen3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    RadioButton RB1,RB2;
    CheckBox CHK1,CHK2,CHK3,CHK4,CHK5;
    Button B1,B2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        RB1=(RadioButton) findViewById(R.id.RB1);
        RB2=(RadioButton) findViewById(R.id.RB2);
        CHK1=(CheckBox) findViewById(R.id.CHK1);
        CHK2=(CheckBox) findViewById(R.id.CHK2);
        CHK3=(CheckBox) findViewById(R.id.CHK3);
        CHK4=(CheckBox) findViewById(R.id.CHK4);
        CHK5=(CheckBox) findViewById(R.id.CHK5);

        B1=(Button)findViewById(R.id.B1);
        B2=(Button)findViewById(R.id.B2);
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);
            }
        });
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((RB1.isChecked() == false) && (RB2.isChecked() == true)) {
                } else {
                    if ((RB1.isChecked() == true) && (RB2.isChecked() == true)) {
                        Toast.makeText(Main3Activity.this, "Has seleccionado dos campos en periodo:2019 y 2018, por favor selecciona de nuevo", Toast.LENGTH_LONG).show();
                    } else {
                        if ((RB1.isChecked() == false) && (RB2.isChecked() == false)) {

                            Toast.makeText(Main3Activity.this, "No has seleccionado ningun campo de periodo", Toast.LENGTH_LONG).show();

                        }
                        if ((CHK1.isChecked() == false) && (CHK2.isChecked() == false) && (CHK3.isChecked() == false) && (CHK4.isChecked() == false) && (CHK5.isChecked() == false)) {
                            Toast.makeText(Main3Activity.this, "Seleccione alguna materia", Toast.LENGTH_SHORT).show();
                        } else {
                            Intent intent = new Intent(v.getContext(), Main4Activity.class);
                            startActivityForResult(intent, 0);
                        }
                    }
                }
            }
        });
    }
}
