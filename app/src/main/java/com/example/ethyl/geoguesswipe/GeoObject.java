package com.example.ethyl.geoguesswipe;


public class GeoObject {

    private String mInEurope;
    public int mGeoImageName;

    public GeoObject(String mInEurope, int mGeoImageName) {
        this.mInEurope = mInEurope;
        this.mGeoImageName = mGeoImageName;
    }

    public GeoObject(String mGeoName) {
        this.mInEurope = mGeoName;
    }

    public String getmInEurope() {
        return mInEurope;
    }


    public void setmInEurope(String mInEurope) {
        this.mInEurope = mInEurope;
    }

    public int getmGeoImageName() {

        return mGeoImageName;

    }

    public void setmGeoImageName(int mGeoImageName) {

        this.mGeoImageName = mGeoImageName;

    }

    public static final String[] PRE_DEFINED_GEO_OBJECT_EU_STATE = {

           "yes",
            "no",
            "no",
            "yes",
            "no",
            "yes",
            "yes",
            "no"
    };

    public static final int[] PRE_DEFINED_GEO_OBJECT_IMAGE_IDS = {

            R.drawable.img1_yes_denmark,
            R.drawable.img2_no_canada,
            R.drawable.img3_no_bangladesh,
            R.drawable.img4_yes_kazachstan,
            R.drawable.img5_no_colombia,
            R.drawable.img6_yes_poland,
            R.drawable.img7_yes_malta,
            R.drawable.img8_no_thailand,

    };



}
