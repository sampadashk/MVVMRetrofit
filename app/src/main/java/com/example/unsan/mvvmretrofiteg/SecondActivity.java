package com.example.unsan.mvvmretrofiteg;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.example.unsan.mvvmretrofiteg.databinding.ActivitySecondBinding;
import com.example.unsan.mvvmretrofiteg.remote.Student;

public class SecondActivity extends AppCompatActivity {
    ActivitySecondBinding activitySecondBinding;
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        activitySecondBinding= DataBindingUtil.setContentView(this,R.layout.activity_second);
        activitySecondBinding.setStudent(new Student("sampada","shukla"));
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(SecondActivity.this,ThirdActivity.class);
                startActivity(intent);

            }
        },5000);


    }
}
