package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<Student> arr;
    StudentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.listviewStudent);
        arr = new ArrayList<>();
        arr.add(new Student("Duyen", 19, R.drawable.h1));

        adapter = new StudentAdapter(this, R.layout.dong_sinh_vien, arr);
        lv.setAdapter(adapter);

    }
}
