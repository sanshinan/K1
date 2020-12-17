package com.example.k1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.k1.base.BaseActivity;
import com.example.k1.contract.MainContrac;
import com.example.k1.modle.Banbean;
import com.example.k1.persent.MainPresenterImpl;
import com.example.k1.util.URLConstant;

public class MainActivity extends BaseActivity<MainPresenterImpl> implements MainContrac.IMainView {


    private Button btn;
    private TextView text;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

        btn = (Button) findViewById(R.id.btn);
        text = (TextView) findViewById(R.id.text);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.loginBan(URLConstant.NEWBAN);
            }
        });
    }

    @Override
    protected int getLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    public MainPresenterImpl getPresenter() {
        return new MainPresenterImpl(this);
    }

    @Override
    public void getBan(Banbean banbean) {
        Log.i("TAG", "getBan: "+banbean.toString());
    }
}