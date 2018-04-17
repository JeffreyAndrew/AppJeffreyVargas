package com.jevar.appjeffreyvargas.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.jevar.appjeffreyvargas.R;
import com.jevar.appjeffreyvargas.interfaces.LoginInterface;
import com.jevar.appjeffreyvargas.presentator.LoginPresentator;

public class LoginActivity extends AppCompatActivity implements LoginInterface.View{

    private EditText txtUser, txtPass;
    private Button btnLogin;
    private LoginInterface.Presenter loginPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        txtUser = (EditText)findViewById(R.id.txtUserLogin);
        txtPass = (EditText)findViewById(R.id.txtPassLogin);
        btnLogin = (Button) findViewById(R.id.btnLogInLogin);

        loginPresenter = new LoginPresentator(this);
    }

    public void validate(View view){
        String user = txtUser.getText().toString();
        String pass = txtPass.getText().toString();
        //Toast.makeText(this, "USER"+user+" PASS: "+pass, Toast.LENGTH_SHORT).show();
        loginPresenter.validate(user,pass);
    }

    @Override
    public void enter(Boolean var) {
        Toast.makeText(this, "LLEGA", Toast.LENGTH_SHORT).show();
        if (var == true){
            Toast.makeText(this, "Login Sucessful", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, MainActivity.class));
        }else{
            Toast.makeText(this, "Login Fail", Toast.LENGTH_SHORT).show();
        }
    }
}
