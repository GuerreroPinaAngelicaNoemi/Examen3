package com.example.examen3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {
Switch s1,s2,s3,s4,s5;
Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        s1=(Switch)findViewById(R.id.s1);
        s2=(Switch)findViewById(R.id.s2);
        s3=(Switch)findViewById(R.id.s3);
        s4=(Switch)findViewById(R.id.s4);
        s5=(Switch)findViewById(R.id.s5);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((s1.isChecked() == false) && (s2.isChecked() == false) && (s3.isChecked() == false) && (s4.isChecked() == false) && (s5.isChecked() == false)) {
                    Toast.makeText(Main4Activity.this, "Seleccione alguna materia", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(v.getContext(), Main5Activity.class);
                    startActivityForResult(intent, 0);
                }
            }
        });
    }
}
