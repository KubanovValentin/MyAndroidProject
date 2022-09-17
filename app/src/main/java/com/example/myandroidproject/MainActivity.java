package com.example.myandroidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private TextView plList;
    private int count = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        plList = findViewById(R.id.tv_pl_names);
        String[] names = {"Java", "Python", "Kotlin", "JavaScript", "Ruby","C",
                "C++","Matlab","Swift","Lisp","Haskell","C#","Objective","Rust"};
        //plList это одна строка и в нее мы добавляем из массива names строки
        plList.setText("");
        for (String name : names) {
            plList.append(count + "." + name + "\n");
            count++;
        }

    }
}
