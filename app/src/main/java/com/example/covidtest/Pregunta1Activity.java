package com.example.covidtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Pregunta1Activity extends AppCompatActivity implements View.OnClickListener {

    ImageButton a,b;
    int resultado=0;
    Intent i;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_pregunta1);

        a=(ImageButton) findViewById(R.id.visto1);
        b=(ImageButton) findViewById(R.id.equis1);
        i=new Intent(Pregunta1Activity.this,Pregunta2Activity.class);
        a.setOnClickListener(this);
        b.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.visto1:

                resultado=1;
                startActivity(i);
                break;

            case R.id.equis1:

                resultado=0;
                startActivity(i);

            default:
                break;



        }
        i.putExtra("resultado",resultado);
    }
}