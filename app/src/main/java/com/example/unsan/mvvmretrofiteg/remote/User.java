package com.example.unsan.mvvmretrofiteg.remote;

import android.databinding.BaseObservable;

public class User extends BaseObservable {
    public String email;
   public String pwd;
   public String emalHint;
    public String pwdHint;

    public User( String emalHint, String pwdHint) {

        this.emalHint = emalHint;
        this.pwdHint = pwdHint;
    }




    public User() {
    }


}
