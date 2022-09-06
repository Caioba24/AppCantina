package com.example.appcantina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView qtdproduto;
    ImageView plus, minus;
    String quantidade;
    int qtdprod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        qtdproduto = findViewById(R.id.qtdProduto);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);


        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                quantidade = String.valueOf(qtdproduto.getText());
                qtdprod = Integer.parseInt(quantidade);
                qtdprod++;
                qtdproduto.setText(String.valueOf(qtdprod));
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                quantidade = String.valueOf(qtdproduto);
                qtdprod = Integer.parseInt(quantidade);
                if (qtdprod>0){
                    qtdprod--;
                }
                qtdproduto.setText(String.valueOf(qtdprod));
            }
        });
    }
}