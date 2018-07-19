package com.example.unsan.mvvmretrofiteg;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.unsan.mvvmretrofiteg.adapter.NewsAdapter;
import com.example.unsan.mvvmretrofiteg.databinding.ActivityThirdBinding;
import com.example.unsan.mvvmretrofiteg.viewModel.NewsModel;

import java.util.ArrayList;

public class ThirdActivity extends AppCompatActivity {
    ActivityThirdBinding activityThirdBinding;
    NewsModel newsModel;
    private ArrayList<NewsModel> newsModelList;
    private NewsAdapter newsAdapter;
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        activityThirdBinding= DataBindingUtil.setContentView(this,R.layout.activity_third);
        newsModel=new NewsModel();
        newsModelList=newsModel.getArrayListView();
        newsAdapter=new NewsAdapter(this,newsModelList);
        activityThirdBinding.listView.setAdapter(newsAdapter);

    }
}
