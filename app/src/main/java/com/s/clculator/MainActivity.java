package com.s.clculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText one, two;
    private TextView result;
    private Button add,c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
         result = findViewById(R.id.result);
         add = findViewById(R.id.add);
         c= findViewById(R.id.c);
         add.setOnClickListener                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         (new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 addSum();
             }
         });

c.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        clear();
    }
});


    }

    private void clear() {
        one.setText("");
        two.setText("");
        result.setText("");
    }

    private void addSum() {
        int a , b, c;
        a= Integer.parseInt(one.getText().toString() );
        b= Integer.parseInt(two.getText().toString() );
        c = a +b;
       result.setText(String.valueOf(c));

    }

}