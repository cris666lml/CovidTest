package com.example.covidtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Pregunta5Activity extends AppCompatActivity implements View.OnClickListener {                                                //Creado por Cris666lml

    ImageButton a,b;
    int resultado=0;
    Intent i ,rec;
    Bundle acumula;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta5);


        a = (ImageButton) findViewById(R.id.visto5);
        b = (ImageButton) findViewById(R.id.equis5);
        i = new Intent(Pregunta5Activity.this, Pregunta6Activity.class);

        try {

            rec = getIntent();
            acumula = rec.getExtras();
            resultado = acumula.getInt("resultado");
        }catch (Exception e){

            Toast.makeText(this,"No se recibieron datos", Toast.LENGTH_SHORT).show();

        }



        a.setOnClickListener(this);
        b.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.visto5:

                resultado+=1;
                startActivity(i);
                break;

            case R.id.equis5:

                resultado+=0;
                startActivity(i);

            default:
                break;



        }
        i.putExtra("resultado",resultado);

    }
}