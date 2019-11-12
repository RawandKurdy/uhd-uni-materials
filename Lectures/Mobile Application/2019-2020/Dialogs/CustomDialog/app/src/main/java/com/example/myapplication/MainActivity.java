package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final Context mainContext = this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.btn1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Dialog
                final Dialog sampleDiaglog = new Dialog(mainContext);
                sampleDiaglog.setContentView(R.layout.customdialog);
                sampleDiaglog.setTitle("Video is Processed!");

                TextView txt_in_dialog = sampleDiaglog.findViewById(R.id.dialog_txt_1);
                txt_in_dialog.setText("Video File 0123 is Processed Successfully");

                Button btn_in_diaglog = sampleDiaglog.findViewById(R.id.dialog_btn_1);
                btn_in_diaglog.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        sampleDiaglog.dismiss();
                    }
                });
                //Dialog

                sampleDiaglog.show();
            }
        });

    }
}
