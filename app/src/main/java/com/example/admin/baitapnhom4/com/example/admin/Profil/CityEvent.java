package com.example.admin.baitapnhom4.com.example.admin.Profil;

/**
 * Created by admin on 8/11/2016.
 */
public class CityEvent {
    public static final int TITRE = 0;
    public static final int ACTIVITE = 1;


    private String mTitle;
    private String mName;
    private String mDescription;
    private int mType;

    public CityEvent(String mTitle, String mName, String mDescription, int mType) {
        this.mTitle = mTitle;
        this.mName = mName;
        this.mDescription = mDescription;
        this.mType = mType;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public int getType() {
        return mType;
    }

    public void setType(int mType) {
        this.mType = mType;
    }
}
