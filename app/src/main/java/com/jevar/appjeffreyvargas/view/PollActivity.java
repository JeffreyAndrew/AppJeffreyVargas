package com.jevar.appjeffreyvargas.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jevar.appjeffreyvargas.R;

public class PollActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poll);
        getSupportActionBar().hide();
    }
}
