package com.example.unsan.mvvmretrofiteg.remote;

import android.arch.lifecycle.MutableLiveData;

public class UserRepository {
    public UserRepository()
    {

    }
    public MutableLiveData<String> getResponse()
    {
        final MutableLiveData<String> data=new MutableLiveData<>();
        return data;
    }
}
