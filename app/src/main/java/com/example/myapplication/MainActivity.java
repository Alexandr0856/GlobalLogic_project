package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String MAIN_MES = "mainMes";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button main_btn = findViewById(R.id.main_btn);

        main_btn.setOnClickListener(view -> showText());
    }

    private void showText() {
        Context context = getApplicationContext();
        EditText main_input = findViewById(R.id.main_input);
        String textToShow = main_input.getText().toString();

        int duration = Toast.LENGTH_SHORT;

        if (TextUtils.isEmpty(textToShow)) {
            textToShow = String.valueOf(R.string.void_input);
        }

        Toast.makeText(context, textToShow, duration).show();
        Log.v(MAIN_MES, textToShow);
    }
}