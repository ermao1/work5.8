package com.example.demo.presenter;


import com.example.demo.model.IModel;
import com.example.demo.view.IGoodsListView;
import com.example.demo.view.IMainView;
import com.example.demo.view.IRegView;


public interface Ipresenter {
    //    登录
    void loginPresenter(IModel iModel, IMainView iMainView);
    //    注册
    void regPresenter(IModel iModel, IRegView iRegView);
}
