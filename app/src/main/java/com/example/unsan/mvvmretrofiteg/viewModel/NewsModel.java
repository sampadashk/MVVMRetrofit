package com.example.unsan.mvvmretrofiteg.viewModel;

import com.example.unsan.mvvmretrofiteg.remote.News;

import java.util.ArrayList;

public class NewsModel {

    public String header;
    public String description;

    public NewsModel(News news)
    {
        this.header=news.header;
        description=news.description;
    }

    public String getHeader() {
        return header;
    }

    public NewsModel() {
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public ArrayList<NewsModel> getArrayListView()
    {
        ArrayList<NewsModel> newsModels=new ArrayList<>();
        News news=new News("First Headline","First decription of headline");
        NewsModel newmodel=new NewsModel(news);
        newsModels.add(newmodel);
        NewsModel n2=new NewsModel(new News("SecondHeadline","Second description here"));
        NewsModel n3=new NewsModel(new News("ThirdHeadline","Third description here"));
        NewsModel n4=new NewsModel(new News("FourthHeadline","Fourth description here"));
        newsModels.add(n2);
        newsModels.add(n3);
        newsModels.add(n4);


        return newsModels;

    }
}
