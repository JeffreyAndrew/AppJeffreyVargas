package com.jevar.appjeffreyvargas.interfaces;

/**
 * Created by jevar on 15/04/2018.
 */

public interface LoginInterface {

    interface View{
        void enter(Boolean var);
    }

    interface Presenter{
        void validate(String user, String pass);
        void confirmValidate(Boolean var);
    }

    interface Model{
        void validate(String user, String pass);
    }
}
