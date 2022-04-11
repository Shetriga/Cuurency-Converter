package com.example.source;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert(View view){
        EditText v = findViewById(R.id.money);
        Double original = Double.parseDouble(v.getText().toString());
        Double result = original * 0.0626209;
        Toast.makeText(getApplicationContext(), "$" + result, Toast.LENGTH_SHORT).show();
    }

}