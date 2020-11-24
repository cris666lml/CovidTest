package com.example.covidtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Resultctivity extends AppCompatActivity {

    Intent i,rec;
    Bundle acumula;
    int resultado=0;
    TextView re;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultctivity);

        re=(TextView)findViewById(R.id.re);

        try{

            rec=getIntent();
            acumula=rec.getExtras();
            resultado=acumula.getInt("resultado");
            re.setText("resultado:"+resultado);


        }catch (Exception e) {

            Toast.makeText(this, "No se recibieron datos", Toast.LENGTH_SHORT).show();

        }
    }


}