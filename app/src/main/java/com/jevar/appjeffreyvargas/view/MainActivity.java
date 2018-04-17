package com.jevar.appjeffreyvargas.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.jevar.appjeffreyvargas.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageButton btnMessage, btnContact, btnPoll, btnCourse;
    private TextView userRe;
    String user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        getSupportActionBar().hide();

        Intent intent = getIntent();
        user = intent.getStringExtra("user");


        btnMessage = (ImageButton) findViewById(R.id.btnMessageMain);
        btnContact = (ImageButton) findViewById(R.id.btnContactMain);
        btnPoll = (ImageButton) findViewById(R.id.btnPollMain);
        btnCourse = (ImageButton) findViewById(R.id.btnCourseMain);
        userRe = (TextView) findViewById(R.id.userRec);

        userRe.setText(user);

        btnMessage.setOnClickListener(this);
        btnContact.setOnClickListener(this);
        btnPoll.setOnClickListener(this);
        btnCourse.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnMessageMain:
                startActivity(new Intent(this, MessageActivity.class));
                break;
            case R.id.btnContactMain:
                startActivity(new Intent(this, ContactActivity.class));
                break;
            case R.id.btnPollMain:
                startActivity(new Intent(this, PollActivity.class));
                break;
            case R.id.btnCourseMain:
                startActivity(new Intent(this, CourseActivity.class));
                break;
        }
    }
}
