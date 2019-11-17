package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        Intent receivedData = getIntent();
        String question = receivedData.getStringExtra("question");

        Toast.makeText(this, question, Toast.LENGTH_SHORT).show();

        // Send Data
        Button send = findViewById(R.id.act_b_btn);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Send
                Intent data = new Intent();
                data.putExtra("student", "Akar");
                setResult(RESULT_OK, data);
                finish();
            }
        });
        // Send Data

    }
}
