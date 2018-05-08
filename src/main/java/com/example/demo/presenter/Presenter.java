package com.example.demo.presenter;

import android.util.Log;


import com.example.demo.http.HttpConfig;
import com.example.demo.model.GoodsListListener;
import com.example.demo.model.GoosListBean;
import com.example.demo.model.IModel;
import com.example.demo.model.LoginListener;
import com.example.demo.model.RegListener;
import com.example.demo.view.IGoodsListView;
import com.example.demo.view.IMainView;
import com.example.demo.view.IRegView;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

public class Presenter implements Ipresenter {
    private static final String TAG = "Presenter-----";
    //登录
    @Override
    public void loginPresenter(IModel iModel, final IMainView iMainView) {
        Map<String, String> map = new HashMap<>();
        map.put("mobile", iMainView.getMobile());
        map.put("password", iMainView.getPassword());
        iModel.login(HttpConfig.login_url, map, new LoginListener() {
            //根据回调结果，决定view的显示效果
            @Override
            public void loginSuccess(String json) {
                iMainView.loginSuccess();
            }

            @Override
            public void loginError(String error) {
                iMainView.loginError();
            }
        });

    }

    //注册
    public void regPresenter(IModel iModel, final IRegView iRegView) {
        //调用m请求数据
        Map<String, String> map = new HashMap<>();
        map.put("mobile", iRegView.getMobile());
        map.put("password", iRegView.getPassword());
        iModel.reg(HttpConfig.reg_url, map, new RegListener() {
            @Override
            public void regSuccess(String json) {
                iRegView.regSuccess();
            }

            @Override
            public void regError(String error) {
                iRegView.regError();
            }
        });
    }

}
