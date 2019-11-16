package com.java.yihur.stimulateduck.advancedduck.ducks;

import com.java.yihur.stimulateduck.advancedduck.flybehavior.NoFlyBehavior;
import com.java.yihur.stimulateduck.advancedduck.quackbehavior.NoQuackBehavior;
import com.java.yihur.stimulateduck.advancedduck.swimbehavior.NoSwimBehavior;

/**
 * 石头做的鸭子
 * @author Administrator
 */
public class StoneBaseDuck extends BaseDuck {


    /**
     * 石头鸭所具有的属性
     */
    public StoneBaseDuck(){
        mFlyBehavior = new NoFlyBehavior();
        mQuackBehavior = new NoQuackBehavior();
        mSwimBehavior = new NoSwimBehavior();
    }


    @Override
    public void display() {
        System.out.println("**StoneBaseDuck**");
    }

}
