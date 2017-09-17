package com.abhi66.mvpsample.ui.Main;

import com.abhi66.mvpsample.ui.Base.BasePresenter;

import java.util.Random;

/**
 * @author Abhishek Prajapati
 * @version 1.0.0
 * @since 9/16/17.
 */

public class MainPresenter extends BasePresenter<MainContract.View> implements MainContract.Presenter {

    private String[] helloTexts = {"BONJOUR", "HOLA", "HALLO", "MERHABA", "HELLO", "CIAO", "KONNICHIWA"};

    @Override
    public void loadHelloText() {
        Random random = new Random();
        String hello = helloTexts[random.nextInt(helloTexts.length)];
        getView().onTextLoaded(hello);
    }
}
