package com.example.counterclicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int a;
    private Button plus;
    private Button minus;
    private TextView text;
    private Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        plus=findViewById(R.id.button);
        minus=findViewById(R.id.button2);
        text=findViewById(R.id.textView);
        reset=findViewById(R.id.button3);



        if(savedInstanceState != null){
            a = 0 + savedInstanceState.getInt("a", 0);
            text.setText(a+"");
        }
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a++;
                text.setText(a+"");
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a--;
                text.setText(a+"");
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=0;
                text.setText(a+"");
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("a",a);
    }


}
