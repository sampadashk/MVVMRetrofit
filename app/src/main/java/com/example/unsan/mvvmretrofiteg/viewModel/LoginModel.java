package com.example.unsan.mvvmretrofiteg.viewModel;

import android.arch.lifecycle.ViewModel;
import android.databinding.BaseObservable;

import com.example.unsan.mvvmretrofiteg.R;
import com.example.unsan.mvvmretrofiteg.remote.User;

public class LoginModel extends BaseObservable {
    String email;
    String pwd;
    String emalHint;
    String pwdHint;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(R.id.editText);
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
        notifyPropertyChanged(R.id.editText2);
    }

    public String getEmalHint() {
        return emalHint;
    }

    public void setEmalHint(String emalHint) {
        this.emalHint = emalHint;
    }

    public String getPwdHint() {
        return pwdHint;
    }

    public void setPwdHint(String pwdHint) {
        this.pwdHint = pwdHint;
    }

    public LoginModel(User user)
    {

        emalHint=user.emalHint;
        pwdHint=user.pwdHint;
    }
}

