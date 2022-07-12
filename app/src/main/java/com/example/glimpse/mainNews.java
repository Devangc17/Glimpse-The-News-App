package com.example.glimpse;

import java.util.ArrayList;

public class mainNews {
    private String status;
    private String totalResults;
    private ArrayList<com.example.glimpse.ModelClass> articles;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public ArrayList<com.example.glimpse.ModelClass> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<com.example.glimpse.ModelClass> articles) {
        this.articles = articles;
    }

    public mainNews(String status, String totalResults, ArrayList<com.example.glimpse.ModelClass> articles) {
        this.status = status;
        this.totalResults = totalResults;
        this.articles = articles;


    }
}
