package com.example.k1.persent;

import com.example.k1.base.BasePersent;
import com.example.k1.contract.MainContrac;
import com.example.k1.modle.Banbean;
import com.example.k1.modle.MainModelImol;
import com.example.k1.util.INetCallBack;

public class MainPresenterImpl extends BasePersent<MainContrac.IMainView> implements MainContrac.IMainPersenter {
   MainContrac.IMainModdel mainModdel;

   public MainPresenterImpl(MainContrac.IMainView mainView){
       this.mainModdel=new MainModelImol();
   }
    @Override
    public void loginBan(String url) {
       mainModdel.getLoginBab(url, new INetCallBack<Banbean>() {

           @Override
           public void onSuccess(Banbean banbean) {
               iView.getBan(banbean);
           }

           @Override
           public void onFail(String err) {

           }
       });
    }
}
