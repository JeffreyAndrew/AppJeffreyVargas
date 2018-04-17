package com.jevar.appjeffreyvargas.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jevar.appjeffreyvargas.R;

public class CourseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);
        getSupportActionBar().hide();
    }
}
