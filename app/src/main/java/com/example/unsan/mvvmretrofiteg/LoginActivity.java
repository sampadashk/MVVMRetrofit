package com.example.unsan.mvvmretrofiteg;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.unsan.mvvmretrofiteg.databinding.ActivityLoginBinding;
import com.example.unsan.mvvmretrofiteg.presenter.userLogin;
import com.example.unsan.mvvmretrofiteg.remote.User;
import com.example.unsan.mvvmretrofiteg.viewModel.LoginModel;

public class LoginActivity extends AppCompatActivity {
    ActivityLoginBinding activityLoginBinding;
    LoginModel loginModel;
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        activityLoginBinding= DataBindingUtil.setContentView(this,R.layout.activity_login);
        User user=new User("Enter email","Enter Password");
        loginModel=new LoginModel(user);
        activityLoginBinding.setLogin(loginModel);
        activityLoginBinding.setUserloginevent(new userLogin() {
            @Override
            public void onClickLogin() {
                Toast.makeText(LoginActivity.this,"Details entered are: "+activityLoginBinding.getLogin().getEmail()+" "+activityLoginBinding.getLogin().getPwd(),Toast.LENGTH_LONG).show();
                Intent intent=new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });



    }
}
