package com.example.sharedpreference;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText text = findViewById(R.id.editText);
        final String theText = text.getText().toString();

        Button saveBtn = findViewById(R.id.saveBtn);
        saveBtn.setOnClickListener( new View.OnClickListener() {

            TextView backup1 = findViewById(R.id.backup);


            @Override
            public void onClick(View view) {

                backup1.setText(theText);
                SharedPreferences sharedPref = MainActivity.this.getPreferences(Context.MODE_PRIVATE);
                String defaultValue = getResources().getString(R.string.backup);
                String highScore = sharedPref.getString(getString(R.string.remember_me), defaultValue);


                backup1.setText(highScore);


            }








        });



    }
}
