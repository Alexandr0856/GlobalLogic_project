package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText main_input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_input = findViewById(R.id.main_input);
        Button main_btn = findViewById(R.id.main_btn);

        main_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;

                if (main_input.getText().toString().equals(""))
                    Toast.makeText(context, R.string.void_input, duration).show();
                else{
                    String input_text = main_input.getText().toString();
                    Toast.makeText(context, input_text, duration).show();
                    Log.v("main_mes", input_text);
                }
            }
        });
    }
}