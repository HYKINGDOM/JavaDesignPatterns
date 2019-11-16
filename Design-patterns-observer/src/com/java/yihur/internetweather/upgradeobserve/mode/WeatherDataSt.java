package com.java.yihur.internetweather.upgradeobserve.mode;

import java.util.ArrayList;
import java.util.List;

import com.java.yihur.internetweather.upgradeobserve.observer.Observer;
import com.java.yihur.internetweather.upgradeobserve.observer.Subject;

/**
 * 天气数据
 *
 * @author yihur
 */
public class WeatherDataSt implements Subject {

    private float mTemperate;
    private float mPressure;
    private float mHumidity;
    private List<Observer> mObservers;

    public WeatherDataSt() {
        mObservers = new ArrayList<>();
    }

    public float getTemperature() {
        return mTemperate;

    }

    public float getPressure() {
        return mPressure;

    }

    public float getHumidity() {
        return mHumidity;

    }

    public void dataChange() {
        notifyObservers();
    }


    public void setData(float mTemperate, float mPressure, float mHumidity) {
        this.mTemperate = mTemperate;
        this.mPressure = mPressure;
        this.mHumidity = mHumidity;
        dataChange();
    }

    @Override
    public void registerObserver(Observer o) {
        mObservers.add(o);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (mObservers.contains(observer)) {
            mObservers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer mObserver : mObservers) {
            mObserver.update(getTemperature(), getPressure(), getHumidity());
            System.out.println("开始通知：" + mObserver.getClass().getSimpleName());
        }
    }

}
