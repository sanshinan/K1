package com.example.k1.contract;

import com.example.k1.base.BaseView;
import com.example.k1.modle.Banbean;
import com.example.k1.util.INetCallBack;

public class MainContract {

    interface  IMainModel{
        //Banner
        <T> void getLoginBab(String url, INetCallBack<T> callBack);
    }

    interface IMainPersenter{
        void  loginBan(String url);
    }

    interface IMainView extends BaseView{
        void getBan(Banbean banbean);
    }
}
