package com.abhi66.mvpsample.ui.Main;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.abhi66.mvpsample.R;
import com.abhi66.mvpsample.ui.Base.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.View{

    @BindView(R.id.tvHello)
    TextView mTextView;


    @OnClick(R.id.tvHello)
    public void onClick() {
        getPresenter().loadHelloText();
    }

    @Override
    protected void injectDependencies() {
        getActivityComponent().inject(this);
    }

    @Override
    protected int getContentResource() {
        return R.layout.activity_main;
    }

    @Override
    protected void init(@Nullable Bundle state) {
        getPresenter().loadHelloText();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        getPresenter().detach();
    }

    @Override
    public void onTextLoaded(String text) {
       mTextView.setText(text);
    }
}
