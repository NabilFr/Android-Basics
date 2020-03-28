package com.example.quete3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                EditText usernameEditText = findViewById(R.id.usernameEditText);
                String text1 = usernameEditText.getText().toString();

                EditText editText2 = findViewById(R.id.editText2);
                String text2 = editText2.getText().toString();

                Intent otherActivity = new Intent(getApplicationContext(), CookieActivity.class);
                otherActivity.putExtra("name", text1);
                otherActivity.putExtra("name1", text2);
                startActivity(otherActivity);

            }
        });
    }
}

