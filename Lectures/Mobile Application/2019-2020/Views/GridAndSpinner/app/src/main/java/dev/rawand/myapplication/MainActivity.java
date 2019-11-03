package dev.rawand.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //GridView Using CustomAdapter
        // 1- Create Item XML Layout Definition
        // 2- Add GridView XML Definition (Set ColNo, etc)
        // 3- Create Custom Adapter
        // 4- Prepare Your List Data
        // 5- Init. Custom Adapter and Apply it
        // 6- Add Java actions if you want
        final String[] names= {"John", "Richard", "Yad", "Jolla", "Emma", "Lee"};
        CustomAdapter namesAdapter = new CustomAdapter(this, names);

        GridView gridView = findViewById(R.id.grid_view_1);
        gridView.setAdapter(namesAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String txt = names[position];
                Toast.makeText(MainActivity.this, txt, Toast.LENGTH_SHORT).show();
            }
        });


        //Spinner Using Resources
        // 1- Define Array Resource
        // 2- Add XML Definition
        // 3- Add Java Action if needed
        Spinner spinner = findViewById(R.id.spinner_view);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String txt = "PX is: "+ position +", ID is: "+ id;
                Toast.makeText(MainActivity.this, txt, Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
