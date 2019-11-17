package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
                if(resultCode == RESULT_OK) {
                    String name = data.getStringExtra("student");

                    Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
                }
    }

    public void btnAction(View view){
        Intent act_b = new Intent(MainActivity.this, ActivityB.class);
            act_b.putExtra("question", "What is your name?");

        startActivityForResult(act_b, 0);
    }

    public void btnActionExit(View view) {
        finish();
    }
}
