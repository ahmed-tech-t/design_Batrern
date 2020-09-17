package com.alyndroid.architecturepatternstutorialshomework.ui.mvp;

import com.alyndroid.architecturepatternstutorialshomework.operation.Calculate;

public class Presenter {
    Calculate calculate = new Calculate();
    mvpInterface view ;
    public Presenter(mvpInterface view) {
        this.view = view;
    }
    public void getResult(){
       view.setDivResult(calculate.GetResult("div"));
    }

}
