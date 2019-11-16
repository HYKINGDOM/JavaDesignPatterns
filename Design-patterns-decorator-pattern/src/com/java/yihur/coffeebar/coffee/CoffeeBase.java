package com.java.yihur.coffeebar.coffee;

import com.java.yihur.coffeebar.BaseDrink;

/**
 * 饮品中咖啡基类
 *
 * @author yihur
 */
public class CoffeeBase extends BaseDrink {

    @Override
    public float cost() {
        return super.getPrice();
    }


}
