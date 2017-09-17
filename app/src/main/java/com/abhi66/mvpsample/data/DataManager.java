package com.abhi66.mvpsample.data;

/**
 * The type Data manager.
 *
 * @author Abhishek Prajapati
 * @version 1.0.0
 * @since 9 /16/17. It is the only part of model that interacts with presenter and vice versa,  for interaction among other parts of model and presenter, datamanager acts as a middleman.
 */
public class DataManager {

    /**
     * The M shared prefs helper.
     */
    SharedPrefsHelper mSharedPrefsHelper;

    /**
     * Instantiates a new Data manager.
     *
     * @param sharedPrefsHelper the shared prefs helper
     */
    public DataManager(SharedPrefsHelper sharedPrefsHelper) {
        mSharedPrefsHelper = sharedPrefsHelper;
    }

    /**
     * Clear.
     */
    public void clear() {
        mSharedPrefsHelper.clear();
    }

    /**
     * Save email id.
     *
     * @param email the email
     */
    public void saveEmailId(String email) {
        mSharedPrefsHelper.putEmail(email);
    }

    /**
     * Gets email id.
     *
     * @return the email id
     */
    public String getEmailId() {
        return mSharedPrefsHelper.getEmail();
    }

    /**
     * Sets logged in.
     */
    public void setLoggedIn() {
        mSharedPrefsHelper.setLoggedInMode(true);
    }

    /**
     * Gets logged in mode.
     *
     * @return the logged in mode
     */
    public Boolean getLoggedInMode() {
        return mSharedPrefsHelper.getLoggedInMode();
    }
}
