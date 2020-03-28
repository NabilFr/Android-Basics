package com.example.quete3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CookieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_cookie);
        Intent otherActivity = getIntent();
        String value = otherActivity.getStringExtra("name");
        String value2 = otherActivity.getStringExtra("name1");

        Toast.makeText(getApplicationContext(), (value + " " + value2), Toast.LENGTH_LONG).show();
    }
}
