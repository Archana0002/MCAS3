package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button login;
    EditText username, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.user);
        password = (EditText) findViewById(R.id.pwd);
        login = (Button) findViewById(R.id.LoginButton);
        login.setOnClickListener(this);


    }
    public void onClick(View view)
    {
        if(view.getId()==R.id.LoginButton){
            String a = username.getText().toString();
            String b = password.getText().toString();
            if(a.equals("123456")&&b.equals("archana"))
                Toast.makeText(this,"Login successfull",Toast.LENGTH_LONG).show();
            else
                Toast.makeText(this,"Login failed",Toast.LENGTH_LONG).show();
        }
    }
}