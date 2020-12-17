package com.example.k1.util;

public interface INetCallBack<T> {
    void onSuccess(T t);
    void onFail(String err);
}
