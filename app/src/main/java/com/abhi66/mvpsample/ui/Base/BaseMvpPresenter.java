package com.abhi66.mvpsample.ui.Base;

/**
 * @author Abhishek Prajapati
 * @version 1.0.0
 * @since 9/16/17.
 *
 * Each presenter must implement this interface
 * Each presenter is an interface and will implement BaseMvpPresenter Creating the logic over interfaces instead of classes will be useful.
 *
 * @param <V> View for the presenter
 */

public interface BaseMvpPresenter<V extends BaseView> {

    /**
     * Called when view attached to presenter
     *
     * @param view
     */
    void attach(V view);

    /**
     * Called when view is detached from presenter
     */
    void detach();

    /**
     * @return true if view is attached to presenter
     */
    boolean isAttached();
}
