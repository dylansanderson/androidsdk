package com.example.myapplication;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
private String word = "hi";
private Button button;
private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main2);
        button = (Button)findViewById(R.id.button2);
        text = (TextView)findViewById(R.id.textView2);
        button.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                text.append(word);

            }
        });
    }

}
