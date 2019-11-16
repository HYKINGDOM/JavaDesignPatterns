package com.java.yihur.stimulateduck.advancedduck.ducks;


import com.java.yihur.stimulateduck.advancedduck.flybehavior.NoFlyBehavior;
import com.java.yihur.stimulateduck.advancedduck.quackbehavior.GaGaQuackBehavior;
import com.java.yihur.stimulateduck.advancedduck.swimbehavior.NoSwimBehavior;

/**
 * 塑料的鸭子
 *
 * @author yihur
 */
public class PlasticBaseDuck extends BaseDuck {


    public PlasticBaseDuck() {
        mQuackBehavior = new GaGaQuackBehavior();
        mFlyBehavior = new NoFlyBehavior();
        mSwimBehavior = new NoSwimBehavior();
    }


    @Override
    public void display() {
        System.out.println("**PlasticBaseDuck**");
    }


}
