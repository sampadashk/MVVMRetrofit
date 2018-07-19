package com.example.unsan.mvvmretrofiteg;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.example.unsan.mvvmretrofiteg.databinding.ActivityMainBinding;
import com.example.unsan.mvvmretrofiteg.presenter.presenter;
import com.example.unsan.mvvmretrofiteg.viewModel.NameModel;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding activityMainBinding;
    private NameModel nameModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        nameModel= ViewModelProviders.of(this).get(NameModel.class);
        nameModel.getData().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                activityMainBinding.textView.setText(s);
            }
        });
        activityMainBinding.setNamemodel(nameModel);
        activityMainBinding.setPresenter(new presenter() {
            @Override
            public void getData() {
                //2nd approach
                nameModel.nameval.set("This is the second approach");
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                        startActivity(intent);

                    }
                },6000);
                //this is first approach
                //nameModel.data.setValue("This is a very first approach of data binding");

            }
        });

        }



    }

