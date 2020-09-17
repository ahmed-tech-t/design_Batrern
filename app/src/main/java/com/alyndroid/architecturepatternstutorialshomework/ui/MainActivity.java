package com.alyndroid.architecturepatternstutorialshomework.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import com.alyndroid.architecturepatternstutorialshomework.R;
import com.alyndroid.architecturepatternstutorialshomework.databinding.ActivityMainBinding;
import com.alyndroid.architecturepatternstutorialshomework.operation.Calculate;
import com.alyndroid.architecturepatternstutorialshomework.ui.mvp.Presenter;
import com.alyndroid.architecturepatternstutorialshomework.ui.mvp.mvpInterface;
import com.alyndroid.architecturepatternstutorialshomework.ui.mvvm.ModelView;

public class MainActivity extends AppCompatActivity implements mvpInterface {

    ActivityMainBinding binding;
    Presenter presenter;
    ModelView modelView;
    Calculate calculate = new Calculate();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setOnClicked(this);
        presenter = new Presenter(this);

        modelView = ViewModelProviders.of(this).get(ModelView.class);
        binding.setModelView(modelView);
        binding.setLifecycleOwner(this);

    }

    public void showAddResult(){
        binding.plusResultTextView.setText(String.valueOf(calculate.GetResult("add")));
    }

    public void showDivResult(){
        presenter.getResult();
    }
    @Override
    public void setDivResult(int result) {
        binding.divResultTextView.setText(String.valueOf(result));
    }
}
