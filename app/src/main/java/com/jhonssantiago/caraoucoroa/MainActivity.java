package com.jhonssantiago.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private RadioButton radioButtonCara, radioButtonCoroa;
    private Button buttonJogar;
    private String escolhido;
    private ImageButton imgCara, imgCoroa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        imgCara = findViewById(R.id.imgcara);
        imgCoroa = findViewById(R.id.imgcoroa);


        // radioButtonCoroa = findViewById(R.id.radiobuttonCoroa);
        // radioButtonCara = findViewById(R.id.radiobuttonCara);
       // buttonJogar = findViewById(R.id.buttonJogar);
       /* buttonJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), Result.class);
                int numRand = new Random().nextInt(2);
                it.putExtra("numRand", numRand);
                it.putExtra("escolhido", escolhido);
                startActivity(it);
            }
        }); */
        imgCara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), Result.class);
                int numRand = new Random().nextInt(2);
                escolhido = "CARA";
                it.putExtra("numRand", numRand);
                it.putExtra("escolhido", escolhido);
                startActivity(it);
            }
        });
        imgCoroa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), Result.class);
                int numRand = new Random().nextInt(2);
                escolhido = "COROA";
                it.putExtra("numRand", numRand);
                it.putExtra("escolhido", escolhido);
                startActivity(it);
            }
        });

    }

  /*  public void escolher(View view) {
        RadioButton rb = (RadioButton) view;
        boolean selecionado = rb.isChecked();
        if(view.getId() == R.id.radiobuttonCara){
           if(selecionado){
                Toast.makeText(getApplicationContext(),"CARA",Toast.LENGTH_SHORT).show();
                escolhido = "cara";
            }
        }
        if(view.getId() == R.id.radiobuttonCoroa) {
            if(selecionado){
                Toast.makeText(getApplicationContext(),"COROA",Toast.LENGTH_SHORT).show();
                escolhido = "coroa";
           }

        }

    }//escolher */
}