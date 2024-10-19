package com.example.prg2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText number1,number2;
    Button add;
    TextView res;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        number1 = (EditText) findViewById(R.id.num1);
        number2 = (EditText) findViewById(R.id.num2);
        add = (Button) findViewById(R.id.submit);
        res = (TextView) findViewById(R.id.result);
        add.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.submit)
        {
            int a = Integer.parseInt(number1.getText().toString());
            int b = Integer.parseInt(number2.getText().toString());
            String results = String.valueOf(a + b);
            res.setText("Result is:" + results);
        }
    }
}
