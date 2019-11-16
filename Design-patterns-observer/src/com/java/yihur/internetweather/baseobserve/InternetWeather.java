package com.java.yihur.internetweather.baseobserve;

/**
 * @author yihur
 */
public class InternetWeather {

    public static void main(String[] args) {
        CurrentConditions mCurrentConditions = new CurrentConditions();
        WeatherData mWeatherData = new WeatherData(mCurrentConditions);
        mWeatherData.setData(30, 150, 40);
    }
}
