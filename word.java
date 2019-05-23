package com.example.tourapplication;

public class word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageRef;



    public word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }


    public word (String defaultTranslation, String miwokTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageRef= imageResourceId;

    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getmImageRef(){return mImageRef;}


}




