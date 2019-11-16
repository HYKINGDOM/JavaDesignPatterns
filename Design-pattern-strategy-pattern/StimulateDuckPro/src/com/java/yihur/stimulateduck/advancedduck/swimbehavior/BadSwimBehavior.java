package com.java.yihur.stimulateduck.advancedduck.swimbehavior;

/**
 * 游泳技术很差
 * @author yihur
 */
public class BadSwimBehavior implements SwimBehavior {
    @Override
    public void swim() {
        System.out.println("~~bad swim~~");
    }
}
