package com.jhonssantiago.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Result extends AppCompatActivity {
    private ImageView imageResultado;
    private TextView textEscolhido, textResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        imageResultado = findViewById(R.id.imageResult);
        textEscolhido = findViewById(R.id.textEscolhido);
        textResultado = findViewById(R.id.textResultado);

        Bundle dados = getIntent().getExtras();
        int numRecuperado = dados.getInt("numRand");
        String escolhido = dados.getString("escolhido");

        textEscolhido.setText("Você escolheu: "+ escolhido);

        if(numRecuperado==0){
            imageResultado.setImageResource(R.drawable.cara);
            textResultado.setText("Saiu CARA");
        }else{
            imageResultado.setImageResource(R.drawable.coroa);
            textResultado.setText("Saiu CAROA");
        }

    }
}