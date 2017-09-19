package com.abhi66.mvpsample.di;

import com.abhi66.mvpsample.ui.Main.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author Abhishek Prajapati
 * @version 1.0.0
 * @since 9/19/17.
 */

@Singleton
@Component(modules = {ActivityModule.class})
public interface ActivityComponent {

    void inject(MainActivity mainActivity);
}
