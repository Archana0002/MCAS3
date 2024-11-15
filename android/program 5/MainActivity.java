package com.example.program5;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText email,pass;
    Button login, sign;
    SharedPreferences sp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        email = (EditText) findViewById(R.id.edit1);
        pass = (EditText) findViewById(R.id.edit2);
        login = (Button) findViewById(R.id.btn1);

        sp = getSharedPreferences("Mypref",MODE_PRIVATE);
        login.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String e = email.getText().toString();
        String p = email.getText().toString();
        SharedPreferences.Editor ed=sp.edit();
        ed.putString("Email",e);
        ed.putString("Pass",p);
        ed.apply();
        Intent i = new Intent(this, MainActivity2.class);
        startActivity(i);

    }
}
