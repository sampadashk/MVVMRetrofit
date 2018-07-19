package com.example.unsan.mvvmretrofiteg.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.unsan.mvvmretrofiteg.R;
import com.example.unsan.mvvmretrofiteg.databinding.ListItemBinding;
import com.example.unsan.mvvmretrofiteg.viewModel.NewsModel;

import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter<NewsModel> {
    private ArrayList<NewsModel> newsModels;
    private Context context;

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        ListItemBinding listItemBinding= DataBindingUtil.inflate(layoutInflater,R.layout.list_item,parent,false);
        listItemBinding.setNewslist(newsModels.get(position));

        return listItemBinding.getRoot();
    }

    public NewsAdapter(@NonNull Context context, ArrayList<NewsModel> newsModels) {
        super(context,R.layout.list_item,newsModels);
        this.newsModels=newsModels;
        this.context=context;
    }
}
