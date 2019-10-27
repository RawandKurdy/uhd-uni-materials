package dev.rawand.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TO VIEW THE Other Activity Change the following to
        // for GridLayout is in activity_main
        // for TableLayout is in table_layout
        setContentView(R.layout.activity_main);
    }
}
