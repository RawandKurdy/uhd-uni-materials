package dev.rawand.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText input_msg;
    //Button btn_submit;

    AutoCompleteTextView input_country_single;
    MultiAutoCompleteTextView input_country_multi;

    // Basic Method to show msg content as a TOAST
    public void showMsg(){
        String msg = input_msg.getText().toString();
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    // Function to call Method from XML
    public void showMsg(View v){
        showMsg();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Changing Keyboard Behavior
        input_msg = findViewById(R.id.input_msg);
        input_msg.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_SEND) {
                    InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                    inputMethodManager.hideSoftInputFromWindow(v.getWindowToken(),0);
                    showMsg();

                    return true;
                }
                return false;
            }
        });


        // Giving Buttons Actions From Java Class
//        btn_submit = findViewById(R.id.button_submit);
//        btn_submit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                showMsg();
//            }
//        });


        // Auto Completion Example
        String[] countries = {"Estonia", "Iraq", "Russian Federation", "USA"};
        ArrayAdapter<String> countriesAdapter = new ArrayAdapter<>
                (this, android.R.layout.simple_dropdown_item_1line, countries);
//
        input_country_single = findViewById(R.id.input_country_single);
        input_country_single.setAdapter(countriesAdapter);

        input_country_multi = findViewById(R.id.input_country_multi);
        input_country_multi.setAdapter(countriesAdapter);
        input_country_multi.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());

    }
}
