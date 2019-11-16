package com.java.yihur.coffeebar.juice;

import com.java.yihur.coffeebar.BaseDrink;

/**
 * 苹果汁
 * @author yihur
 */
public class AppleJuiceBase extends JuiceBase {

    public AppleJuiceBase(BaseDrink obj){
        super(obj);
        super.setDescription("AppleJuice");
        super.setPrice(5.1f);
    }
}
