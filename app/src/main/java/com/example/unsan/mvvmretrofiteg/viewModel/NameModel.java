package com.example.unsan.mvvmretrofiteg.viewModel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.databinding.ObservableField;

import com.example.unsan.mvvmretrofiteg.remote.UserRepository;

public class NameModel extends ViewModel {
    public MutableLiveData<String> data;
    public ObservableField<String> nameval=new ObservableField<>("");
    private UserRepository userRepository;

    public MutableLiveData<String> getData() {

        return data;
    }
    public NameModel()
    {
        userRepository=new UserRepository();
        nameval.set("This is the first One");
        data=userRepository.getResponse();
    }
}
