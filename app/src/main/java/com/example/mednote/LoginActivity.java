package com.example.mednote;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    boolean l;
    private Button LoginBtn;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        LoginBtn = findViewById(R.id.LoginBtn);
        LoginBtn.setOnClickListener(v -> openMainActivity());

    }
    public void openMainActivity(){
        if (l) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);

        }
    }
}