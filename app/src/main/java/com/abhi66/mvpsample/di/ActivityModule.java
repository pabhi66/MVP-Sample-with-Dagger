package com.abhi66.mvpsample.di;

import android.content.Context;

import com.abhi66.mvpsample.ui.Main.MainContract;
import com.abhi66.mvpsample.ui.Main.MainPresenter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author Abhishek Prajapati
 * @version 1.0.0
 * @since 9/19/17.
 */

@Module
public class ActivityModule {

    private Context mContext;

    public ActivityModule(Context mContext) {
        this.mContext = mContext;
    }

    @Provides @Singleton
    MainContract.Presenter providesMainPresenter(){
        return new MainPresenter();
    }
}
