package com.example.demo.model;


public interface GoodsListListener {
    //    获取数据成功
    void getDataSuccess(String json);

    //获取数据失败
    void getDataError(String error);
}
