package dev.rawand.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // First Create Item XML Definition

        //2nd >> Prepare Data (String)
        final String[] countries = {"Iraq", "USA", "Vietnam",
                "Russia", "Spain", "Mexico", "Poland"};

        //3rd >> init. the array adapter
        ArrayAdapter adapter = new ArrayAdapter<>(
                this,R.layout.listitem,
                R.id.list_item_text_view,
                countries);

        //List View
        ListView listView = findViewById(R.id.list_view_1);
        listView.setAdapter(adapter);

        //Actions
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,
                        countries[position],
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
