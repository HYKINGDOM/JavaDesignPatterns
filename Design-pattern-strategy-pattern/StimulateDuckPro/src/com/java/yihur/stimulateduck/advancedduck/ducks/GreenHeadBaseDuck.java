package com.java.yihur.stimulateduck.advancedduck.ducks;

import com.java.yihur.stimulateduck.advancedduck.flybehavior.BadFlyBehavior;
import com.java.yihur.stimulateduck.advancedduck.quackbehavior.GaGaQuackBehavior;
import com.java.yihur.stimulateduck.advancedduck.swimbehavior.GoodSwimBehavior;
import com.java.yihur.stimulateduck.advancedduck.swimbehavior.SwimBehavior;

/**
 * 绿头鸭
 *
 * @author Administrator
 */
public class GreenHeadBaseDuck extends BaseDuck {

    /**
     * 绿头鸭所具有的属性
     */
    public GreenHeadBaseDuck() {
        mFlyBehavior = new BadFlyBehavior();
        mQuackBehavior = new GaGaQuackBehavior();
        mSwimBehavior = new GoodSwimBehavior();
    }

    @Override
    public void display() {
        System.out.println("**GreenHead**");
    }

}
