package com.abhi66.mvpsample.ui.Base;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.abhi66.mvpsample.di.ActivityComponent;
import com.abhi66.mvpsample.di.ActivityModule;
import com.abhi66.mvpsample.di.DaggerActivityComponent;

import javax.inject.Inject;

import butterknife.ButterKnife;

/**
 * @author Abhishek Prajapati
 * @version 1.0.0
 * @since 9/16/17.
 */

public abstract class BaseActivity<T extends BaseMvpPresenter> extends AppCompatActivity implements BaseView {

    /**
     * Injected presenter
     */
    @Inject
    T mPresenter;

    private ActivityComponent mActivityComponent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentResource());
        ButterKnife.bind(this);
        mActivityComponent = DaggerActivityComponent.builder()
                .activityModule(new ActivityModule(this))
                .build();
        injectDependencies();
        mPresenter.attach(this);
        init(savedInstanceState);
    }

    /**
     * Detach presenter
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.detach();
    }


    public ActivityComponent getActivityComponent() {
        return mActivityComponent;
    }

    /**
     * Getter for the presenter
     *
     * @return the present for the activity
     */
    public T getPresenter() {
        return mPresenter;
    }

    /**
     * Layout resource to be inflated
     *
     * @return layout resource
     */
    @LayoutRes
    protected abstract int getContentResource();

    /**
     * Initializations
     */
    protected abstract void init(@Nullable Bundle state);

    /**
     * Injecting dependencies
     */
    protected abstract void injectDependencies();
}
