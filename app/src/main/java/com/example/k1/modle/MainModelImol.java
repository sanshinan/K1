package com.example.k1.modle;

import com.example.k1.contract.MainContrac;
import com.example.k1.util.INetCallBack;
import com.example.k1.util.RetrofitUtils;

public class MainModelImol implements MainContrac.IMainModdel {
    @Override
    public <T> void getLoginBab(String url, INetCallBack<T> callBack) {
        RetrofitUtils.getInstance().get(url,callBack);
    }
}
