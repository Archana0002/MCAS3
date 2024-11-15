package com.example.program5;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    TextView em,ps;
    SharedPreferences sp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        SharedPreferences sp = getSharedPreferences("Mypref",MODE_PRIVATE);
        em = (TextView) findViewById(R.id.text6);
        ps = (TextView) findViewById(R.id.text8);
        if(sp.contains("Email"))
        {
            em.setText("Your Email is:"+sp.getString("Email",""));
        }
        if(sp.contains("Pass"))
        {
                ps.setText("Your Password is:" + sp.getString("Pass",""));
        }




    }
}
