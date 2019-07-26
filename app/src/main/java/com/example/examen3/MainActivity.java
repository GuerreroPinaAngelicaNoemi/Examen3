package com.example.examen3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 =(Button)findViewById(R.id.b1);
        Button b2 =(Button)findViewById(R.id.b2);
        et1=(EditText)findViewById(R.id.et1) ;
        et2=(EditText)findViewById(R.id.et2) ;

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario, contraseña;
                usuario = et1.getText().toString();
                contraseña = et2.getText().toString();
                if (validar()) {
                    if ("".equals(usuario) || "".equals(contraseña)) {
                        Toast.makeText(MainActivity.this, "Ningun campo debe estar vacio", Toast.LENGTH_LONG).show();
                    }
                    Toast.makeText(MainActivity.this, "Ingresando", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(v.getContext(), Main3Activity.class);
                    startActivityForResult(intent, 0);
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(v.getContext(), Main2Activity.class);
                startActivityForResult(intent1, 0);
            }
        });
    }
    public boolean validar(){
        boolean retorno =true;
        String usuario=et1.getText().toString();
        String Contraseña=et2.getText().toString();
        if(usuario.isEmpty()){
            et1.setError("El campo usuario no debe quedar vacio");
            retorno=false;
        }
        if(Contraseña.isEmpty()){
            et2.setError("El campo contraseña no debe quedar vacio");
            retorno=false;
        }
        return retorno;
    }
}
