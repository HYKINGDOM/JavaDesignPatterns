package com.java.yihur.stimulateduck.advancedduck.flybehavior;


/**
 * 描述正常的飞行行为
 * @author Administrator
 */
public class GoodFlyBehavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("--GoodFly--");
    }

}