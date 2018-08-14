package com.example.android.quakereport;


/*
** {@link Earthquake} represents a single Earthquake information.
** Each object has 3 properties: magnitude, location, and date.
 */
public class Earthquake {

    // Magnitude of the earthquake
    private double mQuakeMagnitude;

    // Location of the earthquake
    private String mQuakeLocation;

    // Time of the earthquake
    private long mTimeInMilliseconds;

    // Website URL of the earthquake
    private String mUrl;

    /*
    ** Create a new Earthquake object.
    * @param magnitude is the magnitude of the earthquake
    * @param location is the location of the earthquake
    * @param timeInMilliseconds is the time in milliseconds when the earthquake happened
    * @param url is website url to find more details about the earthquake
    */
    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url){
        mQuakeMagnitude = magnitude;
        mQuakeLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    /*
    ** Get or return the magnitude of the earthquake
     */
    public double getQuakeMagnitude() {
        return mQuakeMagnitude;
    }

    /*
     ** Get the location of the earthquake
     */
    public String getQuakeLocation() {
        return mQuakeLocation;
    }

    /*
     ** Get the date of the earthquake
     */
    public long getQuakeTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    /*
    ** Return the website url to find more information about the earthquake
     */
    public String getQuakeUrl(){
        return mUrl;
    }
}
