package com.example.mednote;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button SintomasBtn;
    private Button RelatorioBtn;
    private Button ConsultaBtn;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SintomasBtn = findViewById(R.id.SintomasBtn);
        RelatorioBtn = findViewById(R.id.RelatorioBtn);
        ConsultaBtn = findViewById(R.id.ConsultaBtn);

        SintomasBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSintomasActivity();
            }
        });
        RelatorioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRelatorioBtn();
            }
        });
        ConsultaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openConsultaBtn();
            }
        });
    }
    public void openSintomasActivity(){
        Intent intent = new Intent(this, SintomasActivity.class);
        startActivity(intent);
    }
    public void openRelatorioBtn(){
        Intent intent = new Intent(this, RelatorioActivity.class);
        startActivity(intent);
    }
    public void openConsultaBtn(){
        Intent intent = new Intent(this, ConsultaActivity.class);
        startActivity(intent);
    }
}