package com.example.yeseul.movieapp.view.main;

import com.example.yeseul.movieapp.pojo.Movie;
import com.example.yeseul.movieapp.view.BasePresenter;
import com.example.yeseul.movieapp.view.BaseView;
import com.example.yeseul.movieapp.view.adapter.AdapterContract;

public interface MainContract {

    interface View extends BaseView {

        void onSearchResultEmpty(String searchKey);

        void startMovieDetailPage(String linkUrl);

        void showBookMarkDialog(Boolean isInclusion,int position);
    }

    interface Presenter extends BasePresenter {

        void onSearchButtonClicked(String searchKey);

        void onDialogItemClicked(Boolean isInclusion,int position);

        void setAdapterView(AdapterContract.View adapterView);

        void setAdapterModel(AdapterContract.Model<Movie> adapterModel);
    }
}
