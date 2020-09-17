package com.alyndroid.architecturepatternstutorialshomework.ui.mvvm;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.alyndroid.architecturepatternstutorialshomework.operation.Calculate;

public class ModelView extends ViewModel {
    Calculate calculate =new Calculate();

    public MutableLiveData<String> mutableLiveData =new MutableLiveData<>();

    public void setResult(){
        mutableLiveData.setValue(String.valueOf(calculate.GetResult("mul")));

    }
}
