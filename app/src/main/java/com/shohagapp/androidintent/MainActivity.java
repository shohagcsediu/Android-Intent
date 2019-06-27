package com.shohagapp.androidintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btnET);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // do what you want when button is clicked I am showing toast message
                Toast.makeText(MainActivity.this, "Listener Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }


    public void mybtn(View view) {
        // do what you want when button is clicked I am showing toast message and Intent
        Toast.makeText(this, "Onclick clicked", Toast.LENGTH_SHORT).show();
        //using intent I can go to another activity
        startActivity(new Intent(MainActivity.this,SecondActivity.class));
    }
}
