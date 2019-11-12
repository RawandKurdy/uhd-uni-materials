package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Context main = this;

        Button button = findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final AlertDialog alert_1 = new AlertDialog.Builder(main).create();
                alert_1.setTitle("Video Is Processed!");
                alert_1.setMessage("Video 001 is Processed!");


                alert_1.setButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        alert_1.dismiss();
                        Toast.makeText(main, "You clicked on OK", Toast.LENGTH_SHORT).show();
                    }
                });


                alert_1.setButton2("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        alert_1.dismiss();
                        Toast.makeText(main, "You clicked on Cancel", Toast.LENGTH_SHORT).show();
                    }
                });

                alert_1.show();

            }
        });

    }
}
