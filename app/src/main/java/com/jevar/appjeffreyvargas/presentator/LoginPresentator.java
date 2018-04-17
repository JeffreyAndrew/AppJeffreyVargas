package com.jevar.appjeffreyvargas.presentator;

import android.util.Log;

import com.jevar.appjeffreyvargas.interfaces.LoginInterface;
import com.jevar.appjeffreyvargas.model.LoginModel;
import com.jevar.appjeffreyvargas.view.LoginActivity;

/**
 * Created by jevar on 15/04/2018.
 */

public class LoginPresentator implements LoginInterface.Presenter{

    private LoginInterface.View view;
    private LoginInterface.Model model;

    public LoginPresentator(LoginActivity view) {
        this.view = view;
        model = new LoginModel(this);
    }


    @Override
    public void validate(String user, String pass) {
        if (view != null){
            Log.w("USUARIO: " , user);
            model.validate(user,pass);
        }
    }

    @Override
    public void confirmValidate(Boolean var) {
        if (view != null){
            view.enter(var);
        }
    }


}
