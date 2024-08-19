package com.example.app_03;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements TextWatcher {

    EditText e;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        e = (EditText) findViewById(R.id.edit1);
        t = (TextView) findViewById(R.id.text1);
        e.addTextChangedListener(this);

    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void afterTextChanged(Editable editable) {
        float num=0;
        String s = editable.toString();
        if(s!=null && !s.isEmpty())
            num = Float.parseFloat(editable.toString());
        if(num>100)
            editable.replace(0,editable.length(),"100");


    }
}