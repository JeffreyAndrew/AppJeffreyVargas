package com.jevar.appjeffreyvargas.model;

import android.content.Intent;
import android.os.CountDownTimer;
import android.util.Log;
import android.widget.Toast;

import com.jevar.appjeffreyvargas.interfaces.LoginInterface;

/**
 * Created by jevar on 15/04/2018.
 */

public class LoginModel implements LoginInterface.Model{

    private LoginInterface.Presenter presenter;
    public LoginModel(LoginInterface.Presenter presenter){
        this.presenter = presenter;
    }

    private int counter =  3;
    private boolean var = false;

    @Override
    public void validate(String user, String pass) {

        if (user.equals("jeffrey") && pass.equals("1")){
            var = true;
            presenter.confirmValidate(var);
        }/*else{
            counter--;
           // Toast.makeText(this, "le quedan " + counter, Toast.LENGTH_SHORT).show();

            if (counter ==0){
                new CountDownTimer(300, 100) {
                    public void onTick(long millisUntilFinished) {
                        // mTextField.setText("seconds remaining: " + millisUntilFinished / 1000);
                    }
                    public void onFinish() {
                        // mTextField.setText("done!");
                    }
                }.start();
            }
            presenter.confirmValidate(var);
        }*/
        presenter.confirmValidate(var);
    }
}
