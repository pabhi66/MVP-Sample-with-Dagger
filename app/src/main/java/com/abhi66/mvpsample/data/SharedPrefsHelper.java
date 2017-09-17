package com.abhi66.mvpsample.data;

import android.content.Context;
import android.content.SharedPreferences;

import static android.content.Context.MODE_PRIVATE;

/**
 * The type Shared prefs helper.
 *
 * @author Abhishek Prajapati
 * @version 1.0.0
 * @since 9 /16/17. It is called only by datamanager. Presenter never directly interacts with SharedPrefsHelper
 */
public class SharedPrefsHelper {

    /**
     * The constant MY_PREFS.
     */
    public static final String MY_PREFS = "MY_PREFS";

    /**
     * The constant EMAIL.
     */
    public static final String EMAIL = "EMAIL";

    /**
     * The M shared preferences.
     */
    SharedPreferences mSharedPreferences;

    /**
     * Instantiates a new Shared prefs helper.
     *
     * @param context the context
     */
    public SharedPrefsHelper(Context context) {
        mSharedPreferences = context.getSharedPreferences(MY_PREFS, MODE_PRIVATE);
    }

    /**
     * Clear.
     */
    public void clear() {
        mSharedPreferences.edit().clear().apply();
    }

    /**
     * Put email.
     *
     * @param email the email
     */
    public void putEmail(String email) {
        mSharedPreferences.edit().putString(EMAIL, email).apply();
    }

    /**
     * Gets email.
     *
     * @return the email
     */
    public String getEmail() {
        return mSharedPreferences.getString(EMAIL, null);
    }

    /**
     * Gets logged in mode.
     *
     * @return the logged in mode
     */
    public boolean getLoggedInMode() {
        return mSharedPreferences.getBoolean("IS_LOGGED_IN", false);
    }

    /**
     * Sets logged in mode.
     *
     * @param loggedIn the logged in
     */
    public void setLoggedInMode(boolean loggedIn) {
        mSharedPreferences.edit().putBoolean("IS_LOGGED_IN", loggedIn).apply();
    }
}
