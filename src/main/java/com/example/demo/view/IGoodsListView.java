package com.example.demo.view;



import com.example.demo.model.GoosListBean;

import java.util.List;

/**
 * 商品列表的View接口
 */

public interface IGoodsListView {
    //展示商品列表的方法
    void showGoodsList(List<GoosListBean.DataBean> data);
}
