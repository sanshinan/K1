package com.example.k1.base;

public class BasePersent<V extends BaseView> {
    public V iView;

    public void attachView(V v){
        iView=v;
    }
}
