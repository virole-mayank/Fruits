package com.example.fruits;

public class Fruits {

    private String mHindi;
    private String mEng;

    private int mImageResourceId;

    public Fruits(String Hindi, String Eng, int imageResourceId)
    {
        mHindi = Hindi;
        mEng = Eng;
        mImageResourceId = imageResourceId;
    }

    public String getHindi() {
        return mHindi;
    }

    public String getEng() {
        return mEng;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

}

